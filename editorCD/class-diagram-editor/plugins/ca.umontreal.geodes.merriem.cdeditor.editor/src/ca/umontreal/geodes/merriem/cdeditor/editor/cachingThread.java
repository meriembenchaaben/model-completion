package ca.umontreal.geodes.merriem.cdeditor.editor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.Random;

import ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz;
import ca.umontreal.geodes.meriem.cdeditor.metamodel.ClazzCondidate;
import ca.umontreal.geodes.meriem.cdeditor.metamodel.Model;

public class cachingThread extends Thread {

	protected Model model;
	protected volatile HashMap<String, HashMap<String, String>> classAttributes;
	protected volatile HashMap<String, List<String>> relatedClasses;
	protected volatile String newClassAdded;

	protected Properties config;

	cachingThread(Model model, String newClassAdded) {
		this.model = model;
		this.config = new Properties();
		this.newClassAdded = newClassAdded;
		try {
			InputStream stream = Services.class.getClassLoader().getResourceAsStream("/config.properties");
			this.config.load(stream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	// called when a new concept is added to the model

	public HashMap<String, String> updateAttributes(String className) {

		String scriptLocation = this.config.getProperty("scriptlocation");
		String pythonCommand = this.config.getProperty("pythoncommand");
		String input = "";
		List<String> Results = new ArrayList<String>();

		try {

			Process P1 = new ProcessBuilder(pythonCommand, scriptLocation + "predictAttributes.py", className, input,
					"Attribute").start();
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(P1.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(P1.getErrorStream()));
			String s;
			while ((s = stdInput.readLine()) != null) {
				Results.add(s);
			}

			while ((s = stdError.readLine()) != null) {
				// add logger !
				System.out.println(s);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}

		String[] arrayAttributes = Results.toArray(new String[0]);
		HashMap<String, String> typeAttributes = new HashMap<String, String>();

		// print recieved attributes from python script
		for (int j = 0; j < arrayAttributes.length; j++) {
			String Type = "";

			try {
				Process P2 = new ProcessBuilder(pythonCommand, scriptLocation + "predictAttributes.py",
						arrayAttributes[j], input, "Type").start();
				BufferedReader stdInput = new BufferedReader(new InputStreamReader(P2.getInputStream()));
				BufferedReader stdError = new BufferedReader(new InputStreamReader(P2.getErrorStream()));
				String s;
				while ((s = stdInput.readLine()) != null) {
					Type = s;
				}
				while ((s = stdError.readLine()) != null) {
					// add logger !
					System.out.println(s);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			typeAttributes.put(arrayAttributes[j], Type);

		}
		return typeAttributes;

	}

	public void run() {
		HashMap<String, String> typeAttributes = new HashMap<String, String>();

		// check what part of run should be executed (is a new concept added so just
		// attributes will be predicted for that)
		if (this.newClassAdded == null) {
			System.out.print("prediction is proceeding 1 ... ");

			String scriptLocation = this.config.getProperty("scriptlocation");
			String pythonCommand = this.config.getProperty("pythoncommand");
			System.out.print("prediction is proceeding ... ");
			List<Clazz> classesInModel = model.getClazz();
			List<String> AllclassNames = new ArrayList<String>();
			List<ClazzCondidate> classeCondidateInModel = model.getClazzcondidate();

			for (int i = 0; i < classeCondidateInModel.size(); i++) {
				AllclassNames.add(classeCondidateInModel.get(i).getName());
			}

			for (int i = 0; i < classesInModel.size(); i++) {
				AllclassNames.add(classesInModel.get(i).getName());
			}
			HashMap<String, HashMap<String, String>> classAttributes = new HashMap<String, HashMap<String, String>>();
			HashMap<String, List<String>> relatedClasses = new HashMap<String, List<String>>();

			// relatedClass for each class

			System.out.print("related classescalculated ... ");

			List<String> Results = new ArrayList<String>();
			String input = "";
			for (int i = 0; i < AllclassNames.size(); i++) {

				// relatedClass for each class:

				List<String> Concepts = new ArrayList<String>();
				input = AllclassNames.get(i);

				// not sure what to send to back !
				// heuristic: what to send to GPT3
				Random rand = new Random();
				String randomElement = AllclassNames.get(rand.nextInt(AllclassNames.size()));
				input = input.concat(",").concat(randomElement);
				try {
					Process P = new ProcessBuilder(pythonCommand, scriptLocation + "predictConcepts.py", input).start();

					String line = "";
					BufferedReader stdInput = new BufferedReader(new InputStreamReader(P.getInputStream()));
					BufferedReader stdError = new BufferedReader(new InputStreamReader(P.getErrorStream()));

					String s;
					while ((s = stdInput.readLine()) != null) {
						if (!AllclassNames.contains(s)) {
							Concepts.add(s);
						}
					}
					relatedClasses.put(AllclassNames.get(i), Concepts);

					while ((s = stdError.readLine()) != null) { // add logger !
						System.out.println(s);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}

				// Attributes for each class

				typeAttributes = updateAttributes(AllclassNames.get(i));
				classAttributes.put(AllclassNames.get(i), typeAttributes);
			}
			this.classAttributes = classAttributes;
			this.relatedClasses = relatedClasses;

		} else {
			System.out.print("prediction after concept added  ... ");
			typeAttributes = updateAttributes(newClassAdded);
			HashMap<String, HashMap<String, String>> classAttributes = new HashMap<String, HashMap<String, String>>();

			classAttributes.put(newClassAdded, typeAttributes);
			this.classAttributes = classAttributes;

		}
	}
}

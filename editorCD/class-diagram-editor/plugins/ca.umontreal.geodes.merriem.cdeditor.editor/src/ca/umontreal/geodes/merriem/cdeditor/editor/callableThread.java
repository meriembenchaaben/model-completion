package ca.umontreal.geodes.merriem.cdeditor.editor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.Callable;

import ca.umontreal.geodes.meriem.cdeditor.metamodel.Model;

public class callableThread implements Callable {
	protected Model model;
	protected volatile HashMap<String, HashMap<String, String>> classAttributes;
	protected volatile HashMap<String, List<String>> relatedClasses;
	protected volatile String newClassAdded;

	protected Properties config;

	callableThread(Model model, String newClassAdded) {
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
			if (arrayAttributes[j] != "") {
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
		}
		return typeAttributes;

	}

	public HashMap<String, HashMap<String, String>> call() {
		HashMap<String, String> typeAttributes = new HashMap<String, String>();

		System.out.print("prediction in callable ... ");
		typeAttributes = updateAttributes(newClassAdded);
		HashMap<String, HashMap<String, String>> classAttributes = new HashMap<String, HashMap<String, String>>();
		classAttributes.put(newClassAdded, typeAttributes);
		System.out.print("finish in callable ... ");

		return classAttributes;
	}
}

package ca.umontreal.geodes.merriem.cdeditor.editor;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Random;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.draw2d.geometry.Point;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.ResourceSetListener;
import org.eclipse.emf.transaction.TransactionalEditingDomain;
import org.eclipse.gmf.runtime.diagram.ui.commands.CreateOrSelectElementCommand.LabelProvider;
import org.eclipse.gmf.runtime.diagram.ui.editparts.IGraphicalEditPart;
import org.eclipse.gmf.runtime.diagram.ui.editparts.ShapeEditPart;
import org.eclipse.gmf.runtime.diagram.ui.parts.DiagramEditor;
import org.eclipse.gmf.runtime.notation.Bounds;
import org.eclipse.gmf.runtime.notation.Diagram;
import org.eclipse.gmf.runtime.notation.LayoutConstraint;
import org.eclipse.gmf.runtime.notation.View;
import org.eclipse.gmf.runtime.notation.impl.NodeImpl;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.window.Window;
import org.eclipse.sirius.business.api.dialect.DialectManager;
import org.eclipse.sirius.business.api.query.EObjectQuery;
import org.eclipse.sirius.business.api.session.Session;
import org.eclipse.sirius.business.api.session.SessionManager;
import org.eclipse.sirius.common.ui.tools.api.util.EclipseUIUtil;
import org.eclipse.sirius.diagram.DDiagramElement;
import org.eclipse.sirius.diagram.model.business.internal.spec.DSemanticDiagramSpec;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusGMFHelper;
import org.eclipse.sirius.diagram.ui.business.api.view.SiriusLayoutDataManager;
import org.eclipse.sirius.diagram.ui.business.internal.view.RootLayoutData;
import org.eclipse.sirius.ui.business.api.session.SessionEditorInput;
import org.eclipse.sirius.viewpoint.DAnalysis;
import org.eclipse.sirius.viewpoint.DRepresentation;
import org.eclipse.sirius.viewpoint.DRepresentationDescriptor;
import org.eclipse.sirius.viewpoint.DView;
import org.eclipse.sirius.viewpoint.ViewpointPackage;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.MessageBox;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorReference;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.dialogs.ElementListSelectionDialog;
import org.eclipse.ui.internal.EditorReference;
import org.osgi.framework.ServiceException;

import ca.umontreal.geodes.meriem.cdeditor.metamodel.Attribute;
import ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz;
import ca.umontreal.geodes.meriem.cdeditor.metamodel.ClazzCondidate;
import ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelFactory;
import ca.umontreal.geodes.meriem.cdeditor.metamodel.Model;
import ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.AttributeImpl;
import ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ClazzCondidateImpl;
import ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ClazzImpl;

/**
 * The services class used by VSM.
 */
public class Services {

	private Properties config;
	protected static final String SIRIUS_DIAGRAM_EDITOR_ID = "org.eclipse.sirius.diagram.ui.part.SiriusDiagramEditorID";
	protected static final int Nan = 0;
	protected HashMap<String, HashMap<String, String>> classAttributes;
	protected HashMap<String, List<String>> relatedClasses;

	public Services() throws Exception {
		this.config = new Properties();
		this.relatedClasses = new HashMap<String, List<String>>();
		this.classAttributes = new HashMap<String, HashMap<String, String>>();
		try {
			InputStream stream = Services.class.getClassLoader().getResourceAsStream("/config.properties");
			this.config.load(stream);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		ResourceSetListener listener = new MyListener();
		TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();

		domain.addResourceSetListener(listener);

	};

	// call threads for caching beginning
	public EObject setPredictionMode(EObject rootModel) throws InterruptedException {
		System.out.println("in  predictionMode ....");
		ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(Display.getCurrent().getActiveShell());

		Model m = getModel();

		try {
			cachingThread T = new cachingThread(m, null); // creating thread
			T.start();
			T.join();
			this.classAttributes = T.classAttributes;
			this.relatedClasses = T.relatedClasses;

		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		System.out.println(this.classAttributes);
		return rootModel;
	}

	private void getCoorddinatesmodelObject(EObject modelObject) {
		NodeImpl node = (NodeImpl) modelObject;
		LayoutConstraint nodeLayoutConstraint = node.getLayoutConstraint();
		if (nodeLayoutConstraint instanceof Bounds) {
			Bounds bounds = (Bounds) nodeLayoutConstraint;
			int x = bounds.getX();
			int y = bounds.getY();
		}

	}

	private IGraphicalEditPart getEditPart(DDiagramElement diagramElement) {
		IEditorPart editor = EclipseUIUtil.getActiveEditor();
		if (editor instanceof DiagramEditor) {
			Session session = new EObjectQuery(diagramElement).getSession();
			View gmfView = SiriusGMFHelper.getGmfView(diagramElement, session);

			IGraphicalEditPart result = null;
			if (gmfView != null && editor instanceof DiagramEditor) {
				final Map<?, ?> editPartRegistry = ((DiagramEditor) editor).getDiagramGraphicalViewer()
						.getEditPartRegistry();
				final Object editPart = editPartRegistry.get(gmfView);
				if (editPart instanceof IGraphicalEditPart) {
					result = (IGraphicalEditPart) editPart;
					return result;
				}
			}
		}
		return null;
	}

	private void setGraphicalHintsFromExistingNode(DDiagramElement existingNode) {
		// Give hints about location and size
		IGraphicalEditPart editPart = getEditPart(existingNode);
		if (editPart instanceof ShapeEditPart) {
			ShapeEditPart part = (ShapeEditPart) editPart;
			SiriusLayoutDataManager.INSTANCE
					.addData(new RootLayoutData(existingNode.eContainer(), part.getLocation(), part.getSize()));
		}
	}

	private void setGraphicalHintsNEAR_ExistingNode(DDiagramElement existingNode, int x) {
		// Give hints about location and size
		System.out.println("hello ? ");
		IGraphicalEditPart editPart = getEditPart(existingNode);
		if (editPart instanceof ShapeEditPart) {
			ShapeEditPart part = (ShapeEditPart) editPart;
			Point p = part.getLocation().getTranslated(x, 1);
			System.out.println(x);
			System.out.println(p.x);
			SiriusLayoutDataManager.INSTANCE.addData(new RootLayoutData(existingNode.eContainer(), p, part.getSize()));
		}
	}

	private boolean containsIgnoreCase(List<String> list, String soughtFor) {

		for (String current : list) {
			if (current.replaceAll("\\s+", "").equalsIgnoreCase(soughtFor.replaceAll("\\s+", ""))) {
				return true;
			}
		}
		return false;
	}

	protected Model getModel() {
		IEditorReference[] editorReferences = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage()
				.getEditorReferences();

		IEditorReference editor = null;

		for (IEditorReference iEditorReference : editorReferences) {
			EditorReference editRef = (EditorReference) iEditorReference;
			if (editRef.getDescriptor().getId().equalsIgnoreCase(SIRIUS_DIAGRAM_EDITOR_ID)) {
				editor = editRef;
				break;
			}
		}

		if (editor == null) {
			System.out.println("No process found.");
			return null;
		}

		EObject input = null;

		try {
			IEditorInput editorInput = editor.getEditorInput();
			if (editorInput instanceof SessionEditorInput) {
				input = ((SessionEditorInput) editorInput).getInput();

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		EObject model = null;

		if (input instanceof Diagram) {
			EObject element = ((Diagram) input).getElement();
			if (element instanceof DSemanticDiagramSpec) {
				model = ((DSemanticDiagramSpec) element).getTarget();
			}
		}

		return (Model) model;
	}

	public void createClass(String Name, Session session) {
		try {
			DAnalysis root = (DAnalysis) session.getSessionResource().getContents().get(0);
			DView dView = root.getOwnedViews().get(0);

			TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();
			CommandStack stack = domain.getCommandStack();

			RecordingCommand cmd = new RecordingCommand(domain) {

				@Override
				protected void doExecute() {
					Model model = getModel();
					MetamodelFactory metamodelFactory = ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelFactory.eINSTANCE;

					ClazzImpl newClazz = (ClazzImpl) metamodelFactory.createClazz();
					newClazz.setName(Name);
					model.getClazz().add(newClazz);

					// refresh Model
					DRepresentation represnt = null;
					for (DRepresentationDescriptor descrp : dView.getOwnedRepresentationDescriptors()) {
						represnt = descrp.getRepresentation();
					}
					DialectManager.INSTANCE.refresh(represnt, new NullProgressMonitor());

				}

			};

			stack.execute(cmd);
		} catch (ServiceException e) {
			e.printStackTrace();
		}

	}

	public void deletetClassCondidate(String classToRemove, Session session) {
		try {
			DAnalysis root = (DAnalysis) session.getSessionResource().getContents().get(0);
			DView dView = root.getOwnedViews().get(0);

			TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();

			CommandStack stack = domain.getCommandStack();

			RecordingCommand cmd = new RecordingCommand(domain) {

				@Override
				protected void doExecute() {
					Model model = getModel();
					MetamodelFactory metamodelFactory = ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelFactory.eINSTANCE;

					List<ClazzCondidate> classesCondidate = model.getClazzcondidate();
					int index = Nan;
					for (int i = 0; i < classesCondidate.size(); i++) {
						if (classesCondidate.get(i).getName().replaceAll("\\s+", "")
								.equals(classToRemove.replaceAll("\\s+", ""))) {
							index = i;
							break;
						}

					}
					model.getClazzcondidate().remove(index);

					// refresh Model
					DRepresentation represnt = null;
					for (DRepresentationDescriptor descrp : dView.getOwnedRepresentationDescriptors()) {
						represnt = descrp.getRepresentation();

					}
					DialectManager.INSTANCE.refresh(represnt, new NullProgressMonitor());

				}

			};

			stack.execute(cmd);
		} catch (ServiceException e) {
			e.printStackTrace();
		}

	}

	public void createClassCondidate(String Name, Session session) {
		try {

			DAnalysis root = (DAnalysis) session.getSessionResource().getContents().get(0);
			DView dView = root.getOwnedViews().get(0);

			TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();

			CommandStack stack = domain.getCommandStack();

			RecordingCommand cmd = new RecordingCommand(domain) {

				@Override
				protected void doExecute() {
					Model model = getModel();
					MetamodelFactory metamodelFactory = ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelFactory.eINSTANCE;
					ClazzCondidateImpl newClazzCondidate = (ClazzCondidateImpl) metamodelFactory.createClazzCondidate();
					newClazzCondidate.setName(Name);
					model.getClazzcondidate().add(newClazzCondidate);

					// refresh Model
					DRepresentation represnt = null;
					for (DRepresentationDescriptor descrp : dView.getOwnedRepresentationDescriptors()) {
						represnt = descrp.getRepresentation();

					}
					DialectManager.INSTANCE.refresh(represnt, new NullProgressMonitor());

				}

			};

			stack.execute(cmd);
		} catch (ServiceException e) {
			e.printStackTrace();
		}

	}

	public void createAttribute(String Name, String Type, String containerName, Session session) {
		try {

			DAnalysis root = (DAnalysis) session.getSessionResource().getContents().get(0);
			DView dView = root.getOwnedViews().get(0);

			TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();

			CommandStack stack = domain.getCommandStack();

			RecordingCommand cmd = new RecordingCommand(domain) {

				@Override
				protected void doExecute() {
					Model model = getModel();
					MetamodelFactory metamodelFactory = ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelFactory.eINSTANCE;
					AttributeImpl newAttribute = (AttributeImpl) metamodelFactory.createAttribute();
					newAttribute.setName(Name);
					newAttribute.setType(Type);
					List<Clazz> classes = model.getClazz();
					for (int i = 0; i < classes.size(); i++) {

						String Cname = classes.get(i).getName().replaceAll("\\s+", "");
						if (containerName.equals(Cname)) {
							EList<Attribute> attributesName = model.getClazz().get(i).getAttributes();
							boolean attributeExist = false;
							for (int j = 0; j < attributesName.size(); j++) {

								if (attributesName.get(j).getName().replaceAll("\\s+", "")
										.equals(Name.replaceAll("\\s+", ""))) {
									attributeExist = true;
									break;
								}
							}
							if (!attributeExist) {
								model.getClazz().get(i).getAttributes().add(newAttribute);
								break;
							}
						}
					}

					// refresh Model
					DRepresentation represnt = null;
					for (DRepresentationDescriptor descrp : dView.getOwnedRepresentationDescriptors()) {
						represnt = descrp.getRepresentation();
					}
					DialectManager.INSTANCE.refresh(represnt, new NullProgressMonitor());

				}
			};
			stack.execute(cmd);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}

	public void createAssociation(String AssociationName, String Type, String Target, String Source, Session session) {
		try {

			DAnalysis root = (DAnalysis) session.getSessionResource().getContents().get(0);
			DView dView = root.getOwnedViews().get(0);

			TransactionalEditingDomain domain = TransactionalEditingDomain.Factory.INSTANCE.createEditingDomain();

			CommandStack stack = domain.getCommandStack();

			RecordingCommand cmd = new RecordingCommand(domain) {

				@Override
				protected void doExecute() {
					Model model = getModel();
					MetamodelFactory metamodelFactory = ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelFactory.eINSTANCE;
					List<Clazz> classes = new ArrayList<Clazz>();
					classes = model.getClazz();
					// find both classes target and source:
					Clazz ClassSource = null;
					Clazz ClassTarget = null;
					for (int i = 0; i < classes.size(); i++) {
						if (classes.get(i).getName().replaceAll("\\s+", "").equals(Source.replaceAll("\\s+", ""))) {
							ClassSource = classes.get(i);
						}
						if (classes.get(i).getName().replaceAll("\\s+", "").equals(Target.replaceAll("\\s+", ""))) {
							ClassTarget = classes.get(i);
						}
					}

					switch (Type) {
					case "inheritance":
						ClassSource.setSpecializes(ClassTarget);

						break;
					case "composition":
						ClassSource.setIsMember(ClassTarget);

						break;
					case "association":
						ClassSource.getAssociatedFrom().add(ClassTarget);
						ClassTarget.getAssociatedTo().add(ClassSource);
						break;
					default:
						// code block
					}

					// refresh Model
					DRepresentation represnt = null;
					for (DRepresentationDescriptor descrp : dView.getOwnedRepresentationDescriptors()) {
						represnt = descrp.getRepresentation();
					}
					DialectManager.INSTANCE.refresh(represnt, new NullProgressMonitor());

				}
			};
			stack.execute(cmd);
		} catch (ServiceException e) {
			e.printStackTrace();
		}
	}
	// temp

	public boolean getRandomBoolean() {
		Random random = new Random();
		return random.nextBoolean();
	}

	public EObject getAttributePrediction(EObject node) {
		Session session = SessionManager.INSTANCE.getSession(node);
		assert session != null;

		String scriptLocation = this.config.getProperty("scriptlocation");
		String pythonCommand = this.config.getProperty("pythoncommand");

		String NodeName = node.toString().split(":", 2)[1].replace(")", "");

		NodeName = NodeName.replaceAll("\\s+", "");
		System.out.print("PredictAttibutes for :  ");
		System.out.println(NodeName);
		Model model = getModel();
		List<Clazz> classesInModel = model.getClazz();
		List<ClazzCondidate> packageClassES = model.getClazzcondidate();
		ClazzCondidate pack = null;
		String packName = "";
		if (packageClassES.size() != 0) {
			pack = packageClassES.get(0);
			packName = pack.getName();
		}
		String concepts = "";
		for (int i = 0; i < classesInModel.size(); i++) {
			if (classesInModel.get(i).getName().replaceAll("\\s+", "") != NodeName) {
				// if (getRandomBoolean()) {
				concepts = concepts + "" + classesInModel.get(i).getName().replaceAll("\\s+", "") + ":[";
				List<Attribute> attributes = classesInModel.get(i).getAttributes();
				if (attributes.size() != 0) {
					for (int j = 0; j < attributes.size(); j++) {
						concepts = concepts + attributes.get(j).getName();
						if (j != attributes.size() - 1) {
							concepts = concepts + ",";
						}
					}
				}

				concepts = concepts + "]";
				if (i != classesInModel.size() - 1) {
					concepts = concepts + ",";
				} else {
					concepts = concepts + ";";
				}

			}

		}
		String Results = "";
		try {
			Process P1 = new ProcessBuilder(pythonCommand, scriptLocation + "predictAttributesRelated.py", NodeName,
					concepts, packName).start();

			BufferedReader stdInput = new BufferedReader(new InputStreamReader(P1.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(P1.getErrorStream()));
			String s;

			while ((s = stdInput.readLine()) != null) {
				if (s != "") {

					Results = s;

				}

			}

			while ((s = stdError.readLine()) != null) {
				// add logger !
				System.out.println(s);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("from GPT3:" + Results);
		Results = Results.replace("{", "");
		Results = Results.replace("}", "");

		String[] elements;
		HashMap<String, List<String>> concepts_attributes = new HashMap<String, List<String>>();

		elements = Results.split("],");
		for (int k = 0; k < elements.length; k++) {
			String key = elements[k].split(":")[0];
			key = key.replace("'", "");
			key = key.replace("'", "");
			key = key.replace(" ", "");

			String values = elements[k].split(":")[1];
			values = values.replace("'", "");
			values = values.replace("'", "");
			values = values.replace("[", "");
			values = values.replace(" ", "");
			String[] value = values.split(",");

			List<String> listValues = Arrays.asList(value);
			concepts_attributes.put(key, listValues);

		}
		System.out.println(concepts_attributes);
		System.out.println(NodeName);
		System.out.println(concepts_attributes.keySet());
		if (concepts_attributes.containsKey(NodeName)) {
			System.out.println(concepts_attributes.get(NodeName));

		}

		return node;
	}

	// Temp: 3 same requests to engine
	public EObject getAttributePrediction3(EObject node) {

		Session session = SessionManager.INSTANCE.getSession(node);
		assert session != null;

		String scriptLocation = this.config.getProperty("scriptlocation");
		String pythonCommand = this.config.getProperty("pythoncommand");

		String NodeName = node.toString().split(":", 2)[1].replace(")", "");

		NodeName = NodeName.replaceAll("\\s+", "");
		System.out.print("PredictAttibutes for :  ");
		System.out.println(NodeName);
		String input = "";
		List<String> Results = new ArrayList<String>();
		HashMap<String, String> typeAttributes = new HashMap<String, String>();
		for (int l = 0; l < 3; l++) {
			System.out.println("predicting " + l);
			List<String> attributes = new ArrayList<String>();
			for (int i = 1; i < node.eContents().size(); i++) {
				attributes.add(node.eContents().get(i).toString().split(" ", 3)[2].split(":", 3)[0]);
			}

			if (node.eContents().size() > 1) {
				input = attributes.get(0);
				for (int i = 1; i < attributes.size(); i++) {
					input = input.concat(",").concat(attributes.get(i));
				}
			} else
				input = "";

			try {
				Process P1 = new ProcessBuilder(pythonCommand, scriptLocation + "predictAttributes.py", NodeName, input,
						"Attribute").start();

				BufferedReader stdInput = new BufferedReader(new InputStreamReader(P1.getInputStream()));
				BufferedReader stdError = new BufferedReader(new InputStreamReader(P1.getErrorStream()));
				String s;
				while ((s = stdInput.readLine()) != null) {
					if (s != "") {

						Results.add(s);

					}

				}

				while ((s = stdError.readLine()) != null) {
					// add logger !
					System.out.println(s);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			// arrayAttributes = Results.toArray(new String[0]);
		}
		// print received attributes from python script

		List<String> ResultsTyped = new ArrayList<String>();

		// this.classAttributes.put(NodeName, typeAttributes);
		Map<String, Integer> resultMap = new HashMap<String, Integer>();
		for (int i = 0; i < Results.size(); i++) {

			if (!resultMap.keySet().contains(Results.get(i))) {
				resultMap.put(Results.get(i), 0);
			}
			resultMap.merge(Results.get(i), 1, Integer::sum);

		}

		for (String name : resultMap.keySet()) {
			String Type = "";
			if (name != "") {
				try {
					Process P2 = new ProcessBuilder(pythonCommand, scriptLocation + "predictAttributes.py", name, input,
							"Type").start();
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
			}
			typeAttributes.put(name, Type);
			// typeAttributes.entrySet().stream().forEach(System.out::println);

			// createAttribute(arrayAttributes[i], Type, NodeName, session);

		}
		resultMap.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		for (int i = 0; i < Results.size(); i++) {
			if (Results.get(i) != "" && typeAttributes.get(Results.get(i)) != "") {
				ResultsTyped.add(Results.get(i).concat(":").concat(typeAttributes.get(Results.get(i))));
				System.out.println(Results.get(i).concat(":").concat(typeAttributes.get(Results.get(i))));
			}

		}
		return node;
	}

	// the real one
	public EObject getAttributePrediction_(EObject node) {

		Session session = SessionManager.INSTANCE.getSession(node);
		assert session != null;

		String NodeName = node.toString().split(":", 2)[1].replace(")", "");

		NodeName = NodeName.replaceAll("\\s+", "");
		System.out.print("PredictAttibutes for :  ");
		System.out.println(NodeName);
		String[] arrayAttributes;
		HashMap<String, String> typeAttributes = new HashMap<String, String>();
		if (classAttributes.containsKey(NodeName) && (!classAttributes.get(NodeName).isEmpty())) {

			typeAttributes = classAttributes.get(NodeName);
			arrayAttributes = typeAttributes.keySet().toArray(new String[typeAttributes.keySet().size()]);
		} else {
			List<String> attributes = new ArrayList<String>();
			for (int i = 1; i < node.eContents().size(); i++) {
				attributes.add(node.eContents().get(i).toString().split(" ", 3)[2].split(":", 3)[0]);
			}
			String input;
			if (node.eContents().size() > 1) {
				input = attributes.get(0);
				for (int i = 1; i < attributes.size(); i++) {
					input = input.concat(",").concat(attributes.get(i));
				}
			} else
				input = "";
			List<String> Results = new ArrayList<String>();

			String scriptLocation = this.config.getProperty("scriptlocation");
			String pythonCommand = this.config.getProperty("pythoncommand");

			try {
				Process P1 = new ProcessBuilder(pythonCommand, scriptLocation + "predictAttributes.py", NodeName, input,
						"Attribute").start();

				BufferedReader stdInput = new BufferedReader(new InputStreamReader(P1.getInputStream()));
				BufferedReader stdError = new BufferedReader(new InputStreamReader(P1.getErrorStream()));
				String s;
				while ((s = stdInput.readLine()) != null) {
					if (s != "") {
						Results.add(s);
					}

				}

				while ((s = stdError.readLine()) != null) {
					// add logger !
					System.out.println(s);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			arrayAttributes = Results.toArray(new String[0]);

			// print received attributes from python script
			for (int i = 0; i < arrayAttributes.length; i++) {
				String Type = "";
				if (arrayAttributes[i] != "") {
					try {
						Process P2 = new ProcessBuilder(pythonCommand, scriptLocation + "predictAttributes.py",
								arrayAttributes[i], input, "Type").start();
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
				}
				typeAttributes.put(arrayAttributes[i], Type);

				// createAttribute(arrayAttributes[i], Type, NodeName, session);

			}

		}
		List<String> ResultsTyped = new ArrayList<String>();

		for (int i = 0; i < arrayAttributes.length; i++) {
			if (arrayAttributes[i] != "" && typeAttributes.get(arrayAttributes[i]) != "") {
				ResultsTyped.add(arrayAttributes[i].concat(":").concat(typeAttributes.get(arrayAttributes[i])));
				System.out.println(arrayAttributes[i].concat(":").concat(typeAttributes.get(arrayAttributes[i])));

			}

		}

		String[] ArrayResultsTyped = ResultsTyped.toArray(new String[0]);
		ElementListSelectionDialog dialog = new ElementListSelectionDialog(Display.getCurrent().getActiveShell(),
				new LabelProvider());

		dialog.setElements(ArrayResultsTyped);
		dialog.setTitle("select appropriate attributes, press ctrl for multiple selection");
		// user pressed cancel

		dialog.setMultipleSelection(true);

		if (dialog.open() != Window.OK) {
			// return false;
		}
		Object[] result = dialog.getResult();
		for (int i = 0; i < result.length; i++) {
			String res = (String) result[i];

			res = res.split(":")[0];
			createAttribute(res, typeAttributes.get(res), NodeName, session);
			// don't show already selected attributes
			typeAttributes.remove(res);
		}
		// this.classAttributes.put(NodeName, typeAttributes);
		return node;
	}

	// getClassPredictionRanking
	@SuppressWarnings("null")
	public EObject getClassPrediction(EObject rootModel) {
		Session session = SessionManager.INSTANCE.getSession(rootModel);
		assert session != null;
		String[] arrayConcepts = new String[50];
		List<String> AllclassNames = new ArrayList<String>();
		Model model = getModel();
		List<Clazz> classesInModel = model.getClazz();
		String className = "";
		List<ClazzCondidate> classeCondidateInModel = model.getClazzcondidate();

		for (int i = 0; i < classesInModel.size(); i++) {
			AllclassNames.add(classesInModel.get(i).getName());

		}
		for (int i = 0; i < classeCondidateInModel.size(); i++) {
			AllclassNames.add(classeCondidateInModel.get(i).getName());
		}
		String input = "";

		// heuristic: what to send to GPT3

		List<String[]> predictionLists = new ArrayList<String[]>();
		String scriptLocation = this.config.getProperty("scriptlocation");
		String pythonCommand = this.config.getProperty("pythoncommand");
		for (int i = 0; i < classesInModel.size(); i++) {

			className = classesInModel.get(i).getName();
			for (int z = 0; z < classesInModel.size(); z++) {
				input = className;
				List<String> Concepts = new ArrayList<String>();

				if (!classesInModel.get(z).getName().equals(className)) {
					if (input != "") {
						input = input.concat(",").concat(classesInModel.get(z).getName());
						try {
							Process P = new ProcessBuilder(pythonCommand, scriptLocation + "predictConcepts.py", input)
									.start();

							BufferedReader stdInput = new BufferedReader(new InputStreamReader(P.getInputStream()));
							BufferedReader stdError = new BufferedReader(new InputStreamReader(P.getErrorStream()));

							String s;
							while ((s = stdInput.readLine()) != null) {
								if (!AllclassNames.contains(s)) {
									Concepts.add(s.toLowerCase());
								}
							}

							while ((s = stdError.readLine()) != null) { // add logger !
								System.out.println(s);
							}
						} catch (IOException e) {
							e.printStackTrace();
						}

						arrayConcepts = Concepts.toArray(new String[0]);
						predictionLists.add(arrayConcepts);

					}
				}
			}
		}

		Map<String, Integer> result = new HashMap<String, Integer>();
		for (int i = 0; i < predictionLists.size(); i++) {
			System.out.println("predictionLists");
			for (int j = 0; j < predictionLists.get(i).length; j++) {
				if (!result.keySet().contains(predictionLists.get(i)[j])) {
					result.put(predictionLists.get(i)[j], 0);
				}
				result.merge(predictionLists.get(i)[j], 1, Integer::sum);

			}
		}
		System.out.println("printing sorted : ");
		result.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);

		return null;
	}

	public EObject getClassPrediction_(EObject rootModel) {

		Session session = SessionManager.INSTANCE.getSession(rootModel);
		assert session != null;
		String[] arrayConcepts = new String[50];
		List<String> Concepts = new ArrayList<String>();

		List<String> classNames = new ArrayList<String>();
		List<String> AllclassNames = new ArrayList<String>();
		Model model = getModel();
		List<Clazz> classesInModel = model.getClazz();
		String className = "";
		List<ClazzCondidate> classeCondidateInModel = model.getClazzcondidate();

		for (int i = 0; i < classesInModel.size(); i++) {
			AllclassNames.add(classesInModel.get(i).getName());

		}
		for (int i = 0; i < classeCondidateInModel.size(); i++) {
			AllclassNames.add(classeCondidateInModel.get(i).getName());
		}
		String input = "";
		if (rootModel instanceof Model) {
			System.out.println("from one Canvas");

			for (int i = 0; i < classesInModel.size(); i++) {

				input = input.concat(",").concat(classesInModel.get(i).getName());
				classNames.add(classesInModel.get(i).getName());
			}
		} else if (rootModel instanceof Clazz) {
			System.out.print("from one class");
			Clazz inputClass = (Clazz) rootModel;
			input = inputClass.getName();
			className = input;
			classNames.add(inputClass.getName());
			// heuristic: what to send to GPT3
			Random rand = new Random();
			String randomElement = AllclassNames.get(rand.nextInt(AllclassNames.size()));
			input = input.concat(",").concat(randomElement);
			System.out.println(className);

		}
		if (relatedClasses.containsKey(className) && !relatedClasses.get(className).isEmpty()) {
			System.out.println("already found in Cash! ");
			arrayConcepts = relatedClasses.get(className).toArray(new String[0]);
		} else {
			System.out.println("not found in Cash! , start predicting ... ");
			Process p;

			String scriptLocation = this.config.getProperty("scriptlocation");
			String pythonCommand = this.config.getProperty("pythoncommand");
			if (input != "") {
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

					while ((s = stdError.readLine()) != null) { // add logger !
						System.out.println(s);
					}
				} catch (IOException e) {
					e.printStackTrace();
				}

				arrayConcepts = Concepts.toArray(new String[0]);
			}

			// add to cach or not ?
			// relatedClasses.put(className, Concepts);
		}

		// create class condidate
		Collection<EObject> objects;
		Collection<DRepresentation> allRepresentations = DialectManager.INSTANCE.getAllRepresentations(session);
		for (DRepresentation representation : allRepresentations) {
			DialectManager.INSTANCE.refresh(representation, new NullProgressMonitor());
		}
		objects = new EObjectQuery(rootModel)
				.getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
		EObject eob = objects.iterator().next();
		int x = 0;
		for (int i = 0; i < arrayConcepts.length; i++) {
			System.out.println("creaating a condidate");

			if (!containsIgnoreCase(AllclassNames, arrayConcepts[i].toLowerCase())) {
				System.out.println(arrayConcepts[i]);

				x = x + 1;
				setGraphicalHintsNEAR_ExistingNode((DDiagramElement) eob, (i + 1) * 80);
				createClassCondidate(arrayConcepts[i], session);
			}

		}
		if (x == 0) {
			System.out.println("no further prediction ...");
			MessageBox dialog = new MessageBox(Display.getCurrent().getActiveShell(), SWT.OK);
			dialog.setText("No further suggestions are available");

			int returnCode = dialog.open();

		}
		return null;
	}


	public void predictAssociationName(String className, String relatedClass ,String Type) {
		String scriptLocation = this.config.getProperty("scriptlocation");
		String pythonCommand = this.config.getProperty("pythoncommand");
		try {
			Process P = new ProcessBuilder(pythonCommand, scriptLocation + "predictAssociationNames.py",
					className,relatedClass).start();

			
			BufferedReader stdInput = new BufferedReader(new InputStreamReader(P.getInputStream()));
			BufferedReader stdError = new BufferedReader(new InputStreamReader(P.getErrorStream()));

			String s, res = null;
			while ((s = stdInput.readLine()) != null) {

				res = s;
				System.out.print(className + ","+ relatedClass + " => " + res);
				System.out.println(" : "+ Type);
			}

			while ((s = stdError.readLine()) != null) { // add logger !
				System.out.println(s);
			}
		
		} catch (IOException e) {
			e.printStackTrace();

		}
		
	}

	// predict type of association
	public EObject getAssociationPrediction(EObject rootModel) {

		Session session = SessionManager.INSTANCE.getSession(rootModel);
		assert session != null;
		String className;

		Model model = getModel();
		List<Clazz> classesInModel = model.getClazz();
		String scriptLocation = this.config.getProperty("scriptlocation");
		String pythonCommand = this.config.getProperty("pythoncommand");
		if (rootModel instanceof Clazz) {
			className = rootModel.toString().split(":")[1];
			className = className.substring(1, className.length() - 1);
			List<String> classesAssociatedTo = new ArrayList<String>();
			for (int i = 0; i < classesInModel.size(); i++) {
				if (classesInModel.get(i).getName().equals(className)) {

					if (classesInModel.get(i).getAssociatedTo() != null) {
						for (int j = 0; j < classesInModel.get(i).getAssociatedTo().size(); j++) {
							System.out.println("is associated");

							System.out.println(classesInModel.get(i).getAssociatedTo().get(j).getName());
							classesAssociatedTo.add(classesInModel.get(i).getAssociatedTo().get(j).getName());
						}
					}
					if (classesInModel.get(i).getAssociatedFrom() != null) {
						for (int j = 0; j < classesInModel.get(i).getAssociatedFrom().size(); j++) {
							System.out.println("is associatedfrom");
							classesAssociatedTo.add(classesInModel.get(i).getAssociatedFrom().get(j).getName());
						}
					}

					if (classesInModel.get(i).getIsMember() != null) {
						System.out.println("is memebr");
						System.out.println(classesInModel.get(i).getIsMember().getName());
						classesAssociatedTo.add(classesInModel.get(i).getIsMember().getName());
					}
					if (classesInModel.get(i).getSpecializes() != null) {
						System.out.println("is special");
						classesAssociatedTo.add(classesInModel.get(i).getSpecializes().getName());
						System.out.println(classesInModel.get(i).getSpecializes().getName());
					}
				}
			}

			for (int i = 0; i < classesInModel.size(); i++) {
				if (!className.replaceAll("\\s+", "").equals(classesInModel.get(i).getName())) {

					if (!classesAssociatedTo.contains(classesInModel.get(i).getName().replaceAll("\\s+", ""))) {
						

						String input = classesInModel.get(i).getName().concat(" , ").concat(className);
						try {
							Process P = new ProcessBuilder(pythonCommand, scriptLocation + "predictAssociation.py",
									input).start();

							String line = "";
							BufferedReader stdInput = new BufferedReader(new InputStreamReader(P.getInputStream()));
							BufferedReader stdError = new BufferedReader(new InputStreamReader(P.getErrorStream()));

							String s, res = null;
							while ((s = stdInput.readLine()) != null) {

								res = s;
							}

							while ((s = stdError.readLine()) != null) { // add logger !
								System.out.println(s);
							}
							if (res != null) {
								createAssociation(res, res.replaceAll("\\s+", ""), classesInModel.get(i).getName(),
										className, session);
								predictAssociationName(className,classesInModel.get(i).getName(),res);
							}
						} catch (IOException e) {
							e.printStackTrace();

						}
					}
				}
			}
		}

		return null;
	}

	public EObject approveClassCondidate(EObject rootModel) throws InterruptedException {
		Session session = SessionManager.INSTANCE.getSession(rootModel);
		assert session != null;
		String className = "";
		if (rootModel instanceof ClazzCondidate) {
			System.out.println(rootModel);
			className = rootModel.toString().split(":", 2)[1];
			className = className.replace(")", " ");

		} else {
			className = rootModel.toString().split(" ", 2)[1];
			System.out.println(className);

		}
		if (className.contains(":")) {
			className = className.split(":", 0)[1].replace(")", "");
		}
		Collection<EObject> objects;
		Collection<DRepresentation> allRepresentations = DialectManager.INSTANCE.getAllRepresentations(session);
		for (DRepresentation representation : allRepresentations) {
			DialectManager.INSTANCE.refresh(representation, new NullProgressMonitor());
		}
		objects = new EObjectQuery(rootModel)
				.getInverseReferences(ViewpointPackage.Literals.DSEMANTIC_DECORATOR__TARGET);
		EObject eob = objects.iterator().next();
		// the new class should should have the same coordinates as the condidate class

		setGraphicalHintsFromExistingNode((DDiagramElement) eob);
		createClass(className, session);
		deletetClassCondidate(className, session);
		Model model = getModel();

		// !!!! remove comments for caching !
		// run thread (caching system)

		/*
		 * callableThread C = new callableThread(model, className);
		 * 
		 * 
		 * // creating thread
		 * 
		 * this.classAttributes.putAll(C.call());
		 */

		List<Clazz> classesInModel = model.getClazz();

		/*
		 * for (int i = 0; i < classesInModel.size(); i++) { if
		 * (!classAttributes.containsKey(classesInModel.get(i).getName())) {
		 * callableThread C2 = new callableThread(model,
		 * classesInModel.get(i).getName()); // creating thread
		 * this.classAttributes.putAll(C2.call());
		 * 
		 * } }
		 */
		return rootModel;
	}

}

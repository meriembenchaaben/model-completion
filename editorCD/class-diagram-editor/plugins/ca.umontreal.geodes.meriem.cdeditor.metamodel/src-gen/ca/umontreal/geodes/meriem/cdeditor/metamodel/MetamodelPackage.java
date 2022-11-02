/**
 */
package ca.umontreal.geodes.meriem.cdeditor.metamodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelFactory
 * @model kind="package"
 * @generated
 */
public interface MetamodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "metamodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.umontreal.geodes/metamodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "metamodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MetamodelPackage eINSTANCE = ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.MetamodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ModelImpl
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.MetamodelPackageImpl#getModel()
	 * @generated
	 */
	int MODEL = 0;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__OPERATION = 0;

	/**
	 * The feature id for the '<em><b>Clazz</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CLAZZ = 1;

	/**
	 * The feature id for the '<em><b>Attribute</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ATTRIBUTE = 2;

	/**
	 * The feature id for the '<em><b>Attributecondidate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ATTRIBUTECONDIDATE = 3;

	/**
	 * The feature id for the '<em><b>Clazzcondidate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__CLAZZCONDIDATE = 4;

	/**
	 * The feature id for the '<em><b>Association</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL__ASSOCIATION = 5;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.NamedElementImpl
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.MetamodelPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.TypedElementImpl <em>Typed Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.TypedElementImpl
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.MetamodelPackageImpl#getTypedElement()
	 * @generated
	 */
	int TYPED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT__TYPE = 0;

	/**
	 * The number of structural features of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Typed Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.OperationImpl <em>Operation</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.OperationImpl
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.MetamodelPackageImpl#getOperation()
	 * @generated
	 */
	int OPERATION = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The number of structural features of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Operation</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OPERATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ClazzImpl <em>Clazz</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ClazzImpl
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.MetamodelPackageImpl#getClazz()
	 * @generated
	 */
	int CLAZZ = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Generalizes</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__GENERALIZES = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Specializes</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__SPECIALIZES = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Associated From</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__ASSOCIATED_FROM = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Associated To</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__ASSOCIATED_TO = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Has</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__HAS = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Is Member</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__IS_MEMBER = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Clazz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Clazz</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.AttributeImpl <em>Attribute</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.AttributeImpl
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.MetamodelPackageImpl#getAttribute()
	 * @generated
	 */
	int ATTRIBUTE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Attribute</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ClazzCondidateImpl <em>Clazz Condidate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ClazzCondidateImpl
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.MetamodelPackageImpl#getClazzCondidate()
	 * @generated
	 */
	int CLAZZ_CONDIDATE = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ_CONDIDATE__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Attributecondidate</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ_CONDIDATE__ATTRIBUTECONDIDATE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Clazz Condidate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ_CONDIDATE_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Clazz Condidate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAZZ_CONDIDATE_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.AttributeCondidateImpl <em>Attribute Condidate</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.AttributeCondidateImpl
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.MetamodelPackageImpl#getAttributeCondidate()
	 * @generated
	 */
	int ATTRIBUTE_CONDIDATE = 7;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONDIDATE__TYPE = TYPED_ELEMENT__TYPE;

	/**
	 * The number of structural features of the '<em>Attribute Condidate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONDIDATE_FEATURE_COUNT = TYPED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Attribute Condidate</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ATTRIBUTE_CONDIDATE_OPERATION_COUNT = TYPED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.AssociationImpl <em>Association</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.AssociationImpl
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.MetamodelPackageImpl#getAssociation()
	 * @generated
	 */
	int ASSOCIATION = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Is Composition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IS_COMPOSITION = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IS_ASSOCIATION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Is Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__IS_INHERITANCE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__SOURCE = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION__TARGET = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Association</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ASSOCIATION_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Model <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Model
	 * @generated
	 */
	EClass getModel();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Model#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Model#getOperation()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Model#getClazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clazz</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Model#getClazz()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Clazz();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Model#getAttribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attribute</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Model#getAttribute()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Attribute();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Model#getAttributecondidate <em>Attributecondidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributecondidate</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Model#getAttributecondidate()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Attributecondidate();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Model#getClazzcondidate <em>Clazzcondidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clazzcondidate</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Model#getClazzcondidate()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Clazzcondidate();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Model#getAssociation <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Association</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Model#getAssociation()
	 * @see #getModel()
	 * @generated
	 */
	EReference getModel_Association();

	/**
	 * Returns the meta object for class '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.TypedElement <em>Typed Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Typed Element</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.TypedElement
	 * @generated
	 */
	EClass getTypedElement();

	/**
	 * Returns the meta object for the attribute '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.TypedElement#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.TypedElement#getType()
	 * @see #getTypedElement()
	 * @generated
	 */
	EAttribute getTypedElement_Type();

	/**
	 * Returns the meta object for class '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Operation</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Operation
	 * @generated
	 */
	EClass getOperation();

	/**
	 * Returns the meta object for class '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz <em>Clazz</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clazz</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz
	 * @generated
	 */
	EClass getClazz();

	/**
	 * Returns the meta object for the reference list '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getGeneralizes <em>Generalizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Generalizes</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getGeneralizes()
	 * @see #getClazz()
	 * @generated
	 */
	EReference getClazz_Generalizes();

	/**
	 * Returns the meta object for the reference '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Specializes</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getSpecializes()
	 * @see #getClazz()
	 * @generated
	 */
	EReference getClazz_Specializes();

	/**
	 * Returns the meta object for the reference list '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getAssociatedFrom <em>Associated From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associated From</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getAssociatedFrom()
	 * @see #getClazz()
	 * @generated
	 */
	EReference getClazz_AssociatedFrom();

	/**
	 * Returns the meta object for the reference list '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getAssociatedTo <em>Associated To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Associated To</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getAssociatedTo()
	 * @see #getClazz()
	 * @generated
	 */
	EReference getClazz_AssociatedTo();

	/**
	 * Returns the meta object for the reference list '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Has</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getHas()
	 * @see #getClazz()
	 * @generated
	 */
	EReference getClazz_Has();

	/**
	 * Returns the meta object for the reference '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getIsMember <em>Is Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is Member</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getIsMember()
	 * @see #getClazz()
	 * @generated
	 */
	EReference getClazz_IsMember();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getAttributes <em>Attributes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributes</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getAttributes()
	 * @see #getClazz()
	 * @generated
	 */
	EReference getClazz_Attributes();

	/**
	 * Returns the meta object for class '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Attribute
	 * @generated
	 */
	EClass getAttribute();

	/**
	 * Returns the meta object for class '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.ClazzCondidate <em>Clazz Condidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clazz Condidate</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.ClazzCondidate
	 * @generated
	 */
	EClass getClazzCondidate();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.ClazzCondidate#getAttributecondidate <em>Attributecondidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Attributecondidate</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.ClazzCondidate#getAttributecondidate()
	 * @see #getClazzCondidate()
	 * @generated
	 */
	EReference getClazzCondidate_Attributecondidate();

	/**
	 * Returns the meta object for class '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.AttributeCondidate <em>Attribute Condidate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Attribute Condidate</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.AttributeCondidate
	 * @generated
	 */
	EClass getAttributeCondidate();

	/**
	 * Returns the meta object for class '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Association <em>Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Association</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Association
	 * @generated
	 */
	EClass getAssociation();

	/**
	 * Returns the meta object for the attribute '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Association#isIsComposition <em>Is Composition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Composition</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Association#isIsComposition()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_IsComposition();

	/**
	 * Returns the meta object for the attribute '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Association#isIsAssociation <em>Is Association</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Association</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Association#isIsAssociation()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_IsAssociation();

	/**
	 * Returns the meta object for the attribute '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Association#isIsInheritance <em>Is Inheritance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Inheritance</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Association#isIsInheritance()
	 * @see #getAssociation()
	 * @generated
	 */
	EAttribute getAssociation_IsInheritance();

	/**
	 * Returns the meta object for the reference '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Association#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Association#getSource()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Source();

	/**
	 * Returns the meta object for the reference '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Association#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Association#getTarget()
	 * @see #getAssociation()
	 * @generated
	 */
	EReference getAssociation_Target();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MetamodelFactory getMetamodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ModelImpl
		 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.MetamodelPackageImpl#getModel()
		 * @generated
		 */
		EClass MODEL = eINSTANCE.getModel();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__OPERATION = eINSTANCE.getModel_Operation();

		/**
		 * The meta object literal for the '<em><b>Clazz</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CLAZZ = eINSTANCE.getModel_Clazz();

		/**
		 * The meta object literal for the '<em><b>Attribute</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ATTRIBUTE = eINSTANCE.getModel_Attribute();

		/**
		 * The meta object literal for the '<em><b>Attributecondidate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ATTRIBUTECONDIDATE = eINSTANCE.getModel_Attributecondidate();

		/**
		 * The meta object literal for the '<em><b>Clazzcondidate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__CLAZZCONDIDATE = eINSTANCE.getModel_Clazzcondidate();

		/**
		 * The meta object literal for the '<em><b>Association</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MODEL__ASSOCIATION = eINSTANCE.getModel_Association();

		/**
		 * The meta object literal for the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.NamedElementImpl
		 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.MetamodelPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.TypedElementImpl <em>Typed Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.TypedElementImpl
		 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.MetamodelPackageImpl#getTypedElement()
		 * @generated
		 */
		EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

		/**
		 * The meta object literal for the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.OperationImpl <em>Operation</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.OperationImpl
		 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.MetamodelPackageImpl#getOperation()
		 * @generated
		 */
		EClass OPERATION = eINSTANCE.getOperation();

		/**
		 * The meta object literal for the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ClazzImpl <em>Clazz</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ClazzImpl
		 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.MetamodelPackageImpl#getClazz()
		 * @generated
		 */
		EClass CLAZZ = eINSTANCE.getClazz();

		/**
		 * The meta object literal for the '<em><b>Generalizes</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAZZ__GENERALIZES = eINSTANCE.getClazz_Generalizes();

		/**
		 * The meta object literal for the '<em><b>Specializes</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAZZ__SPECIALIZES = eINSTANCE.getClazz_Specializes();

		/**
		 * The meta object literal for the '<em><b>Associated From</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAZZ__ASSOCIATED_FROM = eINSTANCE.getClazz_AssociatedFrom();

		/**
		 * The meta object literal for the '<em><b>Associated To</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAZZ__ASSOCIATED_TO = eINSTANCE.getClazz_AssociatedTo();

		/**
		 * The meta object literal for the '<em><b>Has</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAZZ__HAS = eINSTANCE.getClazz_Has();

		/**
		 * The meta object literal for the '<em><b>Is Member</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAZZ__IS_MEMBER = eINSTANCE.getClazz_IsMember();

		/**
		 * The meta object literal for the '<em><b>Attributes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAZZ__ATTRIBUTES = eINSTANCE.getClazz_Attributes();

		/**
		 * The meta object literal for the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.AttributeImpl <em>Attribute</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.AttributeImpl
		 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.MetamodelPackageImpl#getAttribute()
		 * @generated
		 */
		EClass ATTRIBUTE = eINSTANCE.getAttribute();

		/**
		 * The meta object literal for the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ClazzCondidateImpl <em>Clazz Condidate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ClazzCondidateImpl
		 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.MetamodelPackageImpl#getClazzCondidate()
		 * @generated
		 */
		EClass CLAZZ_CONDIDATE = eINSTANCE.getClazzCondidate();

		/**
		 * The meta object literal for the '<em><b>Attributecondidate</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAZZ_CONDIDATE__ATTRIBUTECONDIDATE = eINSTANCE.getClazzCondidate_Attributecondidate();

		/**
		 * The meta object literal for the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.AttributeCondidateImpl <em>Attribute Condidate</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.AttributeCondidateImpl
		 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.MetamodelPackageImpl#getAttributeCondidate()
		 * @generated
		 */
		EClass ATTRIBUTE_CONDIDATE = eINSTANCE.getAttributeCondidate();

		/**
		 * The meta object literal for the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.AssociationImpl <em>Association</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.AssociationImpl
		 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.MetamodelPackageImpl#getAssociation()
		 * @generated
		 */
		EClass ASSOCIATION = eINSTANCE.getAssociation();

		/**
		 * The meta object literal for the '<em><b>Is Composition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__IS_COMPOSITION = eINSTANCE.getAssociation_IsComposition();

		/**
		 * The meta object literal for the '<em><b>Is Association</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__IS_ASSOCIATION = eINSTANCE.getAssociation_IsAssociation();

		/**
		 * The meta object literal for the '<em><b>Is Inheritance</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ASSOCIATION__IS_INHERITANCE = eINSTANCE.getAssociation_IsInheritance();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__SOURCE = eINSTANCE.getAssociation_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ASSOCIATION__TARGET = eINSTANCE.getAssociation_Target();

	}

} //MetamodelPackage

/**
 */
package ca.umontreal.geodes.meriem.cdeditor.metamodel;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Association#isIsComposition <em>Is Composition</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Association#isIsAssociation <em>Is Association</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Association#isIsInheritance <em>Is Inheritance</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Association#getSource <em>Source</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Association#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelPackage#getAssociation()
 * @model
 * @generated
 */
public interface Association extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Is Composition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composition</em>' attribute.
	 * @see #setIsComposition(boolean)
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelPackage#getAssociation_IsComposition()
	 * @model
	 * @generated
	 */
	boolean isIsComposition();

	/**
	 * Sets the value of the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Association#isIsComposition <em>Is Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composition</em>' attribute.
	 * @see #isIsComposition()
	 * @generated
	 */
	void setIsComposition(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Association</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Association</em>' attribute.
	 * @see #setIsAssociation(boolean)
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelPackage#getAssociation_IsAssociation()
	 * @model
	 * @generated
	 */
	boolean isIsAssociation();

	/**
	 * Sets the value of the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Association#isIsAssociation <em>Is Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Association</em>' attribute.
	 * @see #isIsAssociation()
	 * @generated
	 */
	void setIsAssociation(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Inheritance</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Inheritance</em>' attribute.
	 * @see #setIsInheritance(boolean)
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelPackage#getAssociation_IsInheritance()
	 * @model
	 * @generated
	 */
	boolean isIsInheritance();

	/**
	 * Sets the value of the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Association#isIsInheritance <em>Is Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Inheritance</em>' attribute.
	 * @see #isIsInheritance()
	 * @generated
	 */
	void setIsInheritance(boolean value);

	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Clazz)
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelPackage#getAssociation_Source()
	 * @model required="true"
	 * @generated
	 */
	Clazz getSource();

	/**
	 * Sets the value of the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Association#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Clazz value);

	/**
	 * Returns the value of the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Target</em>' reference.
	 * @see #setTarget(Clazz)
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelPackage#getAssociation_Target()
	 * @model required="true"
	 * @generated
	 */
	Clazz getTarget();

	/**
	 * Sets the value of the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Association#getTarget <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Target</em>' reference.
	 * @see #getTarget()
	 * @generated
	 */
	void setTarget(Clazz value);

} // Association

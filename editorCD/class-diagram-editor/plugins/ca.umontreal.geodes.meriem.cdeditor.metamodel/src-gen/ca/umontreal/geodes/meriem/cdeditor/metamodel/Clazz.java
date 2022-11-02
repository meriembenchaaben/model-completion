/**
 */
package ca.umontreal.geodes.meriem.cdeditor.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clazz</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getGeneralizes <em>Generalizes</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getAssociatedFrom <em>Associated From</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getAssociatedTo <em>Associated To</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getHas <em>Has</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getIsMember <em>Is Member</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelPackage#getClazz()
 * @model
 * @generated
 */
public interface Clazz extends NamedElement {
	/**
	 * Returns the value of the '<em><b>Generalizes</b></em>' reference list.
	 * The list contents are of type {@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz}.
	 * It is bidirectional and its opposite is '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getSpecializes <em>Specializes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generalizes</em>' reference list.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelPackage#getClazz_Generalizes()
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getSpecializes
	 * @model opposite="specializes"
	 * @generated
	 */
	EList<Clazz> getGeneralizes();

	/**
	 * Returns the value of the '<em><b>Specializes</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getGeneralizes <em>Generalizes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specializes</em>' reference.
	 * @see #setSpecializes(Clazz)
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelPackage#getClazz_Specializes()
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getGeneralizes
	 * @model opposite="generalizes"
	 * @generated
	 */
	Clazz getSpecializes();

	/**
	 * Sets the value of the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getSpecializes <em>Specializes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specializes</em>' reference.
	 * @see #getSpecializes()
	 * @generated
	 */
	void setSpecializes(Clazz value);

	/**
	 * Returns the value of the '<em><b>Associated From</b></em>' reference list.
	 * The list contents are of type {@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz}.
	 * It is bidirectional and its opposite is '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getAssociatedTo <em>Associated To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated From</em>' reference list.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelPackage#getClazz_AssociatedFrom()
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getAssociatedTo
	 * @model opposite="associatedTo"
	 * @generated
	 */
	EList<Clazz> getAssociatedFrom();

	/**
	 * Returns the value of the '<em><b>Associated To</b></em>' reference list.
	 * The list contents are of type {@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz}.
	 * It is bidirectional and its opposite is '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getAssociatedFrom <em>Associated From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated To</em>' reference list.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelPackage#getClazz_AssociatedTo()
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getAssociatedFrom
	 * @model opposite="associatedFrom"
	 * @generated
	 */
	EList<Clazz> getAssociatedTo();

	/**
	 * Returns the value of the '<em><b>Has</b></em>' reference list.
	 * The list contents are of type {@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz}.
	 * It is bidirectional and its opposite is '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getIsMember <em>Is Member</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has</em>' reference list.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelPackage#getClazz_Has()
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getIsMember
	 * @model opposite="isMember"
	 * @generated
	 */
	EList<Clazz> getHas();

	/**
	 * Returns the value of the '<em><b>Is Member</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getHas <em>Has</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Member</em>' reference.
	 * @see #setIsMember(Clazz)
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelPackage#getClazz_IsMember()
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getHas
	 * @model opposite="has"
	 * @generated
	 */
	Clazz getIsMember();

	/**
	 * Sets the value of the '{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz#getIsMember <em>Is Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Member</em>' reference.
	 * @see #getIsMember()
	 * @generated
	 */
	void setIsMember(Clazz value);

	/**
	 * Returns the value of the '<em><b>Attributes</b></em>' containment reference list.
	 * The list contents are of type {@link ca.umontreal.geodes.meriem.cdeditor.metamodel.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributes</em>' containment reference list.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelPackage#getClazz_Attributes()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getAttributes();

} // Clazz

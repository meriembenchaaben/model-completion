/**
 */
package ca.umontreal.geodes.meriem.cdeditor.metamodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clazz Condidate</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.ClazzCondidate#getAttributecondidate <em>Attributecondidate</em>}</li>
 * </ul>
 *
 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelPackage#getClazzCondidate()
 * @model
 * @generated
 */
public interface ClazzCondidate extends NamedElement {

	/**
	 * Returns the value of the '<em><b>Attributecondidate</b></em>' containment reference list.
	 * The list contents are of type {@link ca.umontreal.geodes.meriem.cdeditor.metamodel.AttributeCondidate}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Attributecondidate</em>' containment reference list.
	 * @see ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelPackage#getClazzCondidate_Attributecondidate()
	 * @model containment="true"
	 * @generated
	 */
	EList<AttributeCondidate> getAttributecondidate();
} // ClazzCondidate

/**
 */
package ca.umontreal.geodes.meriem.cdeditor.metamodel.impl;

import ca.umontreal.geodes.meriem.cdeditor.metamodel.Association;
import ca.umontreal.geodes.meriem.cdeditor.metamodel.Attribute;
import ca.umontreal.geodes.meriem.cdeditor.metamodel.AttributeCondidate;
import ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz;
import ca.umontreal.geodes.meriem.cdeditor.metamodel.ClazzCondidate;
import ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelPackage;
import ca.umontreal.geodes.meriem.cdeditor.metamodel.Model;
import ca.umontreal.geodes.meriem.cdeditor.metamodel.Operation;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ModelImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ModelImpl#getClazz <em>Clazz</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ModelImpl#getAttribute <em>Attribute</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ModelImpl#getAttributecondidate <em>Attributecondidate</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ModelImpl#getClazzcondidate <em>Clazzcondidate</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ModelImpl#getAssociation <em>Association</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ModelImpl extends MinimalEObjectImpl.Container implements Model {
	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operation;

	/**
	 * The cached value of the '{@link #getClazz() <em>Clazz</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazz()
	 * @generated
	 * @ordered
	 */
	protected EList<Clazz> clazz;

	/**
	 * The cached value of the '{@link #getAttribute() <em>Attribute</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttribute()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attribute;

	/**
	 * The cached value of the '{@link #getAttributecondidate() <em>Attributecondidate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributecondidate()
	 * @generated
	 * @ordered
	 */
	protected EList<AttributeCondidate> attributecondidate;

	/**
	 * The cached value of the '{@link #getClazzcondidate() <em>Clazzcondidate</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClazzcondidate()
	 * @generated
	 * @ordered
	 */
	protected EList<ClazzCondidate> clazzcondidate;

	/**
	 * The cached value of the '{@link #getAssociation() <em>Association</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociation()
	 * @generated
	 * @ordered
	 */
	protected EList<Association> association;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<Operation>(Operation.class, this,
					MetamodelPackage.MODEL__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clazz> getClazz() {
		if (clazz == null) {
			clazz = new EObjectContainmentEList<Clazz>(Clazz.class, this, MetamodelPackage.MODEL__CLAZZ);
		}
		return clazz;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttribute() {
		if (attribute == null) {
			attribute = new EObjectContainmentEList<Attribute>(Attribute.class, this,
					MetamodelPackage.MODEL__ATTRIBUTE);
		}
		return attribute;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AttributeCondidate> getAttributecondidate() {
		if (attributecondidate == null) {
			attributecondidate = new EObjectContainmentEList<AttributeCondidate>(AttributeCondidate.class, this,
					MetamodelPackage.MODEL__ATTRIBUTECONDIDATE);
		}
		return attributecondidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ClazzCondidate> getClazzcondidate() {
		if (clazzcondidate == null) {
			clazzcondidate = new EObjectContainmentEList<ClazzCondidate>(ClazzCondidate.class, this,
					MetamodelPackage.MODEL__CLAZZCONDIDATE);
		}
		return clazzcondidate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Association> getAssociation() {
		if (association == null) {
			association = new EObjectContainmentEList<Association>(Association.class, this,
					MetamodelPackage.MODEL__ASSOCIATION);
		}
		return association;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.MODEL__OPERATION:
			return ((InternalEList<?>) getOperation()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.MODEL__CLAZZ:
			return ((InternalEList<?>) getClazz()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.MODEL__ATTRIBUTE:
			return ((InternalEList<?>) getAttribute()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.MODEL__ATTRIBUTECONDIDATE:
			return ((InternalEList<?>) getAttributecondidate()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.MODEL__CLAZZCONDIDATE:
			return ((InternalEList<?>) getClazzcondidate()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.MODEL__ASSOCIATION:
			return ((InternalEList<?>) getAssociation()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.MODEL__OPERATION:
			return getOperation();
		case MetamodelPackage.MODEL__CLAZZ:
			return getClazz();
		case MetamodelPackage.MODEL__ATTRIBUTE:
			return getAttribute();
		case MetamodelPackage.MODEL__ATTRIBUTECONDIDATE:
			return getAttributecondidate();
		case MetamodelPackage.MODEL__CLAZZCONDIDATE:
			return getClazzcondidate();
		case MetamodelPackage.MODEL__ASSOCIATION:
			return getAssociation();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetamodelPackage.MODEL__OPERATION:
			getOperation().clear();
			getOperation().addAll((Collection<? extends Operation>) newValue);
			return;
		case MetamodelPackage.MODEL__CLAZZ:
			getClazz().clear();
			getClazz().addAll((Collection<? extends Clazz>) newValue);
			return;
		case MetamodelPackage.MODEL__ATTRIBUTE:
			getAttribute().clear();
			getAttribute().addAll((Collection<? extends Attribute>) newValue);
			return;
		case MetamodelPackage.MODEL__ATTRIBUTECONDIDATE:
			getAttributecondidate().clear();
			getAttributecondidate().addAll((Collection<? extends AttributeCondidate>) newValue);
			return;
		case MetamodelPackage.MODEL__CLAZZCONDIDATE:
			getClazzcondidate().clear();
			getClazzcondidate().addAll((Collection<? extends ClazzCondidate>) newValue);
			return;
		case MetamodelPackage.MODEL__ASSOCIATION:
			getAssociation().clear();
			getAssociation().addAll((Collection<? extends Association>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case MetamodelPackage.MODEL__OPERATION:
			getOperation().clear();
			return;
		case MetamodelPackage.MODEL__CLAZZ:
			getClazz().clear();
			return;
		case MetamodelPackage.MODEL__ATTRIBUTE:
			getAttribute().clear();
			return;
		case MetamodelPackage.MODEL__ATTRIBUTECONDIDATE:
			getAttributecondidate().clear();
			return;
		case MetamodelPackage.MODEL__CLAZZCONDIDATE:
			getClazzcondidate().clear();
			return;
		case MetamodelPackage.MODEL__ASSOCIATION:
			getAssociation().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case MetamodelPackage.MODEL__OPERATION:
			return operation != null && !operation.isEmpty();
		case MetamodelPackage.MODEL__CLAZZ:
			return clazz != null && !clazz.isEmpty();
		case MetamodelPackage.MODEL__ATTRIBUTE:
			return attribute != null && !attribute.isEmpty();
		case MetamodelPackage.MODEL__ATTRIBUTECONDIDATE:
			return attributecondidate != null && !attributecondidate.isEmpty();
		case MetamodelPackage.MODEL__CLAZZCONDIDATE:
			return clazzcondidate != null && !clazzcondidate.isEmpty();
		case MetamodelPackage.MODEL__ASSOCIATION:
			return association != null && !association.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ModelImpl

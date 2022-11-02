/**
 */
package ca.umontreal.geodes.meriem.cdeditor.metamodel.impl;

import ca.umontreal.geodes.meriem.cdeditor.metamodel.Association;
import ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz;
import ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Association</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.AssociationImpl#isIsComposition <em>Is Composition</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.AssociationImpl#isIsAssociation <em>Is Association</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.AssociationImpl#isIsInheritance <em>Is Inheritance</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.AssociationImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.AssociationImpl#getTarget <em>Target</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AssociationImpl extends NamedElementImpl implements Association {
	/**
	 * The default value of the '{@link #isIsComposition() <em>Is Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_COMPOSITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsComposition() <em>Is Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsComposition()
	 * @generated
	 * @ordered
	 */
	protected boolean isComposition = IS_COMPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsAssociation() <em>Is Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAssociation()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_ASSOCIATION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsAssociation() <em>Is Association</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsAssociation()
	 * @generated
	 * @ordered
	 */
	protected boolean isAssociation = IS_ASSOCIATION_EDEFAULT;

	/**
	 * The default value of the '{@link #isIsInheritance() <em>Is Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInheritance()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_INHERITANCE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsInheritance() <em>Is Inheritance</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsInheritance()
	 * @generated
	 * @ordered
	 */
	protected boolean isInheritance = IS_INHERITANCE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Clazz source;

	/**
	 * The cached value of the '{@link #getTarget() <em>Target</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTarget()
	 * @generated
	 * @ordered
	 */
	protected Clazz target;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AssociationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.ASSOCIATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsComposition() {
		return isComposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsComposition(boolean newIsComposition) {
		boolean oldIsComposition = isComposition;
		isComposition = newIsComposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ASSOCIATION__IS_COMPOSITION,
					oldIsComposition, isComposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsAssociation() {
		return isAssociation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsAssociation(boolean newIsAssociation) {
		boolean oldIsAssociation = isAssociation;
		isAssociation = newIsAssociation;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ASSOCIATION__IS_ASSOCIATION,
					oldIsAssociation, isAssociation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsInheritance() {
		return isInheritance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsInheritance(boolean newIsInheritance) {
		boolean oldIsInheritance = isInheritance;
		isInheritance = newIsInheritance;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ASSOCIATION__IS_INHERITANCE,
					oldIsInheritance, isInheritance));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clazz getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject) source;
			source = (Clazz) eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.ASSOCIATION__SOURCE,
							oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clazz basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Clazz newSource) {
		Clazz oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ASSOCIATION__SOURCE, oldSource,
					source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clazz getTarget() {
		if (target != null && target.eIsProxy()) {
			InternalEObject oldTarget = (InternalEObject) target;
			target = (Clazz) eResolveProxy(oldTarget);
			if (target != oldTarget) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.ASSOCIATION__TARGET,
							oldTarget, target));
			}
		}
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clazz basicGetTarget() {
		return target;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTarget(Clazz newTarget) {
		Clazz oldTarget = target;
		target = newTarget;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.ASSOCIATION__TARGET, oldTarget,
					target));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MetamodelPackage.ASSOCIATION__IS_COMPOSITION:
			return isIsComposition();
		case MetamodelPackage.ASSOCIATION__IS_ASSOCIATION:
			return isIsAssociation();
		case MetamodelPackage.ASSOCIATION__IS_INHERITANCE:
			return isIsInheritance();
		case MetamodelPackage.ASSOCIATION__SOURCE:
			if (resolve)
				return getSource();
			return basicGetSource();
		case MetamodelPackage.ASSOCIATION__TARGET:
			if (resolve)
				return getTarget();
			return basicGetTarget();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case MetamodelPackage.ASSOCIATION__IS_COMPOSITION:
			setIsComposition((Boolean) newValue);
			return;
		case MetamodelPackage.ASSOCIATION__IS_ASSOCIATION:
			setIsAssociation((Boolean) newValue);
			return;
		case MetamodelPackage.ASSOCIATION__IS_INHERITANCE:
			setIsInheritance((Boolean) newValue);
			return;
		case MetamodelPackage.ASSOCIATION__SOURCE:
			setSource((Clazz) newValue);
			return;
		case MetamodelPackage.ASSOCIATION__TARGET:
			setTarget((Clazz) newValue);
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
		case MetamodelPackage.ASSOCIATION__IS_COMPOSITION:
			setIsComposition(IS_COMPOSITION_EDEFAULT);
			return;
		case MetamodelPackage.ASSOCIATION__IS_ASSOCIATION:
			setIsAssociation(IS_ASSOCIATION_EDEFAULT);
			return;
		case MetamodelPackage.ASSOCIATION__IS_INHERITANCE:
			setIsInheritance(IS_INHERITANCE_EDEFAULT);
			return;
		case MetamodelPackage.ASSOCIATION__SOURCE:
			setSource((Clazz) null);
			return;
		case MetamodelPackage.ASSOCIATION__TARGET:
			setTarget((Clazz) null);
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
		case MetamodelPackage.ASSOCIATION__IS_COMPOSITION:
			return isComposition != IS_COMPOSITION_EDEFAULT;
		case MetamodelPackage.ASSOCIATION__IS_ASSOCIATION:
			return isAssociation != IS_ASSOCIATION_EDEFAULT;
		case MetamodelPackage.ASSOCIATION__IS_INHERITANCE:
			return isInheritance != IS_INHERITANCE_EDEFAULT;
		case MetamodelPackage.ASSOCIATION__SOURCE:
			return source != null;
		case MetamodelPackage.ASSOCIATION__TARGET:
			return target != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isComposition: ");
		result.append(isComposition);
		result.append(", isAssociation: ");
		result.append(isAssociation);
		result.append(", isInheritance: ");
		result.append(isInheritance);
		result.append(')');
		return result.toString();
	}

} //AssociationImpl

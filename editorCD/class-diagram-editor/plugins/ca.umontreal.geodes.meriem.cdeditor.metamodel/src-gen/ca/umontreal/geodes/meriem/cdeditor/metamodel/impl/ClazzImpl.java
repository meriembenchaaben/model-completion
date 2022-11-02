/**
 */
package ca.umontreal.geodes.meriem.cdeditor.metamodel.impl;

import ca.umontreal.geodes.meriem.cdeditor.metamodel.Attribute;
import ca.umontreal.geodes.meriem.cdeditor.metamodel.Clazz;
import ca.umontreal.geodes.meriem.cdeditor.metamodel.MetamodelPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectWithInverseResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clazz</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ClazzImpl#getGeneralizes <em>Generalizes</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ClazzImpl#getSpecializes <em>Specializes</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ClazzImpl#getAssociatedFrom <em>Associated From</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ClazzImpl#getAssociatedTo <em>Associated To</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ClazzImpl#getHas <em>Has</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ClazzImpl#getIsMember <em>Is Member</em>}</li>
 *   <li>{@link ca.umontreal.geodes.meriem.cdeditor.metamodel.impl.ClazzImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClazzImpl extends NamedElementImpl implements Clazz {
	/**
	 * The cached value of the '{@link #getGeneralizes() <em>Generalizes</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneralizes()
	 * @generated
	 * @ordered
	 */
	protected EList<Clazz> generalizes;

	/**
	 * The cached value of the '{@link #getSpecializes() <em>Specializes</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecializes()
	 * @generated
	 * @ordered
	 */
	protected Clazz specializes;

	/**
	 * The cached value of the '{@link #getAssociatedFrom() <em>Associated From</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedFrom()
	 * @generated
	 * @ordered
	 */
	protected EList<Clazz> associatedFrom;

	/**
	 * The cached value of the '{@link #getAssociatedTo() <em>Associated To</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedTo()
	 * @generated
	 * @ordered
	 */
	protected EList<Clazz> associatedTo;

	/**
	 * The cached value of the '{@link #getHas() <em>Has</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHas()
	 * @generated
	 * @ordered
	 */
	protected EList<Clazz> has;

	/**
	 * The cached value of the '{@link #getIsMember() <em>Is Member</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIsMember()
	 * @generated
	 * @ordered
	 */
	protected Clazz isMember;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClazzImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MetamodelPackage.Literals.CLAZZ;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clazz> getGeneralizes() {
		if (generalizes == null) {
			generalizes = new EObjectWithInverseResolvingEList<Clazz>(Clazz.class, this,
					MetamodelPackage.CLAZZ__GENERALIZES, MetamodelPackage.CLAZZ__SPECIALIZES);
		}
		return generalizes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clazz getSpecializes() {
		if (specializes != null && specializes.eIsProxy()) {
			InternalEObject oldSpecializes = (InternalEObject) specializes;
			specializes = (Clazz) eResolveProxy(oldSpecializes);
			if (specializes != oldSpecializes) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.CLAZZ__SPECIALIZES,
							oldSpecializes, specializes));
			}
		}
		return specializes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clazz basicGetSpecializes() {
		return specializes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSpecializes(Clazz newSpecializes, NotificationChain msgs) {
		Clazz oldSpecializes = specializes;
		specializes = newSpecializes;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.CLAZZ__SPECIALIZES, oldSpecializes, newSpecializes);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecializes(Clazz newSpecializes) {
		if (newSpecializes != specializes) {
			NotificationChain msgs = null;
			if (specializes != null)
				msgs = ((InternalEObject) specializes).eInverseRemove(this, MetamodelPackage.CLAZZ__GENERALIZES,
						Clazz.class, msgs);
			if (newSpecializes != null)
				msgs = ((InternalEObject) newSpecializes).eInverseAdd(this, MetamodelPackage.CLAZZ__GENERALIZES,
						Clazz.class, msgs);
			msgs = basicSetSpecializes(newSpecializes, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLAZZ__SPECIALIZES, newSpecializes,
					newSpecializes));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clazz> getAssociatedFrom() {
		if (associatedFrom == null) {
			associatedFrom = new EObjectWithInverseResolvingEList.ManyInverse<Clazz>(Clazz.class, this,
					MetamodelPackage.CLAZZ__ASSOCIATED_FROM, MetamodelPackage.CLAZZ__ASSOCIATED_TO);
		}
		return associatedFrom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clazz> getAssociatedTo() {
		if (associatedTo == null) {
			associatedTo = new EObjectWithInverseResolvingEList.ManyInverse<Clazz>(Clazz.class, this,
					MetamodelPackage.CLAZZ__ASSOCIATED_TO, MetamodelPackage.CLAZZ__ASSOCIATED_FROM);
		}
		return associatedTo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Clazz> getHas() {
		if (has == null) {
			has = new EObjectWithInverseResolvingEList<Clazz>(Clazz.class, this, MetamodelPackage.CLAZZ__HAS,
					MetamodelPackage.CLAZZ__IS_MEMBER);
		}
		return has;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clazz getIsMember() {
		if (isMember != null && isMember.eIsProxy()) {
			InternalEObject oldIsMember = (InternalEObject) isMember;
			isMember = (Clazz) eResolveProxy(oldIsMember);
			if (isMember != oldIsMember) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MetamodelPackage.CLAZZ__IS_MEMBER,
							oldIsMember, isMember));
			}
		}
		return isMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Clazz basicGetIsMember() {
		return isMember;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetIsMember(Clazz newIsMember, NotificationChain msgs) {
		Clazz oldIsMember = isMember;
		isMember = newIsMember;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					MetamodelPackage.CLAZZ__IS_MEMBER, oldIsMember, newIsMember);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsMember(Clazz newIsMember) {
		if (newIsMember != isMember) {
			NotificationChain msgs = null;
			if (isMember != null)
				msgs = ((InternalEObject) isMember).eInverseRemove(this, MetamodelPackage.CLAZZ__HAS, Clazz.class,
						msgs);
			if (newIsMember != null)
				msgs = ((InternalEObject) newIsMember).eInverseAdd(this, MetamodelPackage.CLAZZ__HAS, Clazz.class,
						msgs);
			msgs = basicSetIsMember(newIsMember, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MetamodelPackage.CLAZZ__IS_MEMBER, newIsMember,
					newIsMember));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this,
					MetamodelPackage.CLAZZ__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.CLAZZ__GENERALIZES:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getGeneralizes()).basicAdd(otherEnd, msgs);
		case MetamodelPackage.CLAZZ__SPECIALIZES:
			if (specializes != null)
				msgs = ((InternalEObject) specializes).eInverseRemove(this, MetamodelPackage.CLAZZ__GENERALIZES,
						Clazz.class, msgs);
			return basicSetSpecializes((Clazz) otherEnd, msgs);
		case MetamodelPackage.CLAZZ__ASSOCIATED_FROM:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAssociatedFrom()).basicAdd(otherEnd, msgs);
		case MetamodelPackage.CLAZZ__ASSOCIATED_TO:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getAssociatedTo()).basicAdd(otherEnd, msgs);
		case MetamodelPackage.CLAZZ__HAS:
			return ((InternalEList<InternalEObject>) (InternalEList<?>) getHas()).basicAdd(otherEnd, msgs);
		case MetamodelPackage.CLAZZ__IS_MEMBER:
			if (isMember != null)
				msgs = ((InternalEObject) isMember).eInverseRemove(this, MetamodelPackage.CLAZZ__HAS, Clazz.class,
						msgs);
			return basicSetIsMember((Clazz) otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MetamodelPackage.CLAZZ__GENERALIZES:
			return ((InternalEList<?>) getGeneralizes()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.CLAZZ__SPECIALIZES:
			return basicSetSpecializes(null, msgs);
		case MetamodelPackage.CLAZZ__ASSOCIATED_FROM:
			return ((InternalEList<?>) getAssociatedFrom()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.CLAZZ__ASSOCIATED_TO:
			return ((InternalEList<?>) getAssociatedTo()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.CLAZZ__HAS:
			return ((InternalEList<?>) getHas()).basicRemove(otherEnd, msgs);
		case MetamodelPackage.CLAZZ__IS_MEMBER:
			return basicSetIsMember(null, msgs);
		case MetamodelPackage.CLAZZ__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
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
		case MetamodelPackage.CLAZZ__GENERALIZES:
			return getGeneralizes();
		case MetamodelPackage.CLAZZ__SPECIALIZES:
			if (resolve)
				return getSpecializes();
			return basicGetSpecializes();
		case MetamodelPackage.CLAZZ__ASSOCIATED_FROM:
			return getAssociatedFrom();
		case MetamodelPackage.CLAZZ__ASSOCIATED_TO:
			return getAssociatedTo();
		case MetamodelPackage.CLAZZ__HAS:
			return getHas();
		case MetamodelPackage.CLAZZ__IS_MEMBER:
			if (resolve)
				return getIsMember();
			return basicGetIsMember();
		case MetamodelPackage.CLAZZ__ATTRIBUTES:
			return getAttributes();
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
		case MetamodelPackage.CLAZZ__GENERALIZES:
			getGeneralizes().clear();
			getGeneralizes().addAll((Collection<? extends Clazz>) newValue);
			return;
		case MetamodelPackage.CLAZZ__SPECIALIZES:
			setSpecializes((Clazz) newValue);
			return;
		case MetamodelPackage.CLAZZ__ASSOCIATED_FROM:
			getAssociatedFrom().clear();
			getAssociatedFrom().addAll((Collection<? extends Clazz>) newValue);
			return;
		case MetamodelPackage.CLAZZ__ASSOCIATED_TO:
			getAssociatedTo().clear();
			getAssociatedTo().addAll((Collection<? extends Clazz>) newValue);
			return;
		case MetamodelPackage.CLAZZ__HAS:
			getHas().clear();
			getHas().addAll((Collection<? extends Clazz>) newValue);
			return;
		case MetamodelPackage.CLAZZ__IS_MEMBER:
			setIsMember((Clazz) newValue);
			return;
		case MetamodelPackage.CLAZZ__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends Attribute>) newValue);
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
		case MetamodelPackage.CLAZZ__GENERALIZES:
			getGeneralizes().clear();
			return;
		case MetamodelPackage.CLAZZ__SPECIALIZES:
			setSpecializes((Clazz) null);
			return;
		case MetamodelPackage.CLAZZ__ASSOCIATED_FROM:
			getAssociatedFrom().clear();
			return;
		case MetamodelPackage.CLAZZ__ASSOCIATED_TO:
			getAssociatedTo().clear();
			return;
		case MetamodelPackage.CLAZZ__HAS:
			getHas().clear();
			return;
		case MetamodelPackage.CLAZZ__IS_MEMBER:
			setIsMember((Clazz) null);
			return;
		case MetamodelPackage.CLAZZ__ATTRIBUTES:
			getAttributes().clear();
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
		case MetamodelPackage.CLAZZ__GENERALIZES:
			return generalizes != null && !generalizes.isEmpty();
		case MetamodelPackage.CLAZZ__SPECIALIZES:
			return specializes != null;
		case MetamodelPackage.CLAZZ__ASSOCIATED_FROM:
			return associatedFrom != null && !associatedFrom.isEmpty();
		case MetamodelPackage.CLAZZ__ASSOCIATED_TO:
			return associatedTo != null && !associatedTo.isEmpty();
		case MetamodelPackage.CLAZZ__HAS:
			return has != null && !has.isEmpty();
		case MetamodelPackage.CLAZZ__IS_MEMBER:
			return isMember != null;
		case MetamodelPackage.CLAZZ__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ClazzImpl

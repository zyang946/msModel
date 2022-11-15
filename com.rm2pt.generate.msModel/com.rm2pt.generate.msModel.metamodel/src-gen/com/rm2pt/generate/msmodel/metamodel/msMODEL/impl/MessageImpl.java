/**
 */
package com.rm2pt.generate.msmodel.metamodel.msMODEL.impl;

import com.rm2pt.generate.msmodel.metamodel.msMODEL.LifeLine;
import com.rm2pt.generate.msmodel.metamodel.msMODEL.Message;
import com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import rEMODEL.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MessageImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MessageImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MessageImpl#getTo <em>To</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MessageImpl#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageImpl extends MinimalEObjectImpl.Container implements Message {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected static final String GUARD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected String guard = GUARD_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTo() <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTo()
	 * @generated
	 * @ordered
	 */
	protected LifeLine to;

	/**
	 * The cached value of the '{@link #getAction() <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAction()
	 * @generated
	 * @ordered
	 */
	protected Operation action;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MsMODELPackage.Literals.MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsMODELPackage.MESSAGE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(String newGuard) {
		String oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsMODELPackage.MESSAGE__GUARD, oldGuard, guard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation getAction() {
		if (action != null && action.eIsProxy()) {
			InternalEObject oldAction = (InternalEObject) action;
			action = (Operation) eResolveProxy(oldAction);
			if (action != oldAction) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MsMODELPackage.MESSAGE__ACTION, oldAction,
							action));
			}
		}
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Operation basicGetAction() {
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAction(Operation newAction) {
		Operation oldAction = action;
		action = newAction;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsMODELPackage.MESSAGE__ACTION, oldAction, action));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifeLine getTo() {
		if (to != null && to.eIsProxy()) {
			InternalEObject oldTo = (InternalEObject) to;
			to = (LifeLine) eResolveProxy(oldTo);
			if (to != oldTo) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MsMODELPackage.MESSAGE__TO, oldTo, to));
			}
		}
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifeLine basicGetTo() {
		return to;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTo(LifeLine newTo) {
		LifeLine oldTo = to;
		to = newTo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsMODELPackage.MESSAGE__TO, oldTo, to));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case MsMODELPackage.MESSAGE__NAME:
			return getName();
		case MsMODELPackage.MESSAGE__GUARD:
			return getGuard();
		case MsMODELPackage.MESSAGE__TO:
			if (resolve)
				return getTo();
			return basicGetTo();
		case MsMODELPackage.MESSAGE__ACTION:
			if (resolve)
				return getAction();
			return basicGetAction();
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
		case MsMODELPackage.MESSAGE__NAME:
			setName((String) newValue);
			return;
		case MsMODELPackage.MESSAGE__GUARD:
			setGuard((String) newValue);
			return;
		case MsMODELPackage.MESSAGE__TO:
			setTo((LifeLine) newValue);
			return;
		case MsMODELPackage.MESSAGE__ACTION:
			setAction((Operation) newValue);
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
		case MsMODELPackage.MESSAGE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MsMODELPackage.MESSAGE__GUARD:
			setGuard(GUARD_EDEFAULT);
			return;
		case MsMODELPackage.MESSAGE__TO:
			setTo((LifeLine) null);
			return;
		case MsMODELPackage.MESSAGE__ACTION:
			setAction((Operation) null);
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
		case MsMODELPackage.MESSAGE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MsMODELPackage.MESSAGE__GUARD:
			return GUARD_EDEFAULT == null ? guard != null : !GUARD_EDEFAULT.equals(guard);
		case MsMODELPackage.MESSAGE__TO:
			return to != null;
		case MsMODELPackage.MESSAGE__ACTION:
			return action != null;
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
		result.append(" (name: ");
		result.append(name);
		result.append(", guard: ");
		result.append(guard);
		result.append(')');
		return result.toString();
	}

} //MessageImpl

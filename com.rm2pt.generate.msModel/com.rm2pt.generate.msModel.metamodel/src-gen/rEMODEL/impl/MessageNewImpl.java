/**
 */
package rEMODEL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import rEMODEL.MessageNew;
import rEMODEL.MixEnd;
import rEMODEL.REMODELPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Message New</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.impl.MessageNewImpl#getName <em>Name</em>}</li>
 *   <li>{@link rEMODEL.impl.MessageNewImpl#getSendingEnd <em>Sending End</em>}</li>
 *   <li>{@link rEMODEL.impl.MessageNewImpl#getReceivingEnd <em>Receiving End</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MessageNewImpl extends MinimalEObjectImpl.Container implements MessageNew {
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
	 * The cached value of the '{@link #getSendingEnd() <em>Sending End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSendingEnd()
	 * @generated
	 * @ordered
	 */
	protected MixEnd sendingEnd;

	/**
	 * The cached value of the '{@link #getReceivingEnd() <em>Receiving End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReceivingEnd()
	 * @generated
	 * @ordered
	 */
	protected MixEnd receivingEnd;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageNewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REMODELPackage.Literals.MESSAGE_NEW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, REMODELPackage.MESSAGE_NEW__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixEnd getSendingEnd() {
		if (sendingEnd != null && sendingEnd.eIsProxy()) {
			InternalEObject oldSendingEnd = (InternalEObject) sendingEnd;
			sendingEnd = (MixEnd) eResolveProxy(oldSendingEnd);
			if (sendingEnd != oldSendingEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REMODELPackage.MESSAGE_NEW__SENDING_END,
							oldSendingEnd, sendingEnd));
			}
		}
		return sendingEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixEnd basicGetSendingEnd() {
		return sendingEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSendingEnd(MixEnd newSendingEnd) {
		MixEnd oldSendingEnd = sendingEnd;
		sendingEnd = newSendingEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REMODELPackage.MESSAGE_NEW__SENDING_END,
					oldSendingEnd, sendingEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixEnd getReceivingEnd() {
		if (receivingEnd != null && receivingEnd.eIsProxy()) {
			InternalEObject oldReceivingEnd = (InternalEObject) receivingEnd;
			receivingEnd = (MixEnd) eResolveProxy(oldReceivingEnd);
			if (receivingEnd != oldReceivingEnd) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REMODELPackage.MESSAGE_NEW__RECEIVING_END,
							oldReceivingEnd, receivingEnd));
			}
		}
		return receivingEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MixEnd basicGetReceivingEnd() {
		return receivingEnd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReceivingEnd(MixEnd newReceivingEnd) {
		MixEnd oldReceivingEnd = receivingEnd;
		receivingEnd = newReceivingEnd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REMODELPackage.MESSAGE_NEW__RECEIVING_END,
					oldReceivingEnd, receivingEnd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case REMODELPackage.MESSAGE_NEW__NAME:
			return getName();
		case REMODELPackage.MESSAGE_NEW__SENDING_END:
			if (resolve)
				return getSendingEnd();
			return basicGetSendingEnd();
		case REMODELPackage.MESSAGE_NEW__RECEIVING_END:
			if (resolve)
				return getReceivingEnd();
			return basicGetReceivingEnd();
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
		case REMODELPackage.MESSAGE_NEW__NAME:
			setName((String) newValue);
			return;
		case REMODELPackage.MESSAGE_NEW__SENDING_END:
			setSendingEnd((MixEnd) newValue);
			return;
		case REMODELPackage.MESSAGE_NEW__RECEIVING_END:
			setReceivingEnd((MixEnd) newValue);
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
		case REMODELPackage.MESSAGE_NEW__NAME:
			setName(NAME_EDEFAULT);
			return;
		case REMODELPackage.MESSAGE_NEW__SENDING_END:
			setSendingEnd((MixEnd) null);
			return;
		case REMODELPackage.MESSAGE_NEW__RECEIVING_END:
			setReceivingEnd((MixEnd) null);
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
		case REMODELPackage.MESSAGE_NEW__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case REMODELPackage.MESSAGE_NEW__SENDING_END:
			return sendingEnd != null;
		case REMODELPackage.MESSAGE_NEW__RECEIVING_END:
			return receivingEnd != null;
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
		result.append(')');
		return result.toString();
	}

} //MessageNewImpl

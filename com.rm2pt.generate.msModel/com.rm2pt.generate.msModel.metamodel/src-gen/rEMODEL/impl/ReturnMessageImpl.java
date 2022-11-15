/**
 */
package rEMODEL.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import rEMODEL.MessageNew;
import rEMODEL.REMODELPackage;
import rEMODEL.ReturnMessage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Return Message</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.impl.ReturnMessageImpl#getInvocationMessage <em>Invocation Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ReturnMessageImpl extends MessageNewImpl implements ReturnMessage {
	/**
	 * The cached value of the '{@link #getInvocationMessage() <em>Invocation Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvocationMessage()
	 * @generated
	 * @ordered
	 */
	protected MessageNew invocationMessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ReturnMessageImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REMODELPackage.Literals.RETURN_MESSAGE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageNew getInvocationMessage() {
		if (invocationMessage != null && invocationMessage.eIsProxy()) {
			InternalEObject oldInvocationMessage = (InternalEObject) invocationMessage;
			invocationMessage = (MessageNew) eResolveProxy(oldInvocationMessage);
			if (invocationMessage != oldInvocationMessage) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							REMODELPackage.RETURN_MESSAGE__INVOCATION_MESSAGE, oldInvocationMessage,
							invocationMessage));
			}
		}
		return invocationMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageNew basicGetInvocationMessage() {
		return invocationMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInvocationMessage(MessageNew newInvocationMessage) {
		MessageNew oldInvocationMessage = invocationMessage;
		invocationMessage = newInvocationMessage;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REMODELPackage.RETURN_MESSAGE__INVOCATION_MESSAGE,
					oldInvocationMessage, invocationMessage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case REMODELPackage.RETURN_MESSAGE__INVOCATION_MESSAGE:
			if (resolve)
				return getInvocationMessage();
			return basicGetInvocationMessage();
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
		case REMODELPackage.RETURN_MESSAGE__INVOCATION_MESSAGE:
			setInvocationMessage((MessageNew) newValue);
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
		case REMODELPackage.RETURN_MESSAGE__INVOCATION_MESSAGE:
			setInvocationMessage((MessageNew) null);
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
		case REMODELPackage.RETURN_MESSAGE__INVOCATION_MESSAGE:
			return invocationMessage != null;
		}
		return super.eIsSet(featureID);
	}

} //ReturnMessageImpl

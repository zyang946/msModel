/**
 */
package rEMODEL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Return Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.ReturnMessage#getInvocationMessage <em>Invocation Message</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getReturnMessage()
 * @model
 * @generated
 */
public interface ReturnMessage extends MessageNew {
	/**
	 * Returns the value of the '<em><b>Invocation Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invocation Message</em>' reference.
	 * @see #setInvocationMessage(MessageNew)
	 * @see rEMODEL.REMODELPackage#getReturnMessage_InvocationMessage()
	 * @model
	 * @generated
	 */
	MessageNew getInvocationMessage();

	/**
	 * Sets the value of the '{@link rEMODEL.ReturnMessage#getInvocationMessage <em>Invocation Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Invocation Message</em>' reference.
	 * @see #getInvocationMessage()
	 * @generated
	 */
	void setInvocationMessage(MessageNew value);

} // ReturnMessage

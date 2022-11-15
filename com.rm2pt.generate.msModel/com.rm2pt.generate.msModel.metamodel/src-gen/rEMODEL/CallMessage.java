/**
 */
package rEMODEL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.CallMessage#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getCallMessage()
 * @model
 * @generated
 */
public interface CallMessage extends MessageNew {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' reference.
	 * @see #setOp(Operation)
	 * @see rEMODEL.REMODELPackage#getCallMessage_Op()
	 * @model
	 * @generated
	 */
	Operation getOp();

	/**
	 * Sets the value of the '{@link rEMODEL.CallMessage#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(Operation value);

} // CallMessage

/**
 */
package rEMODEL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.MessageEnd#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getMessageEnd()
 * @model
 * @generated
 */
public interface MessageEnd extends MixEnd {
	/**
	 * Returns the value of the '<em><b>Message</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' reference.
	 * @see #setMessage(MessageNew)
	 * @see rEMODEL.REMODELPackage#getMessageEnd_Message()
	 * @model
	 * @generated
	 */
	MessageNew getMessage();

	/**
	 * Sets the value of the '{@link rEMODEL.MessageEnd#getMessage <em>Message</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Message</em>' reference.
	 * @see #getMessage()
	 * @generated
	 */
	void setMessage(MessageNew value);

} // MessageEnd

/**
 */
package rEMODEL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message New</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.MessageNew#getName <em>Name</em>}</li>
 *   <li>{@link rEMODEL.MessageNew#getSendingEnd <em>Sending End</em>}</li>
 *   <li>{@link rEMODEL.MessageNew#getReceivingEnd <em>Receiving End</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getMessageNew()
 * @model
 * @generated
 */
public interface MessageNew extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rEMODEL.REMODELPackage#getMessageNew_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rEMODEL.MessageNew#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Sending End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sending End</em>' reference.
	 * @see #setSendingEnd(MixEnd)
	 * @see rEMODEL.REMODELPackage#getMessageNew_SendingEnd()
	 * @model
	 * @generated
	 */
	MixEnd getSendingEnd();

	/**
	 * Sets the value of the '{@link rEMODEL.MessageNew#getSendingEnd <em>Sending End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Sending End</em>' reference.
	 * @see #getSendingEnd()
	 * @generated
	 */
	void setSendingEnd(MixEnd value);

	/**
	 * Returns the value of the '<em><b>Receiving End</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Receiving End</em>' reference.
	 * @see #setReceivingEnd(MixEnd)
	 * @see rEMODEL.REMODELPackage#getMessageNew_ReceivingEnd()
	 * @model
	 * @generated
	 */
	MixEnd getReceivingEnd();

	/**
	 * Sets the value of the '{@link rEMODEL.MessageNew#getReceivingEnd <em>Receiving End</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Receiving End</em>' reference.
	 * @see #getReceivingEnd()
	 * @generated
	 */
	void setReceivingEnd(MixEnd value);

} // MessageNew

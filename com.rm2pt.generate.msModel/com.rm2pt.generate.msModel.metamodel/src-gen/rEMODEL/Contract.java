/**
 */
package rEMODEL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Contract</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.Contract#getDef <em>Def</em>}</li>
 *   <li>{@link rEMODEL.Contract#getPre <em>Pre</em>}</li>
 *   <li>{@link rEMODEL.Contract#getPost <em>Post</em>}</li>
 *   <li>{@link rEMODEL.Contract#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getContract()
 * @model
 * @generated
 */
public interface Contract extends EObject {
	/**
	 * Returns the value of the '<em><b>Op</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' reference.
	 * @see #setOp(Operation)
	 * @see rEMODEL.REMODELPackage#getContract_Op()
	 * @model
	 * @generated
	 */
	Operation getOp();

	/**
	 * Sets the value of the '{@link rEMODEL.Contract#getOp <em>Op</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(Operation value);

	/**
	 * Returns the value of the '<em><b>Def</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Def</em>' containment reference.
	 * @see #setDef(Definition)
	 * @see rEMODEL.REMODELPackage#getContract_Def()
	 * @model containment="true"
	 * @generated
	 */
	Definition getDef();

	/**
	 * Sets the value of the '{@link rEMODEL.Contract#getDef <em>Def</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Def</em>' containment reference.
	 * @see #getDef()
	 * @generated
	 */
	void setDef(Definition value);

	/**
	 * Returns the value of the '<em><b>Pre</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pre</em>' containment reference.
	 * @see #setPre(Precondition)
	 * @see rEMODEL.REMODELPackage#getContract_Pre()
	 * @model containment="true"
	 * @generated
	 */
	Precondition getPre();

	/**
	 * Sets the value of the '{@link rEMODEL.Contract#getPre <em>Pre</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pre</em>' containment reference.
	 * @see #getPre()
	 * @generated
	 */
	void setPre(Precondition value);

	/**
	 * Returns the value of the '<em><b>Post</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Post</em>' containment reference.
	 * @see #setPost(Postcondition)
	 * @see rEMODEL.REMODELPackage#getContract_Post()
	 * @model containment="true"
	 * @generated
	 */
	Postcondition getPost();

	/**
	 * Sets the value of the '{@link rEMODEL.Contract#getPost <em>Post</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Post</em>' containment reference.
	 * @see #getPost()
	 * @generated
	 */
	void setPost(Postcondition value);

} // Contract

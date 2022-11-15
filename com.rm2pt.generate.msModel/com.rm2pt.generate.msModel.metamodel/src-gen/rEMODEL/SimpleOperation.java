/**
 */
package rEMODEL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.SimpleOperation#getRef <em>Ref</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getSimpleOperation()
 * @model
 * @generated
 */
public interface SimpleOperation extends WorkflowExp {
	/**
	 * Returns the value of the '<em><b>Ref</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ref</em>' reference.
	 * @see #setRef(Operation)
	 * @see rEMODEL.REMODELPackage#getSimpleOperation_Ref()
	 * @model
	 * @generated
	 */
	Operation getRef();

	/**
	 * Sets the value of the '{@link rEMODEL.SimpleOperation#getRef <em>Ref</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ref</em>' reference.
	 * @see #getRef()
	 * @generated
	 */
	void setRef(Operation value);

} // SimpleOperation

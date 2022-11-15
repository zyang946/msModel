/**
 */
package rEMODEL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combined Fragment End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.CombinedFragmentEnd#getOwner <em>Owner</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getCombinedFragmentEnd()
 * @model
 * @generated
 */
public interface CombinedFragmentEnd extends MixOpAndCFEnd {
	/**
	 * Returns the value of the '<em><b>Owner</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owner</em>' reference.
	 * @see #setOwner(CombinedFragment)
	 * @see rEMODEL.REMODELPackage#getCombinedFragmentEnd_Owner()
	 * @model
	 * @generated
	 */
	CombinedFragment getOwner();

	/**
	 * Sets the value of the '{@link rEMODEL.CombinedFragmentEnd#getOwner <em>Owner</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Owner</em>' reference.
	 * @see #getOwner()
	 * @generated
	 */
	void setOwner(CombinedFragment value);

} // CombinedFragmentEnd

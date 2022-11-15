/**
 */
package rEMODEL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mix End</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.MixEnd#getContext <em>Context</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getMixEnd()
 * @model
 * @generated
 */
public interface MixEnd extends AbstractEnd {
	/**
	 * Returns the value of the '<em><b>Context</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Context</em>' reference.
	 * @see #setContext(MultiEnd)
	 * @see rEMODEL.REMODELPackage#getMixEnd_Context()
	 * @model
	 * @generated
	 */
	MultiEnd getContext();

	/**
	 * Sets the value of the '{@link rEMODEL.MixEnd#getContext <em>Context</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Context</em>' reference.
	 * @see #getContext()
	 * @generated
	 */
	void setContext(MultiEnd value);

} // MixEnd

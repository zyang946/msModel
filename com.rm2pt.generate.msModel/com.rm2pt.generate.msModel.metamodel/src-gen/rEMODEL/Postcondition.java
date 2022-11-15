/**
 */
package rEMODEL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Postcondition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.Postcondition#getOclexp <em>Oclexp</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getPostcondition()
 * @model
 * @generated
 */
public interface Postcondition extends EObject {
	/**
	 * Returns the value of the '<em><b>Oclexp</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Oclexp</em>' containment reference.
	 * @see #setOclexp(OCLExpressionCS)
	 * @see rEMODEL.REMODELPackage#getPostcondition_Oclexp()
	 * @model containment="true"
	 * @generated
	 */
	OCLExpressionCS getOclexp();

	/**
	 * Sets the value of the '{@link rEMODEL.Postcondition#getOclexp <em>Oclexp</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Oclexp</em>' containment reference.
	 * @see #getOclexp()
	 * @generated
	 */
	void setOclexp(OCLExpressionCS value);

} // Postcondition

/**
 */
package rEMODEL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Switch Case</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.SwitchCase#getCaseValue <em>Case Value</em>}</li>
 *   <li>{@link rEMODEL.SwitchCase#getOp <em>Op</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getSwitchCase()
 * @model
 * @generated
 */
public interface SwitchCase extends EObject {
	/**
	 * Returns the value of the '<em><b>Case Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Case Value</em>' attribute.
	 * @see #setCaseValue(String)
	 * @see rEMODEL.REMODELPackage#getSwitchCase_CaseValue()
	 * @model
	 * @generated
	 */
	String getCaseValue();

	/**
	 * Sets the value of the '{@link rEMODEL.SwitchCase#getCaseValue <em>Case Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Case Value</em>' attribute.
	 * @see #getCaseValue()
	 * @generated
	 */
	void setCaseValue(String value);

	/**
	 * Returns the value of the '<em><b>Op</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Op</em>' containment reference.
	 * @see #setOp(SimpleOperation)
	 * @see rEMODEL.REMODELPackage#getSwitchCase_Op()
	 * @model containment="true"
	 * @generated
	 */
	SimpleOperation getOp();

	/**
	 * Sets the value of the '{@link rEMODEL.SwitchCase#getOp <em>Op</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Op</em>' containment reference.
	 * @see #getOp()
	 * @generated
	 */
	void setOp(SimpleOperation value);

} // SwitchCase

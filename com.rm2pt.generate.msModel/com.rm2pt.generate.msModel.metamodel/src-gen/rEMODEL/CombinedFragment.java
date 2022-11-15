/**
 */
package rEMODEL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Combined Fragment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.CombinedFragment#getName <em>Name</em>}</li>
 *   <li>{@link rEMODEL.CombinedFragment#getOperator <em>Operator</em>}</li>
 *   <li>{@link rEMODEL.CombinedFragment#getCoveredParticipants <em>Covered Participants</em>}</li>
 *   <li>{@link rEMODEL.CombinedFragment#getStart <em>Start</em>}</li>
 *   <li>{@link rEMODEL.CombinedFragment#getFinish <em>Finish</em>}</li>
 *   <li>{@link rEMODEL.CombinedFragment#getOwnedOperands <em>Owned Operands</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getCombinedFragment()
 * @model
 * @generated
 */
public interface CombinedFragment extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rEMODEL.REMODELPackage#getCombinedFragment_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rEMODEL.CombinedFragment#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operator</em>' attribute.
	 * @see #setOperator(String)
	 * @see rEMODEL.REMODELPackage#getCombinedFragment_Operator()
	 * @model
	 * @generated
	 */
	String getOperator();

	/**
	 * Sets the value of the '{@link rEMODEL.CombinedFragment#getOperator <em>Operator</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Operator</em>' attribute.
	 * @see #getOperator()
	 * @generated
	 */
	void setOperator(String value);

	/**
	 * Returns the value of the '<em><b>Covered Participants</b></em>' reference list.
	 * The list contents are of type {@link rEMODEL.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Covered Participants</em>' reference list.
	 * @see rEMODEL.REMODELPackage#getCombinedFragment_CoveredParticipants()
	 * @model
	 * @generated
	 */
	EList<Participant> getCoveredParticipants();

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(CombinedFragmentEnd)
	 * @see rEMODEL.REMODELPackage#getCombinedFragment_Start()
	 * @model
	 * @generated
	 */
	CombinedFragmentEnd getStart();

	/**
	 * Sets the value of the '{@link rEMODEL.CombinedFragment#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(CombinedFragmentEnd value);

	/**
	 * Returns the value of the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish</em>' reference.
	 * @see #setFinish(CombinedFragmentEnd)
	 * @see rEMODEL.REMODELPackage#getCombinedFragment_Finish()
	 * @model
	 * @generated
	 */
	CombinedFragmentEnd getFinish();

	/**
	 * Sets the value of the '{@link rEMODEL.CombinedFragment#getFinish <em>Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish</em>' reference.
	 * @see #getFinish()
	 * @generated
	 */
	void setFinish(CombinedFragmentEnd value);

	/**
	 * Returns the value of the '<em><b>Owned Operands</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.Operand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Owned Operands</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getCombinedFragment_OwnedOperands()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operand> getOwnedOperands();

} // CombinedFragment

/**
 */
package rEMODEL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operand</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.Operand#getName <em>Name</em>}</li>
 *   <li>{@link rEMODEL.Operand#getStart <em>Start</em>}</li>
 *   <li>{@link rEMODEL.Operand#getFinish <em>Finish</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getOperand()
 * @model
 * @generated
 */
public interface Operand extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rEMODEL.REMODELPackage#getOperand_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rEMODEL.Operand#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Start</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Start</em>' reference.
	 * @see #setStart(OperandEnd)
	 * @see rEMODEL.REMODELPackage#getOperand_Start()
	 * @model
	 * @generated
	 */
	OperandEnd getStart();

	/**
	 * Sets the value of the '{@link rEMODEL.Operand#getStart <em>Start</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Start</em>' reference.
	 * @see #getStart()
	 * @generated
	 */
	void setStart(OperandEnd value);

	/**
	 * Returns the value of the '<em><b>Finish</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Finish</em>' reference.
	 * @see #setFinish(MixOpAndCFEnd)
	 * @see rEMODEL.REMODELPackage#getOperand_Finish()
	 * @model
	 * @generated
	 */
	MixOpAndCFEnd getFinish();

	/**
	 * Sets the value of the '{@link rEMODEL.Operand#getFinish <em>Finish</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Finish</em>' reference.
	 * @see #getFinish()
	 * @generated
	 */
	void setFinish(MixOpAndCFEnd value);

} // Operand

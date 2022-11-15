/**
 */
package rEMODEL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Logic Formula Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.LogicFormulaExpCS#getAtomicexp <em>Atomicexp</em>}</li>
 *   <li>{@link rEMODEL.LogicFormulaExpCS#getConnector <em>Connector</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getLogicFormulaExpCS()
 * @model
 * @generated
 */
public interface LogicFormulaExpCS extends OCLExpressionCS {
	/**
	 * Returns the value of the '<em><b>Atomicexp</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.emf.ecore.EObject}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Atomicexp</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getLogicFormulaExpCS_Atomicexp()
	 * @model containment="true"
	 * @generated
	 */
	EList<EObject> getAtomicexp();

	/**
	 * Returns the value of the '<em><b>Connector</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connector</em>' attribute list.
	 * @see rEMODEL.REMODELPackage#getLogicFormulaExpCS_Connector()
	 * @model unique="false"
	 * @generated
	 */
	EList<String> getConnector();

} // LogicFormulaExpCS

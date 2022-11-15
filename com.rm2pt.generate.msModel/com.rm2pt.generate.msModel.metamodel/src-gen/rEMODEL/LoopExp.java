/**
 */
package rEMODEL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Loop Exp</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.LoopExp#getName <em>Name</em>}</li>
 *   <li>{@link rEMODEL.LoopExp#getExps <em>Exps</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getLoopExp()
 * @model
 * @generated
 */
public interface LoopExp extends JoinExp, ComplexOpeartion {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rEMODEL.REMODELPackage#getLoopExp_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rEMODEL.LoopExp#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Exps</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.WorkflowExp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exps</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getLoopExp_Exps()
	 * @model containment="true"
	 * @generated
	 */
	EList<WorkflowExp> getExps();

} // LoopExp

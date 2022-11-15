/**
 */
package rEMODEL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Join Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.JoinNode#getEndlinks <em>Endlinks</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getJoinNode()
 * @model
 * @generated
 */
public interface JoinNode extends WorkflowExp {
	/**
	 * Returns the value of the '<em><b>Endlinks</b></em>' reference list.
	 * The list contents are of type {@link rEMODEL.JoinExp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Endlinks</em>' reference list.
	 * @see rEMODEL.REMODELPackage#getJoinNode_Endlinks()
	 * @model
	 * @generated
	 */
	EList<JoinExp> getEndlinks();

} // JoinNode

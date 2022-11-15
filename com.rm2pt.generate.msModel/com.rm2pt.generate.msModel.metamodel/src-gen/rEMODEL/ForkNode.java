/**
 */
package rEMODEL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fork Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.ForkNode#getStartlinks <em>Startlinks</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getForkNode()
 * @model
 * @generated
 */
public interface ForkNode extends WorkflowExp {
	/**
	 * Returns the value of the '<em><b>Startlinks</b></em>' reference list.
	 * The list contents are of type {@link rEMODEL.JoinExp}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Startlinks</em>' reference list.
	 * @see rEMODEL.REMODELPackage#getForkNode_Startlinks()
	 * @model
	 * @generated
	 */
	EList<JoinExp> getStartlinks();

} // ForkNode

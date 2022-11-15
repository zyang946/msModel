/**
 */
package rEMODEL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workflow</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.Workflow#getName <em>Name</em>}</li>
 *   <li>{@link rEMODEL.Workflow#getParticipants <em>Participants</em>}</li>
 *   <li>{@link rEMODEL.Workflow#getPartitions <em>Partitions</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getWorkflow()
 * @model
 * @generated
 */
public interface Workflow extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rEMODEL.REMODELPackage#getWorkflow_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rEMODEL.Workflow#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Participants</b></em>' reference list.
	 * The list contents are of type {@link rEMODEL.Participant}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Participants</em>' reference list.
	 * @see rEMODEL.REMODELPackage#getWorkflow_Participants()
	 * @model
	 * @generated
	 */
	EList<Participant> getParticipants();

	/**
	 * Returns the value of the '<em><b>Partitions</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.Partition}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Partitions</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getWorkflow_Partitions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Partition> getPartitions();

} // Workflow

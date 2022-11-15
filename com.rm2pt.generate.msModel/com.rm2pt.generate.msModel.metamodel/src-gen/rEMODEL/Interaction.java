/**
 */
package rEMODEL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.Interaction#getName <em>Name</em>}</li>
 *   <li>{@link rEMODEL.Interaction#getParticipants <em>Participants</em>}</li>
 *   <li>{@link rEMODEL.Interaction#getMessages <em>Messages</em>}</li>
 *   <li>{@link rEMODEL.Interaction#getExecutions <em>Executions</em>}</li>
 *   <li>{@link rEMODEL.Interaction#getCombinedFragments <em>Combined Fragments</em>}</li>
 *   <li>{@link rEMODEL.Interaction#getEnds <em>Ends</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getInteraction()
 * @model
 * @generated
 */
public interface Interaction extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rEMODEL.REMODELPackage#getInteraction_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rEMODEL.Interaction#getName <em>Name</em>}' attribute.
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
	 * @see rEMODEL.REMODELPackage#getInteraction_Participants()
	 * @model
	 * @generated
	 */
	EList<Participant> getParticipants();

	/**
	 * Returns the value of the '<em><b>Messages</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.MessageNew}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Messages</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getInteraction_Messages()
	 * @model containment="true"
	 * @generated
	 */
	EList<MessageNew> getMessages();

	/**
	 * Returns the value of the '<em><b>Executions</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.Execution}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Executions</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getInteraction_Executions()
	 * @model containment="true"
	 * @generated
	 */
	EList<Execution> getExecutions();

	/**
	 * Returns the value of the '<em><b>Combined Fragments</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.CombinedFragment}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Combined Fragments</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getInteraction_CombinedFragments()
	 * @model containment="true"
	 * @generated
	 */
	EList<CombinedFragment> getCombinedFragments();

	/**
	 * Returns the value of the '<em><b>Ends</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.AbstractEnd}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ends</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getInteraction_Ends()
	 * @model containment="true"
	 * @generated
	 */
	EList<AbstractEnd> getEnds();

} // Interaction

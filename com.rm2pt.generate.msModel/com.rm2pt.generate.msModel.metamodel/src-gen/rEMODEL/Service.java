/**
 */
package rEMODEL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.Service#getOperation <em>Operation</em>}</li>
 *   <li>{@link rEMODEL.Service#getTemp_property <em>Temp property</em>}</li>
 *   <li>{@link rEMODEL.Service#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link rEMODEL.Service#getInvariance <em>Invariance</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getService()
 * @model
 * @generated
 */
public interface Service extends Participant {
	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getService_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperation();

	/**
	 * Returns the value of the '<em><b>Temp property</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.Attribute}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Temp property</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getService_Temp_property()
	 * @model containment="true"
	 * @generated
	 */
	EList<Attribute> getTemp_property();

	/**
	 * Returns the value of the '<em><b>Workflow</b></em>' reference list.
	 * The list contents are of type {@link rEMODEL.Workflow}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workflow</em>' reference list.
	 * @see rEMODEL.REMODELPackage#getService_Workflow()
	 * @model
	 * @generated
	 */
	EList<Workflow> getWorkflow();

	/**
	 * Returns the value of the '<em><b>Invariance</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.Invariance}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Invariance</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getService_Invariance()
	 * @model containment="true"
	 * @generated
	 */
	EList<Invariance> getInvariance();

} // Service

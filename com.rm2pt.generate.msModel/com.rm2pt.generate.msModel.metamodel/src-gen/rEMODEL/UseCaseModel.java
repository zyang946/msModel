/**
 */
package rEMODEL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Use Case Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.UseCaseModel#getName <em>Name</em>}</li>
 *   <li>{@link rEMODEL.UseCaseModel#getLabel <em>Label</em>}</li>
 *   <li>{@link rEMODEL.UseCaseModel#getUc <em>Uc</em>}</li>
 *   <li>{@link rEMODEL.UseCaseModel#getActor <em>Actor</em>}</li>
 *   <li>{@link rEMODEL.UseCaseModel#getInteraction <em>Interaction</em>}</li>
 *   <li>{@link rEMODEL.UseCaseModel#getService <em>Service</em>}</li>
 *   <li>{@link rEMODEL.UseCaseModel#getContract <em>Contract</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getUseCaseModel()
 * @model
 * @generated
 */
public interface UseCaseModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rEMODEL.REMODELPackage#getUseCaseModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rEMODEL.UseCaseModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see rEMODEL.REMODELPackage#getUseCaseModel_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link rEMODEL.UseCaseModel#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Uc</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.UC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uc</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getUseCaseModel_Uc()
	 * @model containment="true"
	 * @generated
	 */
	EList<UC> getUc();

	/**
	 * Returns the value of the '<em><b>Actor</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.Actor}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Actor</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getUseCaseModel_Actor()
	 * @model containment="true"
	 * @generated
	 */
	EList<Actor> getActor();

	/**
	 * Returns the value of the '<em><b>Interaction</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.Interaction}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interaction</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getUseCaseModel_Interaction()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interaction> getInteraction();

	/**
	 * Returns the value of the '<em><b>Service</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.Service}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getUseCaseModel_Service()
	 * @model containment="true"
	 * @generated
	 */
	EList<Service> getService();

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.Contract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getUseCaseModel_Contract()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contract> getContract();

} // UseCaseModel

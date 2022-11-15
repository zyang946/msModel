/**
 */
package rEMODEL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Requirement Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.RequirementModel#getName <em>Name</em>}</li>
 *   <li>{@link rEMODEL.RequirementModel#getDescription <em>Description</em>}</li>
 *   <li>{@link rEMODEL.RequirementModel#getUseCaseModel <em>Use Case Model</em>}</li>
 *   <li>{@link rEMODEL.RequirementModel#getDomainModel <em>Domain Model</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getRequirementModel()
 * @model
 * @generated
 */
public interface RequirementModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rEMODEL.REMODELPackage#getRequirementModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rEMODEL.RequirementModel#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see rEMODEL.REMODELPackage#getRequirementModel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link rEMODEL.RequirementModel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Use Case Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Case Model</em>' containment reference.
	 * @see #setUseCaseModel(UseCaseModel)
	 * @see rEMODEL.REMODELPackage#getRequirementModel_UseCaseModel()
	 * @model containment="true"
	 * @generated
	 */
	UseCaseModel getUseCaseModel();

	/**
	 * Sets the value of the '{@link rEMODEL.RequirementModel#getUseCaseModel <em>Use Case Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Case Model</em>' containment reference.
	 * @see #getUseCaseModel()
	 * @generated
	 */
	void setUseCaseModel(UseCaseModel value);

	/**
	 * Returns the value of the '<em><b>Domain Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domain Model</em>' containment reference.
	 * @see #setDomainModel(DomainModel)
	 * @see rEMODEL.REMODELPackage#getRequirementModel_DomainModel()
	 * @model containment="true"
	 * @generated
	 */
	DomainModel getDomainModel();

	/**
	 * Sets the value of the '{@link rEMODEL.RequirementModel#getDomainModel <em>Domain Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Domain Model</em>' containment reference.
	 * @see #getDomainModel()
	 * @generated
	 */
	void setDomainModel(DomainModel value);

} // RequirementModel

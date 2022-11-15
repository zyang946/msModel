/**
 */
package com.rm2pt.generate.msmodel.metamodel.msMODEL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import rEMODEL.Contract;
import rEMODEL.DomainModel;
import rEMODEL.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Micro Service</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getProvide <em>Provide</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getRequire <em>Require</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getDomainmodel <em>Domainmodel</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getUse <em>Use</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getOperation <em>Operation</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getContract <em>Contract</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getMicroService()
 * @model
 * @generated
 */
public interface MicroService extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getMicroService_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Provide</b></em>' reference list.
	 * The list contents are of type {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provide</em>' reference list.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getMicroService_Provide()
	 * @model
	 * @generated
	 */
	EList<Interface> getProvide();

	/**
	 * Returns the value of the '<em><b>Require</b></em>' reference list.
	 * The list contents are of type {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Require</em>' reference list.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getMicroService_Require()
	 * @model
	 * @generated
	 */
	EList<Interface> getRequire();

	/**
	 * Returns the value of the '<em><b>Domainmodel</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.DomainModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Domainmodel</em>' containment reference list.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getMicroService_Domainmodel()
	 * @model containment="true"
	 * @generated
	 */
	EList<DomainModel> getDomainmodel();

	/**
	 * Returns the value of the '<em><b>Use</b></em>' reference list.
	 * The list contents are of type {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use</em>' reference list.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getMicroService_Use()
	 * @model
	 * @generated
	 */
	EList<Interface> getUse();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getMicroService_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperation();

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.Contract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference list.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getMicroService_Contract()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contract> getContract();

} // MicroService

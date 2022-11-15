/**
 */
package com.rm2pt.generate.msmodel.metamodel.msMODEL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Micro Service Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel#getDescription <em>Description</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel#getMicroservice <em>Microservice</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getMicroServiceModel()
 * @model
 * @generated
 */
public interface MicroServiceModel extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getMicroServiceModel_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel#getName <em>Name</em>}' attribute.
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
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getMicroServiceModel_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Microservice</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservice</em>' containment reference list.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getMicroServiceModel_Microservice()
	 * @model containment="true"
	 * @generated
	 */
	EList<MicroService> getMicroservice();

	/**
	 * Returns the value of the '<em><b>Interface</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Interface</em>' containment reference list.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getMicroServiceModel_Interface()
	 * @model containment="true"
	 * @generated
	 */
	EList<Interface> getInterface();

} // MicroServiceModel

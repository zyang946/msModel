/**
 */
package com.rm2pt.generate.msmodel.metamodel.msMODEL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import rEMODEL.Contract;
import rEMODEL.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface#getCallchain <em>Callchain</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface#getContract <em>Contract</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getInterface()
 * @model
 * @generated
 */
public interface Interface extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getInterface_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Callchain</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.CallChain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Callchain</em>' containment reference list.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getInterface_Callchain()
	 * @model containment="true"
	 * @generated
	 */
	EList<CallChain> getCallchain();

	/**
	 * Returns the value of the '<em><b>Contract</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.Contract}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Contract</em>' containment reference list.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getInterface_Contract()
	 * @model containment="true"
	 * @generated
	 */
	EList<Contract> getContract();

	/**
	 * Returns the value of the '<em><b>Operation</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.Operation}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Operation</em>' containment reference list.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getInterface_Operation()
	 * @model containment="true"
	 * @generated
	 */
	EList<Operation> getOperation();

} // Interface

/**
 */
package com.rm2pt.generate.msmodel.metamodel.msMODEL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Chain</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.CallChain#getLifeline <em>Lifeline</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.CallChain#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getCallChain()
 * @model
 * @generated
 */
public interface CallChain extends EObject {
	/**
	 * Returns the value of the '<em><b>Lifeline</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.LifeLine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lifeline</em>' containment reference list.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getCallChain_Lifeline()
	 * @model containment="true"
	 * @generated
	 */
	EList<LifeLine> getLifeline();

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getCallChain_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.CallChain#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // CallChain

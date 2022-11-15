/**
 */
package com.rm2pt.generate.msmodel.metamodel.msMODEL;

import org.eclipse.emf.ecore.EObject;

import rEMODEL.Operation;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Message</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Message#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Message#getGuard <em>Guard</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Message#getTo <em>To</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Message#getAction <em>Action</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getMessage()
 * @model
 * @generated
 */
public interface Message extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getMessage_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Message#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' attribute.
	 * @see #setGuard(String)
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getMessage_Guard()
	 * @model
	 * @generated
	 */
	String getGuard();

	/**
	 * Sets the value of the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Message#getGuard <em>Guard</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' attribute.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(String value);

	/**
	 * Returns the value of the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action</em>' reference.
	 * @see #setAction(Operation)
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getMessage_Action()
	 * @model
	 * @generated
	 */
	Operation getAction();

	/**
	 * Sets the value of the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Message#getAction <em>Action</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action</em>' reference.
	 * @see #getAction()
	 * @generated
	 */
	void setAction(Operation value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(LifeLine)
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getMessage_To()
	 * @model
	 * @generated
	 */
	LifeLine getTo();

	/**
	 * Sets the value of the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Message#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(LifeLine value);

} // Message

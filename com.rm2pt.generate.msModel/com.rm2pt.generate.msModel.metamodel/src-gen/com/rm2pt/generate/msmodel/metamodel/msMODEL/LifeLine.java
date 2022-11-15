/**
 */
package com.rm2pt.generate.msmodel.metamodel.msMODEL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Life Line</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.LifeLine#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.LifeLine#getMicroservice <em>Microservice</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.LifeLine#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getLifeLine()
 * @model
 * @generated
 */
public interface LifeLine extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getLifeLine_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.LifeLine#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Microservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Microservice</em>' reference.
	 * @see #setMicroservice(MicroService)
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getLifeLine_Microservice()
	 * @model
	 * @generated
	 */
	MicroService getMicroservice();

	/**
	 * Sets the value of the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.LifeLine#getMicroservice <em>Microservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Microservice</em>' reference.
	 * @see #getMicroservice()
	 * @generated
	 */
	void setMicroservice(MicroService value);

	/**
	 * Returns the value of the '<em><b>Message</b></em>' containment reference list.
	 * The list contents are of type {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Message</em>' containment reference list.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#getLifeLine_Message()
	 * @model containment="true"
	 * @generated
	 */
	EList<Message> getMessage();

} // LifeLine

/**
 */
package com.rm2pt.generate.msmodel.metamodel.msMODEL;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage
 * @generated
 */
public interface MsMODELFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MsMODELFactory eINSTANCE = com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MsMODELFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Micro Service Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Micro Service Model</em>'.
	 * @generated
	 */
	MicroServiceModel createMicroServiceModel();

	/**
	 * Returns a new object of class '<em>Micro Service</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Micro Service</em>'.
	 * @generated
	 */
	MicroService createMicroService();

	/**
	 * Returns a new object of class '<em>Interface</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interface</em>'.
	 * @generated
	 */
	Interface createInterface();

	/**
	 * Returns a new object of class '<em>In</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>In</em>'.
	 * @generated
	 */
	In createIn();

	/**
	 * Returns a new object of class '<em>Provided</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Provided</em>'.
	 * @generated
	 */
	Provided createProvided();

	/**
	 * Returns a new object of class '<em>Required</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Required</em>'.
	 * @generated
	 */
	Required createRequired();

	/**
	 * Returns a new object of class '<em>Call Chain</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Call Chain</em>'.
	 * @generated
	 */
	CallChain createCallChain();

	/**
	 * Returns a new object of class '<em>Life Line</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Life Line</em>'.
	 * @generated
	 */
	LifeLine createLifeLine();

	/**
	 * Returns a new object of class '<em>Message</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Message</em>'.
	 * @generated
	 */
	Message createMessage();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	MsMODELPackage getMsMODELPackage();

} //MsMODELFactory

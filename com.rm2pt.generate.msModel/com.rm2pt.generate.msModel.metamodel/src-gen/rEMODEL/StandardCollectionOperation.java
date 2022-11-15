/**
 */
package rEMODEL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Collection Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.StandardCollectionOperation#getName <em>Name</em>}</li>
 *   <li>{@link rEMODEL.StandardCollectionOperation#getObject <em>Object</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getStandardCollectionOperation()
 * @model
 * @generated
 */
public interface StandardCollectionOperation extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rEMODEL.REMODELPackage#getStandardCollectionOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rEMODEL.StandardCollectionOperation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see #setObject(String)
	 * @see rEMODEL.REMODELPackage#getStandardCollectionOperation_Object()
	 * @model
	 * @generated
	 */
	String getObject();

	/**
	 * Sets the value of the '{@link rEMODEL.StandardCollectionOperation#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(String value);

} // StandardCollectionOperation

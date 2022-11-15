/**
 */
package rEMODEL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.Attribute#getName <em>Name</em>}</li>
 *   <li>{@link rEMODEL.Attribute#getType <em>Type</em>}</li>
 *   <li>{@link rEMODEL.Attribute#isIsmultiple <em>Ismultiple</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getAttribute()
 * @model
 * @generated
 */
public interface Attribute extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rEMODEL.REMODELPackage#getAttribute_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rEMODEL.Attribute#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' containment reference.
	 * @see #setType(TypeCS)
	 * @see rEMODEL.REMODELPackage#getAttribute_Type()
	 * @model containment="true"
	 * @generated
	 */
	TypeCS getType();

	/**
	 * Sets the value of the '{@link rEMODEL.Attribute#getType <em>Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' containment reference.
	 * @see #getType()
	 * @generated
	 */
	void setType(TypeCS value);

	/**
	 * Returns the value of the '<em><b>Ismultiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ismultiple</em>' attribute.
	 * @see #setIsmultiple(boolean)
	 * @see rEMODEL.REMODELPackage#getAttribute_Ismultiple()
	 * @model
	 * @generated
	 */
	boolean isIsmultiple();

	/**
	 * Sets the value of the '{@link rEMODEL.Attribute#isIsmultiple <em>Ismultiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ismultiple</em>' attribute.
	 * @see #isIsmultiple()
	 * @generated
	 */
	void setIsmultiple(boolean value);

} // Attribute

/**
 */
package rEMODEL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.Operation#getName <em>Name</em>}</li>
 *   <li>{@link rEMODEL.Operation#getParameter <em>Parameter</em>}</li>
 *   <li>{@link rEMODEL.Operation#getReturnType <em>Return Type</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getOperation()
 * @model
 * @generated
 */
public interface Operation extends JoinExp {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rEMODEL.REMODELPackage#getOperation_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rEMODEL.Operation#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameter</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.Parameter}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameter</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getOperation_Parameter()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameter();

	/**
	 * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Return Type</em>' containment reference.
	 * @see #setReturnType(TypeCS)
	 * @see rEMODEL.REMODELPackage#getOperation_ReturnType()
	 * @model containment="true"
	 * @generated
	 */
	TypeCS getReturnType();

	/**
	 * Sets the value of the '{@link rEMODEL.Operation#getReturnType <em>Return Type</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Return Type</em>' containment reference.
	 * @see #getReturnType()
	 * @generated
	 */
	void setReturnType(TypeCS value);

} // Operation

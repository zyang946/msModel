/**
 */
package rEMODEL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tuple Literal Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.TupleLiteralExpCS#getName <em>Name</em>}</li>
 *   <li>{@link rEMODEL.TupleLiteralExpCS#getVariables <em>Variables</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getTupleLiteralExpCS()
 * @model
 * @generated
 */
public interface TupleLiteralExpCS extends LiteralExpCS {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rEMODEL.REMODELPackage#getTupleLiteralExpCS_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rEMODEL.TupleLiteralExpCS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Variables</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.VariableDeclarationCS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variables</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getTupleLiteralExpCS_Variables()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclarationCS> getVariables();

} // TupleLiteralExpCS

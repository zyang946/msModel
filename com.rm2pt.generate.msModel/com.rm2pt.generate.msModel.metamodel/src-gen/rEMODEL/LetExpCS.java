/**
 */
package rEMODEL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Let Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.LetExpCS#getVariable <em>Variable</em>}</li>
 *   <li>{@link rEMODEL.LetExpCS#getInExpression <em>In Expression</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getLetExpCS()
 * @model
 * @generated
 */
public interface LetExpCS extends OCLExpressionCS {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.VariableDeclarationCS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getLetExpCS_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclarationCS> getVariable();

	/**
	 * Returns the value of the '<em><b>In Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>In Expression</em>' containment reference.
	 * @see #setInExpression(OCLExpressionCS)
	 * @see rEMODEL.REMODELPackage#getLetExpCS_InExpression()
	 * @model containment="true"
	 * @generated
	 */
	OCLExpressionCS getInExpression();

	/**
	 * Sets the value of the '{@link rEMODEL.LetExpCS#getInExpression <em>In Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>In Expression</em>' containment reference.
	 * @see #getInExpression()
	 * @generated
	 */
	void setInExpression(OCLExpressionCS value);

} // LetExpCS

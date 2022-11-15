/**
 */
package rEMODEL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Variable Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.VariableExpCS#getSymbol <em>Symbol</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getVariableExpCS()
 * @model
 * @generated
 */
public interface VariableExpCS extends LeftSubAtomicExpression, RightSubAtomicExpression {
	/**
	 * Returns the value of the '<em><b>Symbol</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Symbol</em>' attribute.
	 * @see #setSymbol(String)
	 * @see rEMODEL.REMODELPackage#getVariableExpCS_Symbol()
	 * @model
	 * @generated
	 */
	String getSymbol();

	/**
	 * Sets the value of the '{@link rEMODEL.VariableExpCS#getSymbol <em>Symbol</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Symbol</em>' attribute.
	 * @see #getSymbol()
	 * @generated
	 */
	void setSymbol(String value);

} // VariableExpCS

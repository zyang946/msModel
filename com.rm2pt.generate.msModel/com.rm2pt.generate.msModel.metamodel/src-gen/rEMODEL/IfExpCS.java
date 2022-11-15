/**
 */
package rEMODEL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>If Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.IfExpCS#getCondition <em>Condition</em>}</li>
 *   <li>{@link rEMODEL.IfExpCS#getThenExpression <em>Then Expression</em>}</li>
 *   <li>{@link rEMODEL.IfExpCS#getElseExpression <em>Else Expression</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getIfExpCS()
 * @model
 * @generated
 */
public interface IfExpCS extends OCLExpressionCS {
	/**
	 * Returns the value of the '<em><b>Condition</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition</em>' containment reference.
	 * @see #setCondition(OCLExpressionCS)
	 * @see rEMODEL.REMODELPackage#getIfExpCS_Condition()
	 * @model containment="true"
	 * @generated
	 */
	OCLExpressionCS getCondition();

	/**
	 * Sets the value of the '{@link rEMODEL.IfExpCS#getCondition <em>Condition</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition</em>' containment reference.
	 * @see #getCondition()
	 * @generated
	 */
	void setCondition(OCLExpressionCS value);

	/**
	 * Returns the value of the '<em><b>Then Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Then Expression</em>' containment reference.
	 * @see #setThenExpression(OCLExpressionCS)
	 * @see rEMODEL.REMODELPackage#getIfExpCS_ThenExpression()
	 * @model containment="true"
	 * @generated
	 */
	OCLExpressionCS getThenExpression();

	/**
	 * Sets the value of the '{@link rEMODEL.IfExpCS#getThenExpression <em>Then Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Then Expression</em>' containment reference.
	 * @see #getThenExpression()
	 * @generated
	 */
	void setThenExpression(OCLExpressionCS value);

	/**
	 * Returns the value of the '<em><b>Else Expression</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Else Expression</em>' containment reference.
	 * @see #setElseExpression(OCLExpressionCS)
	 * @see rEMODEL.REMODELPackage#getIfExpCS_ElseExpression()
	 * @model containment="true"
	 * @generated
	 */
	OCLExpressionCS getElseExpression();

	/**
	 * Sets the value of the '{@link rEMODEL.IfExpCS#getElseExpression <em>Else Expression</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Else Expression</em>' containment reference.
	 * @see #getElseExpression()
	 * @generated
	 */
	void setElseExpression(OCLExpressionCS value);

} // IfExpCS

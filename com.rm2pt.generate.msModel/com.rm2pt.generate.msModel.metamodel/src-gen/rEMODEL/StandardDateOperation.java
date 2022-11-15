/**
 */
package rEMODEL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Standard Date Operation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.StandardDateOperation#getObject <em>Object</em>}</li>
 *   <li>{@link rEMODEL.StandardDateOperation#getDatenum <em>Datenum</em>}</li>
 *   <li>{@link rEMODEL.StandardDateOperation#getProcall <em>Procall</em>}</li>
 *   <li>{@link rEMODEL.StandardDateOperation#getNested <em>Nested</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getStandardDateOperation()
 * @model
 * @generated
 */
public interface StandardDateOperation extends PredefineOp {
	/**
	 * Returns the value of the '<em><b>Object</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Object</em>' attribute.
	 * @see #setObject(String)
	 * @see rEMODEL.REMODELPackage#getStandardDateOperation_Object()
	 * @model
	 * @generated
	 */
	String getObject();

	/**
	 * Sets the value of the '{@link rEMODEL.StandardDateOperation#getObject <em>Object</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Object</em>' attribute.
	 * @see #getObject()
	 * @generated
	 */
	void setObject(String value);

	/**
	 * Returns the value of the '<em><b>Datenum</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Datenum</em>' containment reference.
	 * @see #setDatenum(NumberLiteralExpCS)
	 * @see rEMODEL.REMODELPackage#getStandardDateOperation_Datenum()
	 * @model containment="true"
	 * @generated
	 */
	NumberLiteralExpCS getDatenum();

	/**
	 * Sets the value of the '{@link rEMODEL.StandardDateOperation#getDatenum <em>Datenum</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Datenum</em>' containment reference.
	 * @see #getDatenum()
	 * @generated
	 */
	void setDatenum(NumberLiteralExpCS value);

	/**
	 * Returns the value of the '<em><b>Procall</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procall</em>' containment reference.
	 * @see #setProcall(PropertyCallExpCS)
	 * @see rEMODEL.REMODELPackage#getStandardDateOperation_Procall()
	 * @model containment="true"
	 * @generated
	 */
	PropertyCallExpCS getProcall();

	/**
	 * Sets the value of the '{@link rEMODEL.StandardDateOperation#getProcall <em>Procall</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Procall</em>' containment reference.
	 * @see #getProcall()
	 * @generated
	 */
	void setProcall(PropertyCallExpCS value);

	/**
	 * Returns the value of the '<em><b>Nested</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Nested</em>' containment reference.
	 * @see #setNested(StandardDateOperation)
	 * @see rEMODEL.REMODELPackage#getStandardDateOperation_Nested()
	 * @model containment="true"
	 * @generated
	 */
	StandardDateOperation getNested();

	/**
	 * Sets the value of the '{@link rEMODEL.StandardDateOperation#getNested <em>Nested</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Nested</em>' containment reference.
	 * @see #getNested()
	 * @generated
	 */
	void setNested(StandardDateOperation value);

} // StandardDateOperation

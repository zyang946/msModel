/**
 */
package rEMODEL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Operation Call Exp CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.OperationCallExpCS#getName <em>Name</em>}</li>
 *   <li>{@link rEMODEL.OperationCallExpCS#getParameters <em>Parameters</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getOperationCallExpCS()
 * @model
 * @generated
 */
public interface OperationCallExpCS extends FeatureCallExpCS {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rEMODEL.REMODELPackage#getOperationCallExpCS_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rEMODEL.OperationCallExpCS#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.OperationParameters}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getOperationCallExpCS_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<OperationParameters> getParameters();

} // OperationCallExpCS

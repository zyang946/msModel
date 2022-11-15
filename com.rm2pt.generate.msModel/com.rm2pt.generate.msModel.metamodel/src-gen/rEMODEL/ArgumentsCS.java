/**
 */
package rEMODEL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Arguments CS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.ArgumentsCS#getFirst <em>First</em>}</li>
 *   <li>{@link rEMODEL.ArgumentsCS#getNext <em>Next</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getArgumentsCS()
 * @model
 * @generated
 */
public interface ArgumentsCS extends EObject {
	/**
	 * Returns the value of the '<em><b>First</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First</em>' containment reference.
	 * @see #setFirst(OCLExpressionCS)
	 * @see rEMODEL.REMODELPackage#getArgumentsCS_First()
	 * @model containment="true"
	 * @generated
	 */
	OCLExpressionCS getFirst();

	/**
	 * Sets the value of the '{@link rEMODEL.ArgumentsCS#getFirst <em>First</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First</em>' containment reference.
	 * @see #getFirst()
	 * @generated
	 */
	void setFirst(OCLExpressionCS value);

	/**
	 * Returns the value of the '<em><b>Next</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Next</em>' containment reference.
	 * @see #setNext(ArgumentsCS)
	 * @see rEMODEL.REMODELPackage#getArgumentsCS_Next()
	 * @model containment="true"
	 * @generated
	 */
	ArgumentsCS getNext();

	/**
	 * Sets the value of the '{@link rEMODEL.ArgumentsCS#getNext <em>Next</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Next</em>' containment reference.
	 * @see #getNext()
	 * @generated
	 */
	void setNext(ArgumentsCS value);

} // ArgumentsCS

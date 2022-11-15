/**
 */
package rEMODEL;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Definition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.Definition#getVariable <em>Variable</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getDefinition()
 * @model
 * @generated
 */
public interface Definition extends EObject {
	/**
	 * Returns the value of the '<em><b>Variable</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.VariableDeclarationCS}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Variable</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getDefinition_Variable()
	 * @model containment="true"
	 * @generated
	 */
	EList<VariableDeclarationCS> getVariable();

} // Definition

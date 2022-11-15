/**
 */
package rEMODEL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Enum Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.EnumEntity#getName <em>Name</em>}</li>
 *   <li>{@link rEMODEL.EnumEntity#getElement <em>Element</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getEnumEntity()
 * @model
 * @generated
 */
public interface EnumEntity extends TypeCS {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rEMODEL.REMODELPackage#getEnumEntity_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rEMODEL.EnumEntity#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Element</b></em>' containment reference list.
	 * The list contents are of type {@link rEMODEL.EnumItem}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Element</em>' containment reference list.
	 * @see rEMODEL.REMODELPackage#getEnumEntity_Element()
	 * @model containment="true"
	 * @generated
	 */
	EList<EnumItem> getElement();

} // EnumEntity

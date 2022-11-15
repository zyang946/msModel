/**
 */
package rEMODEL;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Actor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.Actor#getLabel <em>Label</em>}</li>
 *   <li>{@link rEMODEL.Actor#getSuperActor <em>Super Actor</em>}</li>
 *   <li>{@link rEMODEL.Actor#getUc <em>Uc</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getActor()
 * @model
 * @generated
 */
public interface Actor extends Participant {
	/**
	 * Returns the value of the '<em><b>Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Label</em>' attribute.
	 * @see #setLabel(String)
	 * @see rEMODEL.REMODELPackage#getActor_Label()
	 * @model
	 * @generated
	 */
	String getLabel();

	/**
	 * Sets the value of the '{@link rEMODEL.Actor#getLabel <em>Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Label</em>' attribute.
	 * @see #getLabel()
	 * @generated
	 */
	void setLabel(String value);

	/**
	 * Returns the value of the '<em><b>Super Actor</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Super Actor</em>' reference.
	 * @see #setSuperActor(Actor)
	 * @see rEMODEL.REMODELPackage#getActor_SuperActor()
	 * @model
	 * @generated
	 */
	Actor getSuperActor();

	/**
	 * Sets the value of the '{@link rEMODEL.Actor#getSuperActor <em>Super Actor</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Super Actor</em>' reference.
	 * @see #getSuperActor()
	 * @generated
	 */
	void setSuperActor(Actor value);

	/**
	 * Returns the value of the '<em><b>Uc</b></em>' reference list.
	 * The list contents are of type {@link rEMODEL.UC}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Uc</em>' reference list.
	 * @see rEMODEL.REMODELPackage#getActor_Uc()
	 * @model
	 * @generated
	 */
	EList<UC> getUc();

} // Actor

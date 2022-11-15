/**
 */
package rEMODEL;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.Reference#getName <em>Name</em>}</li>
 *   <li>{@link rEMODEL.Reference#getEntity <em>Entity</em>}</li>
 *   <li>{@link rEMODEL.Reference#isIsmultiple <em>Ismultiple</em>}</li>
 *   <li>{@link rEMODEL.Reference#isIsReverseAssoication <em>Is Reverse Assoication</em>}</li>
 *   <li>{@link rEMODEL.Reference#isIsAggregation <em>Is Aggregation</em>}</li>
 *   <li>{@link rEMODEL.Reference#isIsComposition <em>Is Composition</em>}</li>
 *   <li>{@link rEMODEL.Reference#getType <em>Type</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getReference()
 * @model
 * @generated
 */
public interface Reference extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see rEMODEL.REMODELPackage#getReference_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link rEMODEL.Reference#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Entity</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entity</em>' reference.
	 * @see #setEntity(Entity)
	 * @see rEMODEL.REMODELPackage#getReference_Entity()
	 * @model
	 * @generated
	 */
	Entity getEntity();

	/**
	 * Sets the value of the '{@link rEMODEL.Reference#getEntity <em>Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Entity</em>' reference.
	 * @see #getEntity()
	 * @generated
	 */
	void setEntity(Entity value);

	/**
	 * Returns the value of the '<em><b>Ismultiple</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ismultiple</em>' attribute.
	 * @see #setIsmultiple(boolean)
	 * @see rEMODEL.REMODELPackage#getReference_Ismultiple()
	 * @model
	 * @generated
	 */
	boolean isIsmultiple();

	/**
	 * Sets the value of the '{@link rEMODEL.Reference#isIsmultiple <em>Ismultiple</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ismultiple</em>' attribute.
	 * @see #isIsmultiple()
	 * @generated
	 */
	void setIsmultiple(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Reverse Assoication</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Reverse Assoication</em>' attribute.
	 * @see #setIsReverseAssoication(boolean)
	 * @see rEMODEL.REMODELPackage#getReference_IsReverseAssoication()
	 * @model
	 * @generated
	 */
	boolean isIsReverseAssoication();

	/**
	 * Sets the value of the '{@link rEMODEL.Reference#isIsReverseAssoication <em>Is Reverse Assoication</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Reverse Assoication</em>' attribute.
	 * @see #isIsReverseAssoication()
	 * @generated
	 */
	void setIsReverseAssoication(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Aggregation</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Aggregation</em>' attribute.
	 * @see #setIsAggregation(boolean)
	 * @see rEMODEL.REMODELPackage#getReference_IsAggregation()
	 * @model
	 * @generated
	 */
	boolean isIsAggregation();

	/**
	 * Sets the value of the '{@link rEMODEL.Reference#isIsAggregation <em>Is Aggregation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Aggregation</em>' attribute.
	 * @see #isIsAggregation()
	 * @generated
	 */
	void setIsAggregation(boolean value);

	/**
	 * Returns the value of the '<em><b>Is Composition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Composition</em>' attribute.
	 * @see #setIsComposition(boolean)
	 * @see rEMODEL.REMODELPackage#getReference_IsComposition()
	 * @model
	 * @generated
	 */
	boolean isIsComposition();

	/**
	 * Sets the value of the '{@link rEMODEL.Reference#isIsComposition <em>Is Composition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Composition</em>' attribute.
	 * @see #isIsComposition()
	 * @generated
	 */
	void setIsComposition(boolean value);

	/**
	 * Returns the value of the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Type</em>' attribute.
	 * @see #setType(String)
	 * @see rEMODEL.REMODELPackage#getReference_Type()
	 * @model
	 * @generated
	 */
	String getType();

	/**
	 * Sets the value of the '{@link rEMODEL.Reference#getType <em>Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Type</em>' attribute.
	 * @see #getType()
	 * @generated
	 */
	void setType(String value);

} // Reference

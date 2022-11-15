/**
 */
package rEMODEL;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Collection Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.CollectionItem#getItem <em>Item</em>}</li>
 * </ul>
 *
 * @see rEMODEL.REMODELPackage#getCollectionItem()
 * @model
 * @generated
 */
public interface CollectionItem extends CollectionLiteralPartCS {
	/**
	 * Returns the value of the '<em><b>Item</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Item</em>' containment reference.
	 * @see #setItem(OCLExpressionCS)
	 * @see rEMODEL.REMODELPackage#getCollectionItem_Item()
	 * @model containment="true"
	 * @generated
	 */
	OCLExpressionCS getItem();

	/**
	 * Sets the value of the '{@link rEMODEL.CollectionItem#getItem <em>Item</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Item</em>' containment reference.
	 * @see #getItem()
	 * @generated
	 */
	void setItem(OCLExpressionCS value);

} // CollectionItem

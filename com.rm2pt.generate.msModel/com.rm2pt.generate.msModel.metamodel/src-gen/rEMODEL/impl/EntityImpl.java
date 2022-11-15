/**
 */
package rEMODEL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rEMODEL.Attribute;
import rEMODEL.Entity;
import rEMODEL.Invariance;
import rEMODEL.REMODELPackage;
import rEMODEL.Reference;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Entity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.impl.EntityImpl#isIsCRUD <em>Is CRUD</em>}</li>
 *   <li>{@link rEMODEL.impl.EntityImpl#getName <em>Name</em>}</li>
 *   <li>{@link rEMODEL.impl.EntityImpl#getSuperEntity <em>Super Entity</em>}</li>
 *   <li>{@link rEMODEL.impl.EntityImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link rEMODEL.impl.EntityImpl#getAttributes <em>Attributes</em>}</li>
 *   <li>{@link rEMODEL.impl.EntityImpl#getReference <em>Reference</em>}</li>
 *   <li>{@link rEMODEL.impl.EntityImpl#getInvariance <em>Invariance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class EntityImpl extends MinimalEObjectImpl.Container implements Entity {
	/**
	 * The default value of the '{@link #isIsCRUD() <em>Is CRUD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCRUD()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_CRUD_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsCRUD() <em>Is CRUD</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsCRUD()
	 * @generated
	 * @ordered
	 */
	protected boolean isCRUD = IS_CRUD_EDEFAULT;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSuperEntity() <em>Super Entity</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSuperEntity()
	 * @generated
	 * @ordered
	 */
	protected Entity superEntity;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAttributes()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> attributes;

	/**
	 * The cached value of the '{@link #getReference() <em>Reference</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReference()
	 * @generated
	 * @ordered
	 */
	protected EList<Reference> reference;

	/**
	 * The cached value of the '{@link #getInvariance() <em>Invariance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInvariance()
	 * @generated
	 * @ordered
	 */
	protected EList<Invariance> invariance;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected EntityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REMODELPackage.Literals.ENTITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsCRUD() {
		return isCRUD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsCRUD(boolean newIsCRUD) {
		boolean oldIsCRUD = isCRUD;
		isCRUD = newIsCRUD;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REMODELPackage.ENTITY__IS_CRUD, oldIsCRUD, isCRUD));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REMODELPackage.ENTITY__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity getSuperEntity() {
		if (superEntity != null && superEntity.eIsProxy()) {
			InternalEObject oldSuperEntity = (InternalEObject) superEntity;
			superEntity = (Entity) eResolveProxy(oldSuperEntity);
			if (superEntity != oldSuperEntity) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, REMODELPackage.ENTITY__SUPER_ENTITY,
							oldSuperEntity, superEntity));
			}
		}
		return superEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Entity basicGetSuperEntity() {
		return superEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSuperEntity(Entity newSuperEntity) {
		Entity oldSuperEntity = superEntity;
		superEntity = newSuperEntity;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REMODELPackage.ENTITY__SUPER_ENTITY, oldSuperEntity,
					superEntity));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, REMODELPackage.ENTITY__DESCRIPTION, oldDescription,
					description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getAttributes() {
		if (attributes == null) {
			attributes = new EObjectContainmentEList<Attribute>(Attribute.class, this,
					REMODELPackage.ENTITY__ATTRIBUTES);
		}
		return attributes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Reference> getReference() {
		if (reference == null) {
			reference = new EObjectContainmentEList<Reference>(Reference.class, this, REMODELPackage.ENTITY__REFERENCE);
		}
		return reference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Invariance> getInvariance() {
		if (invariance == null) {
			invariance = new EObjectContainmentEList<Invariance>(Invariance.class, this,
					REMODELPackage.ENTITY__INVARIANCE);
		}
		return invariance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case REMODELPackage.ENTITY__ATTRIBUTES:
			return ((InternalEList<?>) getAttributes()).basicRemove(otherEnd, msgs);
		case REMODELPackage.ENTITY__REFERENCE:
			return ((InternalEList<?>) getReference()).basicRemove(otherEnd, msgs);
		case REMODELPackage.ENTITY__INVARIANCE:
			return ((InternalEList<?>) getInvariance()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case REMODELPackage.ENTITY__IS_CRUD:
			return isIsCRUD();
		case REMODELPackage.ENTITY__NAME:
			return getName();
		case REMODELPackage.ENTITY__SUPER_ENTITY:
			if (resolve)
				return getSuperEntity();
			return basicGetSuperEntity();
		case REMODELPackage.ENTITY__DESCRIPTION:
			return getDescription();
		case REMODELPackage.ENTITY__ATTRIBUTES:
			return getAttributes();
		case REMODELPackage.ENTITY__REFERENCE:
			return getReference();
		case REMODELPackage.ENTITY__INVARIANCE:
			return getInvariance();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case REMODELPackage.ENTITY__IS_CRUD:
			setIsCRUD((Boolean) newValue);
			return;
		case REMODELPackage.ENTITY__NAME:
			setName((String) newValue);
			return;
		case REMODELPackage.ENTITY__SUPER_ENTITY:
			setSuperEntity((Entity) newValue);
			return;
		case REMODELPackage.ENTITY__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case REMODELPackage.ENTITY__ATTRIBUTES:
			getAttributes().clear();
			getAttributes().addAll((Collection<? extends Attribute>) newValue);
			return;
		case REMODELPackage.ENTITY__REFERENCE:
			getReference().clear();
			getReference().addAll((Collection<? extends Reference>) newValue);
			return;
		case REMODELPackage.ENTITY__INVARIANCE:
			getInvariance().clear();
			getInvariance().addAll((Collection<? extends Invariance>) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case REMODELPackage.ENTITY__IS_CRUD:
			setIsCRUD(IS_CRUD_EDEFAULT);
			return;
		case REMODELPackage.ENTITY__NAME:
			setName(NAME_EDEFAULT);
			return;
		case REMODELPackage.ENTITY__SUPER_ENTITY:
			setSuperEntity((Entity) null);
			return;
		case REMODELPackage.ENTITY__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case REMODELPackage.ENTITY__ATTRIBUTES:
			getAttributes().clear();
			return;
		case REMODELPackage.ENTITY__REFERENCE:
			getReference().clear();
			return;
		case REMODELPackage.ENTITY__INVARIANCE:
			getInvariance().clear();
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case REMODELPackage.ENTITY__IS_CRUD:
			return isCRUD != IS_CRUD_EDEFAULT;
		case REMODELPackage.ENTITY__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case REMODELPackage.ENTITY__SUPER_ENTITY:
			return superEntity != null;
		case REMODELPackage.ENTITY__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case REMODELPackage.ENTITY__ATTRIBUTES:
			return attributes != null && !attributes.isEmpty();
		case REMODELPackage.ENTITY__REFERENCE:
			return reference != null && !reference.isEmpty();
		case REMODELPackage.ENTITY__INVARIANCE:
			return invariance != null && !invariance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (isCRUD: ");
		result.append(isCRUD);
		result.append(", name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //EntityImpl

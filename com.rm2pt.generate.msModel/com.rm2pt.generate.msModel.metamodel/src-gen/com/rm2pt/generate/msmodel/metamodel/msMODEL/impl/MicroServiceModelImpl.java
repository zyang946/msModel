/**
 */
package com.rm2pt.generate.msmodel.metamodel.msMODEL.impl;

import com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface;
import com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService;
import com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel;
import com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage;

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

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Micro Service Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MicroServiceModelImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MicroServiceModelImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MicroServiceModelImpl#getMicroservice <em>Microservice</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MicroServiceModelImpl#getInterface <em>Interface</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicroServiceModelImpl extends MinimalEObjectImpl.Container implements MicroServiceModel {
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
	 * The cached value of the '{@link #getMicroservice() <em>Microservice</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroservice()
	 * @generated
	 * @ordered
	 */
	protected EList<MicroService> microservice;

	/**
	 * The cached value of the '{@link #getInterface() <em>Interface</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInterface()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> interface_;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroServiceModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MsMODELPackage.Literals.MICRO_SERVICE_MODEL;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MsMODELPackage.MICRO_SERVICE_MODEL__NAME, oldName,
					name));
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
			eNotify(new ENotificationImpl(this, Notification.SET, MsMODELPackage.MICRO_SERVICE_MODEL__DESCRIPTION,
					oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MicroService> getMicroservice() {
		if (microservice == null) {
			microservice = new EObjectContainmentEList<MicroService>(MicroService.class, this,
					MsMODELPackage.MICRO_SERVICE_MODEL__MICROSERVICE);
		}
		return microservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getInterface() {
		if (interface_ == null) {
			interface_ = new EObjectContainmentEList<Interface>(Interface.class, this,
					MsMODELPackage.MICRO_SERVICE_MODEL__INTERFACE);
		}
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MsMODELPackage.MICRO_SERVICE_MODEL__MICROSERVICE:
			return ((InternalEList<?>) getMicroservice()).basicRemove(otherEnd, msgs);
		case MsMODELPackage.MICRO_SERVICE_MODEL__INTERFACE:
			return ((InternalEList<?>) getInterface()).basicRemove(otherEnd, msgs);
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
		case MsMODELPackage.MICRO_SERVICE_MODEL__NAME:
			return getName();
		case MsMODELPackage.MICRO_SERVICE_MODEL__DESCRIPTION:
			return getDescription();
		case MsMODELPackage.MICRO_SERVICE_MODEL__MICROSERVICE:
			return getMicroservice();
		case MsMODELPackage.MICRO_SERVICE_MODEL__INTERFACE:
			return getInterface();
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
		case MsMODELPackage.MICRO_SERVICE_MODEL__NAME:
			setName((String) newValue);
			return;
		case MsMODELPackage.MICRO_SERVICE_MODEL__DESCRIPTION:
			setDescription((String) newValue);
			return;
		case MsMODELPackage.MICRO_SERVICE_MODEL__MICROSERVICE:
			getMicroservice().clear();
			getMicroservice().addAll((Collection<? extends MicroService>) newValue);
			return;
		case MsMODELPackage.MICRO_SERVICE_MODEL__INTERFACE:
			getInterface().clear();
			getInterface().addAll((Collection<? extends Interface>) newValue);
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
		case MsMODELPackage.MICRO_SERVICE_MODEL__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MsMODELPackage.MICRO_SERVICE_MODEL__DESCRIPTION:
			setDescription(DESCRIPTION_EDEFAULT);
			return;
		case MsMODELPackage.MICRO_SERVICE_MODEL__MICROSERVICE:
			getMicroservice().clear();
			return;
		case MsMODELPackage.MICRO_SERVICE_MODEL__INTERFACE:
			getInterface().clear();
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
		case MsMODELPackage.MICRO_SERVICE_MODEL__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MsMODELPackage.MICRO_SERVICE_MODEL__DESCRIPTION:
			return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
		case MsMODELPackage.MICRO_SERVICE_MODEL__MICROSERVICE:
			return microservice != null && !microservice.isEmpty();
		case MsMODELPackage.MICRO_SERVICE_MODEL__INTERFACE:
			return interface_ != null && !interface_.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", description: ");
		result.append(description);
		result.append(')');
		return result.toString();
	}

} //MicroServiceModelImpl

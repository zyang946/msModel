/**
 */
package com.rm2pt.generate.msmodel.metamodel.msMODEL.impl;

import com.rm2pt.generate.msmodel.metamodel.msMODEL.LifeLine;
import com.rm2pt.generate.msmodel.metamodel.msMODEL.Message;
import com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService;
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
 * An implementation of the model object '<em><b>Life Line</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.LifeLineImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.LifeLineImpl#getMicroservice <em>Microservice</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.LifeLineImpl#getMessage <em>Message</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LifeLineImpl extends MinimalEObjectImpl.Container implements LifeLine {
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
	 * The cached value of the '{@link #getMicroservice() <em>Microservice</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMicroservice()
	 * @generated
	 * @ordered
	 */
	protected MicroService microservice;

	/**
	 * The cached value of the '{@link #getMessage() <em>Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<Message> message;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifeLineImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MsMODELPackage.Literals.LIFE_LINE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MsMODELPackage.LIFE_LINE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroService getMicroservice() {
		if (microservice != null && microservice.eIsProxy()) {
			InternalEObject oldMicroservice = (InternalEObject) microservice;
			microservice = (MicroService) eResolveProxy(oldMicroservice);
			if (microservice != oldMicroservice) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, MsMODELPackage.LIFE_LINE__MICROSERVICE,
							oldMicroservice, microservice));
			}
		}
		return microservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroService basicGetMicroservice() {
		return microservice;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMicroservice(MicroService newMicroservice) {
		MicroService oldMicroservice = microservice;
		microservice = newMicroservice;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, MsMODELPackage.LIFE_LINE__MICROSERVICE,
					oldMicroservice, microservice));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Message> getMessage() {
		if (message == null) {
			message = new EObjectContainmentEList<Message>(Message.class, this, MsMODELPackage.LIFE_LINE__MESSAGE);
		}
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MsMODELPackage.LIFE_LINE__MESSAGE:
			return ((InternalEList<?>) getMessage()).basicRemove(otherEnd, msgs);
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
		case MsMODELPackage.LIFE_LINE__NAME:
			return getName();
		case MsMODELPackage.LIFE_LINE__MICROSERVICE:
			if (resolve)
				return getMicroservice();
			return basicGetMicroservice();
		case MsMODELPackage.LIFE_LINE__MESSAGE:
			return getMessage();
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
		case MsMODELPackage.LIFE_LINE__NAME:
			setName((String) newValue);
			return;
		case MsMODELPackage.LIFE_LINE__MICROSERVICE:
			setMicroservice((MicroService) newValue);
			return;
		case MsMODELPackage.LIFE_LINE__MESSAGE:
			getMessage().clear();
			getMessage().addAll((Collection<? extends Message>) newValue);
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
		case MsMODELPackage.LIFE_LINE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MsMODELPackage.LIFE_LINE__MICROSERVICE:
			setMicroservice((MicroService) null);
			return;
		case MsMODELPackage.LIFE_LINE__MESSAGE:
			getMessage().clear();
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
		case MsMODELPackage.LIFE_LINE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MsMODELPackage.LIFE_LINE__MICROSERVICE:
			return microservice != null;
		case MsMODELPackage.LIFE_LINE__MESSAGE:
			return message != null && !message.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //LifeLineImpl

/**
 */
package com.rm2pt.generate.msmodel.metamodel.msMODEL.impl;

import com.rm2pt.generate.msmodel.metamodel.msMODEL.CallChain;
import com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface;
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

import rEMODEL.Contract;
import rEMODEL.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interface</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.InterfaceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.InterfaceImpl#getCallchain <em>Callchain</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.InterfaceImpl#getContract <em>Contract</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.InterfaceImpl#getOperation <em>Operation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InterfaceImpl extends MinimalEObjectImpl.Container implements Interface {
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
	 * The cached value of the '{@link #getCallchain() <em>Callchain</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCallchain()
	 * @generated
	 * @ordered
	 */
	protected EList<CallChain> callchain;

	/**
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected EList<Contract> contract;

	/**
	 * The cached value of the '{@link #getOperation() <em>Operation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOperation()
	 * @generated
	 * @ordered
	 */
	protected EList<Operation> operation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MsMODELPackage.Literals.INTERFACE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MsMODELPackage.INTERFACE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CallChain> getCallchain() {
		if (callchain == null) {
			callchain = new EObjectContainmentEList<CallChain>(CallChain.class, this,
					MsMODELPackage.INTERFACE__CALLCHAIN);
		}
		return callchain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contract> getContract() {
		if (contract == null) {
			contract = new EObjectContainmentEList<Contract>(Contract.class, this, MsMODELPackage.INTERFACE__CONTRACT);
		}
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<Operation>(Operation.class, this,
					MsMODELPackage.INTERFACE__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MsMODELPackage.INTERFACE__CALLCHAIN:
			return ((InternalEList<?>) getCallchain()).basicRemove(otherEnd, msgs);
		case MsMODELPackage.INTERFACE__CONTRACT:
			return ((InternalEList<?>) getContract()).basicRemove(otherEnd, msgs);
		case MsMODELPackage.INTERFACE__OPERATION:
			return ((InternalEList<?>) getOperation()).basicRemove(otherEnd, msgs);
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
		case MsMODELPackage.INTERFACE__NAME:
			return getName();
		case MsMODELPackage.INTERFACE__CALLCHAIN:
			return getCallchain();
		case MsMODELPackage.INTERFACE__CONTRACT:
			return getContract();
		case MsMODELPackage.INTERFACE__OPERATION:
			return getOperation();
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
		case MsMODELPackage.INTERFACE__NAME:
			setName((String) newValue);
			return;
		case MsMODELPackage.INTERFACE__CALLCHAIN:
			getCallchain().clear();
			getCallchain().addAll((Collection<? extends CallChain>) newValue);
			return;
		case MsMODELPackage.INTERFACE__CONTRACT:
			getContract().clear();
			getContract().addAll((Collection<? extends Contract>) newValue);
			return;
		case MsMODELPackage.INTERFACE__OPERATION:
			getOperation().clear();
			getOperation().addAll((Collection<? extends Operation>) newValue);
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
		case MsMODELPackage.INTERFACE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MsMODELPackage.INTERFACE__CALLCHAIN:
			getCallchain().clear();
			return;
		case MsMODELPackage.INTERFACE__CONTRACT:
			getContract().clear();
			return;
		case MsMODELPackage.INTERFACE__OPERATION:
			getOperation().clear();
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
		case MsMODELPackage.INTERFACE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MsMODELPackage.INTERFACE__CALLCHAIN:
			return callchain != null && !callchain.isEmpty();
		case MsMODELPackage.INTERFACE__CONTRACT:
			return contract != null && !contract.isEmpty();
		case MsMODELPackage.INTERFACE__OPERATION:
			return operation != null && !operation.isEmpty();
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

} //InterfaceImpl

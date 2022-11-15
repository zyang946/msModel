/**
 */
package com.rm2pt.generate.msmodel.metamodel.msMODEL.impl;

import com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface;
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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rEMODEL.Contract;
import rEMODEL.DomainModel;
import rEMODEL.Operation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Micro Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MicroServiceImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MicroServiceImpl#getProvide <em>Provide</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MicroServiceImpl#getRequire <em>Require</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MicroServiceImpl#getDomainmodel <em>Domainmodel</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MicroServiceImpl#getUse <em>Use</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MicroServiceImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MicroServiceImpl#getContract <em>Contract</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MicroServiceImpl extends MinimalEObjectImpl.Container implements MicroService {
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
	 * The cached value of the '{@link #getProvide() <em>Provide</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProvide()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> provide;

	/**
	 * The cached value of the '{@link #getRequire() <em>Require</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequire()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> require;

	/**
	 * The cached value of the '{@link #getDomainmodel() <em>Domainmodel</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDomainmodel()
	 * @generated
	 * @ordered
	 */
	protected EList<DomainModel> domainmodel;

	/**
	 * The cached value of the '{@link #getUse() <em>Use</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUse()
	 * @generated
	 * @ordered
	 */
	protected EList<Interface> use;

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
	 * The cached value of the '{@link #getContract() <em>Contract</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getContract()
	 * @generated
	 * @ordered
	 */
	protected EList<Contract> contract;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MsMODELPackage.Literals.MICRO_SERVICE;
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
			eNotify(new ENotificationImpl(this, Notification.SET, MsMODELPackage.MICRO_SERVICE__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getProvide() {
		if (provide == null) {
			provide = new EObjectResolvingEList<Interface>(Interface.class, this,
					MsMODELPackage.MICRO_SERVICE__PROVIDE);
		}
		return provide;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getRequire() {
		if (require == null) {
			require = new EObjectResolvingEList<Interface>(Interface.class, this,
					MsMODELPackage.MICRO_SERVICE__REQUIRE);
		}
		return require;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DomainModel> getDomainmodel() {
		if (domainmodel == null) {
			domainmodel = new EObjectContainmentEList<DomainModel>(DomainModel.class, this,
					MsMODELPackage.MICRO_SERVICE__DOMAINMODEL);
		}
		return domainmodel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Interface> getUse() {
		if (use == null) {
			use = new EObjectResolvingEList<Interface>(Interface.class, this, MsMODELPackage.MICRO_SERVICE__USE);
		}
		return use;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<Operation>(Operation.class, this,
					MsMODELPackage.MICRO_SERVICE__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Contract> getContract() {
		if (contract == null) {
			contract = new EObjectContainmentEList<Contract>(Contract.class, this,
					MsMODELPackage.MICRO_SERVICE__CONTRACT);
		}
		return contract;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case MsMODELPackage.MICRO_SERVICE__DOMAINMODEL:
			return ((InternalEList<?>) getDomainmodel()).basicRemove(otherEnd, msgs);
		case MsMODELPackage.MICRO_SERVICE__OPERATION:
			return ((InternalEList<?>) getOperation()).basicRemove(otherEnd, msgs);
		case MsMODELPackage.MICRO_SERVICE__CONTRACT:
			return ((InternalEList<?>) getContract()).basicRemove(otherEnd, msgs);
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
		case MsMODELPackage.MICRO_SERVICE__NAME:
			return getName();
		case MsMODELPackage.MICRO_SERVICE__PROVIDE:
			return getProvide();
		case MsMODELPackage.MICRO_SERVICE__REQUIRE:
			return getRequire();
		case MsMODELPackage.MICRO_SERVICE__DOMAINMODEL:
			return getDomainmodel();
		case MsMODELPackage.MICRO_SERVICE__USE:
			return getUse();
		case MsMODELPackage.MICRO_SERVICE__OPERATION:
			return getOperation();
		case MsMODELPackage.MICRO_SERVICE__CONTRACT:
			return getContract();
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
		case MsMODELPackage.MICRO_SERVICE__NAME:
			setName((String) newValue);
			return;
		case MsMODELPackage.MICRO_SERVICE__PROVIDE:
			getProvide().clear();
			getProvide().addAll((Collection<? extends Interface>) newValue);
			return;
		case MsMODELPackage.MICRO_SERVICE__REQUIRE:
			getRequire().clear();
			getRequire().addAll((Collection<? extends Interface>) newValue);
			return;
		case MsMODELPackage.MICRO_SERVICE__DOMAINMODEL:
			getDomainmodel().clear();
			getDomainmodel().addAll((Collection<? extends DomainModel>) newValue);
			return;
		case MsMODELPackage.MICRO_SERVICE__USE:
			getUse().clear();
			getUse().addAll((Collection<? extends Interface>) newValue);
			return;
		case MsMODELPackage.MICRO_SERVICE__OPERATION:
			getOperation().clear();
			getOperation().addAll((Collection<? extends Operation>) newValue);
			return;
		case MsMODELPackage.MICRO_SERVICE__CONTRACT:
			getContract().clear();
			getContract().addAll((Collection<? extends Contract>) newValue);
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
		case MsMODELPackage.MICRO_SERVICE__NAME:
			setName(NAME_EDEFAULT);
			return;
		case MsMODELPackage.MICRO_SERVICE__PROVIDE:
			getProvide().clear();
			return;
		case MsMODELPackage.MICRO_SERVICE__REQUIRE:
			getRequire().clear();
			return;
		case MsMODELPackage.MICRO_SERVICE__DOMAINMODEL:
			getDomainmodel().clear();
			return;
		case MsMODELPackage.MICRO_SERVICE__USE:
			getUse().clear();
			return;
		case MsMODELPackage.MICRO_SERVICE__OPERATION:
			getOperation().clear();
			return;
		case MsMODELPackage.MICRO_SERVICE__CONTRACT:
			getContract().clear();
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
		case MsMODELPackage.MICRO_SERVICE__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case MsMODELPackage.MICRO_SERVICE__PROVIDE:
			return provide != null && !provide.isEmpty();
		case MsMODELPackage.MICRO_SERVICE__REQUIRE:
			return require != null && !require.isEmpty();
		case MsMODELPackage.MICRO_SERVICE__DOMAINMODEL:
			return domainmodel != null && !domainmodel.isEmpty();
		case MsMODELPackage.MICRO_SERVICE__USE:
			return use != null && !use.isEmpty();
		case MsMODELPackage.MICRO_SERVICE__OPERATION:
			return operation != null && !operation.isEmpty();
		case MsMODELPackage.MICRO_SERVICE__CONTRACT:
			return contract != null && !contract.isEmpty();
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

} //MicroServiceImpl

/**
 */
package rEMODEL.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rEMODEL.Attribute;
import rEMODEL.Invariance;
import rEMODEL.Operation;
import rEMODEL.REMODELPackage;
import rEMODEL.Service;
import rEMODEL.Workflow;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Service</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.impl.ServiceImpl#getOperation <em>Operation</em>}</li>
 *   <li>{@link rEMODEL.impl.ServiceImpl#getTemp_property <em>Temp property</em>}</li>
 *   <li>{@link rEMODEL.impl.ServiceImpl#getWorkflow <em>Workflow</em>}</li>
 *   <li>{@link rEMODEL.impl.ServiceImpl#getInvariance <em>Invariance</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ServiceImpl extends ParticipantImpl implements Service {
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
	 * The cached value of the '{@link #getTemp_property() <em>Temp property</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTemp_property()
	 * @generated
	 * @ordered
	 */
	protected EList<Attribute> temp_property;

	/**
	 * The cached value of the '{@link #getWorkflow() <em>Workflow</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkflow()
	 * @generated
	 * @ordered
	 */
	protected EList<Workflow> workflow;

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
	protected ServiceImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REMODELPackage.Literals.SERVICE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Operation> getOperation() {
		if (operation == null) {
			operation = new EObjectContainmentEList<Operation>(Operation.class, this,
					REMODELPackage.SERVICE__OPERATION);
		}
		return operation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Attribute> getTemp_property() {
		if (temp_property == null) {
			temp_property = new EObjectContainmentEList<Attribute>(Attribute.class, this,
					REMODELPackage.SERVICE__TEMP_PROPERTY);
		}
		return temp_property;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Workflow> getWorkflow() {
		if (workflow == null) {
			workflow = new EObjectResolvingEList<Workflow>(Workflow.class, this, REMODELPackage.SERVICE__WORKFLOW);
		}
		return workflow;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Invariance> getInvariance() {
		if (invariance == null) {
			invariance = new EObjectContainmentEList<Invariance>(Invariance.class, this,
					REMODELPackage.SERVICE__INVARIANCE);
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
		case REMODELPackage.SERVICE__OPERATION:
			return ((InternalEList<?>) getOperation()).basicRemove(otherEnd, msgs);
		case REMODELPackage.SERVICE__TEMP_PROPERTY:
			return ((InternalEList<?>) getTemp_property()).basicRemove(otherEnd, msgs);
		case REMODELPackage.SERVICE__INVARIANCE:
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
		case REMODELPackage.SERVICE__OPERATION:
			return getOperation();
		case REMODELPackage.SERVICE__TEMP_PROPERTY:
			return getTemp_property();
		case REMODELPackage.SERVICE__WORKFLOW:
			return getWorkflow();
		case REMODELPackage.SERVICE__INVARIANCE:
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
		case REMODELPackage.SERVICE__OPERATION:
			getOperation().clear();
			getOperation().addAll((Collection<? extends Operation>) newValue);
			return;
		case REMODELPackage.SERVICE__TEMP_PROPERTY:
			getTemp_property().clear();
			getTemp_property().addAll((Collection<? extends Attribute>) newValue);
			return;
		case REMODELPackage.SERVICE__WORKFLOW:
			getWorkflow().clear();
			getWorkflow().addAll((Collection<? extends Workflow>) newValue);
			return;
		case REMODELPackage.SERVICE__INVARIANCE:
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
		case REMODELPackage.SERVICE__OPERATION:
			getOperation().clear();
			return;
		case REMODELPackage.SERVICE__TEMP_PROPERTY:
			getTemp_property().clear();
			return;
		case REMODELPackage.SERVICE__WORKFLOW:
			getWorkflow().clear();
			return;
		case REMODELPackage.SERVICE__INVARIANCE:
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
		case REMODELPackage.SERVICE__OPERATION:
			return operation != null && !operation.isEmpty();
		case REMODELPackage.SERVICE__TEMP_PROPERTY:
			return temp_property != null && !temp_property.isEmpty();
		case REMODELPackage.SERVICE__WORKFLOW:
			return workflow != null && !workflow.isEmpty();
		case REMODELPackage.SERVICE__INVARIANCE:
			return invariance != null && !invariance.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //ServiceImpl

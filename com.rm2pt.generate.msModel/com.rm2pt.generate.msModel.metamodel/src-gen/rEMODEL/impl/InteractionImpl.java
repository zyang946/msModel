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
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
import org.eclipse.emf.ecore.util.InternalEList;

import rEMODEL.AbstractEnd;
import rEMODEL.CombinedFragment;
import rEMODEL.Execution;
import rEMODEL.Interaction;
import rEMODEL.MessageNew;
import rEMODEL.Participant;
import rEMODEL.REMODELPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Interaction</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link rEMODEL.impl.InteractionImpl#getName <em>Name</em>}</li>
 *   <li>{@link rEMODEL.impl.InteractionImpl#getParticipants <em>Participants</em>}</li>
 *   <li>{@link rEMODEL.impl.InteractionImpl#getMessages <em>Messages</em>}</li>
 *   <li>{@link rEMODEL.impl.InteractionImpl#getExecutions <em>Executions</em>}</li>
 *   <li>{@link rEMODEL.impl.InteractionImpl#getCombinedFragments <em>Combined Fragments</em>}</li>
 *   <li>{@link rEMODEL.impl.InteractionImpl#getEnds <em>Ends</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InteractionImpl extends MinimalEObjectImpl.Container implements Interaction {
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
	 * The cached value of the '{@link #getParticipants() <em>Participants</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getParticipants()
	 * @generated
	 * @ordered
	 */
	protected EList<Participant> participants;

	/**
	 * The cached value of the '{@link #getMessages() <em>Messages</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMessages()
	 * @generated
	 * @ordered
	 */
	protected EList<MessageNew> messages;

	/**
	 * The cached value of the '{@link #getExecutions() <em>Executions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutions()
	 * @generated
	 * @ordered
	 */
	protected EList<Execution> executions;

	/**
	 * The cached value of the '{@link #getCombinedFragments() <em>Combined Fragments</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCombinedFragments()
	 * @generated
	 * @ordered
	 */
	protected EList<CombinedFragment> combinedFragments;

	/**
	 * The cached value of the '{@link #getEnds() <em>Ends</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEnds()
	 * @generated
	 * @ordered
	 */
	protected EList<AbstractEnd> ends;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InteractionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return REMODELPackage.Literals.INTERACTION;
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
			eNotify(new ENotificationImpl(this, Notification.SET, REMODELPackage.INTERACTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Participant> getParticipants() {
		if (participants == null) {
			participants = new EObjectResolvingEList<Participant>(Participant.class, this,
					REMODELPackage.INTERACTION__PARTICIPANTS);
		}
		return participants;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MessageNew> getMessages() {
		if (messages == null) {
			messages = new EObjectContainmentEList<MessageNew>(MessageNew.class, this,
					REMODELPackage.INTERACTION__MESSAGES);
		}
		return messages;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Execution> getExecutions() {
		if (executions == null) {
			executions = new EObjectContainmentEList<Execution>(Execution.class, this,
					REMODELPackage.INTERACTION__EXECUTIONS);
		}
		return executions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CombinedFragment> getCombinedFragments() {
		if (combinedFragments == null) {
			combinedFragments = new EObjectContainmentEList<CombinedFragment>(CombinedFragment.class, this,
					REMODELPackage.INTERACTION__COMBINED_FRAGMENTS);
		}
		return combinedFragments;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<AbstractEnd> getEnds() {
		if (ends == null) {
			ends = new EObjectContainmentEList<AbstractEnd>(AbstractEnd.class, this, REMODELPackage.INTERACTION__ENDS);
		}
		return ends;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case REMODELPackage.INTERACTION__MESSAGES:
			return ((InternalEList<?>) getMessages()).basicRemove(otherEnd, msgs);
		case REMODELPackage.INTERACTION__EXECUTIONS:
			return ((InternalEList<?>) getExecutions()).basicRemove(otherEnd, msgs);
		case REMODELPackage.INTERACTION__COMBINED_FRAGMENTS:
			return ((InternalEList<?>) getCombinedFragments()).basicRemove(otherEnd, msgs);
		case REMODELPackage.INTERACTION__ENDS:
			return ((InternalEList<?>) getEnds()).basicRemove(otherEnd, msgs);
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
		case REMODELPackage.INTERACTION__NAME:
			return getName();
		case REMODELPackage.INTERACTION__PARTICIPANTS:
			return getParticipants();
		case REMODELPackage.INTERACTION__MESSAGES:
			return getMessages();
		case REMODELPackage.INTERACTION__EXECUTIONS:
			return getExecutions();
		case REMODELPackage.INTERACTION__COMBINED_FRAGMENTS:
			return getCombinedFragments();
		case REMODELPackage.INTERACTION__ENDS:
			return getEnds();
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
		case REMODELPackage.INTERACTION__NAME:
			setName((String) newValue);
			return;
		case REMODELPackage.INTERACTION__PARTICIPANTS:
			getParticipants().clear();
			getParticipants().addAll((Collection<? extends Participant>) newValue);
			return;
		case REMODELPackage.INTERACTION__MESSAGES:
			getMessages().clear();
			getMessages().addAll((Collection<? extends MessageNew>) newValue);
			return;
		case REMODELPackage.INTERACTION__EXECUTIONS:
			getExecutions().clear();
			getExecutions().addAll((Collection<? extends Execution>) newValue);
			return;
		case REMODELPackage.INTERACTION__COMBINED_FRAGMENTS:
			getCombinedFragments().clear();
			getCombinedFragments().addAll((Collection<? extends CombinedFragment>) newValue);
			return;
		case REMODELPackage.INTERACTION__ENDS:
			getEnds().clear();
			getEnds().addAll((Collection<? extends AbstractEnd>) newValue);
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
		case REMODELPackage.INTERACTION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case REMODELPackage.INTERACTION__PARTICIPANTS:
			getParticipants().clear();
			return;
		case REMODELPackage.INTERACTION__MESSAGES:
			getMessages().clear();
			return;
		case REMODELPackage.INTERACTION__EXECUTIONS:
			getExecutions().clear();
			return;
		case REMODELPackage.INTERACTION__COMBINED_FRAGMENTS:
			getCombinedFragments().clear();
			return;
		case REMODELPackage.INTERACTION__ENDS:
			getEnds().clear();
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
		case REMODELPackage.INTERACTION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case REMODELPackage.INTERACTION__PARTICIPANTS:
			return participants != null && !participants.isEmpty();
		case REMODELPackage.INTERACTION__MESSAGES:
			return messages != null && !messages.isEmpty();
		case REMODELPackage.INTERACTION__EXECUTIONS:
			return executions != null && !executions.isEmpty();
		case REMODELPackage.INTERACTION__COMBINED_FRAGMENTS:
			return combinedFragments != null && !combinedFragments.isEmpty();
		case REMODELPackage.INTERACTION__ENDS:
			return ends != null && !ends.isEmpty();
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

} //InteractionImpl

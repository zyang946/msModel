/**
 */
package rEMODEL.provider;

import com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELFactory;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import rEMODEL.LogicFormulaExpCS;
import rEMODEL.REMODELFactory;
import rEMODEL.REMODELPackage;

/**
 * This is the item provider adapter for a {@link rEMODEL.LogicFormulaExpCS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LogicFormulaExpCSItemProvider extends OCLExpressionCSItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LogicFormulaExpCSItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addConnectorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Connector feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addConnectorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_LogicFormulaExpCS_connector_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_LogicFormulaExpCS_connector_feature",
								"_UI_LogicFormulaExpCS_type"),
						REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__CONNECTOR, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns LogicFormulaExpCS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LogicFormulaExpCS"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		return getString("_UI_LogicFormulaExpCS_type");
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(LogicFormulaExpCS.class)) {
		case REMODELPackage.LOGIC_FORMULA_EXP_CS__CONNECTOR:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case REMODELPackage.LOGIC_FORMULA_EXP_CS__ATOMICEXP:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createRequirementModel()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createInteraction()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createMessageNew()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createCallMessage()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createReturnMessage()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createMultiEnd()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createExecution()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createCombinedFragment()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createOperand()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createAbstractEnd()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createMixEnd()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createMixOpAndCFEnd()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createMessageEnd()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createExecutionEnd()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createCombinedFragmentEnd()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createOperandEnd()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createDomainModel()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createUseCaseModel()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createParticipant()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createActor()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createUC()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createService()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createWorkflow()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createPartition()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createWorkflowExp()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createPartitionAction()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createJoinExp()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createActivityFinal()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createInitalNode()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createForkNode()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createJoinNode()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createComplexOpeartion()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createSimpleOperation()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createLoopExp()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createSwitchExp()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createSwitchCase()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createSwitchDefault()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createOperation()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createParameter()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createEntity()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createAttribute()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createReference()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createTypeCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createInvariance()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createEntityType()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createEnumEntity()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createEnumItem()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createContract()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createDefinition()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createPrecondition()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createPostcondition()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createOCLExpressionCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createNestedExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createLogicFormulaExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createAtomicExpression()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createLeftSubAtomicExpression()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createRightSubAtomicExpression()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createLoopExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createIteratorExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createEntityAttributeName()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createArgumentsCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createFeatureCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createStandardNavigationCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createStandardOperationExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createPredefineOp()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createStandardNoneParameterOperation()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createStandardParameterOperation()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createStandardCollectionOperation()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createStandardDateOperation()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createClassiferCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createPropertyCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createOperationCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createOperationParameters()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createVariableExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createIfExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createLetExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createVariableDeclarationCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createEnumLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createTupleLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createTupleTypeCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createCollectionTypeCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createCollectionLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createCollectionLiteralPartCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createCollectionRangeCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createCollectionItem()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createPrimitiveLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createNumberLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createBooleanLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createStringLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createNullLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createInvalidLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createReservedKeywordCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createCollectionTypeIdentifierCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createPrimitiveTypeCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				REMODELFactory.eINSTANCE.createOclTypeCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				MsMODELFactory.eINSTANCE.createMicroServiceModel()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				MsMODELFactory.eINSTANCE.createMicroService()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				MsMODELFactory.eINSTANCE.createInterface()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				MsMODELFactory.eINSTANCE.createIn()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				MsMODELFactory.eINSTANCE.createProvided()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				MsMODELFactory.eINSTANCE.createRequired()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				MsMODELFactory.eINSTANCE.createCallChain()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				MsMODELFactory.eINSTANCE.createLifeLine()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LOGIC_FORMULA_EXP_CS__ATOMICEXP,
				MsMODELFactory.eINSTANCE.createMessage()));
	}

}

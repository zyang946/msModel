/**
 */
package rEMODEL.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import rEMODEL.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see rEMODEL.REMODELPackage
 * @generated
 */
public class REMODELAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static REMODELPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public REMODELAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = REMODELPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected REMODELSwitch<Adapter> modelSwitch = new REMODELSwitch<Adapter>() {
		@Override
		public Adapter caseRequirementModel(RequirementModel object) {
			return createRequirementModelAdapter();
		}

		@Override
		public Adapter caseInteraction(Interaction object) {
			return createInteractionAdapter();
		}

		@Override
		public Adapter caseMessageNew(MessageNew object) {
			return createMessageNewAdapter();
		}

		@Override
		public Adapter caseCallMessage(CallMessage object) {
			return createCallMessageAdapter();
		}

		@Override
		public Adapter caseReturnMessage(ReturnMessage object) {
			return createReturnMessageAdapter();
		}

		@Override
		public Adapter caseExecution(Execution object) {
			return createExecutionAdapter();
		}

		@Override
		public Adapter caseCombinedFragment(CombinedFragment object) {
			return createCombinedFragmentAdapter();
		}

		@Override
		public Adapter caseOperand(Operand object) {
			return createOperandAdapter();
		}

		@Override
		public Adapter caseAbstractEnd(AbstractEnd object) {
			return createAbstractEndAdapter();
		}

		@Override
		public Adapter caseMixEnd(MixEnd object) {
			return createMixEndAdapter();
		}

		@Override
		public Adapter caseMixOpAndCFEnd(MixOpAndCFEnd object) {
			return createMixOpAndCFEndAdapter();
		}

		@Override
		public Adapter caseMessageEnd(MessageEnd object) {
			return createMessageEndAdapter();
		}

		@Override
		public Adapter caseMultiEnd(MultiEnd object) {
			return createMultiEndAdapter();
		}

		@Override
		public Adapter caseExecutionEnd(ExecutionEnd object) {
			return createExecutionEndAdapter();
		}

		@Override
		public Adapter caseCombinedFragmentEnd(CombinedFragmentEnd object) {
			return createCombinedFragmentEndAdapter();
		}

		@Override
		public Adapter caseOperandEnd(OperandEnd object) {
			return createOperandEndAdapter();
		}

		@Override
		public Adapter caseDomainModel(DomainModel object) {
			return createDomainModelAdapter();
		}

		@Override
		public Adapter caseUseCaseModel(UseCaseModel object) {
			return createUseCaseModelAdapter();
		}

		@Override
		public Adapter caseActor(Actor object) {
			return createActorAdapter();
		}

		@Override
		public Adapter caseUC(UC object) {
			return createUCAdapter();
		}

		@Override
		public Adapter caseService(Service object) {
			return createServiceAdapter();
		}

		@Override
		public Adapter caseParticipant(Participant object) {
			return createParticipantAdapter();
		}

		@Override
		public Adapter caseWorkflow(Workflow object) {
			return createWorkflowAdapter();
		}

		@Override
		public Adapter casePartition(Partition object) {
			return createPartitionAdapter();
		}

		@Override
		public Adapter caseWorkflowExp(WorkflowExp object) {
			return createWorkflowExpAdapter();
		}

		@Override
		public Adapter casePartitionAction(PartitionAction object) {
			return createPartitionActionAdapter();
		}

		@Override
		public Adapter caseJoinExp(JoinExp object) {
			return createJoinExpAdapter();
		}

		@Override
		public Adapter caseActivityFinal(ActivityFinal object) {
			return createActivityFinalAdapter();
		}

		@Override
		public Adapter caseInitalNode(InitalNode object) {
			return createInitalNodeAdapter();
		}

		@Override
		public Adapter caseForkNode(ForkNode object) {
			return createForkNodeAdapter();
		}

		@Override
		public Adapter caseJoinNode(JoinNode object) {
			return createJoinNodeAdapter();
		}

		@Override
		public Adapter caseComplexOpeartion(ComplexOpeartion object) {
			return createComplexOpeartionAdapter();
		}

		@Override
		public Adapter caseSimpleOperation(SimpleOperation object) {
			return createSimpleOperationAdapter();
		}

		@Override
		public Adapter caseLoopExp(LoopExp object) {
			return createLoopExpAdapter();
		}

		@Override
		public Adapter caseSwitchExp(SwitchExp object) {
			return createSwitchExpAdapter();
		}

		@Override
		public Adapter caseSwitchCase(SwitchCase object) {
			return createSwitchCaseAdapter();
		}

		@Override
		public Adapter caseSwitchDefault(SwitchDefault object) {
			return createSwitchDefaultAdapter();
		}

		@Override
		public Adapter caseOperation(Operation object) {
			return createOperationAdapter();
		}

		@Override
		public Adapter caseParameter(Parameter object) {
			return createParameterAdapter();
		}

		@Override
		public Adapter caseEntity(Entity object) {
			return createEntityAdapter();
		}

		@Override
		public Adapter caseAttribute(Attribute object) {
			return createAttributeAdapter();
		}

		@Override
		public Adapter caseReference(Reference object) {
			return createReferenceAdapter();
		}

		@Override
		public Adapter caseTypeCS(TypeCS object) {
			return createTypeCSAdapter();
		}

		@Override
		public Adapter caseInvariance(Invariance object) {
			return createInvarianceAdapter();
		}

		@Override
		public Adapter caseEntityType(EntityType object) {
			return createEntityTypeAdapter();
		}

		@Override
		public Adapter caseEnumEntity(EnumEntity object) {
			return createEnumEntityAdapter();
		}

		@Override
		public Adapter caseEnumItem(EnumItem object) {
			return createEnumItemAdapter();
		}

		@Override
		public Adapter caseContract(Contract object) {
			return createContractAdapter();
		}

		@Override
		public Adapter caseDefinition(Definition object) {
			return createDefinitionAdapter();
		}

		@Override
		public Adapter casePrecondition(Precondition object) {
			return createPreconditionAdapter();
		}

		@Override
		public Adapter casePostcondition(Postcondition object) {
			return createPostconditionAdapter();
		}

		@Override
		public Adapter caseOCLExpressionCS(OCLExpressionCS object) {
			return createOCLExpressionCSAdapter();
		}

		@Override
		public Adapter caseNestedExpCS(NestedExpCS object) {
			return createNestedExpCSAdapter();
		}

		@Override
		public Adapter caseLogicFormulaExpCS(LogicFormulaExpCS object) {
			return createLogicFormulaExpCSAdapter();
		}

		@Override
		public Adapter caseAtomicExpression(AtomicExpression object) {
			return createAtomicExpressionAdapter();
		}

		@Override
		public Adapter caseLeftSubAtomicExpression(LeftSubAtomicExpression object) {
			return createLeftSubAtomicExpressionAdapter();
		}

		@Override
		public Adapter caseRightSubAtomicExpression(RightSubAtomicExpression object) {
			return createRightSubAtomicExpressionAdapter();
		}

		@Override
		public Adapter caseCallExpCS(CallExpCS object) {
			return createCallExpCSAdapter();
		}

		@Override
		public Adapter caseLoopExpCS(LoopExpCS object) {
			return createLoopExpCSAdapter();
		}

		@Override
		public Adapter caseIteratorExpCS(IteratorExpCS object) {
			return createIteratorExpCSAdapter();
		}

		@Override
		public Adapter caseEntityAttributeName(EntityAttributeName object) {
			return createEntityAttributeNameAdapter();
		}

		@Override
		public Adapter caseArgumentsCS(ArgumentsCS object) {
			return createArgumentsCSAdapter();
		}

		@Override
		public Adapter caseFeatureCallExpCS(FeatureCallExpCS object) {
			return createFeatureCallExpCSAdapter();
		}

		@Override
		public Adapter caseStandardNavigationCallExpCS(StandardNavigationCallExpCS object) {
			return createStandardNavigationCallExpCSAdapter();
		}

		@Override
		public Adapter caseStandardOperationExpCS(StandardOperationExpCS object) {
			return createStandardOperationExpCSAdapter();
		}

		@Override
		public Adapter casePredefineOp(PredefineOp object) {
			return createPredefineOpAdapter();
		}

		@Override
		public Adapter caseStandardNoneParameterOperation(StandardNoneParameterOperation object) {
			return createStandardNoneParameterOperationAdapter();
		}

		@Override
		public Adapter caseStandardParameterOperation(StandardParameterOperation object) {
			return createStandardParameterOperationAdapter();
		}

		@Override
		public Adapter caseStandardCollectionOperation(StandardCollectionOperation object) {
			return createStandardCollectionOperationAdapter();
		}

		@Override
		public Adapter caseStandardDateOperation(StandardDateOperation object) {
			return createStandardDateOperationAdapter();
		}

		@Override
		public Adapter caseClassiferCallExpCS(ClassiferCallExpCS object) {
			return createClassiferCallExpCSAdapter();
		}

		@Override
		public Adapter casePropertyCallExpCS(PropertyCallExpCS object) {
			return createPropertyCallExpCSAdapter();
		}

		@Override
		public Adapter caseOperationCallExpCS(OperationCallExpCS object) {
			return createOperationCallExpCSAdapter();
		}

		@Override
		public Adapter caseOperationParameters(OperationParameters object) {
			return createOperationParametersAdapter();
		}

		@Override
		public Adapter caseVariableExpCS(VariableExpCS object) {
			return createVariableExpCSAdapter();
		}

		@Override
		public Adapter caseIfExpCS(IfExpCS object) {
			return createIfExpCSAdapter();
		}

		@Override
		public Adapter caseLetExpCS(LetExpCS object) {
			return createLetExpCSAdapter();
		}

		@Override
		public Adapter caseVariableDeclarationCS(VariableDeclarationCS object) {
			return createVariableDeclarationCSAdapter();
		}

		@Override
		public Adapter caseLiteralExpCS(LiteralExpCS object) {
			return createLiteralExpCSAdapter();
		}

		@Override
		public Adapter caseEnumLiteralExpCS(EnumLiteralExpCS object) {
			return createEnumLiteralExpCSAdapter();
		}

		@Override
		public Adapter caseTupleLiteralExpCS(TupleLiteralExpCS object) {
			return createTupleLiteralExpCSAdapter();
		}

		@Override
		public Adapter caseTupleTypeCS(TupleTypeCS object) {
			return createTupleTypeCSAdapter();
		}

		@Override
		public Adapter caseCollectionTypeCS(CollectionTypeCS object) {
			return createCollectionTypeCSAdapter();
		}

		@Override
		public Adapter caseCollectionLiteralExpCS(CollectionLiteralExpCS object) {
			return createCollectionLiteralExpCSAdapter();
		}

		@Override
		public Adapter caseCollectionLiteralPartCS(CollectionLiteralPartCS object) {
			return createCollectionLiteralPartCSAdapter();
		}

		@Override
		public Adapter caseCollectionRangeCS(CollectionRangeCS object) {
			return createCollectionRangeCSAdapter();
		}

		@Override
		public Adapter caseCollectionItem(CollectionItem object) {
			return createCollectionItemAdapter();
		}

		@Override
		public Adapter casePrimitiveLiteralExpCS(PrimitiveLiteralExpCS object) {
			return createPrimitiveLiteralExpCSAdapter();
		}

		@Override
		public Adapter caseNumberLiteralExpCS(NumberLiteralExpCS object) {
			return createNumberLiteralExpCSAdapter();
		}

		@Override
		public Adapter caseBooleanLiteralExpCS(BooleanLiteralExpCS object) {
			return createBooleanLiteralExpCSAdapter();
		}

		@Override
		public Adapter caseStringLiteralExpCS(StringLiteralExpCS object) {
			return createStringLiteralExpCSAdapter();
		}

		@Override
		public Adapter caseNullLiteralExpCS(NullLiteralExpCS object) {
			return createNullLiteralExpCSAdapter();
		}

		@Override
		public Adapter caseInvalidLiteralExpCS(InvalidLiteralExpCS object) {
			return createInvalidLiteralExpCSAdapter();
		}

		@Override
		public Adapter caseReservedKeywordCS(ReservedKeywordCS object) {
			return createReservedKeywordCSAdapter();
		}

		@Override
		public Adapter caseCollectionTypeIdentifierCS(CollectionTypeIdentifierCS object) {
			return createCollectionTypeIdentifierCSAdapter();
		}

		@Override
		public Adapter casePrimitiveTypeCS(PrimitiveTypeCS object) {
			return createPrimitiveTypeCSAdapter();
		}

		@Override
		public Adapter caseOclTypeCS(OclTypeCS object) {
			return createOclTypeCSAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.RequirementModel <em>Requirement Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.RequirementModel
	 * @generated
	 */
	public Adapter createRequirementModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.Interaction <em>Interaction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.Interaction
	 * @generated
	 */
	public Adapter createInteractionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.MessageNew <em>Message New</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.MessageNew
	 * @generated
	 */
	public Adapter createMessageNewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.CallMessage <em>Call Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.CallMessage
	 * @generated
	 */
	public Adapter createCallMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.ReturnMessage <em>Return Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.ReturnMessage
	 * @generated
	 */
	public Adapter createReturnMessageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.Execution <em>Execution</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.Execution
	 * @generated
	 */
	public Adapter createExecutionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.CombinedFragment <em>Combined Fragment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.CombinedFragment
	 * @generated
	 */
	public Adapter createCombinedFragmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.Operand <em>Operand</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.Operand
	 * @generated
	 */
	public Adapter createOperandAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.AbstractEnd <em>Abstract End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.AbstractEnd
	 * @generated
	 */
	public Adapter createAbstractEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.MixEnd <em>Mix End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.MixEnd
	 * @generated
	 */
	public Adapter createMixEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.MixOpAndCFEnd <em>Mix Op And CF End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.MixOpAndCFEnd
	 * @generated
	 */
	public Adapter createMixOpAndCFEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.MessageEnd <em>Message End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.MessageEnd
	 * @generated
	 */
	public Adapter createMessageEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.MultiEnd <em>Multi End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.MultiEnd
	 * @generated
	 */
	public Adapter createMultiEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.ExecutionEnd <em>Execution End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.ExecutionEnd
	 * @generated
	 */
	public Adapter createExecutionEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.CombinedFragmentEnd <em>Combined Fragment End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.CombinedFragmentEnd
	 * @generated
	 */
	public Adapter createCombinedFragmentEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.OperandEnd <em>Operand End</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.OperandEnd
	 * @generated
	 */
	public Adapter createOperandEndAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.DomainModel <em>Domain Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.DomainModel
	 * @generated
	 */
	public Adapter createDomainModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.UseCaseModel <em>Use Case Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.UseCaseModel
	 * @generated
	 */
	public Adapter createUseCaseModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.Actor <em>Actor</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.Actor
	 * @generated
	 */
	public Adapter createActorAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.UC <em>UC</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.UC
	 * @generated
	 */
	public Adapter createUCAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.Service <em>Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.Service
	 * @generated
	 */
	public Adapter createServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.Participant <em>Participant</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.Participant
	 * @generated
	 */
	public Adapter createParticipantAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.Workflow <em>Workflow</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.Workflow
	 * @generated
	 */
	public Adapter createWorkflowAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.Partition <em>Partition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.Partition
	 * @generated
	 */
	public Adapter createPartitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.WorkflowExp <em>Workflow Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.WorkflowExp
	 * @generated
	 */
	public Adapter createWorkflowExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.PartitionAction <em>Partition Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.PartitionAction
	 * @generated
	 */
	public Adapter createPartitionActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.JoinExp <em>Join Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.JoinExp
	 * @generated
	 */
	public Adapter createJoinExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.ActivityFinal <em>Activity Final</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.ActivityFinal
	 * @generated
	 */
	public Adapter createActivityFinalAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.InitalNode <em>Inital Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.InitalNode
	 * @generated
	 */
	public Adapter createInitalNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.ForkNode <em>Fork Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.ForkNode
	 * @generated
	 */
	public Adapter createForkNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.JoinNode <em>Join Node</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.JoinNode
	 * @generated
	 */
	public Adapter createJoinNodeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.ComplexOpeartion <em>Complex Opeartion</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.ComplexOpeartion
	 * @generated
	 */
	public Adapter createComplexOpeartionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.SimpleOperation <em>Simple Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.SimpleOperation
	 * @generated
	 */
	public Adapter createSimpleOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.LoopExp <em>Loop Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.LoopExp
	 * @generated
	 */
	public Adapter createLoopExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.SwitchExp <em>Switch Exp</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.SwitchExp
	 * @generated
	 */
	public Adapter createSwitchExpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.SwitchCase <em>Switch Case</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.SwitchCase
	 * @generated
	 */
	public Adapter createSwitchCaseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.SwitchDefault <em>Switch Default</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.SwitchDefault
	 * @generated
	 */
	public Adapter createSwitchDefaultAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.Operation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.Operation
	 * @generated
	 */
	public Adapter createOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.Parameter <em>Parameter</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.Parameter
	 * @generated
	 */
	public Adapter createParameterAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.Entity <em>Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.Entity
	 * @generated
	 */
	public Adapter createEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.Attribute <em>Attribute</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.Attribute
	 * @generated
	 */
	public Adapter createAttributeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.TypeCS <em>Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.TypeCS
	 * @generated
	 */
	public Adapter createTypeCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.Invariance <em>Invariance</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.Invariance
	 * @generated
	 */
	public Adapter createInvarianceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.EntityType <em>Entity Type</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.EntityType
	 * @generated
	 */
	public Adapter createEntityTypeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.EnumEntity <em>Enum Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.EnumEntity
	 * @generated
	 */
	public Adapter createEnumEntityAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.EnumItem <em>Enum Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.EnumItem
	 * @generated
	 */
	public Adapter createEnumItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.Contract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.Contract
	 * @generated
	 */
	public Adapter createContractAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.Definition <em>Definition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.Definition
	 * @generated
	 */
	public Adapter createDefinitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.Precondition <em>Precondition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.Precondition
	 * @generated
	 */
	public Adapter createPreconditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.Postcondition <em>Postcondition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.Postcondition
	 * @generated
	 */
	public Adapter createPostconditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.OCLExpressionCS <em>OCL Expression CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.OCLExpressionCS
	 * @generated
	 */
	public Adapter createOCLExpressionCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.NestedExpCS <em>Nested Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.NestedExpCS
	 * @generated
	 */
	public Adapter createNestedExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.LogicFormulaExpCS <em>Logic Formula Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.LogicFormulaExpCS
	 * @generated
	 */
	public Adapter createLogicFormulaExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.AtomicExpression <em>Atomic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.AtomicExpression
	 * @generated
	 */
	public Adapter createAtomicExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.LeftSubAtomicExpression <em>Left Sub Atomic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.LeftSubAtomicExpression
	 * @generated
	 */
	public Adapter createLeftSubAtomicExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.RightSubAtomicExpression <em>Right Sub Atomic Expression</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.RightSubAtomicExpression
	 * @generated
	 */
	public Adapter createRightSubAtomicExpressionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.CallExpCS <em>Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.CallExpCS
	 * @generated
	 */
	public Adapter createCallExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.LoopExpCS <em>Loop Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.LoopExpCS
	 * @generated
	 */
	public Adapter createLoopExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.IteratorExpCS <em>Iterator Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.IteratorExpCS
	 * @generated
	 */
	public Adapter createIteratorExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.EntityAttributeName <em>Entity Attribute Name</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.EntityAttributeName
	 * @generated
	 */
	public Adapter createEntityAttributeNameAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.ArgumentsCS <em>Arguments CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.ArgumentsCS
	 * @generated
	 */
	public Adapter createArgumentsCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.FeatureCallExpCS <em>Feature Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.FeatureCallExpCS
	 * @generated
	 */
	public Adapter createFeatureCallExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.StandardNavigationCallExpCS <em>Standard Navigation Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.StandardNavigationCallExpCS
	 * @generated
	 */
	public Adapter createStandardNavigationCallExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.StandardOperationExpCS <em>Standard Operation Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.StandardOperationExpCS
	 * @generated
	 */
	public Adapter createStandardOperationExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.PredefineOp <em>Predefine Op</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.PredefineOp
	 * @generated
	 */
	public Adapter createPredefineOpAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.StandardNoneParameterOperation <em>Standard None Parameter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.StandardNoneParameterOperation
	 * @generated
	 */
	public Adapter createStandardNoneParameterOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.StandardParameterOperation <em>Standard Parameter Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.StandardParameterOperation
	 * @generated
	 */
	public Adapter createStandardParameterOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.StandardCollectionOperation <em>Standard Collection Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.StandardCollectionOperation
	 * @generated
	 */
	public Adapter createStandardCollectionOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.StandardDateOperation <em>Standard Date Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.StandardDateOperation
	 * @generated
	 */
	public Adapter createStandardDateOperationAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.ClassiferCallExpCS <em>Classifer Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.ClassiferCallExpCS
	 * @generated
	 */
	public Adapter createClassiferCallExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.PropertyCallExpCS <em>Property Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.PropertyCallExpCS
	 * @generated
	 */
	public Adapter createPropertyCallExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.OperationCallExpCS <em>Operation Call Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.OperationCallExpCS
	 * @generated
	 */
	public Adapter createOperationCallExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.OperationParameters <em>Operation Parameters</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.OperationParameters
	 * @generated
	 */
	public Adapter createOperationParametersAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.VariableExpCS <em>Variable Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.VariableExpCS
	 * @generated
	 */
	public Adapter createVariableExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.IfExpCS <em>If Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.IfExpCS
	 * @generated
	 */
	public Adapter createIfExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.LetExpCS <em>Let Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.LetExpCS
	 * @generated
	 */
	public Adapter createLetExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.VariableDeclarationCS <em>Variable Declaration CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.VariableDeclarationCS
	 * @generated
	 */
	public Adapter createVariableDeclarationCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.LiteralExpCS <em>Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.LiteralExpCS
	 * @generated
	 */
	public Adapter createLiteralExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.EnumLiteralExpCS <em>Enum Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.EnumLiteralExpCS
	 * @generated
	 */
	public Adapter createEnumLiteralExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.TupleLiteralExpCS <em>Tuple Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.TupleLiteralExpCS
	 * @generated
	 */
	public Adapter createTupleLiteralExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.TupleTypeCS <em>Tuple Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.TupleTypeCS
	 * @generated
	 */
	public Adapter createTupleTypeCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.CollectionTypeCS <em>Collection Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.CollectionTypeCS
	 * @generated
	 */
	public Adapter createCollectionTypeCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.CollectionLiteralExpCS <em>Collection Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.CollectionLiteralExpCS
	 * @generated
	 */
	public Adapter createCollectionLiteralExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.CollectionLiteralPartCS <em>Collection Literal Part CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.CollectionLiteralPartCS
	 * @generated
	 */
	public Adapter createCollectionLiteralPartCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.CollectionRangeCS <em>Collection Range CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.CollectionRangeCS
	 * @generated
	 */
	public Adapter createCollectionRangeCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.CollectionItem <em>Collection Item</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.CollectionItem
	 * @generated
	 */
	public Adapter createCollectionItemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.PrimitiveLiteralExpCS <em>Primitive Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.PrimitiveLiteralExpCS
	 * @generated
	 */
	public Adapter createPrimitiveLiteralExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.NumberLiteralExpCS <em>Number Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.NumberLiteralExpCS
	 * @generated
	 */
	public Adapter createNumberLiteralExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.BooleanLiteralExpCS <em>Boolean Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.BooleanLiteralExpCS
	 * @generated
	 */
	public Adapter createBooleanLiteralExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.StringLiteralExpCS <em>String Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.StringLiteralExpCS
	 * @generated
	 */
	public Adapter createStringLiteralExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.NullLiteralExpCS <em>Null Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.NullLiteralExpCS
	 * @generated
	 */
	public Adapter createNullLiteralExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.InvalidLiteralExpCS <em>Invalid Literal Exp CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.InvalidLiteralExpCS
	 * @generated
	 */
	public Adapter createInvalidLiteralExpCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.ReservedKeywordCS <em>Reserved Keyword CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.ReservedKeywordCS
	 * @generated
	 */
	public Adapter createReservedKeywordCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.CollectionTypeIdentifierCS <em>Collection Type Identifier CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.CollectionTypeIdentifierCS
	 * @generated
	 */
	public Adapter createCollectionTypeIdentifierCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.PrimitiveTypeCS <em>Primitive Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.PrimitiveTypeCS
	 * @generated
	 */
	public Adapter createPrimitiveTypeCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link rEMODEL.OclTypeCS <em>Ocl Type CS</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see rEMODEL.OclTypeCS
	 * @generated
	 */
	public Adapter createOclTypeCSAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //REMODELAdapterFactory

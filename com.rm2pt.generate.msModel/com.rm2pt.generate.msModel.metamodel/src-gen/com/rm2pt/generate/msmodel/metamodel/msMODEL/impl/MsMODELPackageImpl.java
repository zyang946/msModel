/**
 */
package com.rm2pt.generate.msmodel.metamodel.msMODEL.impl;

import com.rm2pt.generate.msmodel.metamodel.msMODEL.CallChain;
import com.rm2pt.generate.msmodel.metamodel.msMODEL.In;
import com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface;
import com.rm2pt.generate.msmodel.metamodel.msMODEL.LifeLine;
import com.rm2pt.generate.msmodel.metamodel.msMODEL.Message;
import com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService;
import com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel;
import com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELFactory;
import com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage;
import com.rm2pt.generate.msmodel.metamodel.msMODEL.Provided;
import com.rm2pt.generate.msmodel.metamodel.msMODEL.Required;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import rEMODEL.REMODELPackage;

import rEMODEL.impl.REMODELPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MsMODELPackageImpl extends EPackageImpl implements MsMODELPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microServiceModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass microServiceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interfaceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass providedEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass requiredEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass callChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass lifeLineEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass messageEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private MsMODELPackageImpl() {
		super(eNS_URI, MsMODELFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link MsMODELPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static MsMODELPackage init() {
		if (isInited)
			return (MsMODELPackage) EPackage.Registry.INSTANCE.getEPackage(MsMODELPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredMsMODELPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		MsMODELPackageImpl theMsMODELPackage = registeredMsMODELPackage instanceof MsMODELPackageImpl
				? (MsMODELPackageImpl) registeredMsMODELPackage
				: new MsMODELPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(REMODELPackage.eNS_URI);
		REMODELPackageImpl theREMODELPackage = (REMODELPackageImpl) (registeredPackage instanceof REMODELPackageImpl
				? registeredPackage
				: REMODELPackage.eINSTANCE);

		// Create package meta-data objects
		theMsMODELPackage.createPackageContents();
		theREMODELPackage.createPackageContents();

		// Initialize created meta-data
		theMsMODELPackage.initializePackageContents();
		theREMODELPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theMsMODELPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MsMODELPackage.eNS_URI, theMsMODELPackage);
		return theMsMODELPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroServiceModel() {
		return microServiceModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroServiceModel_Name() {
		return (EAttribute) microServiceModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroServiceModel_Description() {
		return (EAttribute) microServiceModelEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroServiceModel_Microservice() {
		return (EReference) microServiceModelEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroServiceModel_Interface() {
		return (EReference) microServiceModelEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMicroService() {
		return microServiceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMicroService_Name() {
		return (EAttribute) microServiceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroService_Provide() {
		return (EReference) microServiceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroService_Require() {
		return (EReference) microServiceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroService_Domainmodel() {
		return (EReference) microServiceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroService_Use() {
		return (EReference) microServiceEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroService_Operation() {
		return (EReference) microServiceEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMicroService_Contract() {
		return (EReference) microServiceEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterface() {
		return interfaceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInterface_Name() {
		return (EAttribute) interfaceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Callchain() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Contract() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInterface_Operation() {
		return (EReference) interfaceEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getIn() {
		return inEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProvided() {
		return providedEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRequired() {
		return requiredEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRequired_Is() {
		return (EReference) requiredEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCallChain() {
		return callChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCallChain_Lifeline() {
		return (EReference) callChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCallChain_Name() {
		return (EAttribute) callChainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getLifeLine() {
		return lifeLineEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getLifeLine_Name() {
		return (EAttribute) lifeLineEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeLine_Microservice() {
		return (EReference) lifeLineEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getLifeLine_Message() {
		return (EReference) lifeLineEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMessage() {
		return messageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Name() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getMessage_Guard() {
		return (EAttribute) messageEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_Action() {
		return (EReference) messageEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMessage_To() {
		return (EReference) messageEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsMODELFactory getMsMODELFactory() {
		return (MsMODELFactory) getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		microServiceModelEClass = createEClass(MICRO_SERVICE_MODEL);
		createEAttribute(microServiceModelEClass, MICRO_SERVICE_MODEL__NAME);
		createEAttribute(microServiceModelEClass, MICRO_SERVICE_MODEL__DESCRIPTION);
		createEReference(microServiceModelEClass, MICRO_SERVICE_MODEL__MICROSERVICE);
		createEReference(microServiceModelEClass, MICRO_SERVICE_MODEL__INTERFACE);

		microServiceEClass = createEClass(MICRO_SERVICE);
		createEAttribute(microServiceEClass, MICRO_SERVICE__NAME);
		createEReference(microServiceEClass, MICRO_SERVICE__PROVIDE);
		createEReference(microServiceEClass, MICRO_SERVICE__REQUIRE);
		createEReference(microServiceEClass, MICRO_SERVICE__DOMAINMODEL);
		createEReference(microServiceEClass, MICRO_SERVICE__USE);
		createEReference(microServiceEClass, MICRO_SERVICE__OPERATION);
		createEReference(microServiceEClass, MICRO_SERVICE__CONTRACT);

		interfaceEClass = createEClass(INTERFACE);
		createEAttribute(interfaceEClass, INTERFACE__NAME);
		createEReference(interfaceEClass, INTERFACE__CALLCHAIN);
		createEReference(interfaceEClass, INTERFACE__CONTRACT);
		createEReference(interfaceEClass, INTERFACE__OPERATION);

		inEClass = createEClass(IN);

		providedEClass = createEClass(PROVIDED);

		requiredEClass = createEClass(REQUIRED);
		createEReference(requiredEClass, REQUIRED__IS);

		callChainEClass = createEClass(CALL_CHAIN);
		createEReference(callChainEClass, CALL_CHAIN__LIFELINE);
		createEAttribute(callChainEClass, CALL_CHAIN__NAME);

		lifeLineEClass = createEClass(LIFE_LINE);
		createEAttribute(lifeLineEClass, LIFE_LINE__NAME);
		createEReference(lifeLineEClass, LIFE_LINE__MICROSERVICE);
		createEReference(lifeLineEClass, LIFE_LINE__MESSAGE);

		messageEClass = createEClass(MESSAGE);
		createEAttribute(messageEClass, MESSAGE__NAME);
		createEAttribute(messageEClass, MESSAGE__GUARD);
		createEReference(messageEClass, MESSAGE__TO);
		createEReference(messageEClass, MESSAGE__ACTION);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		REMODELPackage theREMODELPackage = (REMODELPackage) EPackage.Registry.INSTANCE
				.getEPackage(REMODELPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		inEClass.getESuperTypes().add(this.getInterface());
		providedEClass.getESuperTypes().add(this.getInterface());
		requiredEClass.getESuperTypes().add(this.getInterface());

		// Initialize classes, features, and operations; add parameters
		initEClass(microServiceModelEClass, MicroServiceModel.class, "MicroServiceModel", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMicroServiceModel_Name(), ecorePackage.getEString(), "name", null, 0, 1,
				MicroServiceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getMicroServiceModel_Description(), ecorePackage.getEString(), "description", null, 0, 1,
				MicroServiceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEReference(getMicroServiceModel_Microservice(), this.getMicroService(), null, "microservice", null, 0, -1,
				MicroServiceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroServiceModel_Interface(), this.getInterface(), null, "interface", null, 0, -1,
				MicroServiceModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(microServiceEClass, MicroService.class, "MicroService", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMicroService_Name(), ecorePackage.getEString(), "name", null, 0, 1, MicroService.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroService_Provide(), this.getInterface(), null, "provide", null, 0, -1, MicroService.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroService_Require(), this.getInterface(), null, "require", null, 0, -1, MicroService.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroService_Domainmodel(), theREMODELPackage.getDomainModel(), null, "domainmodel", null, 0,
				-1, MicroService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroService_Use(), this.getInterface(), null, "use", null, 0, -1, MicroService.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroService_Operation(), theREMODELPackage.getOperation(), null, "operation", null, 0, -1,
				MicroService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMicroService_Contract(), theREMODELPackage.getContract(), null, "contract", null, 0, -1,
				MicroService.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(interfaceEClass, Interface.class, "Interface", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInterface_Name(), ecorePackage.getEString(), "name", null, 0, 1, Interface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Callchain(), this.getCallChain(), null, "callchain", null, 0, -1, Interface.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Contract(), theREMODELPackage.getContract(), null, "contract", null, 0, -1,
				Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getInterface_Operation(), theREMODELPackage.getOperation(), null, "operation", null, 0, -1,
				Interface.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inEClass, In.class, "In", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(providedEClass, Provided.class, "Provided", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(requiredEClass, Required.class, "Required", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getRequired_Is(), this.getProvided(), null, "is", null, 0, 1, Required.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);

		initEClass(callChainEClass, CallChain.class, "CallChain", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCallChain_Lifeline(), this.getLifeLine(), null, "lifeline", null, 0, -1, CallChain.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCallChain_Name(), ecorePackage.getEString(), "name", null, 0, 1, CallChain.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(lifeLineEClass, LifeLine.class, "LifeLine", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getLifeLine_Name(), ecorePackage.getEString(), "name", null, 0, 1, LifeLine.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLifeLine_Microservice(), this.getMicroService(), null, "microservice", null, 0, 1,
				LifeLine.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getLifeLine_Message(), this.getMessage(), null, "message", null, 0, -1, LifeLine.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(messageEClass, Message.class, "Message", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getMessage_Name(), ecorePackage.getEString(), "name", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getMessage_Guard(), ecorePackage.getEString(), "guard", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getMessage_To(), this.getLifeLine(), null, "to", null, 0, 1, Message.class, !IS_TRANSIENT,
				!IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED,
				IS_ORDERED);
		initEReference(getMessage_Action(), theREMODELPackage.getOperation(), null, "action", null, 0, 1, Message.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //MsMODELPackageImpl

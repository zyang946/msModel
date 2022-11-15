/**
 */
package com.rm2pt.generate.msmodel.metamodel.msMODEL.impl;

import com.rm2pt.generate.msmodel.metamodel.msMODEL.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MsMODELFactoryImpl extends EFactoryImpl implements MsMODELFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MsMODELFactory init() {
		try {
			MsMODELFactory theMsMODELFactory = (MsMODELFactory) EPackage.Registry.INSTANCE
					.getEFactory(MsMODELPackage.eNS_URI);
			if (theMsMODELFactory != null) {
				return theMsMODELFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MsMODELFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsMODELFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case MsMODELPackage.MICRO_SERVICE_MODEL:
			return createMicroServiceModel();
		case MsMODELPackage.MICRO_SERVICE:
			return createMicroService();
		case MsMODELPackage.INTERFACE:
			return createInterface();
		case MsMODELPackage.IN:
			return createIn();
		case MsMODELPackage.PROVIDED:
			return createProvided();
		case MsMODELPackage.REQUIRED:
			return createRequired();
		case MsMODELPackage.CALL_CHAIN:
			return createCallChain();
		case MsMODELPackage.LIFE_LINE:
			return createLifeLine();
		case MsMODELPackage.MESSAGE:
			return createMessage();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroServiceModel createMicroServiceModel() {
		MicroServiceModelImpl microServiceModel = new MicroServiceModelImpl();
		return microServiceModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MicroService createMicroService() {
		MicroServiceImpl microService = new MicroServiceImpl();
		return microService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Interface createInterface() {
		InterfaceImpl interface_ = new InterfaceImpl();
		return interface_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public In createIn() {
		InImpl in = new InImpl();
		return in;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Provided createProvided() {
		ProvidedImpl provided = new ProvidedImpl();
		return provided;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Required createRequired() {
		RequiredImpl required = new RequiredImpl();
		return required;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CallChain createCallChain() {
		CallChainImpl callChain = new CallChainImpl();
		return callChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LifeLine createLifeLine() {
		LifeLineImpl lifeLine = new LifeLineImpl();
		return lifeLine;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Message createMessage() {
		MessageImpl message = new MessageImpl();
		return message;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsMODELPackage getMsMODELPackage() {
		return (MsMODELPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static MsMODELPackage getPackage() {
		return MsMODELPackage.eINSTANCE;
	}

} //MsMODELFactoryImpl

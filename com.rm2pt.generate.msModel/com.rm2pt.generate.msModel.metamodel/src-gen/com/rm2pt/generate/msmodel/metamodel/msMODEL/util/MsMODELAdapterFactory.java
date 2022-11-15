/**
 */
package com.rm2pt.generate.msmodel.metamodel.msMODEL.util;

import com.rm2pt.generate.msmodel.metamodel.msMODEL.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage
 * @generated
 */
public class MsMODELAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static MsMODELPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsMODELAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = MsMODELPackage.eINSTANCE;
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
	protected MsMODELSwitch<Adapter> modelSwitch = new MsMODELSwitch<Adapter>() {
		@Override
		public Adapter caseMicroServiceModel(MicroServiceModel object) {
			return createMicroServiceModelAdapter();
		}

		@Override
		public Adapter caseMicroService(MicroService object) {
			return createMicroServiceAdapter();
		}

		@Override
		public Adapter caseInterface(Interface object) {
			return createInterfaceAdapter();
		}

		@Override
		public Adapter caseIn(In object) {
			return createInAdapter();
		}

		@Override
		public Adapter caseProvided(Provided object) {
			return createProvidedAdapter();
		}

		@Override
		public Adapter caseRequired(Required object) {
			return createRequiredAdapter();
		}

		@Override
		public Adapter caseCallChain(CallChain object) {
			return createCallChainAdapter();
		}

		@Override
		public Adapter caseLifeLine(LifeLine object) {
			return createLifeLineAdapter();
		}

		@Override
		public Adapter caseMessage(Message object) {
			return createMessageAdapter();
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
	 * Creates a new adapter for an object of class '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel <em>Micro Service Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel
	 * @generated
	 */
	public Adapter createMicroServiceModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService <em>Micro Service</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService
	 * @generated
	 */
	public Adapter createMicroServiceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface
	 * @generated
	 */
	public Adapter createInterfaceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.In <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.In
	 * @generated
	 */
	public Adapter createInAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Provided <em>Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.Provided
	 * @generated
	 */
	public Adapter createProvidedAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Required <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.Required
	 * @generated
	 */
	public Adapter createRequiredAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.CallChain <em>Call Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.CallChain
	 * @generated
	 */
	public Adapter createCallChainAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.LifeLine <em>Life Line</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.LifeLine
	 * @generated
	 */
	public Adapter createLifeLineAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.Message
	 * @generated
	 */
	public Adapter createMessageAdapter() {
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

} //MsMODELAdapterFactory

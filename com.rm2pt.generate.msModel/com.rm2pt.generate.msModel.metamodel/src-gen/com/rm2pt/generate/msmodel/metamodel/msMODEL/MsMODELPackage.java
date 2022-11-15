/**
 */
package com.rm2pt.generate.msmodel.metamodel.msMODEL;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELFactory
 * @model kind="package"
 * @generated
 */
public interface MsMODELPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "msMODEL";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.rm2pt.com/msMODEL";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "msMODEL";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	MsMODELPackage eINSTANCE = com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MsMODELPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MicroServiceModelImpl <em>Micro Service Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MicroServiceModelImpl
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MsMODELPackageImpl#getMicroServiceModel()
	 * @generated
	 */
	int MICRO_SERVICE_MODEL = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE_MODEL__NAME = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE_MODEL__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Microservice</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE_MODEL__MICROSERVICE = 2;

	/**
	 * The feature id for the '<em><b>Interface</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE_MODEL__INTERFACE = 3;

	/**
	 * The number of structural features of the '<em>Micro Service Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE_MODEL_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Micro Service Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE_MODEL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MicroServiceImpl <em>Micro Service</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MicroServiceImpl
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MsMODELPackageImpl#getMicroService()
	 * @generated
	 */
	int MICRO_SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Provide</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE__PROVIDE = 1;

	/**
	 * The feature id for the '<em><b>Require</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE__REQUIRE = 2;

	/**
	 * The feature id for the '<em><b>Domainmodel</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE__DOMAINMODEL = 3;

	/**
	 * The feature id for the '<em><b>Use</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE__USE = 4;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE__OPERATION = 5;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE__CONTRACT = 6;

	/**
	 * The number of structural features of the '<em>Micro Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE_FEATURE_COUNT = 7;

	/**
	 * The number of operations of the '<em>Micro Service</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MICRO_SERVICE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.InterfaceImpl <em>Interface</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.InterfaceImpl
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MsMODELPackageImpl#getInterface()
	 * @generated
	 */
	int INTERFACE = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Callchain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CALLCHAIN = 1;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__CONTRACT = 2;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE__OPERATION = 3;

	/**
	 * The number of structural features of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Interface</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTERFACE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.InImpl <em>In</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.InImpl
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MsMODELPackageImpl#getIn()
	 * @generated
	 */
	int IN = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Callchain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN__CALLCHAIN = INTERFACE__CALLCHAIN;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN__CONTRACT = INTERFACE__CONTRACT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN__OPERATION = INTERFACE__OPERATION;

	/**
	 * The number of structural features of the '<em>In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>In</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.ProvidedImpl <em>Provided</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.ProvidedImpl
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MsMODELPackageImpl#getProvided()
	 * @generated
	 */
	int PROVIDED = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Callchain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED__CALLCHAIN = INTERFACE__CALLCHAIN;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED__CONTRACT = INTERFACE__CONTRACT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED__OPERATION = INTERFACE__OPERATION;

	/**
	 * The number of structural features of the '<em>Provided</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Provided</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROVIDED_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.RequiredImpl <em>Required</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.RequiredImpl
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MsMODELPackageImpl#getRequired()
	 * @generated
	 */
	int REQUIRED = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__NAME = INTERFACE__NAME;

	/**
	 * The feature id for the '<em><b>Callchain</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__CALLCHAIN = INTERFACE__CALLCHAIN;

	/**
	 * The feature id for the '<em><b>Contract</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__CONTRACT = INTERFACE__CONTRACT;

	/**
	 * The feature id for the '<em><b>Operation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__OPERATION = INTERFACE__OPERATION;

	/**
	 * The feature id for the '<em><b>Is</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED__IS = INTERFACE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_FEATURE_COUNT = INTERFACE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Required</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REQUIRED_OPERATION_COUNT = INTERFACE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.CallChainImpl <em>Call Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.CallChainImpl
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MsMODELPackageImpl#getCallChain()
	 * @generated
	 */
	int CALL_CHAIN = 6;

	/**
	 * The feature id for the '<em><b>Lifeline</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHAIN__LIFELINE = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHAIN__NAME = 1;

	/**
	 * The number of structural features of the '<em>Call Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHAIN_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Call Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CALL_CHAIN_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.LifeLineImpl <em>Life Line</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.LifeLineImpl
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MsMODELPackageImpl#getLifeLine()
	 * @generated
	 */
	int LIFE_LINE = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_LINE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Microservice</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_LINE__MICROSERVICE = 1;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_LINE__MESSAGE = 2;

	/**
	 * The number of structural features of the '<em>Life Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_LINE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Life Line</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LIFE_LINE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MessageImpl <em>Message</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MessageImpl
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MsMODELPackageImpl#getMessage()
	 * @generated
	 */
	int MESSAGE = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__NAME = 0;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__GUARD = 1;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__TO = 2;

	/**
	 * The feature id for the '<em><b>Action</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE__ACTION = 3;

	/**
	 * The number of structural features of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_FEATURE_COUNT = 4;

	/**
	 * The number of operations of the '<em>Message</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MESSAGE_OPERATION_COUNT = 0;

	/**
	 * Returns the meta object for class '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel <em>Micro Service Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Micro Service Model</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel
	 * @generated
	 */
	EClass getMicroServiceModel();

	/**
	 * Returns the meta object for the attribute '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel#getName()
	 * @see #getMicroServiceModel()
	 * @generated
	 */
	EAttribute getMicroServiceModel_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel#getDescription()
	 * @see #getMicroServiceModel()
	 * @generated
	 */
	EAttribute getMicroServiceModel_Description();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel#getMicroservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Microservice</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel#getMicroservice()
	 * @see #getMicroServiceModel()
	 * @generated
	 */
	EReference getMicroServiceModel_Microservice();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel#getInterface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Interface</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel#getInterface()
	 * @see #getMicroServiceModel()
	 * @generated
	 */
	EReference getMicroServiceModel_Interface();

	/**
	 * Returns the meta object for class '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService <em>Micro Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Micro Service</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService
	 * @generated
	 */
	EClass getMicroService();

	/**
	 * Returns the meta object for the attribute '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getName()
	 * @see #getMicroService()
	 * @generated
	 */
	EAttribute getMicroService_Name();

	/**
	 * Returns the meta object for the reference list '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getProvide <em>Provide</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Provide</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getProvide()
	 * @see #getMicroService()
	 * @generated
	 */
	EReference getMicroService_Provide();

	/**
	 * Returns the meta object for the reference list '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getRequire <em>Require</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Require</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getRequire()
	 * @see #getMicroService()
	 * @generated
	 */
	EReference getMicroService_Require();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getDomainmodel <em>Domainmodel</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Domainmodel</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getDomainmodel()
	 * @see #getMicroService()
	 * @generated
	 */
	EReference getMicroService_Domainmodel();

	/**
	 * Returns the meta object for the reference list '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getUse <em>Use</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Use</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getUse()
	 * @see #getMicroService()
	 * @generated
	 */
	EReference getMicroService_Use();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getOperation()
	 * @see #getMicroService()
	 * @generated
	 */
	EReference getMicroService_Operation();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contract</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService#getContract()
	 * @see #getMicroService()
	 * @generated
	 */
	EReference getMicroService_Contract();

	/**
	 * Returns the meta object for class '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface <em>Interface</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interface</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface
	 * @generated
	 */
	EClass getInterface();

	/**
	 * Returns the meta object for the attribute '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface#getName()
	 * @see #getInterface()
	 * @generated
	 */
	EAttribute getInterface_Name();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface#getCallchain <em>Callchain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Callchain</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface#getCallchain()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Callchain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface#getContract <em>Contract</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Contract</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface#getContract()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Contract();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface#getOperation <em>Operation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Operation</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface#getOperation()
	 * @see #getInterface()
	 * @generated
	 */
	EReference getInterface_Operation();

	/**
	 * Returns the meta object for class '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.In <em>In</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.In
	 * @generated
	 */
	EClass getIn();

	/**
	 * Returns the meta object for class '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Provided <em>Provided</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Provided</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.Provided
	 * @generated
	 */
	EClass getProvided();

	/**
	 * Returns the meta object for class '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Required <em>Required</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Required</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.Required
	 * @generated
	 */
	EClass getRequired();

	/**
	 * Returns the meta object for the reference '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Required#getIs <em>Is</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Is</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.Required#getIs()
	 * @see #getRequired()
	 * @generated
	 */
	EReference getRequired_Is();

	/**
	 * Returns the meta object for class '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.CallChain <em>Call Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Call Chain</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.CallChain
	 * @generated
	 */
	EClass getCallChain();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.CallChain#getLifeline <em>Lifeline</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Lifeline</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.CallChain#getLifeline()
	 * @see #getCallChain()
	 * @generated
	 */
	EReference getCallChain_Lifeline();

	/**
	 * Returns the meta object for the attribute '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.CallChain#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.CallChain#getName()
	 * @see #getCallChain()
	 * @generated
	 */
	EAttribute getCallChain_Name();

	/**
	 * Returns the meta object for class '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.LifeLine <em>Life Line</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Life Line</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.LifeLine
	 * @generated
	 */
	EClass getLifeLine();

	/**
	 * Returns the meta object for the attribute '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.LifeLine#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.LifeLine#getName()
	 * @see #getLifeLine()
	 * @generated
	 */
	EAttribute getLifeLine_Name();

	/**
	 * Returns the meta object for the reference '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.LifeLine#getMicroservice <em>Microservice</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Microservice</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.LifeLine#getMicroservice()
	 * @see #getLifeLine()
	 * @generated
	 */
	EReference getLifeLine_Microservice();

	/**
	 * Returns the meta object for the containment reference list '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.LifeLine#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.LifeLine#getMessage()
	 * @see #getLifeLine()
	 * @generated
	 */
	EReference getLifeLine_Message();

	/**
	 * Returns the meta object for class '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Message <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Message</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.Message
	 * @generated
	 */
	EClass getMessage();

	/**
	 * Returns the meta object for the attribute '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Message#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.Message#getName()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Name();

	/**
	 * Returns the meta object for the attribute '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Message#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Guard</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.Message#getGuard()
	 * @see #getMessage()
	 * @generated
	 */
	EAttribute getMessage_Guard();

	/**
	 * Returns the meta object for the reference '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Message#getAction <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Action</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.Message#getAction()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_Action();

	/**
	 * Returns the meta object for the reference '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Message#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.Message#getTo()
	 * @see #getMessage()
	 * @generated
	 */
	EReference getMessage_To();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	MsMODELFactory getMsMODELFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MicroServiceModelImpl <em>Micro Service Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MicroServiceModelImpl
		 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MsMODELPackageImpl#getMicroServiceModel()
		 * @generated
		 */
		EClass MICRO_SERVICE_MODEL = eINSTANCE.getMicroServiceModel();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICRO_SERVICE_MODEL__NAME = eINSTANCE.getMicroServiceModel_Name();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICRO_SERVICE_MODEL__DESCRIPTION = eINSTANCE.getMicroServiceModel_Description();

		/**
		 * The meta object literal for the '<em><b>Microservice</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICRO_SERVICE_MODEL__MICROSERVICE = eINSTANCE.getMicroServiceModel_Microservice();

		/**
		 * The meta object literal for the '<em><b>Interface</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICRO_SERVICE_MODEL__INTERFACE = eINSTANCE.getMicroServiceModel_Interface();

		/**
		 * The meta object literal for the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MicroServiceImpl <em>Micro Service</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MicroServiceImpl
		 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MsMODELPackageImpl#getMicroService()
		 * @generated
		 */
		EClass MICRO_SERVICE = eINSTANCE.getMicroService();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MICRO_SERVICE__NAME = eINSTANCE.getMicroService_Name();

		/**
		 * The meta object literal for the '<em><b>Provide</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICRO_SERVICE__PROVIDE = eINSTANCE.getMicroService_Provide();

		/**
		 * The meta object literal for the '<em><b>Require</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICRO_SERVICE__REQUIRE = eINSTANCE.getMicroService_Require();

		/**
		 * The meta object literal for the '<em><b>Domainmodel</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICRO_SERVICE__DOMAINMODEL = eINSTANCE.getMicroService_Domainmodel();

		/**
		 * The meta object literal for the '<em><b>Use</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICRO_SERVICE__USE = eINSTANCE.getMicroService_Use();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICRO_SERVICE__OPERATION = eINSTANCE.getMicroService_Operation();

		/**
		 * The meta object literal for the '<em><b>Contract</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MICRO_SERVICE__CONTRACT = eINSTANCE.getMicroService_Contract();

		/**
		 * The meta object literal for the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.InterfaceImpl <em>Interface</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.InterfaceImpl
		 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MsMODELPackageImpl#getInterface()
		 * @generated
		 */
		EClass INTERFACE = eINSTANCE.getInterface();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INTERFACE__NAME = eINSTANCE.getInterface_Name();

		/**
		 * The meta object literal for the '<em><b>Callchain</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__CALLCHAIN = eINSTANCE.getInterface_Callchain();

		/**
		 * The meta object literal for the '<em><b>Contract</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__CONTRACT = eINSTANCE.getInterface_Contract();

		/**
		 * The meta object literal for the '<em><b>Operation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INTERFACE__OPERATION = eINSTANCE.getInterface_Operation();

		/**
		 * The meta object literal for the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.InImpl <em>In</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.InImpl
		 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MsMODELPackageImpl#getIn()
		 * @generated
		 */
		EClass IN = eINSTANCE.getIn();

		/**
		 * The meta object literal for the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.ProvidedImpl <em>Provided</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.ProvidedImpl
		 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MsMODELPackageImpl#getProvided()
		 * @generated
		 */
		EClass PROVIDED = eINSTANCE.getProvided();

		/**
		 * The meta object literal for the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.RequiredImpl <em>Required</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.RequiredImpl
		 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MsMODELPackageImpl#getRequired()
		 * @generated
		 */
		EClass REQUIRED = eINSTANCE.getRequired();

		/**
		 * The meta object literal for the '<em><b>Is</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REQUIRED__IS = eINSTANCE.getRequired_Is();

		/**
		 * The meta object literal for the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.CallChainImpl <em>Call Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.CallChainImpl
		 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MsMODELPackageImpl#getCallChain()
		 * @generated
		 */
		EClass CALL_CHAIN = eINSTANCE.getCallChain();

		/**
		 * The meta object literal for the '<em><b>Lifeline</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CALL_CHAIN__LIFELINE = eINSTANCE.getCallChain_Lifeline();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CALL_CHAIN__NAME = eINSTANCE.getCallChain_Name();

		/**
		 * The meta object literal for the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.LifeLineImpl <em>Life Line</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.LifeLineImpl
		 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MsMODELPackageImpl#getLifeLine()
		 * @generated
		 */
		EClass LIFE_LINE = eINSTANCE.getLifeLine();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LIFE_LINE__NAME = eINSTANCE.getLifeLine_Name();

		/**
		 * The meta object literal for the '<em><b>Microservice</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFE_LINE__MICROSERVICE = eINSTANCE.getLifeLine_Microservice();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LIFE_LINE__MESSAGE = eINSTANCE.getLifeLine_Message();

		/**
		 * The meta object literal for the '{@link com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MessageImpl <em>Message</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MessageImpl
		 * @see com.rm2pt.generate.msmodel.metamodel.msMODEL.impl.MsMODELPackageImpl#getMessage()
		 * @generated
		 */
		EClass MESSAGE = eINSTANCE.getMessage();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__NAME = eINSTANCE.getMessage_Name();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MESSAGE__GUARD = eINSTANCE.getMessage_Guard();

		/**
		 * The meta object literal for the '<em><b>Action</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__ACTION = eINSTANCE.getMessage_Action();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MESSAGE__TO = eINSTANCE.getMessage_To();

	}

} //MsMODELPackage

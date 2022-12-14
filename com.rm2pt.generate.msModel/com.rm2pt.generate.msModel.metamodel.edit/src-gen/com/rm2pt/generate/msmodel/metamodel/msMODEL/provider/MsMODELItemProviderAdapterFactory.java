/**
 */
package com.rm2pt.generate.msmodel.metamodel.msMODEL.provider;

import com.rm2pt.generate.msmodel.metamodel.msMODEL.util.MsMODELAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class MsMODELItemProviderAdapterFactory extends MsMODELAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MsMODELItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroServiceModelItemProvider microServiceModelItemProvider;

	/**
	 * This creates an adapter for a {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroServiceModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMicroServiceModelAdapter() {
		if (microServiceModelItemProvider == null) {
			microServiceModelItemProvider = new MicroServiceModelItemProvider(this);
		}

		return microServiceModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MicroServiceItemProvider microServiceItemProvider;

	/**
	 * This creates an adapter for a {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.MicroService}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMicroServiceAdapter() {
		if (microServiceItemProvider == null) {
			microServiceItemProvider = new MicroServiceItemProvider(this);
		}

		return microServiceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InterfaceItemProvider interfaceItemProvider;

	/**
	 * This creates an adapter for a {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Interface}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInterfaceAdapter() {
		if (interfaceItemProvider == null) {
			interfaceItemProvider = new InterfaceItemProvider(this);
		}

		return interfaceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.In} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InItemProvider inItemProvider;

	/**
	 * This creates an adapter for a {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.In}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createInAdapter() {
		if (inItemProvider == null) {
			inItemProvider = new InItemProvider(this);
		}

		return inItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Provided} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProvidedItemProvider providedItemProvider;

	/**
	 * This creates an adapter for a {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Provided}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createProvidedAdapter() {
		if (providedItemProvider == null) {
			providedItemProvider = new ProvidedItemProvider(this);
		}

		return providedItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Required} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RequiredItemProvider requiredItemProvider;

	/**
	 * This creates an adapter for a {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Required}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createRequiredAdapter() {
		if (requiredItemProvider == null) {
			requiredItemProvider = new RequiredItemProvider(this);
		}

		return requiredItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.CallChain} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CallChainItemProvider callChainItemProvider;

	/**
	 * This creates an adapter for a {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.CallChain}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createCallChainAdapter() {
		if (callChainItemProvider == null) {
			callChainItemProvider = new CallChainItemProvider(this);
		}

		return callChainItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.LifeLine} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LifeLineItemProvider lifeLineItemProvider;

	/**
	 * This creates an adapter for a {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.LifeLine}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createLifeLineAdapter() {
		if (lifeLineItemProvider == null) {
			lifeLineItemProvider = new LifeLineItemProvider(this);
		}

		return lifeLineItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Message} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MessageItemProvider messageItemProvider;

	/**
	 * This creates an adapter for a {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.Message}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createMessageAdapter() {
		if (messageItemProvider == null) {
			messageItemProvider = new MessageItemProvider(this);
		}

		return messageItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (microServiceModelItemProvider != null)
			microServiceModelItemProvider.dispose();
		if (microServiceItemProvider != null)
			microServiceItemProvider.dispose();
		if (interfaceItemProvider != null)
			interfaceItemProvider.dispose();
		if (inItemProvider != null)
			inItemProvider.dispose();
		if (providedItemProvider != null)
			providedItemProvider.dispose();
		if (requiredItemProvider != null)
			requiredItemProvider.dispose();
		if (callChainItemProvider != null)
			callChainItemProvider.dispose();
		if (lifeLineItemProvider != null)
			lifeLineItemProvider.dispose();
		if (messageItemProvider != null)
			messageItemProvider.dispose();
	}

}

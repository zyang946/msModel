/**
 */
package com.rm2pt.generate.msmodel.metamodel.msMODEL.provider;

import com.rm2pt.generate.msmodel.metamodel.msMODEL.MsMODELPackage;
import com.rm2pt.generate.msmodel.metamodel.msMODEL.deleteReference;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link com.rm2pt.generate.msmodel.metamodel.msMODEL.deleteReference} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class deleteReferenceItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public deleteReferenceItemProvider(AdapterFactory adapterFactory) {
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

			addNamePropertyDescriptor(object);
			addIsmultiplePropertyDescriptor(object);
			addIsReverseAssociationPropertyDescriptor(object);
			addIsAggreationPropertyDescriptor(object);
			addIsCompositionPropertyDescriptor(object);
			addTypePropertyDescriptor(object);
			addAssociationPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Name feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNamePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_deleteReference_name_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_deleteReference_name_feature",
								"_UI_deleteReference_type"),
						MsMODELPackage.Literals.DELETE_REFERENCE__NAME, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Ismultiple feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsmultiplePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_deleteReference_ismultiple_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_deleteReference_ismultiple_feature",
								"_UI_deleteReference_type"),
						MsMODELPackage.Literals.DELETE_REFERENCE__ISMULTIPLE, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Reverse Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsReverseAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_deleteReference_isReverseAssociation_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_deleteReference_isReverseAssociation_feature",
						"_UI_deleteReference_type"),
				MsMODELPackage.Literals.DELETE_REFERENCE__IS_REVERSE_ASSOCIATION, true, false, false,
				ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Aggreation feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsAggreationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_deleteReference_isAggreation_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_deleteReference_isAggreation_feature",
								"_UI_deleteReference_type"),
						MsMODELPackage.Literals.DELETE_REFERENCE__IS_AGGREATION, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Is Composition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsCompositionPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_deleteReference_isComposition_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_deleteReference_isComposition_feature",
								"_UI_deleteReference_type"),
						MsMODELPackage.Literals.DELETE_REFERENCE__IS_COMPOSITION, true, false, false,
						ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Type feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addTypePropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_deleteReference_type_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_deleteReference_type_feature",
								"_UI_deleteReference_type"),
						MsMODELPackage.Literals.DELETE_REFERENCE__TYPE, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Association feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addAssociationPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_deleteReference_association_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_deleteReference_association_feature",
								"_UI_deleteReference_type"),
						MsMODELPackage.Literals.DELETE_REFERENCE__ASSOCIATION, true, false, true, null, null, null));
	}

	/**
	 * This returns deleteReference.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/deleteReference"));
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
		String label = ((deleteReference) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_deleteReference_type")
				: getString("_UI_deleteReference_type") + " " + label;
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

		switch (notification.getFeatureID(deleteReference.class)) {
		case MsMODELPackage.DELETE_REFERENCE__NAME:
		case MsMODELPackage.DELETE_REFERENCE__ISMULTIPLE:
		case MsMODELPackage.DELETE_REFERENCE__IS_REVERSE_ASSOCIATION:
		case MsMODELPackage.DELETE_REFERENCE__IS_AGGREATION:
		case MsMODELPackage.DELETE_REFERENCE__IS_COMPOSITION:
		case MsMODELPackage.DELETE_REFERENCE__TYPE:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
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
	}

	/**
	 * Return the resource locator for this item provider's resources.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		return MsMODELEditPlugin.INSTANCE;
	}

}

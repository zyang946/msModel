/**
 */
package rEMODEL.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import rEMODEL.REMODELFactory;
import rEMODEL.REMODELPackage;
import rEMODEL.StandardNavigationCallExpCS;

/**
 * This is the item provider adapter for a {@link rEMODEL.StandardNavigationCallExpCS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class StandardNavigationCallExpCSItemProvider extends FeatureCallExpCSItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StandardNavigationCallExpCSItemProvider(AdapterFactory adapterFactory) {
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

			addObjectPropertyDescriptor(object);
			addNavopPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Object feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addObjectPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add(createItemPropertyDescriptor(
				((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(), getResourceLocator(),
				getString("_UI_StandardNavigationCallExpCS_object_feature"),
				getString("_UI_PropertyDescriptor_description", "_UI_StandardNavigationCallExpCS_object_feature",
						"_UI_StandardNavigationCallExpCS_type"),
				REMODELPackage.Literals.STANDARD_NAVIGATION_CALL_EXP_CS__OBJECT, true, false, false,
				ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Navop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNavopPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_StandardNavigationCallExpCS_navop_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_StandardNavigationCallExpCS_navop_feature",
								"_UI_StandardNavigationCallExpCS_type"),
						REMODELPackage.Literals.STANDARD_NAVIGATION_CALL_EXP_CS__NAVOP, true, false, false,
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
			childrenFeatures.add(REMODELPackage.Literals.STANDARD_NAVIGATION_CALL_EXP_CS__CLASSIFERCALL);
			childrenFeatures.add(REMODELPackage.Literals.STANDARD_NAVIGATION_CALL_EXP_CS__PROPERTYCALL);
			childrenFeatures.add(REMODELPackage.Literals.STANDARD_NAVIGATION_CALL_EXP_CS__STANDARD_OP);
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
	 * This returns StandardNavigationCallExpCS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/StandardNavigationCallExpCS"));
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
		String label = ((StandardNavigationCallExpCS) object).getObject();
		return label == null || label.length() == 0 ? getString("_UI_StandardNavigationCallExpCS_type")
				: getString("_UI_StandardNavigationCallExpCS_type") + " " + label;
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

		switch (notification.getFeatureID(StandardNavigationCallExpCS.class)) {
		case REMODELPackage.STANDARD_NAVIGATION_CALL_EXP_CS__OBJECT:
		case REMODELPackage.STANDARD_NAVIGATION_CALL_EXP_CS__NAVOP:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case REMODELPackage.STANDARD_NAVIGATION_CALL_EXP_CS__CLASSIFERCALL:
		case REMODELPackage.STANDARD_NAVIGATION_CALL_EXP_CS__PROPERTYCALL:
		case REMODELPackage.STANDARD_NAVIGATION_CALL_EXP_CS__STANDARD_OP:
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

		newChildDescriptors
				.add(createChildParameter(REMODELPackage.Literals.STANDARD_NAVIGATION_CALL_EXP_CS__CLASSIFERCALL,
						REMODELFactory.eINSTANCE.createClassiferCallExpCS()));

		newChildDescriptors
				.add(createChildParameter(REMODELPackage.Literals.STANDARD_NAVIGATION_CALL_EXP_CS__PROPERTYCALL,
						REMODELFactory.eINSTANCE.createPropertyCallExpCS()));

		newChildDescriptors
				.add(createChildParameter(REMODELPackage.Literals.STANDARD_NAVIGATION_CALL_EXP_CS__STANDARD_OP,
						REMODELFactory.eINSTANCE.createStandardCollectionOperation()));
	}

}

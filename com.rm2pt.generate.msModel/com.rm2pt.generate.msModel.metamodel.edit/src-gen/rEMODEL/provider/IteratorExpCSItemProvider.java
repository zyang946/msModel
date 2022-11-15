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

import rEMODEL.IteratorExpCS;
import rEMODEL.REMODELFactory;
import rEMODEL.REMODELPackage;

/**
 * This is the item provider adapter for a {@link rEMODEL.IteratorExpCS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class IteratorExpCSItemProvider extends LoopExpCSItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IteratorExpCSItemProvider(AdapterFactory adapterFactory) {
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

			addSimpleCallPropertyDescriptor(object);
			addIteratorPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Simple Call feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSimpleCallPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_IteratorExpCS_simpleCall_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_IteratorExpCS_simpleCall_feature",
								"_UI_IteratorExpCS_type"),
						REMODELPackage.Literals.ITERATOR_EXP_CS__SIMPLE_CALL, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Iterator feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIteratorPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_IteratorExpCS_iterator_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_IteratorExpCS_iterator_feature",
								"_UI_IteratorExpCS_type"),
						REMODELPackage.Literals.ITERATOR_EXP_CS__ITERATOR, true, false, false,
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
			childrenFeatures.add(REMODELPackage.Literals.ITERATOR_EXP_CS__OBJECT_CALL);
			childrenFeatures.add(REMODELPackage.Literals.ITERATOR_EXP_CS__VARIBLES);
			childrenFeatures.add(REMODELPackage.Literals.ITERATOR_EXP_CS__EXP);
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
	 * This returns IteratorExpCS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/IteratorExpCS"));
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
		String label = ((IteratorExpCS) object).getSimpleCall();
		return label == null || label.length() == 0 ? getString("_UI_IteratorExpCS_type")
				: getString("_UI_IteratorExpCS_type") + " " + label;
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

		switch (notification.getFeatureID(IteratorExpCS.class)) {
		case REMODELPackage.ITERATOR_EXP_CS__SIMPLE_CALL:
		case REMODELPackage.ITERATOR_EXP_CS__ITERATOR:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case REMODELPackage.ITERATOR_EXP_CS__OBJECT_CALL:
		case REMODELPackage.ITERATOR_EXP_CS__VARIBLES:
		case REMODELPackage.ITERATOR_EXP_CS__EXP:
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

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__OBJECT_CALL,
				REMODELFactory.eINSTANCE.createFeatureCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__OBJECT_CALL,
				REMODELFactory.eINSTANCE.createStandardNavigationCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__OBJECT_CALL,
				REMODELFactory.eINSTANCE.createStandardOperationExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__OBJECT_CALL,
				REMODELFactory.eINSTANCE.createClassiferCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__OBJECT_CALL,
				REMODELFactory.eINSTANCE.createPropertyCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__OBJECT_CALL,
				REMODELFactory.eINSTANCE.createOperationCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__VARIBLES,
				REMODELFactory.eINSTANCE.createVariableDeclarationCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__EXP,
				REMODELFactory.eINSTANCE.createOCLExpressionCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__EXP,
				REMODELFactory.eINSTANCE.createNestedExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__EXP,
				REMODELFactory.eINSTANCE.createLogicFormulaExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__EXP,
				REMODELFactory.eINSTANCE.createIfExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__EXP,
				REMODELFactory.eINSTANCE.createLetExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__EXP,
				REMODELFactory.eINSTANCE.createLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__EXP,
				REMODELFactory.eINSTANCE.createEnumLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__EXP,
				REMODELFactory.eINSTANCE.createTupleLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__EXP,
				REMODELFactory.eINSTANCE.createCollectionLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__EXP,
				REMODELFactory.eINSTANCE.createPrimitiveLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__EXP,
				REMODELFactory.eINSTANCE.createNumberLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__EXP,
				REMODELFactory.eINSTANCE.createBooleanLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__EXP,
				REMODELFactory.eINSTANCE.createStringLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__EXP,
				REMODELFactory.eINSTANCE.createNullLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ITERATOR_EXP_CS__EXP,
				REMODELFactory.eINSTANCE.createInvalidLiteralExpCS()));
	}

}

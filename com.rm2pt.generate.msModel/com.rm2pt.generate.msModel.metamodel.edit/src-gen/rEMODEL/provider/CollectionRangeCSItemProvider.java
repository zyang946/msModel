/**
 */
package rEMODEL.provider;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import rEMODEL.CollectionRangeCS;
import rEMODEL.REMODELFactory;
import rEMODEL.REMODELPackage;

/**
 * This is the item provider adapter for a {@link rEMODEL.CollectionRangeCS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class CollectionRangeCSItemProvider extends CollectionLiteralPartCSItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CollectionRangeCSItemProvider(AdapterFactory adapterFactory) {
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

		}
		return itemPropertyDescriptors;
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
			childrenFeatures.add(REMODELPackage.Literals.COLLECTION_RANGE_CS__FIRST);
			childrenFeatures.add(REMODELPackage.Literals.COLLECTION_RANGE_CS__LAST);
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
	 * This returns CollectionRangeCS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/CollectionRangeCS"));
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
		return getString("_UI_CollectionRangeCS_type");
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

		switch (notification.getFeatureID(CollectionRangeCS.class)) {
		case REMODELPackage.COLLECTION_RANGE_CS__FIRST:
		case REMODELPackage.COLLECTION_RANGE_CS__LAST:
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

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__FIRST,
				REMODELFactory.eINSTANCE.createOCLExpressionCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__FIRST,
				REMODELFactory.eINSTANCE.createNestedExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__FIRST,
				REMODELFactory.eINSTANCE.createLogicFormulaExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__FIRST,
				REMODELFactory.eINSTANCE.createIfExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__FIRST,
				REMODELFactory.eINSTANCE.createLetExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__FIRST,
				REMODELFactory.eINSTANCE.createLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__FIRST,
				REMODELFactory.eINSTANCE.createEnumLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__FIRST,
				REMODELFactory.eINSTANCE.createTupleLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__FIRST,
				REMODELFactory.eINSTANCE.createCollectionLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__FIRST,
				REMODELFactory.eINSTANCE.createPrimitiveLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__FIRST,
				REMODELFactory.eINSTANCE.createNumberLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__FIRST,
				REMODELFactory.eINSTANCE.createBooleanLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__FIRST,
				REMODELFactory.eINSTANCE.createStringLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__FIRST,
				REMODELFactory.eINSTANCE.createNullLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__FIRST,
				REMODELFactory.eINSTANCE.createInvalidLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__LAST,
				REMODELFactory.eINSTANCE.createOCLExpressionCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__LAST,
				REMODELFactory.eINSTANCE.createNestedExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__LAST,
				REMODELFactory.eINSTANCE.createLogicFormulaExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__LAST,
				REMODELFactory.eINSTANCE.createIfExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__LAST,
				REMODELFactory.eINSTANCE.createLetExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__LAST,
				REMODELFactory.eINSTANCE.createLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__LAST,
				REMODELFactory.eINSTANCE.createEnumLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__LAST,
				REMODELFactory.eINSTANCE.createTupleLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__LAST,
				REMODELFactory.eINSTANCE.createCollectionLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__LAST,
				REMODELFactory.eINSTANCE.createPrimitiveLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__LAST,
				REMODELFactory.eINSTANCE.createNumberLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__LAST,
				REMODELFactory.eINSTANCE.createBooleanLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__LAST,
				REMODELFactory.eINSTANCE.createStringLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__LAST,
				REMODELFactory.eINSTANCE.createNullLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.COLLECTION_RANGE_CS__LAST,
				REMODELFactory.eINSTANCE.createInvalidLiteralExpCS()));
	}

	/**
	 * This returns the label text for {@link org.eclipse.emf.edit.command.CreateChildCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getCreateChildText(Object owner, Object feature, Object child, Collection<?> selection) {
		Object childFeature = feature;
		Object childObject = child;

		boolean qualify = childFeature == REMODELPackage.Literals.COLLECTION_RANGE_CS__FIRST
				|| childFeature == REMODELPackage.Literals.COLLECTION_RANGE_CS__LAST;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
	}

}

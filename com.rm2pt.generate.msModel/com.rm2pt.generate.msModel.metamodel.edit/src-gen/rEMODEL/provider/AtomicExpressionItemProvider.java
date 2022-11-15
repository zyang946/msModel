/**
 */
package rEMODEL.provider;

import com.rm2pt.generate.msmodel.metamodel.msMODEL.provider.MsMODELEditPlugin;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EStructuralFeature;

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

import rEMODEL.AtomicExpression;
import rEMODEL.REMODELFactory;
import rEMODEL.REMODELPackage;

/**
 * This is the item provider adapter for a {@link rEMODEL.AtomicExpression} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class AtomicExpressionItemProvider extends ItemProviderAdapter implements IEditingDomainItemProvider,
		IStructuredItemContentProvider, ITreeItemContentProvider, IItemLabelProvider, IItemPropertySource {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AtomicExpressionItemProvider(AdapterFactory adapterFactory) {
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

			addInfixopPropertyDescriptor(object);
			addOpPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Infixop feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addInfixopPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AtomicExpression_infixop_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AtomicExpression_infixop_feature",
								"_UI_AtomicExpression_type"),
						REMODELPackage.Literals.ATOMIC_EXPRESSION__INFIXOP, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Op feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addOpPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_AtomicExpression_op_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_AtomicExpression_op_feature",
								"_UI_AtomicExpression_type"),
						REMODELPackage.Literals.ATOMIC_EXPRESSION__OP, true, false, false,
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
			childrenFeatures.add(REMODELPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE);
			childrenFeatures.add(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE);
			childrenFeatures.add(REMODELPackage.Literals.ATOMIC_EXPRESSION__NUM);
			childrenFeatures.add(REMODELPackage.Literals.ATOMIC_EXPRESSION__EXP);
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
	 * This returns AtomicExpression.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/AtomicExpression"));
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
		String label = ((AtomicExpression) object).getInfixop();
		return label == null || label.length() == 0 ? getString("_UI_AtomicExpression_type")
				: getString("_UI_AtomicExpression_type") + " " + label;
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

		switch (notification.getFeatureID(AtomicExpression.class)) {
		case REMODELPackage.ATOMIC_EXPRESSION__INFIXOP:
		case REMODELPackage.ATOMIC_EXPRESSION__OP:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case REMODELPackage.ATOMIC_EXPRESSION__LEFTSIDE:
		case REMODELPackage.ATOMIC_EXPRESSION__RIGHTSIDE:
		case REMODELPackage.ATOMIC_EXPRESSION__NUM:
		case REMODELPackage.ATOMIC_EXPRESSION__EXP:
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

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				REMODELFactory.eINSTANCE.createLeftSubAtomicExpression()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				REMODELFactory.eINSTANCE.createCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				REMODELFactory.eINSTANCE.createLoopExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				REMODELFactory.eINSTANCE.createIteratorExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				REMODELFactory.eINSTANCE.createFeatureCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				REMODELFactory.eINSTANCE.createStandardNavigationCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				REMODELFactory.eINSTANCE.createStandardOperationExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				REMODELFactory.eINSTANCE.createClassiferCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				REMODELFactory.eINSTANCE.createPropertyCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				REMODELFactory.eINSTANCE.createOperationCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE,
				REMODELFactory.eINSTANCE.createVariableExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				REMODELFactory.eINSTANCE.createRightSubAtomicExpression()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				REMODELFactory.eINSTANCE.createCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				REMODELFactory.eINSTANCE.createLoopExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				REMODELFactory.eINSTANCE.createIteratorExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				REMODELFactory.eINSTANCE.createFeatureCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				REMODELFactory.eINSTANCE.createStandardNavigationCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				REMODELFactory.eINSTANCE.createStandardOperationExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				REMODELFactory.eINSTANCE.createClassiferCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				REMODELFactory.eINSTANCE.createPropertyCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				REMODELFactory.eINSTANCE.createOperationCallExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				REMODELFactory.eINSTANCE.createVariableExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				REMODELFactory.eINSTANCE.createLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				REMODELFactory.eINSTANCE.createEnumLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				REMODELFactory.eINSTANCE.createTupleLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				REMODELFactory.eINSTANCE.createCollectionLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				REMODELFactory.eINSTANCE.createPrimitiveLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				REMODELFactory.eINSTANCE.createNumberLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				REMODELFactory.eINSTANCE.createBooleanLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				REMODELFactory.eINSTANCE.createStringLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				REMODELFactory.eINSTANCE.createNullLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE,
				REMODELFactory.eINSTANCE.createInvalidLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__NUM,
				REMODELFactory.eINSTANCE.createPrimitiveLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__NUM,
				REMODELFactory.eINSTANCE.createNumberLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__NUM,
				REMODELFactory.eINSTANCE.createBooleanLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__NUM,
				REMODELFactory.eINSTANCE.createStringLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__NUM,
				REMODELFactory.eINSTANCE.createNullLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__NUM,
				REMODELFactory.eINSTANCE.createInvalidLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.ATOMIC_EXPRESSION__EXP,
				REMODELFactory.eINSTANCE.createAtomicExpression()));
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

		boolean qualify = childFeature == REMODELPackage.Literals.ATOMIC_EXPRESSION__LEFTSIDE
				|| childFeature == REMODELPackage.Literals.ATOMIC_EXPRESSION__RIGHTSIDE
				|| childFeature == REMODELPackage.Literals.ATOMIC_EXPRESSION__NUM;

		if (qualify) {
			return getString("_UI_CreateChild_text2",
					new Object[] { getTypeText(childObject), getFeatureText(childFeature), getTypeText(owner) });
		}
		return super.getCreateChildText(owner, feature, child, selection);
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

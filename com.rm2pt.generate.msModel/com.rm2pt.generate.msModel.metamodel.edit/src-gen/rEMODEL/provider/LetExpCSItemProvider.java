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

import rEMODEL.LetExpCS;
import rEMODEL.REMODELFactory;
import rEMODEL.REMODELPackage;

/**
 * This is the item provider adapter for a {@link rEMODEL.LetExpCS} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class LetExpCSItemProvider extends OCLExpressionCSItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LetExpCSItemProvider(AdapterFactory adapterFactory) {
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
			childrenFeatures.add(REMODELPackage.Literals.LET_EXP_CS__VARIABLE);
			childrenFeatures.add(REMODELPackage.Literals.LET_EXP_CS__IN_EXPRESSION);
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
	 * This returns LetExpCS.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/LetExpCS"));
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
		return getString("_UI_LetExpCS_type");
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

		switch (notification.getFeatureID(LetExpCS.class)) {
		case REMODELPackage.LET_EXP_CS__VARIABLE:
		case REMODELPackage.LET_EXP_CS__IN_EXPRESSION:
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

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LET_EXP_CS__VARIABLE,
				REMODELFactory.eINSTANCE.createVariableDeclarationCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LET_EXP_CS__IN_EXPRESSION,
				REMODELFactory.eINSTANCE.createOCLExpressionCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LET_EXP_CS__IN_EXPRESSION,
				REMODELFactory.eINSTANCE.createNestedExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LET_EXP_CS__IN_EXPRESSION,
				REMODELFactory.eINSTANCE.createLogicFormulaExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LET_EXP_CS__IN_EXPRESSION,
				REMODELFactory.eINSTANCE.createIfExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LET_EXP_CS__IN_EXPRESSION,
				REMODELFactory.eINSTANCE.createLetExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LET_EXP_CS__IN_EXPRESSION,
				REMODELFactory.eINSTANCE.createLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LET_EXP_CS__IN_EXPRESSION,
				REMODELFactory.eINSTANCE.createEnumLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LET_EXP_CS__IN_EXPRESSION,
				REMODELFactory.eINSTANCE.createTupleLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LET_EXP_CS__IN_EXPRESSION,
				REMODELFactory.eINSTANCE.createCollectionLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LET_EXP_CS__IN_EXPRESSION,
				REMODELFactory.eINSTANCE.createPrimitiveLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LET_EXP_CS__IN_EXPRESSION,
				REMODELFactory.eINSTANCE.createNumberLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LET_EXP_CS__IN_EXPRESSION,
				REMODELFactory.eINSTANCE.createBooleanLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LET_EXP_CS__IN_EXPRESSION,
				REMODELFactory.eINSTANCE.createStringLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LET_EXP_CS__IN_EXPRESSION,
				REMODELFactory.eINSTANCE.createNullLiteralExpCS()));

		newChildDescriptors.add(createChildParameter(REMODELPackage.Literals.LET_EXP_CS__IN_EXPRESSION,
				REMODELFactory.eINSTANCE.createInvalidLiteralExpCS()));
	}

}

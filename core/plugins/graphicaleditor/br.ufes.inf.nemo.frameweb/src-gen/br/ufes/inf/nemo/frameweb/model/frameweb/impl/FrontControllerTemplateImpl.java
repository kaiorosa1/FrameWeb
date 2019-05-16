/**
 */
package br.ufes.inf.nemo.frameweb.model.frameweb.impl;

import br.ufes.inf.nemo.frameweb.model.frameweb.FramewebPackage;
import br.ufes.inf.nemo.frameweb.model.frameweb.FrontControllerTemplate;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Front Controller Template</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FrontControllerTemplateImpl#getClassTemplate <em>Class Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FrontControllerTemplateImpl#getPageTemplate <em>Page Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FrontControllerTemplateImpl#getFormTemplate <em>Form Template</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FrontControllerTemplateImpl#getClassExtension <em>Class Extension</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FrontControllerTemplateImpl#getPageExtension <em>Page Extension</em>}</li>
 *   <li>{@link br.ufes.inf.nemo.frameweb.model.frameweb.impl.FrontControllerTemplateImpl#getRestClassTemplate <em>Rest Class Template</em>}</li>
 * </ul>
 *
 * @generated
 */
@SuppressWarnings("all")
public class FrontControllerTemplateImpl extends FrameworkProfileImpl implements FrontControllerTemplate {
	/**
	 * The default value of the '{@link #getClassTemplate() <em>Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassTemplate() <em>Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassTemplate()
	 * @generated
	 * @ordered
	 */
	protected String classTemplate = CLASS_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageTemplate() <em>Page Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageTemplate() <em>Page Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageTemplate()
	 * @generated
	 * @ordered
	 */
	protected String pageTemplate = PAGE_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFormTemplate() <em>Form Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String FORM_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFormTemplate() <em>Form Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFormTemplate()
	 * @generated
	 * @ordered
	 */
	protected String formTemplate = FORM_TEMPLATE_EDEFAULT;

	/**
	 * The default value of the '{@link #getClassExtension() <em>Class Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClassExtension() <em>Class Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClassExtension()
	 * @generated
	 * @ordered
	 */
	protected String classExtension = CLASS_EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getPageExtension() <em>Page Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageExtension()
	 * @generated
	 * @ordered
	 */
	protected static final String PAGE_EXTENSION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPageExtension() <em>Page Extension</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPageExtension()
	 * @generated
	 * @ordered
	 */
	protected String pageExtension = PAGE_EXTENSION_EDEFAULT;

	/**
	 * The default value of the '{@link #getRestClassTemplate() <em>Rest Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestClassTemplate()
	 * @generated
	 * @ordered
	 */
	protected static final String REST_CLASS_TEMPLATE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRestClassTemplate() <em>Rest Class Template</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRestClassTemplate()
	 * @generated
	 * @ordered
	 */
	protected String restClassTemplate = REST_CLASS_TEMPLATE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FrontControllerTemplateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FramewebPackage.Literals.FRONT_CONTROLLER_TEMPLATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassTemplate() {
		return classTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassTemplate(String newClassTemplate) {
		String oldClassTemplate = classTemplate;
		classTemplate = newClassTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.FRONT_CONTROLLER_TEMPLATE__CLASS_TEMPLATE, oldClassTemplate, classTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPageTemplate() {
		return pageTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPageTemplate(String newPageTemplate) {
		String oldPageTemplate = pageTemplate;
		pageTemplate = newPageTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.FRONT_CONTROLLER_TEMPLATE__PAGE_TEMPLATE, oldPageTemplate, pageTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getFormTemplate() {
		return formTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setFormTemplate(String newFormTemplate) {
		String oldFormTemplate = formTemplate;
		formTemplate = newFormTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.FRONT_CONTROLLER_TEMPLATE__FORM_TEMPLATE, oldFormTemplate, formTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getClassExtension() {
		return classExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setClassExtension(String newClassExtension) {
		String oldClassExtension = classExtension;
		classExtension = newClassExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.FRONT_CONTROLLER_TEMPLATE__CLASS_EXTENSION, oldClassExtension, classExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPageExtension() {
		return pageExtension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPageExtension(String newPageExtension) {
		String oldPageExtension = pageExtension;
		pageExtension = newPageExtension;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.FRONT_CONTROLLER_TEMPLATE__PAGE_EXTENSION, oldPageExtension, pageExtension));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getRestClassTemplate() {
		return restClassTemplate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setRestClassTemplate(String newRestClassTemplate) {
		String oldRestClassTemplate = restClassTemplate;
		restClassTemplate = newRestClassTemplate;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET,
					FramewebPackage.FRONT_CONTROLLER_TEMPLATE__REST_CLASS_TEMPLATE, oldRestClassTemplate,
					restClassTemplate));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__CLASS_TEMPLATE:
			return getClassTemplate();
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__PAGE_TEMPLATE:
			return getPageTemplate();
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__FORM_TEMPLATE:
			return getFormTemplate();
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__CLASS_EXTENSION:
			return getClassExtension();
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__PAGE_EXTENSION:
			return getPageExtension();
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__REST_CLASS_TEMPLATE:
			return getRestClassTemplate();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__CLASS_TEMPLATE:
			setClassTemplate((String) newValue);
			return;
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__PAGE_TEMPLATE:
			setPageTemplate((String) newValue);
			return;
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__FORM_TEMPLATE:
			setFormTemplate((String) newValue);
			return;
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__CLASS_EXTENSION:
			setClassExtension((String) newValue);
			return;
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__PAGE_EXTENSION:
			setPageExtension((String) newValue);
			return;
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__REST_CLASS_TEMPLATE:
			setRestClassTemplate((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__CLASS_TEMPLATE:
			setClassTemplate(CLASS_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__PAGE_TEMPLATE:
			setPageTemplate(PAGE_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__FORM_TEMPLATE:
			setFormTemplate(FORM_TEMPLATE_EDEFAULT);
			return;
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__CLASS_EXTENSION:
			setClassExtension(CLASS_EXTENSION_EDEFAULT);
			return;
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__PAGE_EXTENSION:
			setPageExtension(PAGE_EXTENSION_EDEFAULT);
			return;
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__REST_CLASS_TEMPLATE:
			setRestClassTemplate(REST_CLASS_TEMPLATE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__CLASS_TEMPLATE:
			return CLASS_TEMPLATE_EDEFAULT == null ? classTemplate != null
					: !CLASS_TEMPLATE_EDEFAULT.equals(classTemplate);
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__PAGE_TEMPLATE:
			return PAGE_TEMPLATE_EDEFAULT == null ? pageTemplate != null : !PAGE_TEMPLATE_EDEFAULT.equals(pageTemplate);
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__FORM_TEMPLATE:
			return FORM_TEMPLATE_EDEFAULT == null ? formTemplate != null : !FORM_TEMPLATE_EDEFAULT.equals(formTemplate);
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__CLASS_EXTENSION:
			return CLASS_EXTENSION_EDEFAULT == null ? classExtension != null
					: !CLASS_EXTENSION_EDEFAULT.equals(classExtension);
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__PAGE_EXTENSION:
			return PAGE_EXTENSION_EDEFAULT == null ? pageExtension != null
					: !PAGE_EXTENSION_EDEFAULT.equals(pageExtension);
		case FramewebPackage.FRONT_CONTROLLER_TEMPLATE__REST_CLASS_TEMPLATE:
			return REST_CLASS_TEMPLATE_EDEFAULT == null ? restClassTemplate != null
					: !REST_CLASS_TEMPLATE_EDEFAULT.equals(restClassTemplate);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (classTemplate: ");
		result.append(classTemplate);
		result.append(", pageTemplate: ");
		result.append(pageTemplate);
		result.append(", formTemplate: ");
		result.append(formTemplate);
		result.append(", classExtension: ");
		result.append(classExtension);
		result.append(", pageExtension: ");
		result.append(pageExtension);
		result.append(", restClassTemplate: ");
		result.append(restClassTemplate);
		result.append(')');
		return result.toString();
	}

} //FrontControllerTemplateImpl

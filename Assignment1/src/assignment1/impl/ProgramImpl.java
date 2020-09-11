/**
 */
package assignment1.impl;

import assignment1.Assignment1Package;
import assignment1.Program;
import assignment1.Specialization;
import assignment1.Year;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link assignment1.impl.ProgramImpl#getGradYear <em>Grad Year</em>}</li>
 *   <li>{@link assignment1.impl.ProgramImpl#getYear <em>Year</em>}</li>
 *   <li>{@link assignment1.impl.ProgramImpl#getSpecialization <em>Specialization</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ProgramImpl extends MinimalEObjectImpl.Container implements Program {
	/**
	 * The default value of the '{@link #getGradYear() <em>Grad Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradYear()
	 * @generated
	 * @ordered
	 */
	protected static final int GRAD_YEAR_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getGradYear() <em>Grad Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGradYear()
	 * @generated
	 * @ordered
	 */
	protected int gradYear = GRAD_YEAR_EDEFAULT;

	/**
	 * The cached value of the '{@link #getYear() <em>Year</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYear()
	 * @generated
	 * @ordered
	 */
	protected EList<Year> year;

	/**
	 * The cached value of the '{@link #getSpecialization() <em>Specialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialization()
	 * @generated
	 * @ordered
	 */
	protected Specialization specialization;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgramImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return Assignment1Package.Literals.PROGRAM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getGradYear() {
		return gradYear;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGradYear(int newGradYear) {
		int oldGradYear = gradYear;
		gradYear = newGradYear;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment1Package.PROGRAM__GRAD_YEAR, oldGradYear, gradYear));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Year> getYear() {
		if (year == null) {
			year = new EObjectContainmentEList<Year>(Year.class, this, Assignment1Package.PROGRAM__YEAR);
		}
		return year;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization getSpecialization() {
		if (specialization != null && specialization.eIsProxy()) {
			InternalEObject oldSpecialization = (InternalEObject)specialization;
			specialization = (Specialization)eResolveProxy(oldSpecialization);
			if (specialization != oldSpecialization) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, Assignment1Package.PROGRAM__SPECIALIZATION, oldSpecialization, specialization));
			}
		}
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Specialization basicGetSpecialization() {
		return specialization;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpecialization(Specialization newSpecialization) {
		Specialization oldSpecialization = specialization;
		specialization = newSpecialization;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, Assignment1Package.PROGRAM__SPECIALIZATION, oldSpecialization, specialization));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case Assignment1Package.PROGRAM__YEAR:
				return ((InternalEList<?>)getYear()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case Assignment1Package.PROGRAM__GRAD_YEAR:
				return getGradYear();
			case Assignment1Package.PROGRAM__YEAR:
				return getYear();
			case Assignment1Package.PROGRAM__SPECIALIZATION:
				if (resolve) return getSpecialization();
				return basicGetSpecialization();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case Assignment1Package.PROGRAM__GRAD_YEAR:
				setGradYear((Integer)newValue);
				return;
			case Assignment1Package.PROGRAM__YEAR:
				getYear().clear();
				getYear().addAll((Collection<? extends Year>)newValue);
				return;
			case Assignment1Package.PROGRAM__SPECIALIZATION:
				setSpecialization((Specialization)newValue);
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
			case Assignment1Package.PROGRAM__GRAD_YEAR:
				setGradYear(GRAD_YEAR_EDEFAULT);
				return;
			case Assignment1Package.PROGRAM__YEAR:
				getYear().clear();
				return;
			case Assignment1Package.PROGRAM__SPECIALIZATION:
				setSpecialization((Specialization)null);
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
			case Assignment1Package.PROGRAM__GRAD_YEAR:
				return gradYear != GRAD_YEAR_EDEFAULT;
			case Assignment1Package.PROGRAM__YEAR:
				return year != null && !year.isEmpty();
			case Assignment1Package.PROGRAM__SPECIALIZATION:
				return specialization != null;
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
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (gradYear: ");
		result.append(gradYear);
		result.append(')');
		return result.toString();
	}

} //ProgramImpl

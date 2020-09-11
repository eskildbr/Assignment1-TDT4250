/**
 */
package assignment1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Program</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment1.Program#getGradYear <em>Grad Year</em>}</li>
 *   <li>{@link assignment1.Program#getYear <em>Year</em>}</li>
 *   <li>{@link assignment1.Program#getSpecialization <em>Specialization</em>}</li>
 * </ul>
 *
 * @see assignment1.Assignment1Package#getProgram()
 * @model
 * @generated
 */
public interface Program extends EObject {
	/**
	 * Returns the value of the '<em><b>Grad Year</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Grad Year</em>' attribute.
	 * @see #setGradYear(int)
	 * @see assignment1.Assignment1Package#getProgram_GradYear()
	 * @model
	 * @generated
	 */
	int getGradYear();

	/**
	 * Sets the value of the '{@link assignment1.Program#getGradYear <em>Grad Year</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Grad Year</em>' attribute.
	 * @see #getGradYear()
	 * @generated
	 */
	void setGradYear(int value);

	/**
	 * Returns the value of the '<em><b>Year</b></em>' containment reference list.
	 * The list contents are of type {@link assignment1.Year}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Year</em>' containment reference list.
	 * @see assignment1.Assignment1Package#getProgram_Year()
	 * @model containment="true"
	 * @generated
	 */
	EList<Year> getYear();

	/**
	 * Returns the value of the '<em><b>Specialization</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Specialization</em>' reference.
	 * @see #setSpecialization(Specialization)
	 * @see assignment1.Assignment1Package#getProgram_Specialization()
	 * @model
	 * @generated
	 */
	Specialization getSpecialization();

	/**
	 * Sets the value of the '{@link assignment1.Program#getSpecialization <em>Specialization</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Specialization</em>' reference.
	 * @see #getSpecialization()
	 * @generated
	 */
	void setSpecialization(Specialization value);

} // Program

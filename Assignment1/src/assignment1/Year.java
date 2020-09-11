/**
 */
package assignment1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Year</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment1.Year#getNumber <em>Number</em>}</li>
 *   <li>{@link assignment1.Year#getCourseChoice <em>Course Choice</em>}</li>
 *   <li>{@link assignment1.Year#getCredits <em>Credits</em>}</li>
 * </ul>
 *
 * @see assignment1.Assignment1Package#getYear()
 * @model annotation="http://www.eclipse.org/emf/2002/Ecore constraints='maxCredits'"
 * @generated
 */
public interface Year extends EObject {
	/**
	 * Returns the value of the '<em><b>Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number</em>' attribute.
	 * @see #setNumber(int)
	 * @see assignment1.Assignment1Package#getYear_Number()
	 * @model
	 * @generated
	 */
	int getNumber();

	/**
	 * Sets the value of the '{@link assignment1.Year#getNumber <em>Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Number</em>' attribute.
	 * @see #getNumber()
	 * @generated
	 */
	void setNumber(int value);

	/**
	 * Returns the value of the '<em><b>Course Choice</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course Choice</em>' containment reference.
	 * @see #setCourseChoice(CourseChoice)
	 * @see assignment1.Assignment1Package#getYear_CourseChoice()
	 * @model containment="true"
	 * @generated
	 */
	CourseChoice getCourseChoice();

	/**
	 * Sets the value of the '{@link assignment1.Year#getCourseChoice <em>Course Choice</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Course Choice</em>' containment reference.
	 * @see #getCourseChoice()
	 * @generated
	 */
	void setCourseChoice(CourseChoice value);

	/**
	 * Returns the value of the '<em><b>Credits</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Credits</em>' attribute.
	 * @see #setCredits(float)
	 * @see assignment1.Assignment1Package#getYear_Credits()
	 * @model
	 * @generated
	 */
	float getCredits();

	/**
	 * Sets the value of the '{@link assignment1.Year#getCredits <em>Credits</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Credits</em>' attribute.
	 * @see #getCredits()
	 * @generated
	 */
	void setCredits(float value);

} // Year

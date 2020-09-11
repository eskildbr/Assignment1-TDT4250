/**
 */
package assignment1;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Course Choice</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment1.CourseChoice#getCriteria <em>Criteria</em>}</li>
 *   <li>{@link assignment1.CourseChoice#getCourse <em>Course</em>}</li>
 * </ul>
 *
 * @see assignment1.Assignment1Package#getCourseChoice()
 * @model
 * @generated
 */
public interface CourseChoice extends EObject {
	/**
	 * Returns the value of the '<em><b>Criteria</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Criteria</em>' attribute.
	 * @see #setCriteria(String)
	 * @see assignment1.Assignment1Package#getCourseChoice_Criteria()
	 * @model
	 * @generated
	 */
	String getCriteria();

	/**
	 * Sets the value of the '{@link assignment1.CourseChoice#getCriteria <em>Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Criteria</em>' attribute.
	 * @see #getCriteria()
	 * @generated
	 */
	void setCriteria(String value);

	/**
	 * Returns the value of the '<em><b>Course</b></em>' containment reference list.
	 * The list contents are of type {@link assignment1.Course}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Course</em>' containment reference list.
	 * @see assignment1.Assignment1Package#getCourseChoice_Course()
	 * @model containment="true"
	 * @generated
	 */
	EList<Course> getCourse();

} // CourseChoice

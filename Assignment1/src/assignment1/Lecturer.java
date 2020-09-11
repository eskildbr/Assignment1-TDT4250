/**
 */
package assignment1;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Lecturer</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link assignment1.Lecturer#getName <em>Name</em>}</li>
 *   <li>{@link assignment1.Lecturer#getGivenName <em>Given Name</em>}</li>
 *   <li>{@link assignment1.Lecturer#getFamilyName <em>Family Name</em>}</li>
 * </ul>
 *
 * @see assignment1.Assignment1Package#getLecturer()
 * @model
 * @generated
 */
public interface Lecturer extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see assignment1.Assignment1Package#getLecturer_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link assignment1.Lecturer#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Given Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Given Name</em>' attribute.
	 * @see assignment1.Assignment1Package#getLecturer_GivenName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated NOT
	 */
	public default String getGivenName() {
		String name = this.getName();
		
		if(name == null)
			return null;
		int pos = name.lastIndexOf(' ');
		
		if (pos < 0) {
			return null;
		}
		
		return name.substring(0, pos).trim();
	}

	/**
	 * Returns the value of the '<em><b>Family Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return 
	 * @return 
	 * @return 
	 * @return the value of the '<em>Family Name</em>' attribute.
	 * @see assignment1.Assignment1Package#getLecturer_FamilyName()
	 * @model transient="true" changeable="false" volatile="true" derived="true"
	 * @generated NOTR
	 */
		
	public default String getFamilyName() {
		String name = this.getName();
		
		if(name == null)
			return null;
		int pos = name.lastIndexOf(' ');
		
		if (pos < 0) {
			return null;
		}
		
		return name.substring(pos + 1);
	}

} // Lecturer

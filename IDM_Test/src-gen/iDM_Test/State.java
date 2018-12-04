/**
 */
package iDM_Test;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link iDM_Test.State#getName <em>Name</em>}</li>
 *   <li>{@link iDM_Test.State#getOutgoing <em>Outgoing</em>}</li>
 *   <li>{@link iDM_Test.State#getIncomming <em>Incomming</em>}</li>
 * </ul>
 *
 * @see iDM_Test.IDM_TestPackage#getState()
 * @model
 * @generated
 */
public interface State extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see iDM_Test.IDM_TestPackage#getState_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link iDM_Test.State#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Outgoing</b></em>' reference list.
	 * The list contents are of type {@link iDM_Test.Transition}.
	 * It is bidirectional and its opposite is '{@link iDM_Test.Transition#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing</em>' reference list.
	 * @see iDM_Test.IDM_TestPackage#getState_Outgoing()
	 * @see iDM_Test.Transition#getTo
	 * @model opposite="to"
	 * @generated
	 */
	EList<Transition> getOutgoing();

	/**
	 * Returns the value of the '<em><b>Incomming</b></em>' reference list.
	 * The list contents are of type {@link iDM_Test.Transition}.
	 * It is bidirectional and its opposite is '{@link iDM_Test.Transition#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incomming</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incomming</em>' reference list.
	 * @see iDM_Test.IDM_TestPackage#getState_Incomming()
	 * @see iDM_Test.Transition#getFrom
	 * @model opposite="from"
	 * @generated
	 */
	EList<Transition> getIncomming();

} // State

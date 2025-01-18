package org.amitchavan.reactive;

/**
 * This class is a sample custom Java type used in the demos.
 * DO NOT MODIFY THIS CODE
 *
 * @author amitchavan
 */

public class Employee {

    private int id;
    private String employeefirstName;
    private String employeelastName;

    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.employeefirstName = firstName;
        this.employeelastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return employeefirstName;
    }

    public void setFirstName(String firstName) {
        this.employeefirstName = firstName;
    }

    public String getLastName() {
        return employeelastName;
    }

    public void setLastName(String lastName) {
        this.employeelastName = lastName;
    }

    @Override
    public String toString() {
        return "User{" + "id=" + id + ", firstName='" + employeefirstName + '\'' + ", lastName='" + employeelastName + '\'' + '}';
    }
}

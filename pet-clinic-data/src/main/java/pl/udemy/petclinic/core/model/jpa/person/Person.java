package pl.udemy.petclinic.core.model.jpa.person;

import pl.udemy.petclinic.core.model.jpa.BaseEntity;

/**
 * @author Dawid Janik
 * @since 01.12.2018
 */
public class Person extends BaseEntity {

    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

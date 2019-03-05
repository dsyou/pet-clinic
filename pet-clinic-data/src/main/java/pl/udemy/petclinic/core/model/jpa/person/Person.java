package pl.udemy.petclinic.core.model.jpa.person;

import pl.udemy.petclinic.core.model.jpa.BaseEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author Dawid Janik
 * @since 01.12.2018
 */
@MappedSuperclass
public class Person extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
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

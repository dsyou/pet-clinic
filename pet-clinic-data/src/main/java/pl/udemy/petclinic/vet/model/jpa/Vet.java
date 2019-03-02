package pl.udemy.petclinic.vet.model.jpa;

import pl.udemy.petclinic.core.model.jpa.person.Person;
import pl.udemy.petclinic.speciality.Speciality;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dawid Janik
 * @since 01.12.2018
 */
public class Vet extends Person {

    private Set<Speciality> specialities = new HashSet<>();

    public Set<Speciality> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(Set<Speciality> specialities) {
        this.specialities = specialities;
    }
}

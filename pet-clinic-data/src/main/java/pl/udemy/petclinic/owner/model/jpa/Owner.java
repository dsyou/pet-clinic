package pl.udemy.petclinic.owner.model.jpa;

import pl.udemy.petclinic.core.model.person.jpa.Person;
import pl.udemy.petclinic.pet.model.jpa.Pet;

import java.util.Set;

/**
 * @author Dawid Janik
 * @since 01.12.2018
 */
public class Owner extends Person {
    private Set<Pet> pets;


    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}

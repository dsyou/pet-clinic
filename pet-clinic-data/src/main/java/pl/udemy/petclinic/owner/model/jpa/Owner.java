package pl.udemy.petclinic.owner.model.jpa;

import pl.udemy.petclinic.core.model.jpa.person.Person;
import pl.udemy.petclinic.pet.model.jpa.Pet;

import java.util.Set;

/**
 * @author Dawid Janik
 * @since 01.12.2018
 */
public class Owner extends Person {

    private String city;
    private String address;
    private String telephone;

    private Set<Pet> pets;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}

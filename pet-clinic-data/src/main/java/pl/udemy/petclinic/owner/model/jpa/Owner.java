package pl.udemy.petclinic.owner.model.jpa;

import pl.udemy.petclinic.core.model.jpa.person.Person;
import pl.udemy.petclinic.pet.model.jpa.Pet;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Dawid Janik
 * @since 01.12.2018
 */
@Entity
@Table(name = "owners")
public class Owner extends Person {

    @Column(name = "city")
    private String city;

    @Column(name = "address")
    private String address;

    @Column(name = "telephone")
    private String telephone;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "owner")
    private Set<Pet> pets = new HashSet<>();

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

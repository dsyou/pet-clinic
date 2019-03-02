package pl.udemy.petclinic.pet.model.jpa;

import pl.udemy.petclinic.core.model.jpa.BaseIdEntity;
import pl.udemy.petclinic.owner.model.jpa.Owner;

import java.time.LocalDate;

/**
 * @author Dawid Janik
 * @since 01.12.2018
 */
public class Pet extends BaseIdEntity {

    private String name;
    private PetType petType;
    private Owner owner;
    private LocalDate birthDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }
}

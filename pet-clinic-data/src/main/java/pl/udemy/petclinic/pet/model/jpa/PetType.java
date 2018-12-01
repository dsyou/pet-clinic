package pl.udemy.petclinic.pet.model.jpa;

import pl.udemy.petclinic.core.model.jpa.BaseIdEntity;

/**
 * @author Dawid Janik
 * @since 01.12.2018
 */
public class PetType extends BaseIdEntity {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
package pl.udemy.petclinic.visit;

import pl.udemy.petclinic.core.model.jpa.BaseIdEntity;
import pl.udemy.petclinic.pet.model.jpa.Pet;

import java.time.LocalDate;

/**
 * @author Dawid Janik
 * @since 27.02.2019
 */
public class Visit extends BaseIdEntity {

    private LocalDate date;
    private String description;
    private Pet pet;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}

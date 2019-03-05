package pl.udemy.petclinic.visit.model.jpa;

import pl.udemy.petclinic.core.model.jpa.BaseEntity;
import pl.udemy.petclinic.pet.model.jpa.Pet;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Dawid Janik
 * @since 27.02.2019
 */
@Entity
@Table(name = "visits")
public class Visit extends BaseEntity {

    @Column(name = "date")
    private LocalDate date;

    @Column(name = "description")
    private String description;

    @ManyToOne
    @JoinColumn(name = "pet_id")
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

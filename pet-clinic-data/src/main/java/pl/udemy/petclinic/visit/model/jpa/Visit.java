package pl.udemy.petclinic.visit.model.jpa;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.udemy.petclinic.core.model.jpa.BaseEntity;
import pl.udemy.petclinic.pet.model.jpa.Pet;

import javax.persistence.*;
import java.time.LocalDate;

/**
 * @author Dawid Janik
 * @since 27.02.2019
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
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

}

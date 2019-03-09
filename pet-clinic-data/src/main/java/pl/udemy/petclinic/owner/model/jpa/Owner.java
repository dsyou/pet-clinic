package pl.udemy.petclinic.owner.model.jpa;

import lombok.*;
import pl.udemy.petclinic.core.model.jpa.person.Person;
import pl.udemy.petclinic.pet.model.jpa.Pet;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

/**
 * @author Dawid Janik
 * @since 01.12.2018
 */
@Builder
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
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

}

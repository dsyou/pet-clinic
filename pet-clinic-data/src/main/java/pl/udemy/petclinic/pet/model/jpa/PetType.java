package pl.udemy.petclinic.pet.model.jpa;

import pl.udemy.petclinic.core.model.jpa.BaseEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author Dawid Janik
 * @since 01.12.2018
 */
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {

    @Column(name = "name")
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}

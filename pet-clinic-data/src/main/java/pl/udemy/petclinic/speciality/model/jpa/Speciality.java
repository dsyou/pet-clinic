package pl.udemy.petclinic.speciality.model.jpa;

import pl.udemy.petclinic.core.model.jpa.BaseEntity;

/**
 * @author Dawid Janik
 * @since 02.03.2019
 */
public class Speciality extends BaseEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

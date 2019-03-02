package pl.udemy.petclinic.speciality.model.jpa;

import pl.udemy.petclinic.core.model.jpa.BaseIdEntity;

/**
 * @author Dawid Janik
 * @since 02.03.2019
 */
public class Speciality extends BaseIdEntity {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

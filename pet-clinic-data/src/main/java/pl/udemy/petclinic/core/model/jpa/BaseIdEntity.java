package pl.udemy.petclinic.core.model.jpa;

/**
 * @author Dawid Janik
 * @since 01.12.2018
 */
public class BaseIdEntity {

    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}

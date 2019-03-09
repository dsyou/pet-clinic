package pl.udemy.petclinic.core.model.jpa.person;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import pl.udemy.petclinic.core.model.jpa.BaseEntity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * @author Dawid Janik
 * @since 01.12.2018
 */
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class Person extends BaseEntity {

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

}

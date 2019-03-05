package pl.udemy.petclinic.speciality.model;

import org.springframework.data.repository.CrudRepository;
import pl.udemy.petclinic.speciality.model.jpa.Speciality;

/**
 * @author Dawid Janik
 * @since 05.03.2019
 */
public interface SpecialityRepository extends CrudRepository<Speciality, Long> {
}

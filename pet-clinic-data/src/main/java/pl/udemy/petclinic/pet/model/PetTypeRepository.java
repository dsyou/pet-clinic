package pl.udemy.petclinic.pet.model;

import org.springframework.data.repository.CrudRepository;
import pl.udemy.petclinic.pet.model.jpa.PetType;

/**
 * @author Dawid Janik
 * @since 05.03.2019
 */
public interface PetTypeRepository extends CrudRepository<PetType,Long> {
}

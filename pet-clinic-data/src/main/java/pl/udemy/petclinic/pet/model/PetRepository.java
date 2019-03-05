package pl.udemy.petclinic.pet.model;

import org.springframework.data.repository.CrudRepository;
import pl.udemy.petclinic.pet.model.jpa.Pet;

/**
 * @author Dawid Janik
 * @since 05.03.2019
 */
public interface PetRepository extends CrudRepository<Pet, Long> {
}

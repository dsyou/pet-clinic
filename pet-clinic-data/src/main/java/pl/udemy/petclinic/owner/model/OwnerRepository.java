package pl.udemy.petclinic.owner.model;

import org.springframework.data.repository.CrudRepository;
import pl.udemy.petclinic.owner.model.jpa.Owner;

/**
 * @author Dawid Janik
 * @since 05.03.2019
 */
public interface OwnerRepository extends CrudRepository<Owner, Long> {
}

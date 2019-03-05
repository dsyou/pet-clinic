package pl.udemy.petclinic.vet.model;

import org.springframework.data.repository.CrudRepository;
import pl.udemy.petclinic.vet.model.jpa.Vet;

/**
 * @author Dawid Janik
 * @since 05.03.2019
 */
public interface VetRepository extends CrudRepository<Vet, Long> {
}

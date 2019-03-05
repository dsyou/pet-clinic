package pl.udemy.petclinic.visit.model;

import org.springframework.data.repository.CrudRepository;
import pl.udemy.petclinic.visit.model.jpa.Visit;

/**
 * @author Dawid Janik
 * @since 05.03.2019
 */
public interface VisitRepository extends CrudRepository<Visit, Long> {
}

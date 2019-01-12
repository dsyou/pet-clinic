package pl.udemy.petclinic.owner;

import pl.udemy.petclinic.core.CrudService;
import pl.udemy.petclinic.owner.model.jpa.Owner;

import java.util.Set;

/**
 * @author Dawid Janik
 * @since 01.12.2018
 */
public interface OwnerService extends CrudService<Owner, Long> {
    Owner findByLastName(String lastName);
}

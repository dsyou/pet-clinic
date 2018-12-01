package pl.udemy.petclinic.owner;

import pl.udemy.petclinic.owner.model.jpa.Owner;

import java.util.Set;

/**
 * @author Dawid Janik
 * @since 01.12.2018
 */
public interface OwnerService {

    Owner findByLastName(String lastName);

    Owner findById(Long id);

    Owner save(Owner owner);

    Set<Owner> findAll();
}

package pl.udemy.petclinic.services;

import pl.udemy.petclinic.model.Owner;

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

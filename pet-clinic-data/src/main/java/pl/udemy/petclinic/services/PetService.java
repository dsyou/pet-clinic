package pl.udemy.petclinic.services;

import pl.udemy.petclinic.model.Pet;

import java.util.Set;

/**
 * @author Dawid Janik
 * @since 01.12.2018
 */
public interface PetService {
    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}

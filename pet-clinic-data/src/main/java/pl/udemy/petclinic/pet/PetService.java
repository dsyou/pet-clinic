package pl.udemy.petclinic.pet;

import pl.udemy.petclinic.pet.model.jpa.Pet;

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

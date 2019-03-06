package pl.udemy.petclinic.pet;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.udemy.petclinic.pet.model.PetRepository;
import pl.udemy.petclinic.pet.model.jpa.Pet;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dawid Janik
 * @since 06.03.2019
 */
@Service
@Profile("springadatajpa")
public class PetJpaService implements PetService {

    private final PetRepository petRepository;

    public PetJpaService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    @Override
    public Set<Pet> getAll() {
        Set<Pet> pets = new HashSet<>();
        petRepository.findAll().forEach(pets::add);
        return pets;
    }

    @Override
    public Pet getById(Long id) {
        return petRepository.findById(id)
                .orElseThrow(NullPointerException::new);
    }

    @Override
    public Pet create(Pet pet) {
        return petRepository.save(pet);
    }

    @Override
    public void delete(Pet pet) {
        petRepository.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        petRepository.deleteById(id);
    }
}

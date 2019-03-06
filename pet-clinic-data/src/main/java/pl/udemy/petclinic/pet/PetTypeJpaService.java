package pl.udemy.petclinic.pet;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.udemy.petclinic.pet.model.PetTypeRepository;
import pl.udemy.petclinic.pet.model.jpa.PetType;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dawid Janik
 * @since 06.03.2019
 */
@Service
@Profile("springadatajpa")
public class PetTypeJpaService implements PetTypeService {

    private final PetTypeRepository petTypeRepository;

    public PetTypeJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> getAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType getById(Long id) {
        return petTypeRepository.findById(id).orElseThrow(NullPointerException::new);
    }

    @Override
    public PetType create(PetType petType) {
        return petTypeRepository.save(petType);
    }

    @Override
    public void delete(PetType petType) {
        petTypeRepository.delete(petType);
    }

    @Override
    public void deleteById(Long id) {
        petTypeRepository.deleteById(id);
    }
}

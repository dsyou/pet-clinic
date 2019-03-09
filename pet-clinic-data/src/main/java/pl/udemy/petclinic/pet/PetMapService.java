package pl.udemy.petclinic.pet;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.udemy.petclinic.core.AbstractMapService;
import pl.udemy.petclinic.pet.model.jpa.Pet;

import java.util.Set;

/**
 * @author Dawid Janik
 * @since 01.12.2018
 */
@Service
@Profile({"default", "map"})
public class PetMapService extends AbstractMapService<Pet, Long> implements PetService {

    @Override
    public Set<Pet> getAll() {
        return super.getAll();
    }

    @Override
    public Pet getById(Long id) {
        return super.getById(id);
    }

    @Override
    public Pet create(Pet pet) {
        return super.create(pet);
    }

    @Override
    public void delete(Pet pet) {
        super.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }
}

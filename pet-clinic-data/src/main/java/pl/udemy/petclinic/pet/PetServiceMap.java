package pl.udemy.petclinic.pet;

import pl.udemy.petclinic.core.AbstractMapService;
import pl.udemy.petclinic.core.CrudService;
import pl.udemy.petclinic.pet.model.jpa.Pet;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements PetService {

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
        return super.create(pet.getId(), pet);
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

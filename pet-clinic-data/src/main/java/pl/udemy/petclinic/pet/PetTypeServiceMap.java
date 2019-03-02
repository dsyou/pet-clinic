package pl.udemy.petclinic.pet;

import org.springframework.stereotype.Service;
import pl.udemy.petclinic.core.AbstractMapService;
import pl.udemy.petclinic.pet.model.jpa.Pet;
import pl.udemy.petclinic.pet.model.jpa.PetType;

import java.util.Set;

/**
 * @author Dawid Janik
 * @since 01.12.2018
 */
@Service
public class PetTypeServiceMap extends AbstractMapService<PetType, Long> implements PetTypeService {

    @Override
    public Set<PetType> getAll() {
        return super.getAll();
    }

    @Override
    public PetType create(PetType petType) {
        return super.create(petType);
    }

    @Override
    public void delete(PetType petType) {
        super.delete(petType);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

}

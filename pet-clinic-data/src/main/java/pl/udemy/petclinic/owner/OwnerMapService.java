package pl.udemy.petclinic.owner;

import org.springframework.stereotype.Service;
import pl.udemy.petclinic.core.AbstractMapService;
import pl.udemy.petclinic.owner.model.jpa.Owner;
import pl.udemy.petclinic.pet.PetService;
import pl.udemy.petclinic.pet.PetTypeService;
import pl.udemy.petclinic.pet.model.jpa.Pet;

import java.util.Set;

@Service
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

    private final PetService petService;
    private final PetTypeService petTypeService;

    public OwnerMapService(PetService petService, PetTypeService petTypeService) {
        this.petService = petService;
        this.petTypeService = petTypeService;
    }

    @Override
    public Owner getById(Long id) {
        return super.getById(id);
    }

    @Override
    public Set<Owner> getAll() {
        return super.getAll();
    }

    @Override
    public Owner create(Owner owner) {

        if (owner != null) {
            if (owner.getPets() != null) {
                owner.getPets().forEach(pet -> {
                    if (pet.getPetType() != null) {
                        if (pet.getPetType().getId() == null) {
                            pet.setPetType(petTypeService.create(pet.getPetType()));
                        }
                    } else {
                        throw new RuntimeException("Pet Type is required");
                    }

                    if(pet.getId() == null){
                        Pet savedPet = petService.create(pet);
                        pet.setId(savedPet.getId());
                    }
                });
            }
            return super.create(owner);
        } else {
            return null;
        }

    }

    @Override
    public void delete(Owner owner) {
        super.delete(owner);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Owner findByLastName(String lastName) {
        return null;
    }

}


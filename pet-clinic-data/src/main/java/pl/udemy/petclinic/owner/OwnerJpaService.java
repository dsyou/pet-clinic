package pl.udemy.petclinic.owner;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.udemy.petclinic.owner.model.OwnerRepository;
import pl.udemy.petclinic.owner.model.jpa.Owner;
import pl.udemy.petclinic.pet.PetService;
import pl.udemy.petclinic.pet.PetTypeService;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dawid Janik
 * @since 05.03.2019
 */
@Service
@Profile("springadatajpa")
public class OwnerJpaService implements OwnerService {

    private final OwnerRepository ownerRepository;
    private final PetService petService;
    private final PetTypeService petTypeService;

    public OwnerJpaService(OwnerRepository ownerRepository, PetService petService, PetTypeService petTypeService) {
        this.ownerRepository = ownerRepository;
        this.petService = petService;
        this.petTypeService = petTypeService;
    }

    @Override
    public Owner findByLastName(String lastName) {
        return ownerRepository.findByLastName(lastName);
    }

    @Override
    public Set<Owner> getAll() {
        Set<Owner> owners = new HashSet<>();
        ownerRepository.findAll().forEach(owners::add);
        return owners;
    }

    @Override
    public Owner getById(Long id) {
        return ownerRepository.findById(id)
                .orElseThrow(NullPointerException::new);
    }

    @Override
    public Owner create(Owner owner) {
        return ownerRepository.save(owner);
    }

    @Override
    public void delete(Owner owner) {
        ownerRepository.delete(owner);
    }

    @Override
    public void deleteById(Long aLong) {

    }
}

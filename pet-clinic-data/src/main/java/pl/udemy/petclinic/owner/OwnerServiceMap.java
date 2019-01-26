package pl.udemy.petclinic.owner;

import org.springframework.stereotype.Service;
import pl.udemy.petclinic.core.AbstractMapService;
import pl.udemy.petclinic.core.CrudService;
import pl.udemy.petclinic.owner.model.jpa.Owner;

import java.util.Set;

@Service
public class OwnerServiceMap extends AbstractMapService<Owner, Long> implements OwnerService {

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
        return super.create(owner.getId(), owner);
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


package pl.udemy.petclinic.vet;

import org.springframework.stereotype.Service;
import pl.udemy.petclinic.core.AbstractMapService;
import pl.udemy.petclinic.vet.model.jpa.Vet;

import java.util.Set;

@Service
public class VerServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    @Override
    public Vet getById(Long id) {
        return super.getById(id);
    }

    @Override
    public Set<Vet> getAll() {
        return super.getAll();
    }

    @Override
    public Vet create(Vet vet) {
        return super.create(vet.getId(), vet);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet vet) {
        super.delete(vet);
    }

}

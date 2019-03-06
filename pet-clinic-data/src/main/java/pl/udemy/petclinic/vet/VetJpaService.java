package pl.udemy.petclinic.vet;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.udemy.petclinic.vet.model.VetRepository;
import pl.udemy.petclinic.vet.model.jpa.Vet;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dawid Janik
 * @since 06.03.2019
 */
@Service
@Profile("springdatajpa")
public class VetJpaService implements VetService {

    private final VetRepository vetRepository;

    public VetJpaService(VetRepository vetRepository) {
        this.vetRepository = vetRepository;
    }

    @Override
    public Set<Vet> getAll() {
        Set<Vet> vets = new HashSet<>();
        vetRepository.findAll().forEach(vets::add);
        return vets;
    }

    @Override
    public Vet getById(Long id) {
        return vetRepository.findById(id).orElseThrow(NullPointerException::new);
    }

    @Override
    public Vet create(Vet vet) {
        return vetRepository.save(vet);
    }

    @Override
    public void delete(Vet vet) {
        vetRepository.delete(vet);
    }

    @Override
    public void deleteById(Long id) {
        vetRepository.deleteById(id);
    }
    
}

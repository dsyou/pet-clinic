package pl.udemy.petclinic.speciality;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import pl.udemy.petclinic.speciality.model.SpecialityRepository;
import pl.udemy.petclinic.speciality.model.jpa.Speciality;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Dawid Janik
 * @since 06.03.2019
 */
@Service
@Profile("springdatajpa")
public class SpecialityJpaService implements SpecialityService {

    private final SpecialityRepository specialityRepository;

    public SpecialityJpaService(SpecialityRepository specialityRepository) {
        this.specialityRepository = specialityRepository;
    }

    @Override
    public Set<Speciality> getAll() {
        Set<Speciality> specialities = new HashSet<>();
        specialityRepository.findAll().forEach(specialities::add);
        return specialities;
    }

    @Override
    public Speciality getById(Long id) {
        return specialityRepository.findById(id).orElseThrow(NullPointerException::new);
    }

    @Override
    public Speciality create(Speciality speciality) {
        return specialityRepository.save(speciality);
    }

    @Override
    public void delete(Speciality speciality) {
        specialityRepository.delete(speciality);
    }

    @Override
    public void deleteById(Long id) {
        specialityRepository.deleteById(id);
    }
}

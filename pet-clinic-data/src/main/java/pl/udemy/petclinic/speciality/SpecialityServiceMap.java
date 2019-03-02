package pl.udemy.petclinic.speciality;

import org.springframework.stereotype.Service;
import pl.udemy.petclinic.core.AbstractMapService;
import pl.udemy.petclinic.speciality.model.jpa.Speciality;

import java.util.Set;

/**
 * @author Dawid Janik
 * @since 01.12.2018
 */
@Service
public class SpecialityServiceMap extends AbstractMapService<Speciality, Long> implements SpecialityService {

    @Override
    public Set<Speciality> getAll() {
        return super.getAll();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public Speciality create(Speciality speciality) {
        return super.create(speciality);
    }

    @Override
    public void delete(Speciality speciality) {
        super.delete(speciality);
    }
}

package pl.udemy.petclinic.vet;

import org.springframework.stereotype.Service;
import pl.udemy.petclinic.core.AbstractMapService;
import pl.udemy.petclinic.speciality.SpecialityService;
import pl.udemy.petclinic.speciality.model.jpa.Speciality;
import pl.udemy.petclinic.vet.model.jpa.Vet;

import java.util.Set;

@Service
public class VerServiceMap extends AbstractMapService<Vet, Long> implements VetService {

    private final SpecialityService specialityService;

    public VerServiceMap(SpecialityService specialityService) {
        this.specialityService = specialityService;
    }

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
        if (vet.getSpecialities().size() > 0){
            vet.getSpecialities().forEach(speciality -> {
                if(speciality.getId() == null){
                    Speciality savedSpecialty = specialityService.create(speciality);
                    speciality.setId(savedSpecialty.getId());
                }
            });
        }
        return super.create(vet);
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

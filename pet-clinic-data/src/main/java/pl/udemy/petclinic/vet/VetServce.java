package pl.udemy.petclinic.vet;

import pl.udemy.petclinic.vet.model.jpa.Vet;

import java.util.Set;

/**
 * @author Dawid Janik
 * @since 01.12.2018
 */
public interface VetServce {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}

package pl.udemy.petclinic.core;

import java.util.Set;

/**
 * @author Dawid Janik
 * @since 12.01.2019
 */
public interface CrudService<T, ID> {

    Set<T> getAll();

    T getById(ID id);

    T create(T object);

    void delete(T object);

    void deleteById(ID id);
}

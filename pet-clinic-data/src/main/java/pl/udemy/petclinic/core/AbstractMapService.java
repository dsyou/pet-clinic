package pl.udemy.petclinic.core;

import pl.udemy.petclinic.core.model.jpa.BaseIdEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseIdEntity, ID extends Long> {

    protected Map<Long, T> map = new HashMap<>();

    protected Set<T> getAll() {
        return new HashSet<>(map.values());
    }

    public T getById(ID id) {
        return map.get(id);
    }

    protected T create(T object) {
        if (object != null) {
            if (object.getId() == null) {
                object.setId(getNextId());
            }
            map.put(object.getId(), object);
        } else {
            throw new RuntimeException("Object cannot be null");
        }
        return object;
    }

    protected void deleteById(ID id) {
        map.remove(id);
    }

    protected void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }

    private Long getNextId() {
        Long nextId;
        try {
            nextId = Collections.max(map.keySet()) + 1;
        } catch (NoSuchElementException ex) {
            nextId = 1L;
        }
        return nextId;
    }
}

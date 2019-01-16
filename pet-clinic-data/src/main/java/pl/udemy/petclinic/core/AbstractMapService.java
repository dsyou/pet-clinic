package pl.udemy.petclinic.core;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public abstract class AbstractMapService<T, ID> {

    protected Map<ID, T> map = new HashMap<>();

    protected Set<T> getAll() {
        return new HashSet<>(map.values());
    }

    public T getById(ID id) {
        return map.get(id);
    }

    protected T create(ID id, T object) {
        return map.put(id, object);
    }

    protected void deleteById(ID id) {
        map.remove(id);
    }

    protected void delete(T object) {
        map.entrySet().removeIf(entry -> entry.getValue().equals(object));
    }
}

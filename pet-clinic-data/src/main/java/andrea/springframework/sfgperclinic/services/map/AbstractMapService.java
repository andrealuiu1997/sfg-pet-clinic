package andrea.springframework.sfgperclinic.services.map;

import andrea.springframework.sfgperclinic.Model.BaseEntity;

import java.util.*;

public abstract class AbstractMapService<T extends BaseEntity, ID extends Long> {

    protected Map<Long,T> map = new HashMap<>();

    Set<T> findAll(){
       return new HashSet<>(map.values());
    }

    T findById(ID id) {
        return map.get(id);
    }

    T save(T object) {
        if(object != null) {
            if(object.getId() == null) {
                object.setId(getNextID());
            }
            map.put(object.getId(), object);
        }else {
            throw new  NullPointerException("that cannot be null");
        }
         return object;
    }

    void deleteById(ID id){
        map.remove(id);
    }

    void delete(T object) {
        map.entrySet().
                removeIf(entry -> map.values().equals(object));
    }

    private Long getNextID(){
        Long nextId = null;

        try {
            //the max method return the max value
            //the keyset obviously it's returning the keys of the map
            nextId = Collections.max(map.keySet()) + 1;
        }catch (NoSuchElementException ex) {
            nextId = 1L;
        }
        return nextId;
    }
}

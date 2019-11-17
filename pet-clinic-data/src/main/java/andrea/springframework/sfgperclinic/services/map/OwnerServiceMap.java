package andrea.springframework.sfgperclinic.services.map;

import andrea.springframework.sfgperclinic.Model.Owner;
import andrea.springframework.sfgperclinic.services.CrudService;

import java.util.Set;

public class OwnerServiceMap extends AbstractMapService<Owner,Long> implements CrudService<Owner,Long> {
    @Override
    public Set<Owner> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner findByID(Long id) {
        return super.findById(id);
    }


    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }
}
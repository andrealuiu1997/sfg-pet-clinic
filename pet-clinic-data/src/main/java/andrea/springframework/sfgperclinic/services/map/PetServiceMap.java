package andrea.springframework.sfgperclinic.services.map;

import andrea.springframework.sfgperclinic.Model.Pet;
import andrea.springframework.sfgperclinic.services.PetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class PetServiceMap extends AbstractMapService<Pet,Long> implements PetService {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }

    @Override
    public Pet findByID(Long id) {
        return super.findById(id);
    }


    @Override
    public Pet save(Pet object) {
        return super.save( object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }
}

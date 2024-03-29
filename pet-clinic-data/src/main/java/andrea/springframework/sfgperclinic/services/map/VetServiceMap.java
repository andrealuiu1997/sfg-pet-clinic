package andrea.springframework.sfgperclinic.services.map;

import andrea.springframework.sfgperclinic.Model.Speciality;
import andrea.springframework.sfgperclinic.Model.Vet;
import andrea.springframework.sfgperclinic.services.SpecialtyService;
import andrea.springframework.sfgperclinic.services.VetService;
import org.springframework.stereotype.Service;

import java.util.Set;

@Service
public class VetServiceMap extends AbstractMapService<Vet,Long> implements VetService {

    private final SpecialtyService specialtyService;

    public VetServiceMap(SpecialtyService specialtyService) {
        this.specialtyService = specialtyService;
    }

    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }

    @Override
    public Vet findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        if(object.getSpecialities().size() > 0) {
            object.getSpecialities().forEach(speciality -> {
                if(speciality.getId() != null) {
                    Speciality saved = specialtyService.save(speciality);
                    speciality.setId(saved.getId());
                }
            });
        }
        return super.save( object);}

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }
}

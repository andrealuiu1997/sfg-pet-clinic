package andrea.springframework.sfgperclinic.services.map;

import andrea.springframework.sfgperclinic.Model.Speciality;
import andrea.springframework.sfgperclinic.services.SpecialtiesServices;

import java.util.Set;

public class SpecialtiesMapService extends AbstractMapService<Speciality,Long> implements SpecialtiesServices {

    @Override
    public Set<Speciality> findAll() {
        return super.findAll();
    }

    @Override
    public Speciality findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Speciality save(Speciality object) {
        return super.save(object);
    }

    @Override
    public void delete(Speciality object) {
        super.delete(object);
    }

    @Override
    public void deleteByID(Long id) {
        super.deleteById(id);
    }
}

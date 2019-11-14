package andrea.springframework.sfgperclinic.services;

import andrea.springframework.sfgperclinic.Model.Owner;
import andrea.springframework.sfgperclinic.Model.Pet;

import java.util.Set;

public interface PetService {

    Pet findByID(Long id);

    Pet save(Pet owner);

    Set<Pet> findAll();
}

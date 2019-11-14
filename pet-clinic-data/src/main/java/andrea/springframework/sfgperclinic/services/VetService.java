package andrea.springframework.sfgperclinic.services;

import andrea.springframework.sfgperclinic.Model.Vet;

import java.util.Set;

public interface VetService {

    Vet findByID(Long id);

    Vet save(Vet owner);

    Set<Vet> findAll();
}

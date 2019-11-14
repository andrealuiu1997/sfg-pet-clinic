package andrea.springframework.sfgperclinic.services;

import andrea.springframework.sfgperclinic.Model.Owner;

import java.util.Set;

public interface OwnerService {

    Owner findByLastName(String lastName);
    Owner findByID(Long id);
    Owner save(Owner owner);

    Set<Owner> findAll();

}

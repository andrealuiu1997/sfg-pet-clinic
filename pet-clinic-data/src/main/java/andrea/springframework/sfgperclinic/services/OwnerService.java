package andrea.springframework.sfgperclinic.services;

import andrea.springframework.sfgperclinic.Model.Owner;


public interface OwnerService extends CrudService<Owner,Long>{

    Owner findByLastName(String LastName);


}

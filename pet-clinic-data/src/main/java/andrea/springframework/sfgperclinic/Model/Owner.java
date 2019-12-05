package andrea.springframework.sfgperclinic.Model;

import java.util.Set;

public class Owner extends Person {

    Set<Pet> pets;


    //getters and setters
    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}

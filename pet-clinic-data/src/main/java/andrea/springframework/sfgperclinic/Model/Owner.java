package andrea.springframework.sfgperclinic.Model;

import java.util.HashSet;
import java.util.Set;

public class Owner extends Person {

    private String city;
    private String address;
    private String telephone;
    private Set<Pet> pets = new HashSet<>();


    //getters and setters

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public Set<Pet> getPets() {
        return pets;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }
}

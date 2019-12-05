package andrea.springframework.sfgperclinic.Model;

import java.util.Set;

public class Vet extends Person {

    Set<Speciality> specialities;

    //getters and setters
    public Set<Speciality> getSpecialities() { return specialities; }

    public void setSpecialities(Set<Speciality> specialities) { this.specialities = specialities; }
}

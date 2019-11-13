package andrea.springframework.sfgpetclinic.Model;

import java.time.LocalDate;

public class Pet {

    private PetType petType;
    private Owner owner;
    private LocalDate birthaday;


    //getter and setter
    public PetType getPetType() {
        return petType;
    }

    public void setPetType(PetType petType) {
        this.petType = petType;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public LocalDate getBirthaday() {
        return birthaday;
    }

    public void setBirthaday(LocalDate birthaday) {
        this.birthaday = birthaday;
    }
}

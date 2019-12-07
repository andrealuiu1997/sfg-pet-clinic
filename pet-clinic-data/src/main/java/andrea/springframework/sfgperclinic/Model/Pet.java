package andrea.springframework.sfgperclinic.Model;

import java.time.LocalDate;

public class Pet extends BaseEntity{

    private String name;
    private PetType petType;
    private Owner owner;
    private LocalDate birthaday;


    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

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

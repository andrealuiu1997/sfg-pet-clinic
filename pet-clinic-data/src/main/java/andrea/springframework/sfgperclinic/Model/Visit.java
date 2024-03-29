package andrea.springframework.sfgperclinic.Model;

import java.time.LocalDate;

public class Visit extends BaseEntity {
    private LocalDate date;
    private String description;
    private Pet pet;


    //getter and setters
    public LocalDate getDate() { return date; }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Pet getPet() { return pet; }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}

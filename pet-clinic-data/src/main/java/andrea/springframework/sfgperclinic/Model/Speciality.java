package andrea.springframework.sfgperclinic.Model;

public class Speciality extends BaseEntity {
    private String description;

    //getter and setters
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

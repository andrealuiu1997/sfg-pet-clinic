package andrea.springframework.sfgperclinic.Model;

public class Person  extends BaseEntity{

    private String firstName;
    private String lastName;

    //getter and setter
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

package andrea.springframework.sfgperclinic.Model;

import java.io.Serializable;

public class BaseEntity implements Serializable {

    private Long id;

    //getter and setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}


package andrea.springframework.sfgperclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VetsController {

    @RequestMapping({"/vets","/vets/index","/vets/index.html"})
    public String listsVets(){

        return "vets/index";
    }
}

package andrea.springframework.sfgperclinic.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/vets"})
@Controller
public class VetsController {

    @RequestMapping({"","/","/index","/index.html"})
    public String listsVets(){

        return "vets/index";
    }
}

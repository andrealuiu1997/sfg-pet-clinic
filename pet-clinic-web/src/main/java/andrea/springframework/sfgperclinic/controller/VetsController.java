package andrea.springframework.sfgperclinic.controller;

import andrea.springframework.sfgperclinic.services.VetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping({"/vets"})
@Controller
public class VetsController {

    private VetService vetService;

    @Autowired
    public VetsController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"","/","/index","/index.html"})
    public String listsVets(Model model){

        model.addAttribute("vets", vetService.findAll());

        return "vets/index";
    }
}

package pl.udemy.petclinic.features.owners.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.udemy.petclinic.owner.OwnerService;

@Controller
@RequestMapping("/owners")
@SuppressWarnings("unused")
public class OwnerController {

    private final OwnerService ownerService;

    public OwnerController(OwnerService ownerService) {
        this.ownerService = ownerService;
    }

    @RequestMapping({"", "/index", "/owners/index.html"})
    public String listOwners(Model model) {
        model.addAttribute("owners", ownerService.getAll());
        return "owners/index";
    }

    @RequestMapping("find")
    public String findOwners(){
        return "notimplemented";
    }
}

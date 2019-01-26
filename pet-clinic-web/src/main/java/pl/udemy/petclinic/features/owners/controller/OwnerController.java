package pl.udemy.petclinic.features.owners.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/owners")
@SuppressWarnings("unused")
public class OwnerController {

    @RequestMapping({ "","/index", "/owners/index.html"})
    public String listOwners() {
        return "owners/index";
    }
}

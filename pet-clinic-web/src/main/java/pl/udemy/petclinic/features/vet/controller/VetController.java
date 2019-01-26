package pl.udemy.petclinic.features.vet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("vets")
@SuppressWarnings("unused")
public class VetController {

    @RequestMapping({"", "/index", "/index.html"})
    public String listsVets() {
        return "vets/index";
    }
}
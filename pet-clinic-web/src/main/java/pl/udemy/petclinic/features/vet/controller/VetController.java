package pl.udemy.petclinic.features.vet.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import pl.udemy.petclinic.vet.VetService;

@Controller
@RequestMapping("vets")
@SuppressWarnings("unused")
public class VetController {

    private final VetService vetService;

    public VetController(VetService vetService) {
        this.vetService = vetService;
    }

    @RequestMapping({"", "/index", "/index.html"})
    public String listsVets(Model model) {
        model.addAttribute("vets", vetService.getAll());
        return "vets/index";
    }
}
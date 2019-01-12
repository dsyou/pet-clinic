package pl.udemy.petclinic.features;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Dawid Janik
 * @since 01.12.2019
 */
@Controller
public class IndexController {

    @RequestMapping({
            "",
            "/",
            "index",
            "index.html"
    })
    public String index() {
        return "index";
    }
}

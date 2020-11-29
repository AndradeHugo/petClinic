package curso.spring.petclinic.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/proprietarios")
@Controller
public class ProprietarioController {

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listarProprietarios() {

        return "proprietarios/index";
    }

}

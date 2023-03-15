package br.es.tj.eprocees.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/cadastrar_impedimento")
    public String cadastrarImpedimento(){
        return "cadastrar_impedimento";
    }
}

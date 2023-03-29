package br.es.tj.eprocees.controller.cadastros;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CadastrarImpedimentosController {
    @GetMapping("/cadastrar_impedimento")
    public String cadastrarImpedimento() {
        return "cadastrar_impedimento";
    }
}

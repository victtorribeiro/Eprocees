package br.es.tj.eprocees.controller.cadastros;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CadastrosController {

    @GetMapping(value = "cadastros/selecionar_pessoa")
    public String selecionarPessoa() {
        return "cadastros/selecionar_pessoa.html";
    }

}

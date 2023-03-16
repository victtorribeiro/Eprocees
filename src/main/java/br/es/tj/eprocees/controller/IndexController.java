package br.es.tj.eprocees.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @GetMapping("/distribuir_processos")
    public String distribuirProcessos() {
        return "distribuir_processos";
    }

    @GetMapping("/redistribuir_processo")
    public String redistribuirProcessos() {
        return "redistribuir_processo";
    }

    @GetMapping("/cadastrar_impedimento")
    public String cadastrarImpedimento() {
        return "cadastrar_impedimento";
    }

    @GetMapping("/selecionar_magistrado")
    public String selecionarMagistrado() {
        return "selecionar_magistrado";
    }

}

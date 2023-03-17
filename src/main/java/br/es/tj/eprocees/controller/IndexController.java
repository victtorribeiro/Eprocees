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

    @GetMapping("/cadastrar_impedimento")
    public String cadastrarImpedimento() {
        return "cadastrar_impedimento";
    }

    @GetMapping("/selecionar_magistrado")
    public String selecionarMagistrado() {
        return "selecionar_magistrado";
    }

    @GetMapping("/editar_impedimento")
    public String editarImpedimento() {
        return "editar_impedimento";
    }

    @GetMapping("/selecionar_orgao")
    public String selecionarOrgao() {
        return "selecionar_orgao";
    }

    @GetMapping("/selecionar_magistrado_impedido")
    public String selecionarMagistradoImpedimento() {
        return "selecionar_magistrado_impedido";
    }

    @GetMapping("/selecionar_usuario")
    public String selecionarUsuario() {
        return "selecionar_usuario";
    }

}

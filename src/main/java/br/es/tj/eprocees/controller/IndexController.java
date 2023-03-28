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

    @GetMapping("/consultar_processos")
    public String consultarProcessos() {
        return "consultar_processos";
    }

    @GetMapping("/distribuir_processo")
    public String distribuirProcessos() {
        return "distribuir_processo";
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

    @GetMapping("/selecionar_advogado")
    public String selecioarAdvogado() {
        return "selecionar_advogado";
    }

    @GetMapping("/selecionar_classe")
    public String selecionarClasse() {
        return "selecionar_classe";
    }

    @GetMapping("/selecionar_processo_prevento")
    public String selecionarProcessoPrevento() {
        return "selecionar_processo_prevento";
    }

    @GetMapping("/selecionar_relaator")
    public String selecionarRelator() {
        return "selecionar_relator";
    }

    @GetMapping("/consultar_historico_distribuicao")
    public String consultarHistoricoDistribuicao() {
        return "consultar_historico_distribuicao";
    }

    @GetMapping("/cancelar_distribuicao_redistribuicao")
    public String cancelarDistribuicaoRedistribuicao() {
        return "cancelar_distribuicao_redistribuicao";
    }

    @GetMapping("/teste_modal")
    public String testemodal() {
        return "teste/teste_modal";
    }
}

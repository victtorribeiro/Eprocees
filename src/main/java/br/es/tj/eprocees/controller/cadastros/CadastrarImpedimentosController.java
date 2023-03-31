package br.es.tj.eprocees.controller.cadastros;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import br.es.tj.eprocees.model.PesquisarMagistrado;
import br.es.tj.eprocees.service.pessoa.PessoaFisicaService;

@Controller
public class CadastrarImpedimentosController {
    
    @Autowired
    public PessoaFisicaService pessoaFisicaService;

    @GetMapping("/cadastrar_impedimento")
    public String cadastrarImpedimento() {
        return "cadastrar_impedimento";
    }

    @GetMapping("/cadastrar_impedimento/pesquisar_magistrado")
    public ResponseEntity<PesquisarMagistrado> selecionarMagistrado(@RequestParam String cdMatriculaRh, @RequestParam String nmPessoa) {

        List<PesquisarMagistrado> lista = pessoaFisicaService.pesquisarMagistrado(cdMatriculaRh, nmPessoa);
        
        return new ResponseEntity<PesquisarMagistrado>(lista.get(0), HttpStatus.OK);
    }
    

}

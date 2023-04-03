package br.es.tj.eprocees.controller.consulta;

import java.util.List;

import javax.persistence.Entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.es.tj.eprocees.model.entity.retornoQueries.RetornoPesquisaRelator;
import br.es.tj.eprocees.service.pessoa.PessoaFisicaService;

@Controller
public class AuditoriaController {

    @Autowired
    public PessoaFisicaService pessoaFisicaService;

    @GetMapping("/selecionar_relator")
    public String selecionarRelator() {

        List<RetornoPesquisaRelator> retorno = pessoaFisicaService.pesquisarRelator(null, null);
        System.out.println(retorno);
        return "selecionar_relator";
    }
}

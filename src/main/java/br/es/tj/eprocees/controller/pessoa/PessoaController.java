package br.es.tj.eprocees.controller.pessoa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.es.tj.eprocees.model.entity.pessoa.Pessoa;
import br.es.tj.eprocees.service.pessoa.PessoaService;

@Controller
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @GetMapping("/")
    public String findById() {
        Pessoa pessoa = pessoaService.findById().get();
        System.out.println(pessoa.getTipoPessoa().getDsTipoPessoa());
        return "/index.html";
    }
}

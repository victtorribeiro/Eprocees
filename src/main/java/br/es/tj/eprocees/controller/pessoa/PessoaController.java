package br.es.tj.eprocees.controller.pessoa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import br.es.tj.eprocees.model.entity.menu.Orgao;
import br.es.tj.eprocees.model.entity.pessoa.Pessoa;
import br.es.tj.eprocees.service.menu.OrgaoService;
import br.es.tj.eprocees.service.pessoa.PessoaService;

@Controller
public class PessoaController {

    @Autowired
    PessoaService pessoaService;

    @Autowired
    OrgaoService orgaoService;

    @GetMapping("/")
    public String findById() {
        Orgao org = orgaoService.findById().get();
        Pessoa pessoa = pessoaService.findById().get();
        System.out.println(org.getDsOrgao());
        System.out.println(pessoa.getPessoaFisica().getCpf().getNumeroCpf());
        return "/index.html";
    }
}

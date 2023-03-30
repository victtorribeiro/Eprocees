package br.es.tj.eprocees.controller.cadastros;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.servlet.ModelAndView;

import br.es.tj.eprocees.service.pessoa.PessoaFisicaService;

@Controller
public class CadastrarImpedimentosController {
    
    @Autowired
    public PessoaFisicaService pessoaFisicaService;
    
    public class Filtros{
        public String cdMatricula;
        public String nmPessoa;
    }

    @GetMapping("/cadastrar_impedimento")
    public String cadastrarImpedimento() {
        return "cadastrar_impedimento";
    }

    @GetMapping("/cadastrar_impedimento/selecionar_impedimento")
    public ModelAndView selecionarMagistrado() {

        List<Object> lista = pessoaFisicaService.pesquisarMagistrado("20707678", null);
        // List<Object> lista = pessoaFisicaService.pesquisarMagistrado(filtros.cdMatricula, filtros.nmPessoa);
        System.out.println(lista);

        ModelAndView mv = new ModelAndView("cadastrar_impedimento");
        mv.addObject("magistrado", lista.get(0));
        
        return mv;
    }

}

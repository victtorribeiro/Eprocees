package br.es.tj.eprocees.controller.cadastros;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.es.tj.eprocees.model.entity.retornoQueries.RetornoConsultaImpedimento;
import br.es.tj.eprocees.model.entity.retornoQueries.RetornoPesquisaMagistrado;
import br.es.tj.eprocees.service.impedimento.ImpedimentoService;
import br.es.tj.eprocees.service.pessoa.PessoaFisicaService;

@Controller
public class CadastrarImpedimentosController {

    @Autowired
    public PessoaFisicaService pessoaFisicaService;

    @Autowired
    public ImpedimentoService impedimentoService;

    @GetMapping("/cadastrar_impedimento")
    public String cadastrarImpedimento() {
        return "cadastrar_impedimento";
    }

    @GetMapping("/consultar_impedimento")
    public ModelAndView consultarImpedimento(@RequestParam Integer idPessoaFisica, @RequestParam Integer cdMatriculaRh, @RequestParam String nmPessoa ) {
        
        List<RetornoConsultaImpedimento> impedimentos = this.impedimentoService.consultarImpedimento(idPessoaFisica);

        ModelAndView mv = new ModelAndView("cadastrar_impedimento");
        mv.addObject("impedimentos", impedimentos);
        mv.addObject("magistrado", new RetornoPesquisaMagistrado(cdMatriculaRh, idPessoaFisica, nmPessoa));
        return mv;
    }

    @GetMapping("/cadastrar_impedimento/pesquisar_magistrado")
    public ResponseEntity<RetornoPesquisaMagistrado> selecionarMagistrado(@RequestParam String cdMatriculaRh,
            @RequestParam String nmPessoa) {

        List<RetornoPesquisaMagistrado> lista = pessoaFisicaService.pesquisarMagistrado(cdMatriculaRh, nmPessoa);

        return new ResponseEntity<RetornoPesquisaMagistrado>(lista.get(0), HttpStatus.OK);
    }

}

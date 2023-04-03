package br.es.tj.eprocees.service.pessoa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.es.tj.eprocees.model.entity.retornoQueries.RetornoPesquisaMagistrado;
import br.es.tj.eprocees.model.entity.retornoQueries.RetornoPesquisaRelator;
import br.es.tj.eprocees.repository.pessoa.PessoaFisicaRepository;

@Service
public class PessoaFisicaService {
    @Autowired
    PessoaFisicaRepository pessoaFisicaRepository;

    public List<RetornoPesquisaMagistrado> pesquisarMagistrado(String cdMatricula, String nmPessoa) {

        List<RetornoPesquisaMagistrado> lista = this.pessoaFisicaRepository.pesquisarMagistrado(nmPessoa, cdMatricula);

        return lista;
    }

    public List<RetornoPesquisaRelator> pesquisarRelator(String cdMatricula, String nmPessoa) {

        List<RetornoPesquisaRelator> lista = this.pessoaFisicaRepository.pesquisarRelator(nmPessoa, cdMatricula, 7);

        return lista;
    }
}

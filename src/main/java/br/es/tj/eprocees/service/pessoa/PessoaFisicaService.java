package br.es.tj.eprocees.service.pessoa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.es.tj.eprocees.model.PesquisarMagistrado;
import br.es.tj.eprocees.repository.pessoa.PessoaFisicaRepository;

@Service
public class PessoaFisicaService {
    @Autowired
    PessoaFisicaRepository pessoaFisicaRepository;

    @PersistenceContext
    private EntityManager entityManager;

    public List<PesquisarMagistrado> pesquisarMagistrado(String cdMatricula, String nmPessoa){

        List<PesquisarMagistrado> lista = this.pessoaFisicaRepository.pesquisarMagistrado(nmPessoa, cdMatricula);

        return lista;
    }
}

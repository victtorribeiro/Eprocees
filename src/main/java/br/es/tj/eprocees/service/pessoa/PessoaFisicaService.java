package br.es.tj.eprocees.service.pessoa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.Tuple;

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

    public List<Object> pesquisarMagistrado(String cdMatricula, String nmPessoa){
        String filtros = "";

        // if(cdMatricula != null && cdMatricula != ""){
        //     filtros += "AND SERVIDOR.CD_MATRICULA_RH LIKE " + cdMatricula + " ";
        // }

        // if(nmPessoa != null && nmPessoa != ""){
        //     filtros += "AND PESSOA_FISICA.NM_PESSOA LIKE UPPER( " + nmPessoa + " )";
        // }

        // List<Tuple> lista = this.pessoaFisicaRepository.pesquisarMagistrado(filtros);

        // List<PesquisarMagistrado> listaMagistrado =  new ArrayList<PesquisarMagistrado>();
        // for(Tuple item : lista){
        //     PesquisarMagistrado pesquisa = new PesquisarMagistrado( item.get(0, Integer.class), item.get(1, Integer.class), item.get(0, String.class));
        //     listaMagistrado.add(pesquisa);
        // }

        String sql = "SELECT PESSOA_FISICA.ID_PESSOA_FISICA, PESSOA_FISICA.NM_PESSOA FROM PESSOA_FISICA JOIN SERVIDOR ON ( PESSOA_FISICA.ID_PESSOA_FISICA = SERVIDOR.ID_PESSOA_FISICA) JOIN FUNCAO_SERVIDOR ON ( SERVIDOR.ID_PESSOA_FISICA = FUNCAO_SERVIDOR.ID_PESSOA_FISICA) JOIN FUNCAO ON ( FUNCAO_SERVIDOR.ID_FUNCAO = FUNCAO.ID_FUNCAO) WHERE FUNCAO.ID_FUNCAO = PA_SHARED.GET_PARAMETRO('id.funcao.juiz')";

        Query query = entityManager.createNativeQuery(sql, "PesquisarMagistrado");
        
        List<PesquisarMagistrado> listaMagistrados = query.getResultList();

        System.out.println(listaMagistrados);

        return null;
    }
}

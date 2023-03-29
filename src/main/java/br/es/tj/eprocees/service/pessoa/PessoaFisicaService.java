package br.es.tj.eprocees.service.pessoa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.es.tj.eprocees.repository.pessoa.PessoaFisicaRepository;

@Service
public class PessoaFisicaService {
    @Autowired
    PessoaFisicaRepository pessoaFisicaRepository;

    public List<Object> pesquisarMagistrado(String cdMatricula, String nmPessoa){
        String filtros = "";

        if(cdMatricula != null && cdMatricula != ""){
            filtros += "SERVIDOR.CD_MATRICULA_RH LIKE " + cdMatricula + " ";
        }

        if(nmPessoa != null && nmPessoa != ""){
            filtros += "AND PESSOA_FISICA.NM_PESSOA LIKE UPPER( " + nmPessoa + " )";
        }

        return pessoaFisicaRepository.pesquisarMagistrado(filtros);
    }
}

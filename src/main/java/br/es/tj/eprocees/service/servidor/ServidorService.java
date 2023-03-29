package br.es.tj.eprocees.service.servidor;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.es.tj.eprocees.repository.servidor.ServidorRepository;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ServidorService {

    @Autowired
    private ServidorRepository servidorRepository;

    public List<Object> pesquisarMagistrado(String cdMatricula, String nmPessoa){
        String filtros = "";

        if(cdMatricula != null && cdMatricula != ""){
            filtros += "SERVIDOR.CD_MATRICULA_RH LIKE " + cdMatricula + " ";
        }

        if(nmPessoa != null && nmPessoa != ""){
            filtros += "AND PESSOA_FISICA.NM_PESSOA LIKE UPPER( " + nmPessoa + " )";
        }

        return servidorRepository.pesquisarMagistrado(nmPessoa);
    }
}

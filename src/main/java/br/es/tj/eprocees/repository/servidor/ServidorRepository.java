package br.es.tj.eprocees.repository.servidor;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import br.es.tj.eprocees.model.entity.servidor.Servidor;

public interface ServidorRepository extends JpaRepository<Servidor, Integer>{
    @Query(value = "SELECT SERVIDOR.CD_MATRICULA_RH, PESSOA_FISICA.ID_PESSOA_FISICA, PESSOA_FISICA.NM_PESSOA FROM PESSOA_FISICA JOIN SERVIDOR ON ( PESSOA_FISICA.ID_PESSOA_FISICA = SERVIDOR.ID_PESSOA_FISICA) JOIN FUNCAO_SERVIDOR ON ( SERVIDOR.ID_PESSOA_FISICA = FUNCAO_SERVIDOR.ID_PESSOA_FISICA) JOIN FUNCAO ON ( FUNCAO_SERVIDOR.ID_FUNCAO = FUNCAO.ID_FUNCAO) WHERE FUNCAO.ID_FUNCAO = PA_SHARED.GET_PARAMETRO('id.funcao.juiz') ?1", nativeQuery = true)
    public List<Object> pesquisarMagistrado(String filtros);
}

package br.es.tj.eprocees.repository.pessoa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.es.tj.eprocees.model.entity.pessoa.PessoaFisica;
import br.es.tj.eprocees.model.entity.retornoQueries.RetornoPesquisaMagistrado;
import br.es.tj.eprocees.model.entity.retornoQueries.RetornoPesquisaRelator;

@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Integer> {
    @Query(name = "PesquisarMagistrado", nativeQuery = true)
    public List<RetornoPesquisaMagistrado> pesquisarMagistrado(@Param("nmPessoa") String nmPessoa,
            @Param("cdMatriculaRh") String cdMatriculaRh);

    @Query(name = "PesquisarRelator", nativeQuery = true)
    // falta passar o parametro ORGAO_ID
    public List<RetornoPesquisaRelator> pesquisarRelator(@Param("nmPessoa") String nmPessoa,
            @Param("cdMatricula") String cdMatricula,
            @Param("P_ID_ORGAO") Integer P_ID_ORGAO);
}

package br.es.tj.eprocees.repository.pessoa;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.es.tj.eprocees.model.PesquisarMagistrado;
import br.es.tj.eprocees.model.entity.pessoa.PessoaFisica;

@Repository
public interface PessoaFisicaRepository extends JpaRepository<PessoaFisica, Integer>{
    @Query(name = "PesquisarMagistrado", nativeQuery = true)
    public List<PesquisarMagistrado> pesquisarMagistrado(@Param("nmPessoa") String nmPessoa, @Param("cdMatriculaRh") String cdMatriculaRh);
}

package br.es.tj.eprocees.repository.impedimento;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.es.tj.eprocees.model.entity.RetornoConsultaImpedimento;
import br.es.tj.eprocees.model.entity.impedimento.Impedimento;

@Repository
public interface ImpedimentoRepository extends JpaRepository<Impedimento, Integer>{
    @Query(name = "ConsultarImpedimento", nativeQuery = true)
    public List<RetornoConsultaImpedimento> consultarImpedimento(@Param("idPessoaMagistrado") Integer idPessoaMagistrado);
}
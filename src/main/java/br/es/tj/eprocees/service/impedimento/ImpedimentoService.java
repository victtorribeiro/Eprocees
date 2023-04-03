package br.es.tj.eprocees.service.impedimento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.es.tj.eprocees.model.entity.retornoQueries.RetornoConsultaImpedimento;
import br.es.tj.eprocees.repository.impedimento.ImpedimentoRepository;

@Service
public class ImpedimentoService {

    @Autowired
    private ImpedimentoRepository impedimentoRepository;

    public List<RetornoConsultaImpedimento> consultarImpedimento (Integer idPessoaMagistrado){
        
        List<RetornoConsultaImpedimento> impedimentos = this.impedimentoRepository.consultarImpedimento(idPessoaMagistrado);
        
        return impedimentos;
    }

}

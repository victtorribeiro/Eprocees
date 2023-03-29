package br.es.tj.eprocees.service.pessoa;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.es.tj.eprocees.model.entity.pessoa.Pessoa;
import br.es.tj.eprocees.repository.pessoa.PessoaRepository;

@Service
public class PessoaService {

    @Autowired
    PessoaRepository pessoaRepository;

    public Optional<Pessoa> findById() {

        return pessoaRepository.findById(667262);
    }

}

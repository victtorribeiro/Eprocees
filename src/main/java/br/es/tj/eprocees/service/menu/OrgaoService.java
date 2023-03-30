package br.es.tj.eprocees.service.menu;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.es.tj.eprocees.model.entity.menu.Orgao;
import br.es.tj.eprocees.repository.menu.OrgaoRepository;

@Service
public class OrgaoService {

    @Autowired
    OrgaoRepository orgaoRepository;

    public Optional<Orgao> findById() {
        Integer id = 177;
        return orgaoRepository.findById(id);
    }
}

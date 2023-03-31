package br.es.tj.eprocees.repository.menu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.es.tj.eprocees.model.entity.menu.Orgao;

@Repository
public interface OrgaoRepository extends JpaRepository<Orgao, Integer> {

}

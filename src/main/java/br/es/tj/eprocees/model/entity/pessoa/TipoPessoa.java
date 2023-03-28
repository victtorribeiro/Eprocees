package br.es.tj.eprocees.model.entity.pessoa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class TipoPessoa {

    @Id
    @Column(name = "ID_TIPO_PESSOA")
    private Integer id;

    @Column(name = "DS_TIPO_PESSOA")
    private String dsTipoPessoa;
}

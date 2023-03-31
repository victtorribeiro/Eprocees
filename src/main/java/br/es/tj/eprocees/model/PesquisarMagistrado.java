package br.es.tj.eprocees.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class PesquisarMagistrado {

    private Long CD_MATRICULA_RH;

    private Long ID_PESSOA_FISICA;

    private String NM_PESSOA;
}

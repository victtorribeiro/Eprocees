package br.es.tj.eprocees.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RetornoConsultaImpedimento {
    
    private Integer ID_IMPEDIMENTO;

    private Integer ID_PESSOA_MAGISTRADO;

    private Integer ID_PESSOA_IMPEDIDO;

    private String DM_MOTIVO_IMPEDIMENTO;

    private String TX_MOTIVO_IMPEDIMENTO;

    private String DM_TIPO_PESSOA;

    private String NOME;

    private Integer CD_MATRICULA_RH;
}

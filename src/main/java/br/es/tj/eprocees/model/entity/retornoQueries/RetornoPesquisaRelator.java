package br.es.tj.eprocees.model.entity.retornoQueries;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RetornoPesquisaRelator {

    private Integer idPessoaFisica;

    private Integer cdMatricula;

    private String nmPessoa;

    private String dsFuncao;

}

package br.es.tj.eprocees.model.entity.impedimento;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import br.es.tj.eprocees.model.entity.retornoQueries.RetornoConsultaImpedimento;
import lombok.Data;

//consultar Impedimentos
@SqlResultSetMapping(name = "RetornoConsultaImpedimento", 
                    classes = { 
                        @ConstructorResult(targetClass = RetornoConsultaImpedimento.class, 
                        columns = { 
                            @ColumnResult(name = "ID_IMPEDIMENTO", type = Integer.class), 
                            @ColumnResult(name = "ID_PESSOA_MAGISTRADO", type = Integer.class), 
                            @ColumnResult(name = "ID_PESSOA_IMPEDIDO", type = Integer.class), 
                            @ColumnResult(name = "DM_MOTIVO_IMPEDIMENTO", type = String.class),
                            @ColumnResult(name = "TX_MOTIVO_IMPEDIMENTO", type = String.class),
                            @ColumnResult(name = "DM_TIPO_PESSOA", type = String.class),
                            @ColumnResult(name = "NOME", type = String.class),
                            @ColumnResult(name = "CD_MATRICULA_RH", type = Integer.class), 
                            @ColumnResult(name = "DS_TIPO_PESSOA", type = String.class),
                            @ColumnResult(name = "DS_MOTIVO", type = String.class),
                            @ColumnResult(name = "NM_MAGISTRADO", type = String.class)
                        })
                    })
@NamedNativeQuery(name = "ConsultarImpedimento", query = "SELECT IMPEDIMENTO.ID_IMPEDIMENTO, IMPEDIMENTO.ID_PESSOA_MAGISTRADO, IMPEDIMENTO.ID_PESSOA_IMPEDIDO, IMPEDIMENTO.DM_MOTIVO_IMPEDIMENTO, IMPEDIMENTO.TX_MOTIVO_IMPEDIMENTO, IMPEDIMENTO.DM_TIPO_PESSOA, NVL(PESSOA_FISICA.NM_PESSOA, PESSOA_JURIDICA.DS_NOME_FANTASIA) AS NOME, SERVIDOR.CD_MATRICULA_RH, DOMINIO_TIPO_PESSOA.DS_DOMINIO AS DS_TIPO_PESSOA, DOMINIO_MOTIVO.DS_DOMINIO AS DS_MOTIVO, MAGISTRADO.NM_PESSOA AS NM_MAGISTRADO FROM IMPEDIMENTO LEFT JOIN PESSOA_FISICA ON(IMPEDIMENTO.ID_PESSOA_IMPEDIDO = PESSOA_FISICA.ID_PESSOA_FISICA) LEFT JOIN PESSOA_JURIDICA ON(IMPEDIMENTO.ID_PESSOA_IMPEDIDO = PESSOA_JURIDICA.ID_PESSOA_JURIDICA) LEFT JOIN DOMINIO DOMINIO_TIPO_PESSOA ON(IMPEDIMENTO.DM_TIPO_PESSOA = DOMINIO_TIPO_PESSOA.CD_DOMINIO AND DOMINIO_TIPO_PESSOA.NM_DOMINIO = 'DM_TIPO_PESSOA') INNER JOIN DOMINIO DOMINIO_MOTIVO ON(IMPEDIMENTO.DM_MOTIVO_IMPEDIMENTO = DOMINIO_MOTIVO.CD_DOMINIO AND DOMINIO_MOTIVO.NM_DOMINIO = 'DM_MOTIVO_IMPEDIMENTO') INNER JOIN PESSOA_FISICA MAGISTRADO ON(IMPEDIMENTO.ID_PESSOA_MAGISTRADO = MAGISTRADO.ID_PESSOA_FISICA) LEFT JOIN SERVIDOR ON(IMPEDIMENTO.ID_PESSOA_IMPEDIDO = SERVIDOR.ID_PESSOA_FISICA) WHERE IMPEDIMENTO.ID_PESSOA_MAGISTRADO = :idPessoaMagistrado AND IMPEDIMENTO.ID_USUARIO_EXCLUSAO IS NULL AND IMPEDIMENTO.DT_USUARIO_EXCLUSAO IS NULL ", resultSetMapping = "RetornoConsultaImpedimento")


@Entity
@Data
@Table(name = "IMPEDIMENTO")
public class Impedimento {

    @Id
    @Column(name = "ID_IMPEDIMENTO")
    private Integer idImpedimento;

    @Column(name = "ID_PESSSOA_MAGISTRADO")
    private Integer idPessoaMagistrado;

    @Column(name = "ID_PESSOA_IMPEDIDO")
    private Integer idPessoaImpedimento;

    @Column(name = "DM_MOTIVO_IMPEDIMENTO")
    private String dmMotivoImpedimento;

    @Column(name = "TX_MOTIVO_IMPEDIMENTO")
    private String txMotivoImpedimento;

    @Column(name = "ID_USUARIO_CRIACAO")
    private Integer idUsusarioCriacao;

    @Column(name = "DT_USUARIO_CRIACAO")
    private LocalDate dtUsuarioCriacao;

    @Column(name = "ID_USUARIO_ALTERACAO")
    private Integer idUsuarioAlteracao;

    @Column(name = "DT_USUARIO_ALTERACAO")
    private LocalDate dtUsuarioAlteracao;

    @Column(name = "ID_USUARIO_EXCLUSAO")
    private Integer idUsuarioExclusao;

    @Column(name = "DT_USUARIO_EXCLUSAO")
    private LocalDate dtUsusarioExclusao;
}

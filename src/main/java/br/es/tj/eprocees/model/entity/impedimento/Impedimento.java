package br.es.tj.eprocees.model.entity.impedimento;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.Entity;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import lombok.Data;

//consultar Impedimentos
@SqlResultSetMapping(name = "RetornoConsultaImpedimento", classes = { @ConstructorResult(targetClass = PesquisarMagistrado.class, columns = { @ColumnResult(name = "CD_MATRICULA_RH", type = Integer.class), @ColumnResult(name = "ID_PESSOA_FISICA", type = Integer.class), @ColumnResult(name = "NM_PESSOA")})})
@NamedNativeQuery(name = "PesquisarMagistrado", query = "SELECT SERVIDOR.CD_MATRICULA_RH, PESSOA_FISICA.ID_PESSOA_FISICA, PESSOA_FISICA.NM_PESSOA FROM PESSOA_FISICA JOIN SERVIDOR ON ( PESSOA_FISICA.ID_PESSOA_FISICA = SERVIDOR.ID_PESSOA_FISICA) JOIN FUNCAO_SERVIDOR ON ( SERVIDOR.ID_PESSOA_FISICA = FUNCAO_SERVIDOR.ID_PESSOA_FISICA) JOIN FUNCAO ON ( FUNCAO_SERVIDOR.ID_FUNCAO = FUNCAO.ID_FUNCAO) WHERE FUNCAO.ID_FUNCAO = PA_SHARED.GET_PARAMETRO('id.funcao.juiz')  AND ( :nmPessoa IS NULL OR PESSOA_FISICA.NM_PESSOA LIKE UPPER( :nmPessoa ) )  AND ( :cdMatriculaRh IS NULL OR SERVIDOR.CD_MATRICULA_RH LIKE :cdMatriculaRh ) ", resultSetMapping = "PesquisarMagistradoResult")


@Entity
@Data
@Table(name = "IMPEDIMENTO")
public class Impedimento {

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

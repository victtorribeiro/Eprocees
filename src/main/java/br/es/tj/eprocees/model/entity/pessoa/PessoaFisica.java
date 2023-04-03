package br.es.tj.eprocees.model.entity.pessoa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.NamedNativeQuery;
import javax.persistence.OneToOne;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import br.es.tj.eprocees.model.entity.retornoQueries.RetornoPesquisaMagistrado;
import br.es.tj.eprocees.model.entity.retornoQueries.RetornoPesquisaRelator;
import lombok.Data;

//Pesquisa de Magistrados
@SqlResultSetMapping(name = "PesquisarMagistradoResult", classes = {
                @ConstructorResult(targetClass = RetornoPesquisaMagistrado.class, columns = {
                                @ColumnResult(name = "CD_MATRICULA_RH", type = Integer.class),
                                @ColumnResult(name = "ID_PESSOA_FISICA", type = Integer.class),
                                @ColumnResult(name = "NM_PESSOA") }) })
@NamedNativeQuery(name = "PesquisarMagistrado", query = "SELECT SERVIDOR.CD_MATRICULA_RH, PESSOA_FISICA.ID_PESSOA_FISICA, PESSOA_FISICA.NM_PESSOA FROM PESSOA_FISICA JOIN SERVIDOR ON ( PESSOA_FISICA.ID_PESSOA_FISICA = SERVIDOR.ID_PESSOA_FISICA) JOIN FUNCAO_SERVIDOR ON ( SERVIDOR.ID_PESSOA_FISICA = FUNCAO_SERVIDOR.ID_PESSOA_FISICA) JOIN FUNCAO ON ( FUNCAO_SERVIDOR.ID_FUNCAO = FUNCAO.ID_FUNCAO) WHERE FUNCAO.ID_FUNCAO = PA_SHARED.GET_PARAMETRO('id.funcao.juiz')  AND ( :nmPessoa IS NULL OR PESSOA_FISICA.NM_PESSOA LIKE UPPER( :nmPessoa ) )  AND ( :cdMatriculaRh IS NULL OR SERVIDOR.CD_MATRICULA_RH LIKE :cdMatriculaRh ) ", resultSetMapping = "PesquisarMagistradoResult")

@SqlResultSetMapping(name = "PesquisarRelatorResult", classes = {
                @ConstructorResult(targetClass = RetornoPesquisaRelator.class, columns = {
                                @ColumnResult(name = "ID_PESSOA_FISICA", type = Integer.class),
                                @ColumnResult(name = "CD_MATRICULA_RH", type = Integer.class),
                                @ColumnResult(name = "NM_PESSOA_RELATOR", type = String.class),
                                @ColumnResult(name = "DS_FUNCAO", type = String.class)
                })
})
@NamedNativeQuery(name = "PesquisarRelator", query = "SELECT PESSOA_FISICA.ID_PESSOA_FISICA, SERVIDOR.CD_MATRICULA_RH, PESSOA_FISICA.NM_PESSOA AS NM_PESSOA_RELATOR, FUNCAO.DS_FUNCAO FROM PESSOA_FISICA JOIN SERVIDOR ON ( SERVIDOR.ID_PESSOA_FISICA = PESSOA_FISICA.ID_PESSOA_FISICA ) JOIN FUNCAO_SERVIDOR ON ( PESSOA_FISICA.ID_PESSOA_FISICA = FUNCAO_SERVIDOR.ID_PESSOA_FISICA ) JOIN FUNCAO ON ( FUNCAO_SERVIDOR.ID_FUNCAO = FUNCAO.ID_FUNCAO ) WHERE FUNCAO.ID_FUNCAO = PA_SHARED.GET_PARAMETRO ('id.funcao.juiz') AND ( :nmPessoa IS NULL OR NM_PESSOA LIKE UPPER ( :nmPessoa ) ) AND ( :cdMatricula IS NULL OR CD_MATRICULA_RH = :cdMatricula ) AND ( ( PA_SHARED.GET_TIPO_ORGAO_PAI ( :P_ID_ORGAO ) = PA_SHARED.GET_PARAMETRO ('tipo.orgao.tribunal.justica' ) AND FUNCAO_SERVIDOR.DM_TIPO_MAGISTRADO IN ( (SELECT PA_SHARED.GET_PARAMETRO ( 'dm.tipo.magistrado.desemb' ) FROM DUAL), (SELECT PA_SHARED.GET_PARAMETRO ( 'dm.tipo.magistrado.desemb.presidente' ) FROM DUAL), (SELECT PA_SHARED.GET_PARAMETRO ( 'dm.tipo.magistrado.desemb.vice' ) FROM DUAL), (SELECT PA_SHARED.GET_PARAMETRO ( 'dm.tipo.magistrado.desemb.corregedor' ) FROM DUAL) ) ) OR ( PA_SHARED.GET_TIPO_ORGAO_PAI ( :P_ID_ORGAO ) <> (SELECT PA_SHARED.GET_PARAMETRO ( 'tipo.orgao.tribunal.justica' ) FROM DUAL) AND FUNCAO_SERVIDOR.DM_TIPO_MAGISTRADO = (SELECT PA_SHARED.GET_PARAMETRO ( 'dm.tipo.magistrado.juiz' ) FROM DUAL) ) )", resultSetMapping = "PesquisarRelatorResult")

@Entity
@Data
@Table(name = "PESSOA_FISICA")
public class PessoaFisica {

        @Id
        @Column(name = "ID_PESSOA_FISICA")
        private Integer id;

        @MapsId
        @OneToOne
        @JoinColumn(name = "ID_PESSOA_FISICA")
        private Pessoa pessoa;

        @OneToOne(mappedBy = "idPessoaFisica")
        private Cpf cpf;

        @Column(name = "NM_PESSOA")
        private String nomePessoa;

        @Column(name = "DT_NASC_PESSOA")
        private Date dataNascimentoPessoa;

        @Column(name = "DM_SEXO_PESSOA")
        private String dmSexoPessoa;

        @Column(name = "DM_ESTADO_CIVIL")
        private String dmEstadoCivil;

        @Column(name = "ID_CIDADE_NASCIMENTO")
        private Integer idCidadeNascimento;

        @Column(name = "ID_NACIONALIDADE")
        private Integer idNacionalidade;

        @Column(name = "NM_PAI_PESSOA")
        private String nmPaiPessoa;

        @Column(name = "NM_MAE_PESSOA")
        private String nmMaePessoa;

        @Column(name = "DM_DEFICIENTE_FISICO")
        private String dmDeficienteFisico;

        @Column(name = "ID_USUARIO_CRIACAO")
        private Integer idUsuarioCriacao;

        @Column(name = "DT_USUARIO_CRIACAO")
        private Date dataUsuarioCriacao;

        @Column(name = "ID_USUARIO_ALTERACAO")
        private Integer idUsuarioAlteracao;

        @Column(name = "DT_USUARIO_ALTERACAO")
        private Date dataUsuarioAlteracao;

        @Column(name = "ID_USUARIO_EXCLUSAO")
        private Integer idUsuarioExclusao;

        @Column(name = "DT_USUARIO_EXCLUSAO")
        private Date dataUsuariExcusao;

        @Column(name = "DM_GRAU_INSTRUCAO")
        private String dmGrauInstrucao;

        @Column(name = "FONEMA_NM_PESSOA")
        private String FonemaNomePessoa;

}

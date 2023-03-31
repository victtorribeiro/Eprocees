package br.es.tj.eprocees.model.entity.menu;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name   = "ORGAO", schema="MENU")
public class Orgao {

    @Id
    @Column(name = "ID_ORGAO")
    private Integer id;

    @Column(name = "ID_ORGAO_PAI")
    private Integer idOrgaoPai;

    @Column(name = "DS_ORGAO")
    private String dsOrgao;

    @Column(name = "DS_EMAIL")
    private String dsEmail;

    @Column(name = "CD_COMARCA")
    private Integer cdComarca;

    @Column(name = "DT_DESATIVACAO")
    private Date dtDesativacao;

    @Column(name = "NO_TELEFONE_ORGAO")
    private String noTelefoneOrgao;

    @Column(name = "ID_TIPO_ORGAO")
    private Integer idTipoOrgao;

    @Column(name = "NO_CEP")
    private String noCep;

    @Column(name = "DS_UF")
    private String dsUF;

    @Column(name = "DS_MUNICIPIO")
    private String dsMunicipio;

    @Column(name = "DS_BAIRRO")
    private String dsBairro;

    @Column(name = "DS_LOGRADOURO")
    private String dsLogradouro;

    @Column(name = "NO_LOGRADOURO")
    private Integer noLogradouro;

    @Column(name = "DS_COMPLEMENTO")
    private String dsComplemento;

    @Column(name = "HR_DURACAO_AUDIENCIA")
    private Integer hrDuracaoAudiencia;

    @Column(name = "QT_AUDIENCIA")
    private Integer qtAudiencia;

    @Column(name = "QT_AGENDA")
    private Integer qtAgenda;

    @Column(name = "ID_USUARIO_CRIACAO")
    private Integer idUsuarioCriacao;

    @Column(name = "DT_USUARIO_CRIACAO")
    private Date dtUsuarioCriacao;

    @Column(name = "ID_USUARIO_ALTERACAO")
    private Integer idUsuarioAlteracao;

    @Column(name = "DT_USUARIO_ALTERACAO")
    private Date dtUsuarioAlteracao;

    @Column(name = "ID_USUARIO_EXCLUSAO")
    private Integer idUsuarioExclusao;

    @Column(name = "DT_USUARIO_EXCLUSAO")
    private Date dtUsuarioExclusao;

    @Column(name = "NO_SEQUENCIAL")
    private Integer noSequencial;

    @Column(name = "NR_DIAS_AGENDAMENTO")
    private Integer nrDiasAgendamento;

    @Column(name = "CD_ORGAO")
    private Integer cdOrgao;

    @Column(name = "DS_RESUMO_ORGAO")
    private String dsResumoOrgao;

    @Column(name = "IS_ATIVO_EPROCEES")
    private String isAtivoEprocees;
}

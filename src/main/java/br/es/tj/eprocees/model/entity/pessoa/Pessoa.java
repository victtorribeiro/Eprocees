package br.es.tj.eprocees.model.entity.pessoa;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;

import lombok.Data;

@Entity
@Data
public class Pessoa {
    @Id
    @Column(name = "ID_PESSOA")
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "pessoa")
    @PrimaryKeyJoinColumn
    private PessoaJuridica pessoaJuridica;

    @ManyToOne
    @JoinColumn(name = "ID_TIPO_PESSOA")
    private TipoPessoa tipoPessoa;

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
    private Integer dataUsuarioExclusao;

    @Column(name = "CD_PESSOA")
    private String cdPessoa;

    @Column(name = "CD_MIGRA_PROJUDI")
    private Integer cdMigraProjudi;

    @Column(name = "ID_VARA_MIGRA_HOM")
    private Integer idVaraMigraHom;
}
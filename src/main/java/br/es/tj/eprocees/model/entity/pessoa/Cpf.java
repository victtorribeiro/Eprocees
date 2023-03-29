package br.es.tj.eprocees.model.entity.pessoa;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.Data;

@Entity
@Data
public class Cpf {

    @Id
    @Column(name = "ID_CPF")
    private Integer id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_PESSOA_FISICA", referencedColumnName = "ID_PESSOA_FISICA")
    private PessoaFisica idPessoaFisica;

    @Column(name = "NO_CPF")
    private String numeroCpf;

    @Column(name = "DT_EMISSAO_CPF")
    private Date dataEmissaoCpf;

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
    private Date dataUsuarioExclusao;
}

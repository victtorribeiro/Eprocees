package br.es.tj.eprocees.model.entity.pessoa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "PESSOA_JURIDICA")
public class PessoaJuridica {

    @Id
    @Column(name = "ID_PESSOA_JURIDICA")
    private Integer id;

    @MapsId
    @OneToOne
    @JoinColumn(name = "ID_PESSOA_JURIDICA")
    private Pessoa pessoa;

    @Column(name = "NR_CNPJ")
    private String numeroCnpj;

    @Column(name = "DS_NOME_FANTASIA")
    private String dsNomeFantasia;

    @Column(name = "DS_RAZAO_SOCIAL")
    private String dsRazaoSocial;

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

    @Column(name = "ID_NATUREZA_JURIDICA")
    private Integer idNaturezaJuridica;

    @Column(name = "ID_TIPO_ENTIDADE")
    private Integer idTipoEntidade;

    @Column(name = "DM_TIPO_EMPRESA")
    private String dmTipoEmpresa;

    @Column(name = "FONEMA_RAZAO_SOCIAL")
    private String fonemaRazaoSocial;

    @Column(name = "FONEMA_NOME_FANTASIA")
    private String fonemaNomeFantasia;
}

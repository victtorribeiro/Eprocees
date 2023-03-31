package br.es.tj.eprocees.model.entity.usuario;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Usuario {

    @Id
    @Column(name = "ID_USUARIO")
    private Integer id;

    @Column(name = "DS_USERNAME")
    private String dsUsername;

    @Column(name = "DS_EMAIL")
    private String dsEmail;

    @Column(name = "ID_PESSOA")
    private Integer idPessoa;

    @Column(name = "ID_ORGAO_DEFAULT")
    private Integer idOrgaoDefault;

    @Column(name = "DM_AMBIENTE_DEFAULT")
    private String dmAmbienteDefault;

    @Column(name = "DM_ORIGEM_USUARIO")
    private String dmOrigemUsuario;

    @Column(name = "DM_TIPO_USUARIO")
    private String dmTipoUsuario;

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

    @Column(name = "DM_MAGISTRADO_GABINETE")
    private String dmMagistradoGabinete;

    @Column(name = "NM_PESSOA")
    private String nmPessoa;

    @Column(name = "ID_SISTEMA")
    private Integer idSistema;

}

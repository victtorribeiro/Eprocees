package br.es.tj.eprocees.model.entity.servidor;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class FuncaoServidor {

    @Id
    @Column(name = "ID_SERVIDOR_FUNCAO")
    private Integer id;

    @Column(name = "ID_PESSOA_FISICA")
    private Integer idPessoaFisica;

    @Column(name = "ID_FUNCAO")
    private Integer idFuncao;

    @Column(name = "DT_INICIO_FUNCAO")
    private Date dtInicioFuncao;

    @Column(name = "DT_FIM_FUNCAO")
    private Date dtFimFuncao;

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
}

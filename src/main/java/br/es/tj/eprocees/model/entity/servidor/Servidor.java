package br.es.tj.eprocees.model.entity.servidor;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import br.es.tj.eprocees.model.entity.pessoa.PessoaFisica;
import lombok.Data;

@Entity
@Data
@Table(name = "SERVIDOR")
public class Servidor {
    @Id
    @Column(name = "ID_PESSOA_JURIDICA")
    private Integer id;

    @MapsId
    @OneToOne
    @JoinColumn(name = "ID_PESSOA_JURIDICA")
    private PessoaFisica pessoa;

    @Column(name = "CD_MATRICULA_RH")
    private Integer cdMatriculaRh;

    @Column(name = "DT_POSSE")
    private LocalDate dtPosse;

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

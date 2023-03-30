package br.es.tj.eprocees.model.entity.pessoa;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import br.es.tj.eprocees.model.PesquisarMagistrado;
import lombok.Data;

@SqlResultSetMapping(name = "PesquisarMagistrado", classes = @ConstructorResult(targetClass = PesquisarMagistrado.class, columns = { @ColumnResult(name = "ID_PESSOA_FISICA"), @ColumnResult(name = "NM_PESSOA")}))

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

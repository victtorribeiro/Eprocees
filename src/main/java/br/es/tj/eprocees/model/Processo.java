package br.es.tj.eprocees.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Processo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_PROCESSO")
    private Integer id;

    @Column(name = "ID_PETICAO")
    private Integer idPeticao;

    @Column(name = "ID_MATERIA")
    private Integer idMateria;

    @Column(name = "ID_ESPECIALIDADE")
    private Integer idEspecialidade;

    @Column(name = "ID_CLASSE")
    private Integer idClasse;

    @Column(name = "DT_FATO")
    private Date dtFato;

    @Column(name = "DS_CIDADE_FATO")
    private String dsCidadeFato;

    @Column(name = "ID_UF_FATO")
    private Integer idUFFato;

    @Column(name = "DS_LOCAL_FATO")
    private String dsLocalFato;

    @Column(name = "DS_PEDIDO")
    private String dsPedido;

    @Column(name = "VL_CAUSA")
    private Integer vlCausa;

    @Column(name = "DS_VL_CAUSA_EXTENSO")
    private String dsVLCausaExtenso;

    @Column(name = "NR_PROCESSO")
    private String nrProcesso;

    @Column(name = "DM_SEGREDO_JUSTIÇA")
    private String dmSegredoJustica;

    @Column(name = "DT_AJUIZAMENTO")
    private Date dtAjuizamento;

    @Column(name = "DM_STATUS_PROCESSO")
    private String dmStatusProcesso;

    @Column(name = "ID_ASSUNTO")
    private Integer idAssunto;

    @Column(name = "ID_COMARCA")
    private Integer idComarca;

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

    @Column(name = "DM_IDOSO")
    private String dmIdoso;

    @Column(name = "DM_LIMINAR")
    private String dmLiminar;

    @Column(name = "DM_PORTADOR")
    private String dmPortador;

    @Column(name = "DM_EXCEDE_LIMITE")
    private String dmExcedeLimite;

    @Column(name = "DT_PRAZO")
    private Date dtPrazo;

    @Column(name = "DM_PRAZO")
    private String dmPrazo;

    @Column(name = "ID_ESCANINHO")
    private Integer idEscaninho;

    @Column(name = "DS_FATO")
    private String dsFato;

    @Column(name = "NR_PROCESSO_ANTIGO")
    private Integer nrProcessoAntigo;

    @Column(name = "DS_ORIGEM_PRECAT")
    private String dsOrigemPrecat;

    @Column(name = "DS_JUIZ_DEPCT_PRECAT")
    private String dsJuizDepctPrecat;

    @Column(name = "ID_UF_ORIGEM")
    private Integer idUFOrigem;

    @Column(name = "NR_PROCESSO_ORIGEM")
    private String nrProcessoOrigem;

    @Column(name = "ID_VARA")
    private Integer idVara;

    @Column(name = "DM_ANDAMENTO_PROCESSO")
    private String dmAndamentoProcesso;

    @Column(name = "DM_ANDAMENTO_INTIMACAO")
    private String dmAndamentoIntimacao;

    @Column(name = "ID_PESSOA_FISICA_RELATOR")
    private Integer idPessoaFisicaRelator;

    @Column(name = "TX_RELATORIO")
    private String txRelatorio;

    @Column(name = "ID_PESSOA_FISICA_RELAT_SUB")
    private Integer idPessoaFisicaRelatSub;

    @Column(name = "ID_PESSOA_FISICA_REV")
    private Integer idPessoaFisicaRev;

    @Column(name = "ID_PESSOA_FISICA_REV_SUB")
    private Integer idPessoaFisicaRevSub;

    @Column(name = "NR_PROCESSO_EJUD")
    private String nrProcessoEjud;

    @Column(name = "NR_PROTOCOLO")
    private Integer nrProtocolo;

    @Column(name = "ID_COMARCA_ORIGEM")
    private Integer idComarcaOrigem;

    @Column(name = "CD_CATCLA")
    private Integer cdCATCLA;

    @Column(name = "ID_PROCESSO_PAI")
    private Integer idProcessoPai;

    @Column(name = "DT_MUDANCA_AMBIENTE")
    private Date dtMudancaAmbiente;

    @Column(name = "DM_AMBIENTE_ESCANINHO")
    private String dmAmbienteEscaninho;

    @Column(name = "DM_PIS_COFINS")
    private String dmPisCofins;

    @Column(name = "ID_SISTEMA")
    private Integer idSistema;

    @Column(name = "NR_PROCESSO_EPROCEES")
    private String nrProcessoEprocees;

    @Column(name = "CD_MIGRA_PROJUDI")
    private Integer cdMigraProjudi;

    @Column(name = "COD_RECURSO")
    private Integer codRecurso;

    @Column(name = "ID_VARA_MIGRA_HOM")
    private Integer idVaraMigraHom;

    @Column(name = "IS_MIGRADO")
    private String isMigrado;
}

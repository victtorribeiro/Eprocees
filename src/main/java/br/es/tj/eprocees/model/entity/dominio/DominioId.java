package br.es.tj.eprocees.model.entity.dominio;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class DominioId implements Serializable{

    @Column(name = "NM_DOMINIO")
    private String nmDominio;

    @Column(name = "CD_DOMINIO")
    private String cdDominio;
}

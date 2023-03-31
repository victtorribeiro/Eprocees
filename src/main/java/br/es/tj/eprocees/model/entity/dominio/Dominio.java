package br.es.tj.eprocees.model.entity.dominio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Data
@Table(name = "DOMINIO")
public class Dominio {

    @Column(name = "NM_DOMINIO")
    private String nmDominio;

    @Column(name = "CD_DOMINIO")
    private String cdDominio;

    @Column(name = "DS_DOMINIO")
    private String dsDominio;
    
}

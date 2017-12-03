/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Hiroshi
 */
@Entity
@Table(name="banner")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name="Banner.findAll", query="SELECT b FROM Banner b"),
    @NamedQuery(name="Banner.findPromocoesAtivas", query="SELECT b FROM Banner b WHERE b.ativo = TRUE"),
    @NamedQuery(name="Banner.findByDescricao", query="SELECT b FROM Banner b WHERE UPPER(FUNCTION('TRANSLATE', b.descricao, 'ÁÀÃÂÄáàãâäÍÌÏíìïÚÙÜúùüÉÈÊËéèêëÓÒÕÔÖóòõôöÇç', 'AAAAAaaaaaIIIiiiUUUuuuEEEEeeeeOOOOOoooooCc')) LIKE :descricao")
})
public class Banner implements Serializable{
    private static long serialVersionUID = 1L;
    @SequenceGenerator(name="banner_idbanner_seq", sequenceName="banner_idbanner_seq", allocationSize=1)
    @Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="banner_idbanner_seq")
    @Basic(optional=false)
    @NotNull
    @Column(name="idbanner")
    private Integer idbanner;
    @NotNull
    @Column(name="descricao")
    private String descricao;
    @Column(name="nomeimagem")
    private String nomeimagem;
    @Column(name="ativo")
    private boolean ativo;

    public Integer getIdbanner() {
        return idbanner;
    }

    public void setIdbanner(Integer idbanner) {
        this.idbanner = idbanner;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeimagem() {
        return nomeimagem;
    }

    public void setNomeimagem(String nomeimagem) {
        this.nomeimagem = nomeimagem;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
}

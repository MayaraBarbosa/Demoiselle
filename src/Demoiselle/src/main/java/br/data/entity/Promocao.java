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
@Table(name="promocao")
@XmlRootElement
@NamedQueries({
    
    @NamedQuery(name="Promocao.findAll", query="SELECT p FROM Promocao p"),
    @NamedQuery(name="Promocao.findByDescricao", query="SELECT p FROM Promocao p WHERE UPPER(FUNCTION('TRANSLATE', p.descricao, 'ÁÀÃÂÄáàãâäÍÌÏíìïÚÙÜúùüÉÈÊËéèêëÓÒÕÔÖóòõôöÇç', 'AAAAAaaaaaIIIiiiUUUuuuEEEEeeeeOOOOOoooooCc')) LIKE :descricao")
})
public class Promocao implements Serializable{
    private static long serialVersionUID = 1L;
    @SequenceGenerator(name="promocao_idpromocao_seq", sequenceName="promocao_idpromocao_seq", allocationSize=1)
    @Id @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="promocao_idpromocao_seq")
    @Basic(optional=false)
    @NotNull
    @Column(name="idpromocao")
    private Integer idpromocao;
    @NotNull
    @Column(name="descricao")
    private String descricao;
    @Column(name="nomeimagem")
    private String nomeimagem;
    @Column(name="ativo")
    private boolean ativo;
    
    public Integer getIdpromocao() {
        return idpromocao;
    }

    public void setIdpromocao(Integer idpromocao) {
        this.idpromocao = idpromocao;
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

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
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lucas Agustini
 */
@Entity
@Table(name = "passagem")
@XmlRootElement
//@NamedQueries({
//    @NamedQuery(name = "Passagem.findAll", query = "SELECT p FROM Passagem p")
//    , @NamedQuery(name = "Passagem.findByIdpassagem", query = "SELECT p FROM Passagem p WHERE p.idpassagem = :idpassagem")
//    , @NamedQuery(name = "Passagem.findByQtdepassageiros", query = "SELECT p FROM Passagem p WHERE p.qtdepassageiros = :qtdepassageiros")})
public class Passagem implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idpassagem")
    private Integer idpassagem;
    
    @Column(name = "qtdepassageiros")
    private Integer qtdepassageiros;
    
    @Column(name = "idvoo")
    private Integer idvoo;
    

    public Passagem() {
    }

    public Passagem(Integer idpassagem) {
        this.idpassagem = idpassagem;
    }

    public Integer getIdpassagem() {
        return idpassagem;
    }

    public void setIdpassagem(Integer idpassagem) {
        this.idpassagem = idpassagem;
    }

    public Integer getQtdepassageiros() {
        return qtdepassageiros;
    }

    public void setQtdepassageiros(Integer qtdepassageiros) {
        this.qtdepassageiros = qtdepassageiros;
    }

    public Integer getIdvoo() {
        return idvoo;
    }

    public void setIdvoo(Integer idvoo) {
        this.idvoo = idvoo;
    }
    
    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idpassagem != null ? idpassagem.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Passagem)) {
            return false;
        }
        Passagem other = (Passagem) object;
        if ((this.idpassagem == null && other.idpassagem != null) || (this.idpassagem != null && !this.idpassagem.equals(other.idpassagem))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.data.entity.Passagem[ idpassagem=" + idpassagem + " ]";
    }

   
    
}

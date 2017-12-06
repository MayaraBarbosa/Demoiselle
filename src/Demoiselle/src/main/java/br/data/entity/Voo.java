/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Lucas Agustini
 */
@Entity
@Table(name = "voo")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Voo.findAll", query = "SELECT v FROM Voo v")
    , @NamedQuery(name = "Voo.findByIdvoo", query = "SELECT v FROM Voo v WHERE v.idvoo = :idvoo")
    , @NamedQuery(name = "Voo.findByObservacao", query = "SELECT v FROM Voo v WHERE v.observacao = :observacao")
    , @NamedQuery(name = "Voo.findByDatahoraembarque", query = "SELECT v FROM Voo v WHERE v.datahoraembarque = :datahoraembarque")})
public class Voo implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idvoo")
    private Integer idvoo;
    @Size(max = 200)
    @Column(name = "observacao")
    private String observacao;
    @Column(name = "datahoraembarque")
    @Temporal(TemporalType.DATE)
    private Date datahoraembarque;

    //@JoinColumn( name="idaeronave", foreignKey = @ForeignKey(name = "ida")
    @Column(name = "idaeronave")
    private int idaeronave;
    @Column(name = "idpassagem")
    private Integer idpassagem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idrota")
    private int idrota;
    
    public Voo() {
    }

    public Voo(Integer idvoo) {
        this.idvoo = idvoo;
    }

    public Integer getIdvoo() {
        return idvoo;
    }

    public void setIdvoo(Integer idvoo) {
        this.idvoo = idvoo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDatahoraembarque() {
        return datahoraembarque;
    }

    public void setDatahoraembarque(Date datahoraembarque) {
        this.datahoraembarque = datahoraembarque;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idvoo != null ? idvoo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Voo)) {
            return false;
        }
        Voo other = (Voo) object;
        if ((this.idvoo == null && other.idvoo != null) || (this.idvoo != null && !this.idvoo.equals(other.idvoo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.data.entity.Voo[ idvoo=" + idvoo + " ]";
    }

    /**
     * @return the idaeronave
     */
    public int getIdaeronave() {
        return idaeronave;
    }

    /**
     * @param idaeronave the idaeronave to set
     */
    public void setIdaeronave(int idaeronave) {
        this.idaeronave = idaeronave;
    }

    /**
     * @return the idpassagem
     */
    public Integer getIdpassagem() {
        return idpassagem;
    }

    /**
     * @param idpassagem the idpassagem to set
     */
    public void setIdpassagem(Integer idpassagem) {
        this.idpassagem = idpassagem;
    }

    /**
     * @return the idrota
     */
    public int getIdrota() {
        return idrota;
    }

    /**
     * @param idrota the idrota to set
     */
    public void setIdrota(int idrota) {
        this.idrota = idrota;
    }
    
}

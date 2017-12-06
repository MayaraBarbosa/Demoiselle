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
    , @NamedQuery(name = "Voo.findByIdvoo", query = "SELECT v FROM Voo v WHERE v.idVoo = :idVoo")
    , @NamedQuery(name = "Voo.findByObservacao", query = "SELECT v FROM Voo v WHERE v.observacao = :observacao")
    , @NamedQuery(name = "Voo.findByDatahoraembarque", query = "SELECT v FROM Voo v WHERE v.dataHoraEmbarque = :dataHoraEmbarque")})
public class Voo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "idvoo")
    private Integer idVoo;

    @Size(max = 200)
    @Column(name = "observacao")

    private String observacao;
    @Column(name = "datahoraembarque")
    @Temporal(TemporalType.DATE)

    private Date dataHoraEmbarque;

    //@JoinColumn( name="idaeronave", foreignKey = @ForeignKey(name = "ida")
    @Column(name = "idaeronave")
    private int idAeronave;

    @Column(name = "idpassagem")
    private Integer idPassagem;

    @Basic(optional = false)
    @NotNull
    @Column(name = "idrota")
    private int idRota;
    
    public Voo() {
    }

    public Voo(Integer idVoo) {
        this.idVoo = idVoo;
    }

    public Integer getIdvoo() {
        return idVoo;
    }

    public void setIdvoo(Integer idvoo) {
        this.idVoo = idvoo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Date getDatahoraembarque() {
        return dataHoraEmbarque;
    }

    public void setDatahoraembarque(Date dataHoraEmbarque) {
        this.dataHoraEmbarque = dataHoraEmbarque;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idVoo != null ? idVoo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof Voo)) {
            return false;
        }
        Voo other = (Voo) object;
        if ((this.idVoo == null && other.idVoo != null) || (this.idVoo != null && !this.idVoo.equals(other.idVoo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.data.entity.Voo[ idvoo=" + idVoo + " ]";
    }

    public Integer getIdVoo() {
        return idVoo;
    }

    public void setIdVoo(Integer idVoo) {
        this.idVoo = idVoo;
    }

    public Date getDataHoraEmbarque() {
        return dataHoraEmbarque;
    }

    public void setDataHoraEmbarque(Date dataHoraEmbarque) {
        this.dataHoraEmbarque = dataHoraEmbarque;
    }

    public int getIdAeronave() {
        return idAeronave;
    }

    public void setIdAeronave(int idAeronave) {
        this.idAeronave = idAeronave;
    }

    public Integer getIdPassagem() {
        return idPassagem;
    }

    public void setIdPassagem(Integer idPassagem) {
        this.idPassagem = idPassagem;
    }

    public int getIdRota() {
        return idRota;
    }

    public void setIdRota(int idRota) {
        this.idRota = idRota;
    }
}

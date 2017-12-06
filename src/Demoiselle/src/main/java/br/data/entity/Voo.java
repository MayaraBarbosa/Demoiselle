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
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
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

    @ManyToOne
    private Aeronave aeronave;

    @ManyToOne
    private Rota Rota;
    
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

    public Aeronave getAeronave() {
        return aeronave;
    }

    public void setAeronave(Aeronave aeronave) {
        this.aeronave = aeronave;
    }

    public Rota getRota() {
        return Rota;
    }

    public void setRota(Rota Rota) {
        this.Rota = Rota;
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
}

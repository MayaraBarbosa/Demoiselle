/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.entity;

import java.io.Serializable;
<<<<<<< HEAD
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
=======
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
>>>>>>> 917dcfe04615647f2b26d2284ed6e41f280e10e7
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
<<<<<<< HEAD
 * @author Lucas Agustini
=======
 * @author bruno
>>>>>>> 917dcfe04615647f2b26d2284ed6e41f280e10e7
 */
@Entity
@Table(name = "voo")
@XmlRootElement
<<<<<<< HEAD
@NamedQueries({
    @NamedQuery(name = "Voo.findAll", query = "SELECT v FROM Voo v")
    , @NamedQuery(name = "Voo.findByIdvoo", query = "SELECT v FROM Voo v WHERE v.idvoo = :idvoo")
    , @NamedQuery(name = "Voo.findByObservacao", query = "SELECT v FROM Voo v WHERE v.observacao = :observacao")
    , @NamedQuery(name = "Voo.findByDatahoraembarque", query = "SELECT v FROM Voo v WHERE v.datahoraembarque = :datahoraembarque")})
public class Voo implements Serializable {

    @Basic(optional = false)
    @NotNull
    //@JoinColumn( name="idaeronave", foreignKey = @ForeignKey(name = "ida")
    @Column(name = "idaeronave")
    private int idaeronave;
    @Column(name = "idpassagem")
    private Integer idpassagem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "idrota")
    private int idrota;
    
    

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
=======
public class Voo implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @NotNull
    @Column(name = "id")
    public Integer idvoo;
>>>>>>> 917dcfe04615647f2b26d2284ed6e41f280e10e7

    public Voo() {
    }

<<<<<<< HEAD
    public Voo(Integer idvoo) {
        this.idvoo = idvoo;
    }

=======
>>>>>>> 917dcfe04615647f2b26d2284ed6e41f280e10e7
    public Integer getIdvoo() {
        return idvoo;
    }

    public void setIdvoo(Integer idvoo) {
        this.idvoo = idvoo;
    }

<<<<<<< HEAD
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
=======
    @Override
    public int hashCode() {
        int hash = 7;
>>>>>>> 917dcfe04615647f2b26d2284ed6e41f280e10e7
        return hash;
    }

    @Override
<<<<<<< HEAD
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Voo)) {
            return false;
        }
        Voo other = (Voo) object;
        if ((this.idvoo == null && other.idvoo != null) || (this.idvoo != null && !this.idvoo.equals(other.idvoo))) {
=======
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Voo other = (Voo) obj;
        if (!Objects.equals(this.idvoo, other.idvoo)) {
>>>>>>> 917dcfe04615647f2b26d2284ed6e41f280e10e7
            return false;
        }
        return true;
    }
<<<<<<< HEAD

    @Override
    public String toString() {
        return "br.data.entity.Voo[ idvoo=" + idvoo + " ]";
    }

    public int getIdaeronave() {
        return idaeronave;
    }

    public void setIdaeronave(int idaeronave) {
        this.idaeronave = idaeronave;
    }

    public Integer getIdpassagem() {
        return idpassagem;
    }

    public void setIdpassagem(Integer idpassagem) {
        this.idpassagem = idpassagem;
    }

    public int getIdrota() {
        return idrota;
    }

    public void setIdrota(int idrota) {
        this.idrota = idrota;
    }
=======
    
    
>>>>>>> 917dcfe04615647f2b26d2284ed6e41f280e10e7
    
}

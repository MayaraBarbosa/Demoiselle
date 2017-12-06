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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Kelson
 */
@Entity
@Table(name = "remarcar")
@XmlRootElement
/*@NamedQueries({
    @NamedQuery(name = "Remarcar.findAll", query = "SELECT r FROM Voo r WHERE r.idvoo = :idvoo")
    , @NamedQuery(name = "Remarcar.findByIdvoo", query = "SELECT r FROM Voo r WHERE r.idvoo = :idvoo")})*/
public class Remarcar implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "id")
    private Integer idRemarcar;
    @Size(max = 100)
    @Column(name = "descricao")
    private String descricao;

    public Remarcar() {
    }

    public Remarcar(Integer id) {
        this.idRemarcar = id;
    }

    public Integer getIdRemarcar() {
        return idRemarcar;
    }

    public void setId(Integer id) {
        this.idRemarcar = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRemarcar != null ? idRemarcar.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Remarcar)) {
            return false;
        }
        Remarcar other = (Remarcar) object;
        if ((this.idRemarcar == null && other.idRemarcar != null) || (this.idRemarcar != null && !this.idRemarcar.equals(other.idRemarcar))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.data.entity.Remarcar[ id=" + idRemarcar + " ]";
    }

}

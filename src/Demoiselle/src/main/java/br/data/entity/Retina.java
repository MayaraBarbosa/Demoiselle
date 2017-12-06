/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.entity;

import java.io.Serializable;
import java.util.Objects;
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
 * @author bruno
 */
@Entity
@Table(name = "retina")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name="Retina.findById", 
            query = "SELECT r FROM Retina r WHERE r.idretina = :idretina")
})
public class Retina implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @NotNull
    @Column(name = "idretina")
    private Integer idretina;
    
    @Column(name = "pontos")
    private Integer pontos;

    public Retina() {
    }

    public Integer getIdretina() {
        return idretina;
    }

    public void setIdretina(Integer idretina) {
        this.idretina = idretina;
    }

    public Integer getPontos() {
        return pontos;
    }

    public void setPontos(Integer pontos) {
        this.pontos = pontos;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
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
        final Retina other = (Retina) obj;
        if (!Objects.equals(this.idretina, other.idretina)) {
            return false;
        }
        return true;
    }
    
    
}

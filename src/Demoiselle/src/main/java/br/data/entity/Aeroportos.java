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
 * @author MayaraBarbosa
 */
@Entity
@Table(name = "aeroporto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aeroportos.findAll", query = "Select a FROM Aeroportos a")
    ,@NamedQuery(name = "Aeroportos.findByIdaeroporto", query = "Select a FROM Aeroportos a where a.idaeroporto = :idaeroporto")
    ,@NamedQuery(name ="Aeroportos.findByNome", query = "Select a from Aeroportos a WHERE UPPER(FUNCTION('TRANSLATE', a.nome, 'ÁÀÃÂÄáàãâäÍÌÏíìïÚÙÜúùüÉÈÊËéèêëÓÒÕÔÖóòõôöÇç', 'AAAAAaaaaaIIIiiiUUUuuuEEEEeeeeOOOOOoooooCc')) LIKE :nome" )
})

public class Aeroportos implements Serializable{

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "idaeroporto")
    private Integer idaeroporto;
    @Size(max = 40)
    @Column(name = "nome")
    private String nome;
    @Column(name = "sigla")
    private String sigla;
    @Column(name = "latitude")
    private float latitude;
    @Column(name = "longitude")
    private float longitude;
    
    public Aeroportos(){}
    
    public Aeroportos(Integer Idaeroporto){
        this.idaeroporto = idaeroporto;
    }
    
    public Integer getIdaeroporto() {
        return idaeroporto;
    }

    public void setIdaeroporto(Integer idaeroporto) {
        this.idaeroporto = idaeroporto;
    }
    
     /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
        /**
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }
  
    
    /**
     * @return the latitude
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }
    
    /**
     * @return the longitude
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
    
    @Override
    public int hashCode(){
        int hash = 0;
        hash += (idaeroporto != null ? idaeroporto.hashCode() : 0);
        return hash;
    }
    
    @Override
    public boolean equals(Object object){
        if (!(object instanceof Aeroportos)) {
            return false;
        }
        Aeroportos other = (Aeroportos) object;
        if ((this.idaeroporto == null && other.idaeroporto != null) || (this.idaeroporto != null && !this.idaeroporto.equals(other.idaeroporto))) {
            return false;
        }
        return true;
    
    }
    
    @Override
    public String toString() {
        return "br.data.entity.Aeroportos[idaeroporto = ]" + idaeroporto+"]";
    }
    
}

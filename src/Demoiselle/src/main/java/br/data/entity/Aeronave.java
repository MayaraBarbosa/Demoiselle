/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.entity;

/**
 *
 * @author Tamy
 */


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

@Entity
@Table(name = "aeronave")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Aeronave.findAll", query = "SELECT a FROM Aeronave a"),
    /*@NamedQuery(name = "Aeronave.findById", query = "SELECT a FROM Aeronave a WHERE a.id = :id"),*/
    @NamedQuery(name = "Aeronave.findByModelo", query = "SELECT a FROM Aeronave a WHERE UPPER(FUNCTION('TRANSLATE', a.modelo, "
                                                    + "'ÁÀÃÂÄáàãâäÍÌÏíìïÚÙÜúùüÉÈÊËéèêëÓÒÕÔÖóòõôöÇç', "
                                                    + "'AAAAAaaaaaIIIiiiUUUuuuEEEEeeeeOOOOOoooooCc')) LIKE :modelo")})
public class Aeronave implements Serializable{
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name="id")
    private Integer idaeronave;
    @Size(max = 50)
    @Column(name="modelo")
    private String modelo;
    @Column (name = "tempo_de_voo")
    private String tempoVoo;
    @Column(name="idfabricante")
    private Integer idfabricante;
    @Column(name="qtdeassentos")
    private Integer assentos;
    @Column(name="ano")
    private Integer ano;
    
    public Aeronave(){}
    
    public Aeronave(Integer idaeronave){
        this.idaeronave = idaeronave;
    }

    public Integer getIdaeronave() {
        return idaeronave;
    }

    public void setIdaeronave(Integer idaeronave) {
        this.idaeronave = idaeronave;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTempoVoo() {
        return tempoVoo;
    }

    public void setTempoVoo(String tempoVoo) {
        this.tempoVoo = tempoVoo;
    }

    public Integer getIdfabricante() {
        return idfabricante;
    }

    public void setIdfabricante(Integer idfabricante) {
        this.idfabricante = idfabricante;
    }

    public Integer getAssentos() {
        return assentos;
    }

    public void setAssentos(Integer assentos) {
        this.assentos = assentos;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
    
    
}
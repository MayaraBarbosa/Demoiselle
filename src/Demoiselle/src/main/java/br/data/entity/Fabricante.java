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
 * @author Tamy
 */

@Entity
@Table(name = "aeronave")
@XmlRootElement
/*@NamedQueries({
    @NamedQuery(name="Fabricante.findAll", query="SELECT f FROM Fabricante f"),
    @NamedQuery(name="Fabricante.findById", query="SELECT Fabricante f FROM Fabricante f WHERE f.id = :id"),
    @NamedQuery(name="Fabricante.findByNome", query="SELECT f FROM Fabricante a WHERE UPPER(FUNCTION('TRANSLATE', c.modelo, "
                                                    + "'ÁÀÃÂÄáàãâäÍÌÏíìïÚÙÜúùüÉÈÊËéèêëÓÒÕÔÖóòõôöÇç', "
                                                    + "'AAAAAaaaaaIIIiiiUUUuuuEEEEeeeeOOOOOoooooCc')) LIKE :modelo")})*/
public class Fabricante implements Serializable{
    private static final long serialVersionUID = 1L;
    
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name="idabricante")
    private Integer idfabricante;
    @NotNull
    @Column(name="nome")
    private String nome;

    public Integer getIdfabricante() {
        return idfabricante;
    }

    public void setIdfabricante(Integer idfabricante) {
        this.idfabricante = idfabricante;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
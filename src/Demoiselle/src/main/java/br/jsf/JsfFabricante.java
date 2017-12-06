/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Tamy
 */
@Named(value = "jsfFabricante")
@Dependent
public class JsfFabricante {
    

    private Integer idfabricante;
    private String nome;
    
    public JsfFabricante() {
    }
    
    public void persist(){
    br.data.entity.Fabricante fab = new br.data.entity.Fabricante();
    fab.setIdfabricante(idfabricante);
    fab.setNome(nome);
    this.idfabricante = 0;
    this.nome = "";
    }
    
    public void remove(br.data.entity.Fabricante fab){
        new br.data.crud.CrudFabricante().remove(fab);
    }
    
    public java.util.Collection<br.data.entity.Fabricante> getAll(){
        return new br.data.crud.CrudFabricante().getAll();
    }
    
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

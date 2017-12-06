/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.data.crud.CrudFabricante;
import br.data.entity.Fabricante;
import java.util.Collection;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Tamy
 */
@Named(value = "jsfFabricanteSelect")
@Dependent
public class JsfFabricanteSelect {

    private Integer idfabricante;
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
    
    public JsfFabricanteSelect() {
    }
    
    public java.util.Collection<br.data.entity.Fabricante> getSelect(){
        return new br.data.crud.CrudFabricante().SelectByNome(this.nome);
    }
    
}

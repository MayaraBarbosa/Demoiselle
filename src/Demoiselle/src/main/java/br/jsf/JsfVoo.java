/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.data.crud.CrudAeronave;
import br.data.crud.CrudRota;
import br.data.crud.CrudVoo;
import br.data.entity.Aeronave;
import br.data.entity.Rota;
import br.data.entity.Voo;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 *
 * @author lucas agustini  
 */
@ManagedBean
@RequestScoped
public class JsfVoo {
    private Voo voo;
    private List<Rota> rotas;
    private List<Aeronave> aeronaves;
    private CrudVoo crudVoo;
    
    public JsfVoo() {
        this.crudVoo = new CrudVoo();
        this.voo = new Voo();
        this.rotas = new CrudRota().getAll();
        this.aeronaves = new CrudAeronave().getAll();
    }
    
    public void persist() {
        this.crudVoo.persist(voo);
        this.voo = new Voo();
    }
    
    public void remove(br.data.entity.Voo voo){
        this.crudVoo.remove(voo);
    }
    
    public List<Voo> getAll(){
        return this.crudVoo.getAll();
    }

    public String update(br.data.entity.Voo voo){
        return "merge.xhtml";
    }
    
    public void merge(){
        Voo voo;
        voo = this.crudVoo.find(this.voo.getIdVoo());
        this.crudVoo.merge(voo);
    }

    public List<Rota> getRotas() {
        return rotas;
    }

    public void setRotas(List<Rota> rotas) {
        this.rotas = rotas;
    }

    public List<Aeronave> getAeronaves() {
        return aeronaves;
    }

    public void setAeronaves(List<Aeronave> aeronaves) {
        this.aeronaves = aeronaves;
    }

    public Voo getVoo() {
        return voo;
    }

    public void setVoo(Voo voo) {
        this.voo = voo;
    }

    public CrudVoo getCrudVoo() {
        return crudVoo;
    }

    public void setCrudVoo(CrudVoo crudVoo) {
        this.crudVoo = crudVoo;
    }
}

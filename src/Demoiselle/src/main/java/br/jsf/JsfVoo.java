/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.data.crud.CrudVoo;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 *
 * @author lucas agustini  
 */
@ManagedBean
@RequestScoped
public class JsfVoo {
    private int idVoo;
    private int idRota;
    private String observacao;
    private int idAeronave;
    
    public JsfVoo() {
    }
    
    public void persist(){
       br.data.entity.Voo voo = new br.data.entity.Voo();
       voo.setIdvoo(getIdVoo());
       voo.setIdRota(getIdRota());
       voo.setIdAeronave(getIdAeronave());
       voo.setObservacao(getObservacao());
       new br.data.crud.CrudVoo().persist(voo);
       this.setIdVoo(0);
       this.setIdRota(0);
       this.setIdAeronave(0);
       this.setObservacao("");
    }
    
    public void remove(br.data.entity.Voo voo){
        new br.data.crud.CrudVoo().remove(voo);
    }
    
    public java.util.Collection<br.data.entity.Voo> getAll(){
        return new br.data.crud.CrudVoo().getAll();
    }

    public String update(br.data.entity.Voo voo){
        this.setIdVoo((int) voo.getIdvoo());
        this.setIdRota(voo.getIdRota());
        this.setIdAeronave(voo.getIdAeronave());
        this.setObservacao(voo.getObservacao());
        return "merge.xhtml";
    }
    
    public void merge(){
        br.data.entity.Voo voo;
        voo = new CrudVoo().find(this.getIdVoo());
        new br.data.crud.CrudVoo().merge(voo);
        this.setIdVoo(0);
        this.setIdRota(0);
        this.setIdAeronave(0);
        this.setObservacao("");
    }

    public int getIdVoo() {
        return idVoo;
    }

    public void setIdVoo(int idVoo) {
        this.idVoo = idVoo;
    }

    public int getIdRota() {
        return idRota;
    }

    public void setIdRota(int idRota) {
        this.idRota = idRota;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public int getIdAeronave() {
        return idAeronave;
    }

    public void setIdAeronave(int idAeronave) {
        this.idAeronave = idAeronave;
    }
}

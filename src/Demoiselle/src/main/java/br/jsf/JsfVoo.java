/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

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

    /**
     * Creates a new instance of JsfVoo
     */
    private int idvoo;
    private int idrota;
    private String obsservacao;
    private int idaeronave;
    //private Date datahoraembarque;
 
    
    public JsfVoo() {
        
    }
    
   
    public void persist(){
       br.data.entity.Voo voo = new br.data.entity.Voo();
       voo.setIdvoo(getIdvoo());
       voo.setIdrota(getIdrota());
       voo.setIdaeronave(getIdaeronave());
       voo.setObservacao(getObsservacao());
       new br.data.crud.CrudVoo().persist(voo);
       this.setIdvoo(0);
       this.setIdrota(0);
       this.setIdaeronave(0);
       this.setObsservacao("");
       
       
    }
    
    public void remove(br.data.entity.Voo voo){
        new br.data.crud.CrudVoo().remove(voo);
    }
    
    public java.util.Collection<br.data.entity.Voo> getAll(){
        return new br.data.crud.CrudVoo().getAll();
    }

    public String update(br.data.entity.Voo voo){
        this.setIdvoo((int) voo.getIdvoo());
        this.setIdrota(voo.getIdrota());
        this.setIdaeronave(voo.getIdaeronave());
        this.setObsservacao(voo.getObservacao());
        return "merge.xhtml";
    }
    
    public void merge(){
        br.data.entity.Voo voo;
        voo = new br.data.crud.CrudVoo().find(this.getIdvoo());
        
        new br.data.crud.CrudVoo().merge(voo);
        this.setIdvoo(0);
        this.setIdrota(0);
        this.setIdaeronave(0);
        this.setObsservacao("");
        
    }

    /**
     * @return the idvoo
     */
    public int getIdvoo() {
        return idvoo;
    }

    /**
     * @param idvoo the idvoo to set
     */
    public void setIdvoo(int idvoo) {
        this.idvoo = idvoo;
    }

    /**
     * @return the idrota
     */
    public int getIdrota() {
        return idrota;
    }

    /**
     * @param idrota the idrota to set
     */
    public void setIdrota(int idrota) {
        this.idrota = idrota;
    }

    /**
     * @return the obsservacao
     */
    public String getObsservacao() {
        return obsservacao;
    }

    /**
     * @param obsservacao the obsservacao to set
     */
    public void setObsservacao(String obsservacao) {
        this.obsservacao = obsservacao;
    }

    /**
     * @return the idaeronave
     */
    public int getIdaeronave() {
        return idaeronave;
    }

    /**
     * @param idaeronave the idaeronave to set
     */
    public void setIdaeronave(int idaeronave) {
        this.idaeronave = idaeronave;
    }



}

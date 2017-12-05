/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;


/**
 *
 * @author alexandrelerario
 */
@ManagedBean
@RequestScoped
public class JsfPassagem {

    /**
     * Creates a new instance of JsfPassagem
     */
    private int idpassagem;
    private int qtdpassagueiros;
//    private int idvoo;
//    private int idvenda;
 
    
    public JsfPassagem() {
        
    }
    
   
    public void persist(){
       br.data.entity.Passagem pas = new br.data.entity.Passagem();
       pas.setIdpassagem(idpassagem);
       pas.setQtdepassageiros(qtdpassagueiros);
       new br.data.crud.CrudPassagem().persist(pas);
       this.idpassagem=0;
       this.qtdpassagueiros=0;
    }
    
    public void remove(br.data.entity.Passagem passagem){
        new br.data.crud.CrudPassagem().remove(passagem);
    }
    
    public java.util.Collection<br.data.entity.Passagem> getAll(){
        return new br.data.crud.CrudPassagem().getAll();
    }

    public String update(br.data.entity.Passagem passagem){
        this.idpassagem = passagem.getIdpassagem();
        this.qtdpassagueiros = passagem.getQtdepassageiros();
        return "merge.xhtml";
    }
    
    public void merge(){
        br.data.entity.Passagem pas;
        pas = new br.data.crud.CrudPassagem().find(this.idpassagem);
        pas.setQtdepassageiros(this.qtdpassagueiros);
        new br.data.crud.CrudPassagem().merge(pas);
        this.qtdpassagueiros=0;
        this.idpassagem=0;  
    }

    public int getQtdpassagueiros() {
        return qtdpassagueiros;
    }

    public void setQtdpassagueiros(int qtdpassagueiros) {
        this.qtdpassagueiros = qtdpassagueiros;
    }
    
    
    public int getIdpassagem() {
        return idpassagem;
    }

    public void setIdpassagem(int idpassagem) {
        this.idpassagem = idpassagem;
    }

}

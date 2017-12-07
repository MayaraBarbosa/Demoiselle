/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import br.data.crud.CrudPassagem;
import br.data.crud.CrudVoo;
import br.data.entity.Passagem;
import br.data.entity.Voo;
import java.util.List;

/**
 *
 * @author lucas agustini
 */
@ManagedBean
@RequestScoped
public class JsfPassagem {

    /**
     * Creates a new instance of JsfPassagem
     */
    private int idpassagem;
    private int qtdpassageiros;
    private int idvoo;
    private int idvenda;
    private List<Voo> voos;
 
    
    public JsfPassagem() {
        this.voos = new CrudVoo().getAll();
    }
    
    public List<Passagem> getLista(){
        List<Passagem> result = new CrudPassagem().getAll();
        return result;
    }
   
    public void persist(){
       br.data.entity.Passagem pas = new br.data.entity.Passagem();
       pas.setIdpassagem(idpassagem);
       pas.setQtdepassageiros(qtdpassageiros);
       pas.setIdvoo(idvoo);
       pas.setIdvenda(idvenda);
       new br.data.crud.CrudPassagem().persist(pas);
       this.idpassagem=0;
       this.qtdpassageiros=0;
    }
    
    public void remove(br.data.entity.Passagem passagem){
        new br.data.crud.CrudPassagem().remove(passagem);
    }
    
    public java.util.Collection<br.data.entity.Passagem> getAll(){
        return new br.data.crud.CrudPassagem().getAll();
    }

    public String update(br.data.entity.Passagem passagem){
        this.idpassagem = passagem.getIdpassagem();
        this.qtdpassageiros = passagem.getQtdepassageiros();
        this.idvoo = passagem.getIdvoo();
        this.idvenda = passagem.getIdvenda();
        return "merge.xhtml";
    }
    
    public void merge(){
        br.data.entity.Passagem pas;
        pas = new br.data.crud.CrudPassagem().find(this.idpassagem);
        pas.setQtdepassageiros(this.qtdpassageiros);
        new br.data.crud.CrudPassagem().merge(pas);
        this.qtdpassageiros=0;
        this.idpassagem=0;
        this.idvoo=0;
        this.idvenda=0;
    }

    public int getQtdpassageiros() {
        return qtdpassageiros;
    }

    public void setQtdpassageiros(int qtdpassageiros) {
        this.qtdpassageiros = qtdpassageiros;
    }
    
    
    public int getIdpassagem() {
        return idpassagem;
    }

    public void setIdpassagem(int idpassagem) {
        this.idpassagem = idpassagem;
    }

 
    public int getIdvoo() {
        return idvoo;
    }

 
    public void setIdvoo(int idvoo) {
        this.idvoo = idvoo;
    }

    
    public int getIdvenda() {
        return idvenda;
    }

   
    public void setIdvenda(int idvenda) {
        this.idvenda = idvenda;
    }

}

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
public class JsfCidade {

    /**
     * Creates a new instance of JsfCidade
     */
    private int idcidade;
    private String nome;
  
    
    public JsfCidade() {
        
    }
    
   
    public void persist(){
       br.data.entity.Cidade cid = new br.data.entity.Cidade();
       cid.setIdcidade(idcidade);
       cid.setNome(nome);
       new br.data.crud.CrudCidade().persist(cid);
       this.idcidade=0;
       this.nome="";
    }
    
    public void remove(br.data.entity.Cidade cidade){
        new br.data.crud.CrudCidade().remove(cidade);
    }
    
    public java.util.Collection<br.data.entity.Cidade> getAll(){
        return new br.data.crud.CrudCidade().getAll();
    }

    public String update(br.data.entity.Cidade cidade){
        this.idcidade = cidade.getIdcidade();
        this.nome = cidade.getNome();
        return "merge.xhtml";
    }
    
    public void merge(){
        br.data.entity.Cidade teste;
        teste = new br.data.crud.CrudCidade().find(this.idcidade);
        teste.setNome(this.nome);
        new br.data.crud.CrudCidade().merge(teste);
        this.nome="";
        this.idcidade=0;  
    }
    
    
    public int getIdcidade() {
        return idcidade;
    }

    public void setIdcidade(int idcidade) {
        this.idcidade = idcidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
}

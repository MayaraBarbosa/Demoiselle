/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 *
 * @author Lucas Agustini
 */
@ManagedBean
@SessionScoped
public class JsfPassagemSelect  {

    /**
     * Creates a new instance of JsfCidadeSelect
     */
    public JsfPassagemSelect() {
    }
    
    private int idpassagem;
    private int idvoo;
    private int idvenda;
    private String nome = "";
    
    public java.util.Collection<br.data.entity.Passagem> getSelect(){
        return new br.data.crud.CrudPassagem().selectByIdpassagem(idpassagem);
    }

    public int getIdpassagem() {
        return idpassagem;
    }

    public void setIdpassagem(int idpassagem) {
        this.idpassagem = idpassagem;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.data.crud.CrudPassagem;
import br.data.entity.Passagem;
import java.util.Collection;
import java.util.List;
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
    private String obvservacao = "";
    private List<Passagem> passagens;
    
    
    
    public void gSelect(){
        List<Passagem> passagensResult = new CrudPassagem().selectByIdpassagem(idpassagem);
        this.passagens = passagensResult;
        //return new br.data.crud.CrudPassagem().selectByIdpassagem(idpassagem);
    }

    public Collection<Passagem> getPassagens() {
        return passagens;
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


    public String getObvservacao() {
        return obvservacao;
    }


    public void setObvservacao(String obvservacao) {
        this.obvservacao = obvservacao;
    }
    
    
}

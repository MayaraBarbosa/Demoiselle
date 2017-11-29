/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.data.crud.CrudPromocao;
import br.data.entity.Promocao;
import java.util.Collection;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author Hiroshi
 */
@ManagedBean
@RequestScoped
public class JsfPromocao {
    
    private Integer idpromocao;
    private String descricao;
    private String nomeimagem;
    private boolean ativo;
    private List<Promocao> lista;
    public JsfPromocao(){}
    
    public void persist(){
        Promocao promo = new Promocao();
        promo.setDescricao(descricao);
        promo.setNomeimagem("imgteste");
        promo.setAtivo(ativo);
        new CrudPromocao().persist(promo);
    }
    
    public void remove(Promocao promo){
        new CrudPromocao().remove(promo);
    }
    
    public void getAll(){
        this.lista = new CrudPromocao().getAll();
    }
    
    public String update(Promocao promo){
        this.descricao = promo.getDescricao();
        this.idpromocao= promo.getIdpromocao();
        this.nomeimagem = promo.getNomeimagem();
        this.ativo = promo.isAtivo();
        return "merge.xhtml";
    }
    
    public void merge(){
        Promocao promo;
        promo = new CrudPromocao().find(this.idpromocao);
        promo.setDescricao(descricao);
        promo.setNomeimagem(this.nomeimagem);
        promo.setAtivo(ativo);
        new CrudPromocao().merge(promo);
        this.descricao = "";
        this.nomeimagem = "";
    }

    public Collection<Promocao> select(){
        return new CrudPromocao().selectByDescricao(this.descricao);
    }
    
    public Integer getIdpromocao() {
        return idpromocao;
    }

    public void setIdpromocao(Integer idpromocao) {
        this.idpromocao = idpromocao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNomeimagem() {
        return nomeimagem;
    }

    public void setNomeimagem(String nomeimagem) {
        this.nomeimagem = nomeimagem;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public List<Promocao> getLista() {
        return lista;
    }

    public void setLista(List<Promocao> lista) {
        this.lista = lista;
    }
    
    
}

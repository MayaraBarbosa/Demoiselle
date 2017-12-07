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
 * @author alexandrelerario
 */
@ManagedBean
@RequestScoped
public class JsfCancelarVoo {

    /**
     * Creates a new instance of JsfVoo
     */
    private int idvoo;
    private String observacao;

    public JsfCancelarVoo() {

    }

    public void persist() {
        br.data.entity.Voo cvoo = new br.data.entity.Voo();
        cvoo.setIdvoo(idvoo);

        cvoo.setObservacao(observacao);

        new br.data.crud.CrudCancelarVoo().persist(cvoo);
        this.idvoo = 0;
        this.observacao = "";

    }

    public void remove(br.data.entity.Voo voo) {
        new br.data.crud.CrudCancelarVoo().remove(voo);
    }

    public java.util.Collection<br.data.entity.Voo> getAll() {
        return new br.data.crud.CrudCancelarVoo().getAll();
    }

    public String update(br.data.entity.Voo voo) {

        this.idvoo = voo.getIdvoo();
        this.observacao = voo.getObservacao();

        return "merge.xhtml";
    }

    public void merge() {
        br.data.entity.Voo teste;
        teste = new br.data.crud.CrudCancelarVoo().find(this.idvoo);
        teste.setObservacao(this.observacao);
        new br.data.crud.CrudCancelarVoo().merge(teste);
        this.observacao = "";
    }

    public int getIdvoo() {
        return idvoo;
    }

    public void setIdvoo(int idvoo) {
        this.idvoo = idvoo;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

}

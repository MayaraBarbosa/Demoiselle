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
    private Date dataHoraEmbarque;
    private String observacao;
    private Rota rotaSelecionada;
    private Aeronave aeronaveSelecionada;
    private List<Rota> rotas = new ArrayList<>();
    private List<Aeronave> aeronaves = new ArrayList<>();
    private CrudVoo crudVoo;
    
    public JsfVoo() {
        this.crudVoo = new CrudVoo();
        this.rotas = new CrudRota().getAll();
        this.aeronaves = new CrudAeronave().getAll();
    }
    
    public void persist(){
        this.voo = new Voo();
        //this.crudVoo.persist(voo);
        this.voo.setIdVoo(0);
        this.voo.setObservacao(null);
    }
    
    public void remove(br.data.entity.Voo voo){
        this.crudVoo.remove(voo);
    }
    
    public List<Voo> getAll(){
        return this.crudVoo.getAll();
    }

    public String update(br.data.entity.Voo voo){
        this.setObservacao(voo.getObservacao());
        return "merge.xhtml";
    }
    
    public void merge(){
        Voo voo;
        voo = this.crudVoo.find(this.voo.getIdVoo());
        this.crudVoo.merge(voo);
        this.setObservacao("");
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public Rota getRotaSelecionada() {
        return rotaSelecionada;
    }

    public void setRotaSelecionada(Rota rotaSelecionada) {
        this.rotaSelecionada = rotaSelecionada;
    }

    public List<Rota> getRotas() {
        return rotas;
    }

    public void setRotas(List<Rota> rotas) {
        this.rotas = rotas;
    }

    public Aeronave getAeronaveSelecionada() {
        return aeronaveSelecionada;
    }

    public void setAeronaveSelecionada(Aeronave aeronaveSelecionada) {
        this.aeronaveSelecionada = aeronaveSelecionada;
    }

    public List<Aeronave> getAeronaves() {
        return aeronaves;
    }

    public void setAeronaves(List<Aeronave> aeronaves) {
        this.aeronaves = aeronaves;
    }

    public Date getDataHoraEmbarque() {
        return dataHoraEmbarque;
    }

    public void setDataHoraEmbarque(Date dataHoraEmbarque) {
        this.dataHoraEmbarque = dataHoraEmbarque;
    }
}

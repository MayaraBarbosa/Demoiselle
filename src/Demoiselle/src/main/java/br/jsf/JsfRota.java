/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.data.crud.CrudRota;
import br.data.entity.Rota;
import java.util.Date;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author henrique
 */
@ManagedBean
@RequestScoped
public class JsfRota {
    
    private int idrota;
    private int aeroportoorigem;
    private int aeroportodestino;
    private Date datahora_partida;
    private Date datahora_chegada;
    private double frequencia;
    private double duracao_voo;
    private int idPromocao;
    
    private List<Rota> lista; 
    
    public JsfRota() { }
    
    public void getAll() {
        this.lista = new CrudRota().getAll();
    }
    
    public void persist() {
        Rota rota = new Rota();
        
        rota.setAeroportodestino(aeroportodestino);
        rota.setAeroportoorigem(aeroportoorigem);
        rota.setDatahora_chegada(datahora_chegada);
        rota.setDatahora_partida(datahora_partida);
        rota.setDuracao_voo(duracao_voo);
        rota.setFrequencia(frequencia);
        rota.setIdPromocao(idPromocao);
        
        new CrudRota().persist(rota);
        limparFormulario();
    }
    
    public void remove(Rota rota) {
        new CrudRota().remove(rota);
    }
    
    public void merge() {
        CrudRota crud = new CrudRota();
        Rota rota = crud.find(idrota);
        
        rota.setAeroportodestino(aeroportodestino);
        rota.setAeroportoorigem(aeroportoorigem);
        rota.setDatahora_chegada(datahora_chegada);
        rota.setDatahora_partida(datahora_partida);
        rota.setDuracao_voo(duracao_voo);
        rota.setFrequencia(frequencia);
        rota.setIdPromocao(idPromocao);
        
        crud.merge(rota);
        limparFormulario();
    }
    
    private void limparFormulario() {
        this.setAeroportodestino(0);
        this.setAeroportoorigem(0);
        this.setDatahora_chegada(null);
        this.setDatahora_partida(null);
        this.setDuracao_voo(0);
        this.setFrequencia(0);
        this.setIdPromocao(0);
        this.setIdrota(0);
        this.setLista(null);
    }
    
    public String update(Rota rota){
        this.idPromocao = rota.getIdPromocao();
        this.aeroportodestino = rota.getAeroportodestino();
        this.aeroportoorigem = rota.getAeroportoorigem();
        this.datahora_chegada = rota.getDatahora_chegada();
        this.datahora_partida = rota.getDatahora_partida();
        this.duracao_voo = rota.getDuracao_voo();
        this.frequencia = rota.getFrequencia();
        
        return "merge.xhtml";
    }
    
    public int getIdrota() {
        return idrota;
    }

    public void setIdrota(int idrota) {
        this.idrota = idrota;
    }

    public int getAeroportoorigem() {
        return aeroportoorigem;
    }

    public void setAeroportoorigem(int aeroportoorigem) {
        this.aeroportoorigem = aeroportoorigem;
    }

    public int getAeroportodestino() {
        return aeroportodestino;
    }

    public void setAeroportodestino(int aeroportodestino) {
        this.aeroportodestino = aeroportodestino;
    }

    public Date getDatahora_partida() {
        return datahora_partida;
    }

    public void setDatahora_partida(Date datahora_partida) {
        this.datahora_partida = datahora_partida;
    }

    public Date getDatahora_chegada() {
        return datahora_chegada;
    }

    public void setDatahora_chegada(Date datahora_chegada) {
        this.datahora_chegada = datahora_chegada;
    }

    public double getFrequencia() {
        return frequencia;
    }

    public void setFrequencia(double frequencia) {
        this.frequencia = frequencia;
    }

    public double getDuracao_voo() {
        return duracao_voo;
    }

    public void setDuracao_voo(double duracao_voo) {
        this.duracao_voo = duracao_voo;
    }

    public int getIdPromocao() {
        return idPromocao;
    }

    public void setIdPromocao(int idPromocao) {
        this.idPromocao = idPromocao;
    }

    public List<Rota> getLista() {
        return lista;
    }

    public void setLista(List<Rota> lista) {
        this.lista = lista;
    }
}

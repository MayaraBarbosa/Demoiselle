/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.data.crud.CrudAeroportos;
import br.data.crud.CrudRota;
import br.data.entity.Aeroportos;
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
    
    private Aeroportos aeroportoorigem;
    private Aeroportos aeroportodestino;
    private Date datahora_partida;
    private Date datahora_chegada;
    private double frequencia;
    private double duracao_voo;
    private int idPromocao;
    private List<Aeroportos> aeroportos;
    
    public JsfRota() { 
        this.aeroportos = new CrudAeroportos().getAll();
    } 
    
    public List<Rota> getLista() {
        List<Rota> result = new CrudRota().getAll();
        return result;
    }
    
    public String persist() {
        Rota rota = new Rota();
        
        rota.setDestino(aeroportodestino);
        rota.setOrigem(aeroportoorigem);
        rota.setDatahora_chegada(datahora_chegada);
        rota.setDatahora_partida(datahora_partida);
        rota.setDuracao_voo(duracao_voo);
        rota.setFrequencia(frequencia);
        rota.setIdPromocao(idPromocao);
        
        new CrudRota().persist(rota);
        limparFormulario();
        return "listall.xhtml";
    }
    
    public String remove(Rota rota) {
        new CrudRota().remove(rota);
        return "listall.xhtml";
    }
    
    public void merge() {
        CrudRota crud = new CrudRota();
        Rota rota = crud.find(idrota);
        
        rota.setDestino(aeroportodestino);
        rota.setOrigem(aeroportoorigem);
        rota.setDatahora_chegada(datahora_chegada);
        rota.setDatahora_partida(datahora_partida);
        rota.setDuracao_voo(duracao_voo);
        rota.setFrequencia(frequencia);
        rota.setIdPromocao(idPromocao);
        
        crud.merge(rota);
        limparFormulario();
    }
    
    private void limparFormulario() {
        this.setAeroportodestino(null);
        this.setAeroportoorigem(null);
        this.setDatahora_chegada(null);
        this.setDatahora_partida(null);
        this.setDuracao_voo(0);
        this.setFrequencia(0);
        this.setIdPromocao(0);
        this.setIdrota(0);
    }
    
    public String update(Rota rota){
        this.idPromocao = rota.getIdPromocao();
        this.aeroportodestino = rota.getDestino();
        this.aeroportoorigem = rota.getOrigem();
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

    public Aeroportos getAeroportoorigem() {
        return aeroportoorigem;
    }

    public void setAeroportoorigem(Aeroportos aeroportoorigem) {
        this.aeroportoorigem = aeroportoorigem;
    }

    public Aeroportos getAeroportodestino() {
        return aeroportodestino;
    }

    public void setAeroportodestino(Aeroportos aeroportodestino) {
        this.aeroportodestino = aeroportodestino;
    }
    
    public List<Aeroportos> getAeroportos() { 
        return this.aeroportos; 
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
}

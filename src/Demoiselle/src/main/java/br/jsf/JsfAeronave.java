/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Tamy
 */
@Named(value = "jsfAeronave")
@Dependent
public class JsfAeronave {
private int idaeronave;
private String modelo;
private String tempoVoo;
private Integer idfabricante;
private Integer assentos;
private Integer ano;

    public JsfAeronave() {
    }
    
    public void persist(){
        br.data.entity.Aeronave aeronave = new br.data.entity.Aeronave();
        aeronave.setIdaeronave(idaeronave);
        aeronave.setModelo(modelo);
        aeronave.setAno(ano);
        aeronave.setAssentos(assentos);
        aeronave.setTempoVoo(tempoVoo);
        aeronave.setIdfabricante(idfabricante);
        new br.data.crud.CrudAeronave().persist(aeronave);
        this.idaeronave = 0;
        this.modelo = "";
        this.ano = 0;
        this.assentos = 0;
        this.tempoVoo="";
        this.idfabricante = 0;
              
    }
    
    public String update(br.data.entity.Aeronave aeronave){
        this.idaeronave = aeronave.getIdaeronave();
        this.modelo = aeronave.getModelo();
        this.ano = aeronave.getAno();
        this.assentos = aeronave.getAssentos();
        this.tempoVoo = aeronave.getTempoVoo();
        this.idfabricante = aeronave.getIdfabricante();
        return "merge.xhtml";
    }
    
    public void merge(){
        br.data.entity.Aeronave aeronave;
        aeronave = new br.data.crud.CrudAeronave().find(this.idaeronave);
        aeronave.setIdaeronave(idaeronave);
        aeronave.setModelo(modelo);
        aeronave.setAno(ano);
        aeronave.setAssentos(assentos);
        aeronave.setTempoVoo(tempoVoo);
        aeronave.setIdfabricante(idfabricante);
        new br.data.crud.CrudAeronave().persist(aeronave);
        this.idaeronave = 0;
        this.modelo = "";
        this.ano = 0;
        this.assentos = 0;
        this.tempoVoo="";
        this.idfabricante = 0;

    }   

    public int getIdaeronave() {
        return idaeronave;
    }

    public void setIdaeronave(int idaeronave) {
        this.idaeronave = idaeronave;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTempoVoo() {
        return tempoVoo;
    }

    public void setTempoVoo(String tempoVoo) {
        this.tempoVoo = tempoVoo;
    }

    public Integer getIdfabricante() {
        return idfabricante;
    }

    public void setIdfabricante(Integer idfabricante) {
        this.idfabricante = idfabricante;
    }

    public Integer getAssentos() {
        return assentos;
    }

    public void setAssentos(Integer assentos) {
        this.assentos = assentos;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }
    
}

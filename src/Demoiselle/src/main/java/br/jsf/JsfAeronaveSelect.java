/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.data.crud.CrudAeronave;
import br.data.entity.Aeronave;
import java.util.Collection;
import javax.inject.Named;
import javax.enterprise.context.Dependent;

/**
 *
 * @author Tamy
 */
@Named(value = "jsfAeronaveSelect")
@Dependent
public class JsfAeronaveSelect {

    private int idaeronave;
    private String modelo;
    private String tempoVoo;
    private Integer idfabricante;
    private Integer assentos;
    private Integer ano;
    
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

    public JsfAeronaveSelect() {
    }

    public java.util.Collection<br.data.entity.Aeronave> getSelect(){
        return new br.data.crud.CrudAeronave().SelectByModelo(this.modelo);
    }

}

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
 * @author MayaraBarbosa
 */
@ManagedBean
@SessionScoped
public class JsfAeroportosSelect {

    public JsfAeroportosSelect(){}
    
    private int idaeroporto;
    private String nome;
    private String sigla;
    private float latitude;
    private float longitude;

  
    /**
     * @return the idaeroporto
     */
    public int getIdaeroporto() {
        return idaeroporto;
    }

    /**
     * @param idaeroporto the idaeroporto to set
     */
    public void setIdaeroporto(int idaeroporto) {
        this.idaeroporto = idaeroporto;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    /**
     * @return the latitude
     */
    public float getLatitude() {
        return latitude;
    }

    /**
     * @param latitude the latitude to set
     */
    public void setLatitude(float latitude) {
        this.latitude = latitude;
    }

    /**
     * @return the longitude
     */
    public float getLongitude() {
        return longitude;
    }

    /**
     * @param longitude the longitude to set
     */
    public void setLongitude(float longitude) {
        this.longitude = longitude;
    }
    
    public java.util.Collection<br.data.entity.Aeroportos> getSelect(){
        return new br.data.crud.CrudAeroportos().SelectByNome(this.nome);
    }
    
  }

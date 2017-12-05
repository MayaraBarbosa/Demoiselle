/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

/**
 *
 * @author MayaraBarbosa
 */
@ManagedBean
@RequestScoped
public class JsfAeroportos {

    private int idaeroporto;
    private String nome;
    private String sigla;
    private float latitude;
    private float longitude;
    
    
    public JsfAeroportos(){
    }
       
    public void persist(){
       br.data.entity.Aeroportos aer = new br.data.entity.Aeroportos();
       aer.setIdaeroporto(idaeroporto);
       aer.setNome(nome);
       aer.setSigla(sigla);
       aer.setLatitude(latitude);
       aer.setLongitude(longitude);
       new br.data.crud.CrudAeroportos().persist(aer);
       this.idaeroporto=0;
       this.nome="";
       this.sigla = "";
       this.latitude = (float) 0.0;
       this.longitude = (float) 0.0;
    }
    
    public void remove(br.data.entity.Aeroportos aeroportos){
        new br.data.crud.CrudAeroportos().remove(aeroportos);
    }
    
    public java.util.Collection<br.data.entity.Aeroportos> getAll(){
        return new br.data.crud.CrudAeroportos().getAll();
    }

    public String update(br.data.entity.Aeroportos aeroportos){
        this.idaeroporto = aeroportos.getIdaeroporto();
        this.nome = aeroportos.getNome();
        this.sigla = aeroportos.getSigla();
        this.latitude = aeroportos.getLatitude();
        this.longitude = aeroportos.getLongitude();
        return "merge.xhtml";
    }
    
    public void merge(){
        br.data.entity.Aeroportos teste;
        teste = new br.data.crud.CrudAeroportos().find(this.idaeroporto);
        teste.setNome(this.nome);
        new br.data.crud.CrudAeroportos().merge(teste);
        this.nome="";
        this.idaeroporto=0;
        this.sigla="";
        this.latitude = (float) 0.0;
        this.longitude = (float) 0.0;

    }
    
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
    
}

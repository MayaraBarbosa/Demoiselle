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
 * @author admin
 */
@ManagedBean
@SessionScoped
public class JsfCancelarVooSelect {

    /**
     * Creates a new instance of JsfCidadeSelect
     */
    public JsfCancelarVooSelect() {
    }

    private int idvoo;
    private String destino;
    private int horariosaida;
    private int horariochegada;
    private String motivocancelamento;
    private int idsupervisor;
    private int idpiloto;
    private int idaeronave;
    private int idpassageiro;

    public int getIdvoo() {
        return idvoo;
    }

    public void setIdvoo(int idvoo) {
        this.idvoo = idvoo;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getHorariosaida() {
        return horariosaida;
    }

    public void setHorariosaida(int horariosaida) {
        this.horariosaida = horariosaida;
    }

    public int getHorariochegada() {
        return horariochegada;
    }

    public void setHorariochegada(int horariochegada) {
        this.horariochegada = horariochegada;
    }

    public String getMotivocancelamento() {
        return motivocancelamento;
    }

    public void setMotivocancelamento(String motivocancelamento) {
        this.motivocancelamento = motivocancelamento;
    }

    public int getIdsupervisor() {
        return idsupervisor;
    }

    public void setIdsupervisor(int idsupervisor) {
        this.idsupervisor = idsupervisor;
    }

    public int getIdpiloto() {
        return idpiloto;
    }

    public void setIdpiloto(int idpiloto) {
        this.idpiloto = idpiloto;
    }

    public int getIdaeronave() {
        return idaeronave;
    }

    public void setIdaeronave(int idaeronave) {
        this.idaeronave = idaeronave;
    }

    public int getIdpassageiro() {
        return idpassageiro;
    }

    public void setIdpassageiro(int idpassageiro) {
        this.idpassageiro = idpassageiro;
    }

}

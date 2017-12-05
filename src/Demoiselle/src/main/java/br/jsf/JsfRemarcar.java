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
 * @author Kelson
 */
@ManagedBean
@RequestScoped
public class JsfRemarcar {

    private int id;
    private String nome;
    private String descricao;
    private boolean disponível;
    private boolean assentoVago;
    private boolean assentoOcupado;
    private int totalAssentosVagos;
    private int totalAssentosOcupados;
    private int totalAssentos;
    private String tipoPassagem;

    public JsfRemarcar() {

    }

    public void persist() {
        br.data.entity.Remarcar rem = new br.data.entity.Remarcar();
        rem.setId(id);
        rem.setDescricao(descricao);
        new br.data.crud.CrudRemarcar().persist(rem);
        this.id = 0;
    }

    public void remove(br.data.entity.Remarcar remarcar) {
        new br.data.crud.CrudRemarcar().remove(remarcar);
    }

    public java.util.Collection<br.data.entity.Remarcar> getAll() {
        return new br.data.crud.CrudRemarcar().getAll();
    }

    public String update(br.data.entity.Remarcar remarcar) {
        this.id = remarcar.getIdRemarcar();
        this.descricao = remarcar.getDescricao();
        return "merge.xhtml";
    }

    public void merge() {
        br.data.entity.Remarcar remarcar;
        remarcar = new br.data.crud.CrudRemarcar().find(this.id);
        remarcar.setDescricao(this.descricao);
        new br.data.crud.CrudRemarcar().merge(remarcar);
        this.descricao = "";
        this.id = 0;
    }

    public boolean verificarDisponibilidaAssento() {
        for (int i = 0; i <= totalAssentos; i++) {
            if (totalAssentosVagos != 0) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public double calcTarifa(String tipo, double valorPassagem) {
        if (this.tipoPassagem.equalsIgnoreCase(tipo) && (tipo.equals("economica"))) {
            return valorPassagem * 0.05;
        } else {
            return valorPassagem * 0.10;
        }
    }

    public void remarcarPassagem() {
        if (verificarDisponibilidaAssento()) {
            merge();
        } else {
            System.out.println("Não foi possível continuar a operação! Todos os assentos já estão ocupados!");
        }
    }

    public int verificaTotal() {
        return totalAssentos;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean isAssentoVago() {
        return assentoVago;
    }

    public void setAssentoVago(boolean assentoVago) {
        this.assentoVago = assentoVago;
    }

    public boolean isAssentoOcupado() {
        return assentoOcupado;
    }

    public void setAssentoOcupado(boolean assentoOcupado) {
        this.assentoOcupado = assentoOcupado;
    }

    public int getTotalAssentosVagos() {
        return totalAssentosVagos;
    }

    public void setTotalAssentosVagos(int totalAssentosVagos) {
        this.totalAssentosVagos = totalAssentosVagos;
    }

    public int getTotalAssentosOcupados() {
        return totalAssentosOcupados;
    }

    public void setTotalAssentosOcupados(int totalAssentosOcupados) {
        this.totalAssentosOcupados = totalAssentosOcupados;
    }

    public boolean isDisponível() {
        return disponível;
    }

    public void setDisponível(boolean disponível) {
        this.disponível = disponível;
    }

    public int getTotalAssentos() {
        return totalAssentos;
    }

    public void setTotalAssentos(int totalAssentos) {
        this.totalAssentos = totalAssentos;
    }

    public String getTipoPassagem() {
        return tipoPassagem;
    }

    public void setTipoPassagem(String tipoPassagem) {
        this.tipoPassagem = tipoPassagem;
    }

}

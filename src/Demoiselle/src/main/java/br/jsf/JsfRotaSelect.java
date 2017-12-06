/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.data.crud.CrudRota;
import br.data.entity.Rota;
import java.util.Collection;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ValueChangeEvent;

/**
 *
 * @author henrique
 */
@ManagedBean
@SessionScoped
public class JsfRotaSelect  {

    /**
     * Creates a new instance of JsfCidadeSelect
     */
    public JsfRotaSelect() { }
    
    private int idrota;
    private int aeroportoorigem;
    private int aeroportodestino;
    private List<Rota> rotas;

    public Collection<Rota> getRotas() {
        return rotas;
    }
    
    public void getSelect(){
        List<Rota> rotasResult = new CrudRota().selectByAeroporto(aeroportoorigem, aeroportodestino); 
        this.rotas = rotasResult;
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
    
    public void aeroportoorigemChangeListener(ValueChangeEvent evt) { 
        this.aeroportoorigem = (int)evt.getNewValue(); 
    } 
     
    public void aeroportodestinoChangeListener(ValueChangeEvent evt) { 
        this.aeroportodestino = (int)evt.getNewValue(); 
    } 
    
    public int getIdrota() {
        return idrota;
    }
}
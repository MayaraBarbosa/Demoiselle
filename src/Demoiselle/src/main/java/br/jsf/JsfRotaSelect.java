/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.jsf;

import br.data.crud.CrudRota;
import br.data.entity.Rota;
import java.util.Collection;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

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
    private Collection<Rota> rotas;

    public Collection<Rota> getRotas() {
        return rotas;
    }
    
    public void getSelect(){
        this.rotas = new CrudRota().selectByAeroporto(this.aeroportoorigem, this.aeroportodestino);
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
    
    public int getIdrota() {
        return idrota;
    }
}
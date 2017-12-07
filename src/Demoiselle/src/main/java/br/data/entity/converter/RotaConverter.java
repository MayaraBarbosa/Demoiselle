/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.entity.converter;

import br.data.crud.CrudRota;
import br.data.entity.Aeroportos;
import br.data.entity.Rota;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Gabriel Luz
 */
@FacesConverter(value = "rotaConverter")
public class RotaConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if (string == null || string.trim().equals(""))
            return null;
        
        Rota rota = null;
        for(Rota r : new CrudRota().getAll()) {
            Aeroportos origem = r.getOrigem();
            Aeroportos destino = r.getDestino();
            String nome = origem.toString() + " - " + destino.toString();
            if (nome.equals(string))
                rota = r;
        }        
        
        return rota;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        return "";
    }
    
}

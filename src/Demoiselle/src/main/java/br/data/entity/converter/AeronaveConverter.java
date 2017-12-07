/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.entity.converter;

import br.data.crud.CrudAeronave;
import br.data.entity.Aeronave;
import java.util.List;
import java.util.function.Predicate;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Gabriel Luz
 */
@FacesConverter(value = "aeronaveConverter")
public class AeronaveConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        if (string == null || string.trim().equals(""))
            return null;
        
        Aeronave aeronave = null;
        for(Aeronave a : new CrudAeronave().getAll()) {
            String descricao = a.getModelo() + " - " + a.getAno();
            if (descricao.equals(string))
                aeronave = a;
        }        
        
        return aeronave;
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        if (o instanceof String) {
            return null;
        }
        if(o != null) {
            return String.valueOf(((Aeronave) o).getIdaeronave());
        }
        else {
            return null;
        }
    }
}

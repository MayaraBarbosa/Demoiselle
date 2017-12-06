/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.entity.converter;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author bruno
 */
@FacesConverter(value="dataConverter")
public class DataConverter implements Converter {

    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        return LocalDate.parse(string, DateTimeFormatter.ofPattern("dd/MM/yyyy")
                .withLocale(new Locale("pt", "BR")));
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        LocalDate data = (LocalDate) o;
        return data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"));
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.data.entity.converter;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

/**
 *
 * @author Gabriel Luz
 */
@FacesConverter(value="dataHoraConverter")
public class DataHoraConverter implements Converter {
    @Override
    public Object getAsObject(FacesContext fc, UIComponent uic, String string) {
        return LocalDate.parse(string, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm")
                .withLocale(new Locale("pt", "BR")));
    }

    @Override
    public String getAsString(FacesContext fc, UIComponent uic, Object o) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDate data = (LocalDate) o;
        LocalDateTime data2 = LocalDateTime.of(data, LocalTime.MIN);
        return dtf.format(data2);
    }
}

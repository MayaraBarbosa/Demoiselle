/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.util;

import java.sql.Date;
import java.time.LocalDate;
import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

/**
 *
 * @author bruno
 *
@Converter(autoApply = true)
public class LocalDateConverterAttribute implements AttributeConverter<LocalDate, Date> {

    @Override
    public Date convertToDatabaseColumn(LocalDate x) {
        System.out.println("LocalDate: " + x.getDayOfMonth());
         return (x == null ? null : Date.valueOf(x));
    }

    @Override
    public LocalDate convertToEntityAttribute(Date y) {
        System.out.println("Date: " + y.getTime());
        return (y == null? null : y.toLocalDate());
    }
    
}*/

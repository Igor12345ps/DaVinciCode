/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.raven.util;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author ipere
 */
public class ConvertStringToDate {
    
    public static Date convertToDate(String[] splitedDate) {
        // Verifica se o array tem os 3 elementos esperados
        if (splitedDate == null || splitedDate.length != 3) {
            throw new IllegalArgumentException("O array de data deve conter três elementos: dia, mês e ano");
        }

        try {
            // Convertendo para números inteiros
            int day = Integer.parseInt(splitedDate[0]);
            int month = Integer.parseInt(splitedDate[1]);
            int year = Integer.parseInt(splitedDate[2]);

            // Criando um objeto Calendar e configurando a data
            Calendar calendar = Calendar.getInstance();
            calendar.set(Calendar.YEAR, year);
            calendar.set(Calendar.MONTH, month - 1); // Mês é base 0 (janeiro = 0)
            calendar.set(Calendar.DAY_OF_MONTH, day);

            // Obtendo o objeto java.util.Date
            Date date = calendar.getTime();

            return date;
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Os valores no array de data devem ser números válidos: " + e.getMessage());
        }
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Helpers;

import java.time.LocalDate;
import java.time.ZoneId;

/**
 *
 * @author vuhai
 */
public class DateHelper {

    public static java.util.Date convertLocalDateToDate(LocalDate localDate) {
        return java.util.Date.from(localDate.atStartOfDay().atZone(ZoneId.systemDefault()).toInstant());
    }

    public static java.sql.Date convertLocalDateToSqlDate(LocalDate localDate) {
        java.sql.Date sqlDate = new java.sql.Date(convertLocalDateToDate(localDate).getTime());
        return sqlDate;
    }
}

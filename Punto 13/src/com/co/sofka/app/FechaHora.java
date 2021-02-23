package com.co.sofka.app;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FechaHora {
    public static void main(String[] args) {

        Date date = new Date();

        DateFormat hourDateFormat = new SimpleDateFormat("(yyy/MM/dd) (HH:mm:ss");
        System.out.println("La fecha y la Hora es: " + hourDateFormat.format(date));

    }
}

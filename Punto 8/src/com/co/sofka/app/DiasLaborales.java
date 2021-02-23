package com.co.sofka.app;

import javax.swing.*;

public class DiasLaborales {
    public static void main(String[] args) {

        String dia = JOptionPane.showInputDialog("Por favor escriba un día de la Semana");

        switch (dia) {

            case "Lunes":
            case "Martes":
            case "Miércoles":
            case "Jueves":
            case "Viernes":
            case "Sábado":
                System.out.println("Es un día laboral");
                break;
            case "Domingo":
                System.out.println("Hoy no es un día laboral");
            default:
                System.out.println("Por favor ingrese un día de la semana válido");
        }

    }
}

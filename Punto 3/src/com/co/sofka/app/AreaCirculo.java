package com.co.sofka.app;

import javax.swing.*;

public class AreaCirculo {
    public static void main(String[] args) {

        String setRadio = JOptionPane.showInputDialog("Ingresa un valor de Radio");

        double radio = Double.parseDouble(setRadio);

        double area = Math.PI * Math.pow(radio, 2);

        System.out.println("El área total del círculo es: " + area);


    }
}

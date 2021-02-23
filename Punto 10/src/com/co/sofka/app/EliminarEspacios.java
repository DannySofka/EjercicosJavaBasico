package com.co.sofka.app;

import javax.swing.*;

public class EliminarEspacios {
    public static void main(String[] args) {

        String texto = JOptionPane.showInputDialog(null, "Ingresa una frase",
                JOptionPane.INFORMATION_MESSAGE);

        String frase_sin_espacios = "";

        char caracterActual;

        for (int i = 0; i < texto.length(); i++) {
            caracterActual = texto.charAt(i);

            if (caracterActual != ' ') {
                frase_sin_espacios=String.valueOf(caracterActual);
            }
        }
        JOptionPane.showMessageDialog(null, "La frase sin espacios es " + frase_sin_espacios,
                "Resultado", JOptionPane.INFORMATION_MESSAGE);


    }
}


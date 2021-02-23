package com.co.sofka.app;

import javax.swing.*;
import java.util.InputMismatchException;

public class NumeroMayor {
    public static void main(String[] args) {

        int num;

        do {
            String numero = JOptionPane.showInputDialog("Por favor ingresa un número");
            num = Integer.parseInt(numero);
        } while (num < 0);
        System.out.println(num);

    }

}

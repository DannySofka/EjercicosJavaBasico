package com.co.sofka.app;

import javax.swing.*;
import java.util.Scanner;


public class MainApp {
    public static void main(String[] args) {

        int num = 0;

        System.out.println("Ingrese un número: ");
        Scanner numero = new Scanner(System.in);
        num = numero.nextInt();
        while (num < 1000) {

            System.out.println("Número: " + num);
            num += 2;
        }

    }
}

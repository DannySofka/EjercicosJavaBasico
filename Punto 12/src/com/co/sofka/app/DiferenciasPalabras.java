package com.co.sofka.app;

import java.util.Scanner;

public class DiferenciasPalabras {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Escribe la primera palabra");
        String palabra1 = sc.next();

        System.out.println("Escribe la segunda palabra");
        String palabra2 = sc.next();

        if (palabra1.equals(palabra2)) {
            System.out.println("Las palabras ingresadas son iguales");
        } else {
            System.out.println("Las palabras ingresadas no son iguales");
        }
    }
}

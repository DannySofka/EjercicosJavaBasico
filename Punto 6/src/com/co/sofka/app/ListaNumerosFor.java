package com.co.sofka.app;

public class ListaNumerosFor {
    public static void main(String[] args) {

        System.out.println("Lista de números Pares");
        int x;

        for (int i = 1; i < 50; i++) {
            x = i * 2;
            System.out.println("Número par: " + x);

        }
        System.out.println("Lista de números Impares");

        int y;

        for (int i = 1; i < 100; i++) {
            y = i + 2;
            System.out.println("Número Impar: " + i++);


        }

    }
}






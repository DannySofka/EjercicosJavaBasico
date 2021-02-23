package com.co.sofka.app;

public class Vocales {
    public static void main(String[] args) {

        String cadena = "Cuidamos nuestro entorno, multiplicando experiencias exitosas";
        int contador = 0;
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == 'a' ||
                    cadena.charAt(i) == 'e' ||
                    cadena.charAt(i) == 'i' ||
                    cadena.charAt(i) == 'o' ||
                    cadena.charAt(i) == 'u') {
                contador++;
            }
            System.out.println("La cadena tiene " + cadena.length() + " caracteres");
            System.out.println("La frase tiene " + contador + " vocales");
        }

    }

}

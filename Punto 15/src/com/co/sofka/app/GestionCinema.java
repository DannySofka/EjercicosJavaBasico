package com.co.sofka.app;

import java.util.Scanner;

public class GestionCinema {
    public static void main(String[] args) {

        int opc;
        boolean repet = true;
        do {
            System.out.println(" **********GESTIÓN CINEMATOGRÁFICA**********");
            System.out.println("1. NUEVO ACTOR.");
            System.out.println("2. BUSCAR ACTOR.");
            System.out.println("3. ELIMINAR ACTOR.");
            System.out.println("4. MODIFICAR ACTOR.");
            System.out.println("5. VER TODOS LOS ACTOR.");
            System.out.println("6. VER TODAS LAS PELICULAS DE LOS ACTORES.");
            System.out.println("7. VER CATEGORÍA DE LAS PELÍCULAS DE LOS ACTORES.");
            System.out.println("8. SALIR.");

            Scanner opcion = new Scanner(System.in);

            opc = opcion.nextInt();

            switch (opc) {
                case 1: {
                    repet = true;
                    break;
                }
                case 2: {
                    repet = true;
                    break;
                }
                case 3: {
                    repet = true;
                    break;
                }
                case 4: {
                    repet = true;
                    break;
                }
                case 5: {
                    repet = true;
                    break;
                }
                case 6: {
                    repet = true;
                    break;
                }
                case 7: {
                    repet = true;
                    break;
                }
                case 8: {
                    repet = false;
                    break;
                }
                default: {
                    System.out.println("Opción incorrecta.");
                    repet = true;
                }
            }
        } while (repet == true);
    }
}


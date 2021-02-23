package co.com.sofka.app;

import javax.swing.*;

public class PrecioProducto {
    public static void main(String[] args) {

        final double IVA = 0.21;

        String precioInicial = JOptionPane.showInputDialog("Por favor ingrese el precio del producto");

        double precio = Double.parseDouble(precioInicial);

        double precioFinal = precio + (precio * IVA);

        System.out.println(precioFinal);


    }

}

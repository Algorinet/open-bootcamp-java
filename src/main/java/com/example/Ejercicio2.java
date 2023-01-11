package com.example;

public class Ejercicio2 {

    public static void main(String[] args) {
        double priceProduct = 345.99;
        double genericIva = 3.40;

        System.out.println("El precio del producto es: " + getPrecioWithIva(priceProduct, genericIva));
    }

    private static double getPrecioWithIva(double priceProduct, double genericIva) {

        return (priceProduct + genericIva);
    }
}

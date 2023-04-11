/*
Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i. * 0.86 libras es un 1 €
ii. * 1.28611 u$d es un 1 €
iii. * 129.852 yenes es un 1 €

 */
package com.mycompany.guia4;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de Euros");
        double num = leer.nextDouble();
        String moneda;
        do {
            System.out.println("Ingrese la moneda a convertir (L = libras / D = dolares / Y = yenes)");
            moneda = leer.next();
        } while (!(moneda.equalsIgnoreCase("L")) && !(moneda.equalsIgnoreCase("D")) && !(moneda.equalsIgnoreCase("Y")));
        convertir(num, moneda);
    }

    public static void convertir(double num, String moneda) {
        switch (moneda.toUpperCase()) {
            case "L":
                System.out.println("La cantidad de libras es " + num * 0.86);
                break;
            case "D":
                System.out.println("La cantidad de dolares es " + num * 1.28611);
                break;
            case "Y":
                System.out.println("La cantidad de yenes es " + num * 129.852);
                break;
        }

    }
}
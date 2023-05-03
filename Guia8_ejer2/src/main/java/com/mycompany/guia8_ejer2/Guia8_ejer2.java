/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.guia8_ejer2;

import entidad.Cafetera;
import java.util.Scanner;
import servicio.CafeteraServicio;

/**
 *
 * @author John
 */
public class Guia8_ejer2 {
    //public Scanner leer = new Scanner(System.in).useDelimiter("\n"); //abajo de class

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); //abajo de class
        CafeteraServicio cafes = new CafeteraServicio();
        Cafetera cafe = new Cafetera(100, 100);

        int opcion;
        do {
            System.out.println("1- Llenar cafetera"); //arreglar que no este en 0
            System.out.println("2- Servir cafe");
            System.out.println("3- Vaciar cafetera");
            System.out.println("4- Agregar cafe");
            System.out.println("5- Salir");

            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    cafes.llenarCafetera(); 
                    break;
                case 2:
                    System.out.println("Ingrese el tamaño de la taza");
                    int taza = leer.nextInt();
                    cafes.servirTaza(taza);
                    break;
                case 3:
                    cafes.vaciarCafetera();
                    break;
                case 4:
                    System.out.println("Cuanto cafe va a agragar?");
                    int agregar = leer.nextInt();
                    cafes.agregarCafe(agregar);
                    break;

                case 5:
                    System.out.println("Hasta la proxima");
                    break;
                default:
                    System.out.println("Opcion incorrecta");
                    break;
            }
            System.out.println("");
            System.out.println("");
        } while (opcion != 5);

    }
}

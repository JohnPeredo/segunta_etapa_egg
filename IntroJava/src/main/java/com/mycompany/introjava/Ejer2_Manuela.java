/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.introjava;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Ejer2_Manuela {

static Scanner Ej2 = new Scanner(System.in);
            
    public static void main(String[] args) {

         int k = 0;
        String op = "";
        
        System.out.println("Ingrese la cantidad de personas: ");

        int n = Ej2.nextInt();
        Ej2.nextLine(); //Agrego esto

        Info(n, k, op);

        System.out.println("La lista ah terminado");
        
    }

    public static void Info(int n, int k, String op) {
       
        do {

            for (int i = 0; i < n; i++) { //la condicion

                k++;
                
                System.out.println("personas " + i + " ingrese sus datos: ");

                System.out.println("Nombre: ");

                String nombre = Ej2.nextLine();

                System.out.println("Edad: ");

                int edad = Ej2.nextInt();

                if (edad < 18) {

                    System.out.println(nombre + " es mayor de edad");

                } else {

                    System.out.println(nombre + " es menor de edad");
                }

                System.out.println("Desea continuar (s/n): ");

                op = Ej2.nextLine();

            }
        } while (op.equalsIgnoreCase("n"));
    }        
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia5;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vector = new int[n];
        
        for (int i = 0; i < n; i++) {
            vector[i] = (int) (Math.random() * 100) + 1;
            System.out.println(vector[i]);
        }
        
        System.out.println("ingrese el numero a buscar");
        int recorrido = leer.nextInt();
        int cont = 0;
        
        for (int i = 0; i < n; i++) {
            if (vector[i] == recorrido) {
                cont++;
                System.out.println("se encontro el numero en el lugar " + (i + 1));
            }
        }
        
        System.out.println("se encontro las siguientes veces " + cont);
    }
}

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
public class Ejer1_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Cuantos numeros vas a sumar?");
        int numeros = leer.nextInt()+1; //Ese +1 es por el lugar del resultado
        int[] vector = new int[numeros];
        int suma = 0;
        
        for (int i = 0; i < numeros; i++) {
            if (i==(numeros-1)) {
                vector[i] = suma;
                System.out.println("La suma total es de: " + vector[i]);
            }else {
                System.out.println("ingrse un numero");
                vector[i]= leer.nextInt();
            }
            suma = suma +vector[i];
        }
    }
    
}

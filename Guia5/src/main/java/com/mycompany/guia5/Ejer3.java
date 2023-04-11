/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia5;

import java.util.Random;
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
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        System.out.println("Ingrese la cantidad de numeros");
        int tamaño = leer.nextInt();
        int[] vector = new int[tamaño];
        int uno =0 ;
        int dos = 0;
        int tres = 0;
        int cuatro = 0;
        int cinco = 0;
        
        for (int i = 0; i < tamaño; i++) {
            vector[i] = aleatorio.nextInt(99999) + 1; //leer.nextInt();
            System.out.println(vector[i]);
            //import java.util.Random;
        }
        for (int i = 0; i < tamaño; i++) {
            if (vector[i]>0 && vector[i]<10) {
                uno++;
           }
            if (vector[i]>9 && vector[i]<100) {
                dos++;
           }
            if (vector[i]>99 && vector[i]<1000) {
                tres++;
           }
            if (vector[i]>999 && vector[i]<10000) {
                cuatro++;
           }
            if (vector[i]>9999) {
                cinco++;
           }
        }
        System.out.println("La cantidad de numeros de un digito es: "+uno );
        System.out.println("La cantidad de numeros de dos digitos es: "+dos );
        System.out.println("La cantidad de numeros de tres digitos es: "+tres );
        System.out.println("La cantidad de numeros de cuatro digitos es: "+cuatro );
        System.out.println("La cantidad de numeros de cinco digitos es: "+cinco );
        
        
    }
    
}

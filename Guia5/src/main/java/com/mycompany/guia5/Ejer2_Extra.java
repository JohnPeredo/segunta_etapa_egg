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
public class Ejer2_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de los vectores");
        int n = leer.nextInt();
        int[] vector1 = new int[n];
        int[] vector2 = new int[n];
        int cont =0;
        
        
        for (int i = 0; i < n; i++) {
            System.out.println("Valor vec 1 nro: "+ (i+1));
            vector1[i] = leer.nextInt();
            System.out.println("Valor vec 2 nro: " + (i+1));
            vector2[i] = leer.nextInt();
        }
        
        
        
        for (int i = 0; i < n; i++) {
            if (vector1[i]==vector2[i]) {
                cont++;
            }
            
        }
        if (cont != vector1.length) {
            System.out.println("No son gemelos los vectores");
            
        }else {
            System.out.println("Son gemelos");
        }
        
        
        
    }
    
}

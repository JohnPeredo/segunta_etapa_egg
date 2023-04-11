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
public class Ejer3_Extra {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int n = leer.nextInt();
        int[] vec = new int[n];
        rellenar(vec);
        mostrar(vec);

    }

    public static int [] rellenar(int[] vec) { // [] para pasarle un vector
        for (int i = 0; i < vec.length; i++) {
        vec[i] = (int) (Math.random() * 100); 
        }
        return vec;
    }

    public static void mostrar(int [] vec) {
        for (int i = 0; i < vec.length ; i++) {
            System.out.print(" " + vec[i]);
        }
    }

}

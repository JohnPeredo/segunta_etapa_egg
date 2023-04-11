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
public class Ejer5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Random aleatorio = new Random();
        int[][] matriz = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] = aleatorio.nextInt(100) + 1;

                System.out.print(" " + matriz[i][j]);
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println("");
        
        if ((matriz[0][1] == -matriz[1][0]) && (matriz[0][2] == -matriz[2][0]) && (matriz[1][2] == -matriz[2][1])) {
            System.out.println(" Si es antisimetrica");

        } else {
            System.out.println("No es antisimetrica");
        }
    }

}

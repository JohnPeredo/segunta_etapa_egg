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
public class Ejer4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer =new Scanner(System.in); 
        Random aleatorio = new Random();
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[j][i] = aleatorio.nextInt(100)+1;
                System.out.print(" "+matriz[j][i]);    
            }
            System.out.println("");
        }
        
        System.out.println("");
        System.out.println(""); //Para separar visualmente en la consola
        System.out.println("");
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(" "+matriz[i][j]);   //Solo se cambia i con j de lugar para hacer la transpuesta
            }
            System.out.println("");
        }
    }
    
}

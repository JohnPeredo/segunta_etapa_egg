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
public class Ejer6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int[][] matriz = new int[4][4];
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==3) {
                    matriz[3][j] =  matriz[i][0] + matriz[i][1] + matriz[i][2];
                }else if (j==3) {
                    matriz[i][3] =  matriz[0][j] + matriz[1][j] + matriz[2][j];
                } else {
                     matriz[i][j] = leer.nextInt(); 
                }
                       
                 
            }
            System.out.println("renglon");
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
            System.out.println("");
        }
        System.out.println(matriz[3][0]);
        
        
        int num = matriz[0][0] +matriz[1][1]+ matriz[2][2];
    
        
        // TODO code application logic here
        
        
        int sumaFila1 = matriz[0][0] + matriz[0][1] + matriz[0][2];
        int sumaFila2 = matriz[1][0] + matriz[1][1] + matriz[1][2];
        int sumaFila3 = matriz[2][0] + matriz[2][1] + matriz[2][2];
        int sumaColumna1 = matriz[0][0] + matriz[1][0] + matriz[2][0];
        int sumaColumna2 = matriz[0][1] + matriz[1][1] + matriz[2][1];
        int sumaColumna3 = matriz[0][2] + matriz[1][2] + matriz[2][2];
        int sumaDiagonal1 = matriz[0][0] + matriz[1][1] + matriz[2][2];
        int sumaDiagonal2 = matriz[0][2] + matriz[1][1] + matriz[2][0];
    }
    
}

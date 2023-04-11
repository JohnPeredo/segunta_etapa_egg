/*+
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia5;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Ejer4_Extra {

    static Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[][] matriz = new int[10][6]; //i es 10, cantidad de lineas
        String[] nombres = new String[10];
        String[] notas = new String[7];
        int cont=0;
        rellenomatriz(matriz, nombres,cont);
        rellenarNotas(notas);
        mostrar(notas, matriz, nombres,cont);

        
        
    }
        private static String[] rellenarNotas(String[] notas) {
        notas[0] = "Nombres ";
        notas[1] = "1er tp  ";
        notas[2] = "2do tp  ";
        notas[3] = "1er int ";
        notas[4] = "2do int ";
        notas[5] = "Promedio";
        notas[6] = "Aprobo? ";
        return notas;
    }

    public static void rellenomatriz(int[][] matriz, String[] nombres,int cont) {
        for (int i = 0; i < matriz.length; i++) {

            System.out.println("Ingrese el nombre del alumno Nro; " + (i + 1));
            nombres[i] = leer.nextLine();
            cont =0;
            for (int j = 0; j < matriz[i].length; j++) {
                if (j==(matriz.length-1)) {
                   matriz[i][j] = cont; 
                }else {
                     matriz[i][j] = 9;//leer.nextInt();
                     cont=cont+matriz[i][j];
                }
               

            }
        }

    }

    public static void mostrar(String[] notas, int[][] matriz, String[] nombres,int cont) {
        for (int i = 0; i < notas.length; i++) {
            System.out.print(" " + notas[i]);
        }
        System.out.println("");

        for (int i = 0; i < matriz.length; i++) {
            System.out.print(nombres[i]+" ");
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.print(matriz[i][j]);
            }
            System.out.println("");
        }
        System.out.println(cont);
    }


}

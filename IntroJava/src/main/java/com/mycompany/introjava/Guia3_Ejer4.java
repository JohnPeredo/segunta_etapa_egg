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
public class Guia3_Ejer4 {

    /**
     * @param args the command line arguments
     * 
     *     else if(frase.substring(0, 1).equals("a")){
        System.out.println("Si empieza con a");
    }
     * 
     */
    public static void main(String[] args) {
        
    Scanner Leer = new Scanner(System.in);
    System.out.print("Ingrese una palabra o frase: ");
    String frase = Leer.nextLine();
    /*
    frase.substring(0, 1), el 0 es la posicion donde arranca y el 1 la cantidad de pasos que avanza
    */
    if (frase.substring(0, 1).equals("A") || frase.substring(0, 1).equals("a")) {
      System.out.println("Si empieza con A");
    }

    else {
      System.out.println("No comienza con A");
    }
    }
    
}

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
public class Guia3_Ejer1 {

    /**
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
    
    Scanner Leer = new Scanner (System.in);
    System.out.println("Ingrese un numero");
    
    int numero = Leer.nextInt();
    if (numero % 2 == 0) {
      System.out.println(numero + " es par");
    } else {
      System.out.println(numero + " es impar");
        // TODO code application logic here
    }
    
    
}
}

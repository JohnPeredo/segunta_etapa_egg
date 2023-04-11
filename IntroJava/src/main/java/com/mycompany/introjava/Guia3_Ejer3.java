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
public class Guia3_Ejer3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner Leer = new Scanner(System.in);
    
    System.out.println("Introduce una palabra o frase:");
    String Frase = Leer.nextLine();
    
        if (Frase.length() == 8) {
          System.out.println("CORRECTO");
        } else {
          System.out.println("INCORRECTO");
        }
        
        // TODO code application logic here
    }
    
}

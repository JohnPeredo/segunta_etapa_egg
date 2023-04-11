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
public class Guia3_Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner (System.in);
        
        System.out.println("Ingrese la plabra EUREKA");
        
        String palabra = Leer.next();
        
        if(palabra == "eureka") {
        System.out.println("La palabra es correcta");
    }   else {
        System.out.println("La palabra es incorrecta");
    }
        
        
        
        
        
        
        // TODO code application logic here
    }
    
}

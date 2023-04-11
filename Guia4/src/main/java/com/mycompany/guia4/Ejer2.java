/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia4;

import java.util.Scanner;

/**
 *
 * @author John
 */
public class Ejer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner (System.in);
        System.out.println("Edad");
        System.out.println("Ingrese la cantida de personas");
        int personas = 4;
        int edad = 0;
        
        for (int i = 0; i == personas; i++) {
        System.out.println("Nombre y apellido de la persona Nro: "+ i); 
        String nombre= Leer.next();
        System.out.println("Ingrese la edad de la persona Nro: "+i);
        edad = Leer.nextInt();
          
        }
        
        
        
        
        
        
        
        System.out.println(mayor(edad));
        
        
        // TODO code application logic here
    }
    public static String mayor(int edad) {
        String mayor;
        if (edad >= 18) {
            mayor="V";
        } else {
            mayor="F";
        }
        ;
        return mayor;
    }
}

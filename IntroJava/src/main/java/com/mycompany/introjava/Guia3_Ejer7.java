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
public class Guia3_Ejer7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String palabra = "";
        String letraInicio = "X";
        String letraFin= "O";
        String resultado;
        int errores = 0;
        
        /*
            for (int i=1; i< palabra.length(); i++) {
            System.out.println("Ingrese una palabra de 5 letras");
            }
        String resultado = letraInicio + palabra.substring(1, 4) + letraFin;
        */

        do {
            System.out.println("Ingrese una palabra de 5 letras");
            palabra = leer.next();
            
        if(palabra.length()==5) {
        System.out.println("La palabra es correcta");
    }   else {
            errores = errores + 1;
        System.out.println("La palabra no tiene 5 letras");
    }
            
        } while (palabra.length()!=5); 
        
        resultado = letraInicio + palabra.substring(1, 4) + letraFin;
        
        System.out.println("Cantidad de errores: "+errores);
        System.out.println(resultado);
        
        // TODO code application logic here
    }
    
}

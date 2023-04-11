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
public class Guia3_Ejer5 {

    /**
     * Escriba un programa en el cual se ingrese un valor límite positivo, 
     * y a continuación solicite números al usuario 
     * hasta que la suma de los números introducidos supere el límite inicial.
     * 
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int limite = 10;
        int suma = 0;
        int num;
        do {
            System.out.println("Ingrese un numero");
            num = Leer.nextInt();
            suma = suma + num;
        } while (suma<limite);
        System.out.println("Llegaste al limite");
        
        // TODO code application logic here
    }
    
}

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
public class Ejer1_guia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner (System.in);
        //Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        System.out.println("Ingrese la cantidad de integrantes");
        int integrantes = leer.nextInt();
        leer.nextLine(); //agregue esto
        String[] vector = new String[integrantes];
        for (int i = 0; i < integrantes; i++) {
            System.out.println("Ingrese el participante Nro: "+ (i+1));
            vector[i] = leer.nextLine();
            //leer.nextLine();
            
        }
       
        //System.out.println("a escribir");
        
        for (int i = 0; i < integrantes; i++) {
            System.out.println("Participante nro: "+(i+1)+ " "+vector[i]);
            
        }
        
        
        
        
        
    }
    
}

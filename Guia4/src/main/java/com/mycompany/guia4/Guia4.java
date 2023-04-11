/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia4;

import java.util.Scanner;

/**
 * Ejer 1
 * @author Mentores
 */
public class Guia4 {

    public static void main(String[] args) {
        Scanner Leer = new Scanner (System.in);
        
        System.out.println("Ingrese el primer numero");
        int num1 = Leer.nextInt();
        
        System.out.println("Ingrese el segundo numero");
        int num2 = Leer.nextInt();

         System.out.println("ingrese una opcion ");
         System.out.println("a.libra");
         System.out.println("b.dolar");
         System.out.println("c.yenes");
         System.out.println("4.dividir");
         
        int opcion = Leer.nextInt();
         
        
             switch(opcion){
              case 1 :
                 System.out.println("La suma es: " + suma(num1,num2));
                 break;
                 
              case 2 :
                 System.out.println("la resta es: "+ resta(num1,num2));
                 break;
                 
              case 3 :
                 System.out.println("la multiplicacion es: "+ multiplicacion(num1,num2)); 
                 break;
                 
              case 4 :
                 System.out.println("la division  es: "+division(num1,num2));
                 break;
                      
         }

        
    }
    public static int suma(int num1, int num2) {
        int suma = num1+ num2;
        return suma;
    }
        public static int resta(int num1, int num2) {
        int resta = num1 - num2;
        return resta;
    }
    public static int multiplicacion(int num1, int num2) {
        int multiplicacion = num1 * num2;
        return multiplicacion;
    }
        public static int division(int num1, int num2) {
        int division = num1 / num2;
        return division;
    }
}

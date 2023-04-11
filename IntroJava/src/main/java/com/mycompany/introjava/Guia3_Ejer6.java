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
public class Guia3_Ejer6 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int num1;
         int num2;
         int opcion;
         String respuesta = "";
         
         System.out.println("ingrese el primer numero");
         num1 = sc.nextInt();
         
         System.out.println("ingrese el segundo numero");
         num2 = sc.nextInt();
         
        do{
         System.out.println("ingrese una opcion ");
         System.out.println("1.sumar");
         System.out.println("2.restar");
         System.out.println("3.multiplicar");
         System.out.println("4.dividir");
         System.out.println("5.salir");
         
         opcion = sc.nextInt();
         
        
             switch(opcion){
              case 1 :
                 System.out.println("la suma es "+(num1+num2));
                 break;
                 
              case 2 :
                 System.out.println("la resta es "+(num1-num2));
                 break;
                 
              case 3 :
                 System.out.println("la multiplicacion es "+(num1*num2)); 
                 break;
                 
              case 4 :
                 System.out.println("la division  es "+(num1/num2));
                 break;
                 
              case 5 :
                                       
                   System.out.println("estas seguro que deseas salir (s/n)");
                   respuesta = sc.next();
                      
         }
            /*
             ||opcion != 5
             */
        }while(respuesta.equals("n")||opcion != 5);
         
    }   
}
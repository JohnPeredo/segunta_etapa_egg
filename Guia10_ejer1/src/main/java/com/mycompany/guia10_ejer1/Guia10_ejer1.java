/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.guia10_ejer1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class Guia10_ejer1 {


    public static void main(String[] args) {
        /*
        Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
        programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
        después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
        salir, se mostrará todos los perros guardados en el ArrayList.
         */
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        ArrayList<String> razas = new ArrayList<String>();
        String aux;
        
        do {
            System.out.println("Ingrese la raza para agregar a la lista");
            razas.add(leer.next());
            
            System.out.println("Desea seguir agregando razas? (s para continuar)");
            aux= leer.next();
        } while (aux.equalsIgnoreCase("s"));
        
        System.out.println("");
        System.out.println("Lista de razas en la listas");
        
        for (String aux2 : razas) { //muestra la lista 
            System.out.println(aux2);
        }
      
    }
}

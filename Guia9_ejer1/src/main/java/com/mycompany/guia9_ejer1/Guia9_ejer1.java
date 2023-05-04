/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia9_ejer1;

import java.util.Scanner;
import servicio.CadenaServicio;

/**
 *
 * @author John
 */
public class Guia9_ejer1 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n"); //abajo de class
        String letra;
        CadenaServicio servicio = new CadenaServicio();
        servicio.rellenar();//bien
        servicio.mostrarVocales();//bien
        servicio.invertirFrase(); //bien
        System.out.println("buscar letra...");
        servicio.vecesRepetido( leer.next());
        System.out.println("Ingrese una frase para comparar largo");
        servicio.compararLongitud(leer.next());
        System.out.println("Ingrese una nueva frase para unir ");
        servicio.unirFrases(leer.next());
        System.out.println("Ingrese un caracter para reemplazar las a");
        servicio.reemplazar(leer.next());
        System.out.println("Ingrese una letra a buscar");
        boolean aux = servicio.contiene(letra= leer.next());
        if (aux) {
            System.out.println("La frase contiene la letra "+ letra);
        }else {
            System.out.println("La frse no contiene la letra "+ letra);
        }
    }
    
}

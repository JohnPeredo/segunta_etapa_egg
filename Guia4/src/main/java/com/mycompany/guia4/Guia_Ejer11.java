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
public class Guia_Ejer11 {

public static void main(String[] args) {
        Scanner Ej11 = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");

        String frase = Ej11.nextLine();

        Trans(frase);

        Ej11.close();
    }

    public static void Trans (String frase) {

        frase = frase.replace("a", "@");
        frase = frase.replace("e", "#");
        frase = frase.replace("i", "$");
        frase = frase.replace("o", "%");
        frase = frase.replace("u", "*");

        System.out.println(frase);

    }
}
    


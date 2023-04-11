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
public class Ejer4_Bien {
  public static void main(String[] args) {
    Scanner leer = new Scanner(System.in);
    System.out.print("Ingrese un número entero positivo: ");
    int num = leer.nextInt();
    if (esPrimo(num)) {
      System.out.println(num + " es un número primo.");
    } else {
      System.out.println(num + " no es un número primo.");
    }
  }

  public static boolean esPrimo(int num) {
    boolean esPrimo = true;
    for (int i = 2; i <= num / 2; ++i) {
      if (num % i == 0) {
        esPrimo = false;
        break;
      }
    }
    return esPrimo;
  }
}
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
public class Ejer1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int[] vector = new int[100];
        for (int i = 0; i < 100; i++) {
            vector[i]= i+1 ;
        }
        for (int i = 99; i>=0; i--) {
            System.out.println(vector[i]); 
        }
    } 
    
}
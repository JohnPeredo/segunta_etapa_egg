/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.guia7_ejer6_extra;

import com.mycompany.guia7_ejer6_extra.newpackage.Rectangulo;

/**
 *
 * @author John
 */
public class Guia7_ejer6_extra {

    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(4, 6);
        double area = rectangulo1.calcular_area();
        System.out.println("El área del rectángulo es: " + area);
    }
}
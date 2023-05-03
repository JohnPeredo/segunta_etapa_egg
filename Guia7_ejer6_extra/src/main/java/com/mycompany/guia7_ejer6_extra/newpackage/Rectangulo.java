/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia7_ejer6_extra.newpackage;

/**
 *
 * @author John
 */
public class Rectangulo {
    private double lado1;
    private double lado2;
    
    public Rectangulo(double lado1, double lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }
    
    public double calcular_area() {
        return lado1 * lado2;
    }
}


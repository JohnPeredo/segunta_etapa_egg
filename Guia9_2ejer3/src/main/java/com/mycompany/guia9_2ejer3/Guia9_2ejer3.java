/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.guia9_2ejer3;

import servicio.ArregloService;

/**
 *
 * @author John
 */
public class Guia9_2ejer3 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        /*
        Crear en el Main dos arreglos. El arreglo A de 50 números reales 
        y el arreglo B de 20 números reales. Crear la clase ArregloService, en
        el paquete servicio, con los siguientes métodos:
         */
        double[] vectorGrande = new double[50];
        double[] vector = new double[20];
        ArregloService as = new ArregloService();
        /*  
        En el Main nuevamente: inicializar A
        , mostrar A
        , ordenar A
        , inicializar B
        , mostrar A y B.
         */
        as.inicializarA(vectorGrande);
        
        System.out.println("vector de 50");
        as.mostrar(vectorGrande);
        System.out.println("");
        
        as.ordenar(vectorGrande);
        System.out.println("ordenado");
        as.inicializarB(vectorGrande, vector);
        as.mostrar(vectorGrande);
        
        System.out.println("");
        System.out.println("vector de 20");
        as.mostrar(vector);
        
        
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia10_ejer4;

import servicio.peliculaServicio;

/**
 *
 * @author John
 */
public class Guia10_ejer4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        peliculaServicio ps = new peliculaServicio();
        ps.cargarPelicula();
        ps.mostrarPeliculas();
        System.out.println("");
        System.out.println("Mas de una hora");
        ps.mostrarPeliculas1();
        

    }
}

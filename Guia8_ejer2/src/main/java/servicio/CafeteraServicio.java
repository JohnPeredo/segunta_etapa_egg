/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class CafeteraServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n"); //abajo de class
    Cafetera cafe = new Cafetera();

    public void llenarCafetera() {
        System.out.println("actual antes "+cafe.getCantidadActual() );
        System.out.println("");
        cafe.setCantidadActual(cafe.getCapacidadMáxima());
        System.out.println("actual "+cafe.getCantidadActual());
        System.out.println("maxima"+cafe.getCapacidadMáxima());
    }

    public void servirTaza(int taza) {
        // System.out.println("Ingrese el tamaño de la taza");
        //int taza = leer.nextInt();

        if (taza <= cafe.getCantidadActual()) {
            System.out.println("Se lleno la taza");
            System.out.println("Queda "+(cafe.getCantidadActual()-taza)+" gramos de cafe");

        } else {
            System.out.println("No se pudo llenar \n"
                    + "Se lleno hasta " + cafe.getCantidadActual());

        }

    }

    public void vaciarCafetera() {
        cafe.setCantidadActual(0);
        System.out.println("Se vacio la cafetera");
    }

    public void agregarCafe(int agregar) {

        cafe.setCantidadActual(cafe.getCantidadActual() + agregar);
        System.out.println("Se agrego " + agregar + " de cafe \n"
                + "La cantidad actual de cafe es: " + cafe.getCantidadActual());
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Peliculas;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author mcamp
 */
public class PeliculasService {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private ArrayList<Peliculas> peliculas = new ArrayList();
    private Peliculas peli;

    public void crearPelicula() {
        String opcion;
        do {
            System.out.println("Escriba el titulo de la película");
            String titulo = leer.next();
            System.out.println("Escriba el nombre del director/a");
            String director = leer.next();
            System.out.println("Escriba la duracion de la película (en horas)");
            double duracion = leer.nextDouble();

            Peliculas peli = new Peliculas(titulo, director, duracion);
            peliculas.add(peli);

            System.out.println("¿Desea añadir otra película?(S/N)");
            opcion = leer.next();
            while (!opcion.equalsIgnoreCase("s") && !opcion.equalsIgnoreCase("n")) {
                System.out.println("Ha ingresado una opcion invalida. Intente de nuevo.");
                System.out.println("¿Desea añadir otra película?(S/N)");
                opcion = leer.next();
            }
        } while (opcion.equalsIgnoreCase("S"));
    }

    public void mostarPeliculas() {

        System.out.println("Las peliculas son:");
        for (Peliculas aux : peliculas) {
            System.out.println(aux);
        }
    }

    public void mayorDuracion() {

        Iterator<Peliculas> it = peliculas.iterator();
        while (it.hasNext()) {
            Peliculas pelicula = it.next();
            if (pelicula.getDuracion() > 1) {
                System.out.println(pelicula);
            }
        }
    }

    public void ordenarMayorMenor() {
        Collections.sort(peliculas, Peliculas.comparadorDuracion);
        Collections.reverse(peliculas);
//        for (Peliculas pelicula : peliculas) {
//            System.out.println(pelicula);            
//        }
        mostarPeliculas();
    }

    public void ordenarMenorMayor() {
        Collections.sort(peliculas, Peliculas.comparadorDuracion);
//        for (Peliculas pelicula : peliculas) {
//            System.out.println(pelicula);
//        }
        mostarPeliculas();
    }

    public void titulosAlfa() {
        Collections.sort(peliculas, Peliculas.comparadorTitulo);
        mostarPeliculas();
    }

    public void directorAlfa() {
        Collections.sort(peliculas, Peliculas.comparadorDirector);
        mostarPeliculas();
    }
}
//Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
//tendremos una clase Pelicula con el título, director y duración de la película (en horas).
//Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
//que se pide a continuación:
//En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
//todos sus datos y guardándolos en el objeto Pelicula.
//Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
//crear otra Pelicula o no.
//Después de ese bucle realizaremos las siguientes acciones:
//
//22
//
//• Mostrar en pantalla todas las películas.
//• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
//• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
//pantalla.
//• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
//pantalla.
//• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
//• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

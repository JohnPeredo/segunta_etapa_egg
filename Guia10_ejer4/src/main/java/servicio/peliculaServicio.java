/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas.
 * Para esto, tendremos una clase Pelicula con el título, director y duración de
 * la película (en horas). Implemente las clases y métodos necesarios para esta
 * situación, teniendo en cuenta lo que se pide a continuación: En el servicio
 * deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
 * todos sus datos y guardándolos en el objeto Pelicula. Después, esa Pelicula
 * se guarda una lista de Peliculas y se le pregunta al usuario si quiere crear
 * otra Pelicula o no. Después de ese bucle realizaremos las siguientes
 * acciones:
 *
 * 22
 *
 * • Mostrar en pantalla todas las películas. 
 * • Mostrar en pantalla todas las
 * películas con una duración mayor a 1 hora. 
 * • Ordenar las películas de acuerdo
 * a su duración (de mayor a menor) y mostrarlo en pantalla. 
 * • Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
 * pantalla. 
 * • Ordenar las películas por título, alfabéticamente y mostrarlo en
 * pantalla. 
 * • Ordenar las películas por director, alfabéticamente y mostrarlo
 * en pantalla.
 */
public class peliculaServicio {

    ArrayList<Pelicula> peli = new ArrayList<>();
    private Scanner leer = new Scanner(System.in).useDelimiter("\n"); //abajo de class

    public Pelicula crearPelicula() {
        System.out.println("Ingrese el titulo");
        String titulo = leer.next();
        System.out.println("Ingrese el director");
        String director = leer.next();
        System.out.println("Ingrese la duracion");
        Double duracion = leer.nextDouble();
        System.out.println("cargado");
        return new Pelicula(titulo, director, duracion);
    }

    public void cargarPelicula() {
        String opcion;
        do {
            System.out.println("bucle do");
            peli.add(crearPelicula());
            System.out.println("Desea agregar otra pelicula? (s/n)");
            if (leer.next().equalsIgnoreCase("n")) {
                System.out.println("si condicion");
                break;
            }

        } while (true);
    }

    public void mostrarPeliculas() {
        int cont = 1;
        for (Pelicula pelicula : peli) {
            System.out.println("Pelicula Nro: " + cont++);
            System.out.println(pelicula.toString());
        }
    }

    public void mostrarPeliculas1() {
        int cont = 1;
        for (Pelicula pelicula : peli) {
            if (pelicula.getDuracion() > 1) {
                System.out.println("Pelicula Nro: " + cont++);
                System.out.println(pelicula.toString());
            }

        }
    }
    
    public void ordenarMayorAMenor(){
        Collections.sort(peli, Pelicula.comparadorDuracion);
        Collections.reverse(peli);
        mostrarPeliculas();
    }
    
    public void ordenarMenorAMayor(){
        Collections.sort(peli, Pelicula.comparadorDuracion);
        mostrarPeliculas();
    }
    
    public void ordenarPorTitulo(){
        Collections.sort(peli, Pelicula.comparadorTitulo);
        mostrarPeliculas();
    }
    
    public void ordenarPorDirector(){
        Collections.sort(peli, Pelicula.comparadorDirector);
        mostrarPeliculas();
    }
    
    
//        public void menu() {
//        String op;
//        do {
//            System.out.println("-----Menu-----");
//            System.out.println("");
//            System.out.println("1- Ingresar pelicula");
//            System.out.println("2- Mostrar lista de peliculas");
//            System.out.println("3- Ordenar de mayor duracion a menor");
//            System.out.println("4- Ordenar de menor a mayor duracion");
//            System.out.println("5- Ordenar por titulo");
//            System.out.println("6- Ordenar por director");
//            op= leer.nextInt();
//
//        } while (true);
//    }
    
    
}

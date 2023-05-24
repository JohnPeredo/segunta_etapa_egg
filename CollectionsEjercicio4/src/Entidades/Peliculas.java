/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Comparator;



/**
 *
 * @author mcamp
 */
public class Peliculas {

    private String titulo;
    private String director;
    private Double duracion;

    public Peliculas() {
    }

    public Peliculas(String titulo, String director, Double duracion) {
        this.titulo = titulo;
        this.director = director;
        this.duracion = duracion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Pelicula{"
                + "titulo='" + titulo + '\''
                + ", director='" + director + '\''
                + ", duracion=" + duracion
                + '}';
    }
    
    public static Comparator<Peliculas> comparadorDuracion = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
            return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };
    
    public static Comparator<Peliculas> comparadorTitulo = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
            return o1.getTitulo().compareTo(o2.getTitulo());
        }
    };
    
    public static Comparator<Peliculas> comparadorDirector = new Comparator<Peliculas>() {
        @Override
        public int compare(Peliculas o1, Peliculas o2) {
            return o1.getDirector().compareTo(o2.getDirector());
        }
    };
}
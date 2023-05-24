/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

import java.util.Comparator;

/**
 *
 * @author John
 */
public class Pelicula {

    private String titulo;
    private String director;
    private Double duracion;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, Double duracion) {
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

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(Double duracion) {
        this.duracion = duracion;
    }

    @Override
    public String toString() {
        return "Titulo: " + titulo + ", director: " + director + ", duracion: " + duracion;
    }

    public static Comparator<Pelicula> comparadorDuracion = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula t, Pelicula t1) {
            return Double.compare(t.getDuracion().(t1.getDuracion())) //devuelve un double 
                    //return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };

    public static Comparator<Pelicula> comparadorTitulo = new Comparator<Pelicula>() {
        @Override
        public string compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
            //return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };
    public static Comparator<Pelicula> comparadorDirector = new Comparator<Pelicula>() {
        @Override
        public string compare(Pelicula t, Pelicula t1) {
            return t.getTitulo().compareTo(t1.getTitulo());
            //return o1.getDuracion().compareTo(o2.getDuracion());
        }
    };

    /*
        public static Comparator<Pelicula> CompararTiempo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula obj1, Pelicula obj2) {
           return obj1.getTiempo().compareTo(obj2.getTiempo());
        }
    };
     */
}

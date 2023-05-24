/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package collectionsejercicio4;

import Servicio.PeliculasService;

/**
 *
 * @author mcamp
 */
public class CollectionsEjercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        PeliculasService ps = new PeliculasService();
//        Peliculas peli = new Peliculas();
        
        ps.crearPelicula();
        ps.mostarPeliculas();
        ps.mayorDuracion();
        ps.ordenarMayorMenor();
        ps.ordenarMenorMayor();
        ps.titulosAlfa();
        ps.directorAlfa();
        
    }
    
}

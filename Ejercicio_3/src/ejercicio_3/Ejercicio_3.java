/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3;

import ejercicio_3.Entidades.Alumno;
import ejercicio_3.Servicios.AlumnoServicio;
import java.util.ArrayList;

/**
 *
 * @author Zere
 */
public class Ejercicio_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoServicio as = new AlumnoServicio();        
        ArrayList<Alumno> alumnos = new ArrayList();
        
        as.cargarArray(alumnos);
        as.notaFinal(alumnos);
    }
    
}

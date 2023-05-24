/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.alumno2;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class alumnoServicio2 {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n"); //abajo de class
    ArrayList<alumno2> alumnos = new ArrayList();
    
    
    public void crearAlumno(){
        System.out.println("");
        
        ArrayList<Integer> notas = new ArrayList();
        System.out.println("Nombre del alumno");
        String nombre = leer.next();
        for (int i = 0; i < 2; i++) {
            System.out.println("Ingrese la nota nro: "+(i+1));
            notas.add(leer.nextInt());
        }
        alumno2 al2 = new alumno2(nombre, notas);
        System.out.println("Hola mundo");
    }
    
    
}

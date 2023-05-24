/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio_3.Servicios;

import ejercicio_3.Entidades.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author Zere
 */
public class AlumnoServicio {
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    private Alumno crearAlumno(){
        ArrayList<Integer> notas = new ArrayList();
        System.out.println("Ingrese el nombre del alumno");
        String nombre = leer.next();
        System.out.println("Ingrese la 1er nota del alumno");
        notas.add(leer.nextInt());
        System.out.println("Ingrese la 2da nota del alumno");
        notas.add(leer.nextInt());
        System.out.println("Ingrese la 3er nota del alumno");
        notas.add(leer.nextInt());
        return new Alumno(nombre, notas);
    }
    
    public void cargarArray(ArrayList<Alumno> alumnos){
        do{
            Alumno alumno = crearAlumno();
            alumnos.add(alumno);
        }while(comprobacion());
     
    }
    
    private boolean comprobacion(){
        boolean bool = false;
        String respuesta;
        
        System.out.println("Desea Agregar otro Alumno? (S/N)");
        respuesta = leer.next();
        while(!respuesta.equalsIgnoreCase("N")&&!respuesta.equalsIgnoreCase("S")){
            System.out.println("ERROR. Valor incorrecto.");
            System.out.println("Desea Agregar otro Alumno? (S/N)");
            respuesta = leer.next();
        }
        
        if(respuesta.equalsIgnoreCase("S")){
            bool = true;
        }
        
        return bool;
    }
    public void mostrarAlumnos(ArrayList<Alumno> alumnos){
        System.out.println("Lista de alumnos");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre()); 
        }
        
    }
    
    public void notaFinal(ArrayList<Alumno> alumnos){
        
        Iterator<Alumno> it = alumnos.iterator();
        
        System.out.println("Ingrese el nombre de un alumno para saber su nota final");
        mostrarAlumnos(alumnos);
        String nombre = leer.next();
        double nFinal = 0;
        while(it.hasNext()){
            Alumno alumnoAux= it.next(); //Esto
            if(nombre.equalsIgnoreCase(alumnoAux.getNombre())){
                for (Integer nota : alumnoAux.getNotas()) {
                    nFinal += nota;
                }                               
                System.out.println("El promedio del alumno es: "+nFinal/alumnoAux.getNotas().size());
            }
        }
    }
}

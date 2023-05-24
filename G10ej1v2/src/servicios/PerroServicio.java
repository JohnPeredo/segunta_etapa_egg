/*
Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El 
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y 
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide 
salir, se mostrará todos los perros guardados en el ArrayList.
 */
package servicios;

import entidades.Perro;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class PerroServicio {
    ArrayList<Perro> raza = new ArrayList();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public void crearPerro(){
      Perro can = new Perro() ;
        System.out.println("Ingrese la raza del perro");
        String razaPerro= leer.next();
        can.setRaza(razaPerro);
        raza.add(can);        
        
        //raza.add(new Perr(leer.next()));
        
    }
    
    public void cargarPerros(){
        do{
            crearPerro();
            System.out.println("Desea continuar? (S=Si)");
            
        }while (leer.next().equalsIgnoreCase("S"));
    }
    
    public void mostrarLista(){
        raza.forEach((perro) -> {
            System.out.println(perro.getRaza());
        });
    }
}

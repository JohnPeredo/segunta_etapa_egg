package services;

import entities.Perro;
import entities.Persona;
import java.util.*;

/**
 *
 * @author Sebastian
 */
public class AdopcionService {
    
    public void cargar(HashSet<Perro> perros, ArrayList<Persona> personas) {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String seguir;
        int contador = 0;
        System.out.println("Carga de personas y perros.");
        
        do {   
            contador++;
            System.out.println("Persona " + contador);
            personas.add(crearPersona());
            
            System.out.println("¿Desea continuar? S/N");
            seguir = input. next();
        } while (seguir.equalsIgnoreCase("s"));
        contador = 0;
        do {   
            contador++;
            System.out.println("Perro " + contador);
            perros.add(crearPerro());
            
            System.out.println("¿Desea continuar? S/N");
            seguir = input. next();
        } while (seguir.equalsIgnoreCase("s"));
        
    }
    
    private Perro crearPerro() {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String nombre, raza;
        int edad;
        double tamanio;
        
        System.out.println("Ingrese el nombre del perro.");
        nombre = input.next();
        System.out.println("Ingrese la edad del perro.");
        edad = input.nextInt();
        System.out.println("Ingrese la raza del perro.");
        raza = input.next();
        System.out.println("Ingrese el tamaño del perro.");
        tamanio = input.nextDouble();
        
        return new Perro(nombre, raza, edad, tamanio);
    }
    
    private Persona crearPersona() {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String nombre, apellido;
        int edad;
        long documento;
        
        System.out.println("Ingrese el nombre de la persona.");
        nombre = input.next();
        System.out.println("Ingrese el apellido de la persona.");
        apellido = input.next();
        System.out.println("Ingrese la edad de la persona.");
        edad = input.nextInt();
        System.out.println("Ingrese el numero de documento de la persona.");
        documento = input.nextLong();
        
        return new Persona(nombre, apellido, edad, documento);
    }
    
    public void quePerroAdoptar(ArrayList<Persona> personas, HashSet<Perro> perros) {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        String nombrePerro = "";
        Perro elegido;
        boolean existePerros;
        System.out.println("Adopcion de perro.");
        
        if (!personas.isEmpty()) {
            for (Persona persona : personas) {
                if (persona.getPerro() == null) {
                    System.out.println("¿Que perro desea adoptar " + persona.getNombre() + " " + persona.getApellido() + "?");
                    existePerros = mostrarPerros(perros);
                    if (existePerros) {
                        System.out.println("Ingrese el nombre del perro que desea adoptar.");
                        nombrePerro = input.next();
                    }

                    Iterator<Perro> it = perros.iterator();

                    while (it.hasNext()) {
                        Perro next = it.next();
                        if (next.getNombre().equalsIgnoreCase(nombrePerro)) {
//                            elegido = next;
                            persona.setPerro(next);
                            it.remove();
                            System.out.println(nombrePerro + " fue adoptado.");
                            break;
                        } else {
                            System.out.println("El perro no existe o ya fue adoptado.");
                            break;
                        }
                    }
                }
            }
        } else {
            System.out.println("La lista de personas esta vacia.");
        }
    }
    
    public boolean mostrarPerros(HashSet<Perro> perros) {
        int contador = 0;
        boolean existe = false;
        if (!perros.isEmpty()) {
            System.out.println("Mostrar perros:");
            for (Perro perro : perros) {
                System.out.println("Perro: " + ++contador + perro);
            }
            existe = true;
        } else {
            System.out.println("La lista de perros esta vacia.");
        }
        return existe;
    }
    
    public void mostrarPersonas(ArrayList<Persona> personas) {
        int contador = 0;
        if (!personas.isEmpty()) {
            System.out.println("Mostrar personas:");
            for (Persona persona : personas) {
                System.out.println("Persona: " + ++contador + persona);
            }
        } else {
            System.out.println("La lista de personas esta vacia.");
        }
    }
    /*
    Se puede separar la carga de personas y perros en dos metodos.
    Se puede agregar un metodo (cruel) de devolucion.
    Se puede borrar un perro de la lista en otro metodo.
    Se puede hacer un metodo que ingrese una sola persona.
    */
    public void menu(ArrayList<Persona> personas, HashSet<Perro> perros) {
        Scanner input = new Scanner(System.in, "ISO-8859-1").useDelimiter("\n");
        System.out.println("Bienvenido a la interfaz de adopcion de Perros.");
        String opcion, seguir;
        do {
            System.out.println("Elija una opcion.");
            System.out.println("""
                               1. Cargar Personas y Perros.
                               2. Adoptar Perro.
                               3. Mostrar lista de personas.
                               4. Mostrar lista de perros.
                               5. Salir.""");
            opcion = input.next();
            switch (opcion) {
                case "1" -> cargar(perros, personas);
                case "2" -> quePerroAdoptar(personas, perros);
                case "3" -> mostrarPersonas(personas);
                case "4" -> mostrarPerros(perros);
                case "5" -> {
                    return;
                }
                default -> throw new AssertionError();
            }
            System.out.println("¿Desea volver al menu? S/N");
            seguir = input. next();
        } while (seguir.equalsIgnoreCase("s"));
    }
}

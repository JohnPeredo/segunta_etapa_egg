/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Ahorcado;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class AhorcadoServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n"); //abajo de class
    Ahorcado ah = new Ahorcado();

    private void crearJuego() {

        System.out.println("Ingrese la palabra");
        String aux = leer.next();
        String[] vector = new String[aux.length()];

        for (int i = 0; i < aux.length(); i++) {
            vector[i] = aux.substring(i, i + 1);
        }
        ah.setPalabra(vector);
        System.out.println("Cantidad de intentos");
        ah.setJugadasMaximas(leer.nextInt());
        ah.setLetrasEncontradas(0);
    }

    /*
    Método longitud(): muestra la longitud de la 
    palabra que se debe encontrar. Nota: buscar 
    como se usa el vector.length.
     */
    private void longitud() {
        System.out.println("La longitud de la palabra a encontras es " + ah.getPalabra().length);
    }

    /*
    Método buscar(letra):  este método recibe una letra 
    dada por el usuario y busca si la letra ingresada es 
    parte de la palabra o no. También informará si la letra 
    estaba o no.
     */
    private boolean buscar(String letra) {
        if (Arrays.binarySearch(ah.getPalabra(), letra) >= 0) {
            System.out.println("La letra si esta");
            return true;
        } else {
            System.out.println("La letra " + letra + " no esta");
            return false;
        }

        //Arrays.binarySearch(ah.getPalabra(), letra);
    }

    /*
    Método encontradas(letra):  que reciba una letra 
    ingresada por el usuario y muestre cuantas letras 
    han sido encontradas y cuántas le faltan. Este método 
    además deberá devolver true si la letra estaba y false 
    si la letra no estaba, ya que, cada vez que se busque una 
    letra que no esté, se le restará uno a sus oportunidades.
     */
    private boolean encontradas(String letra) {
        int contador = 0;
        if (buscar(letra)) {
            for (int i = 0; i < ah.getPalabra().length; i++) {
                if (letra.equals(ah.getPalabra()[i])) {
                    contador++;
                }
            }

        } else {
            ah.setJugadasMaximas(ah.getJugadasMaximas()-1);
        }
        ah.setLetrasEncontradas(ah.getLetrasEncontradas()+contador);
        System.out.println("Le faltan adivinar "+(ah.getPalabra().length-ah.getLetrasEncontradas())+ "letras");
        
        return buscar(letra);
    }
    
    /*
    Método intentos(): para mostrar cuántas
    oportunidades le queda al jugador.
    */
    private void intentos(){
        System.out.println("Le quedan "+ah.getJugadasMaximas()+" intentos");
    }
    
    /*
    Método juego(): el método juego se encargará 
    de llamar todos los métodos previamente mencionados
    e informará cuando el usuario descubra toda la palabra 
    o se quede sin intentos. Este método se llamará en el main.

    */
    /*
    crearJuego()
    longitud()
    encontradas(letra)
    intentos()
    */
    
    public void juego(){
        crearJuego();
        longitud();
        boolean fin=false;
        do {
        System.out.println("Ingrese una letra");
        encontradas(leer.next());
        intentos();
            if (ah.getJugadasMaximas()==0) {
                System.out.println("Perdiste, no tenes mas intentos");
                fin = true;
            }
            if (ah.getLetrasEncontradas()==ah.getPalabra().length) {
                System.out.print("Ganaste, la palabra era: "+(Arrays.toString(ah.getPalabra())));
                /*
                for (int i = 0; i < ah.getPalabra().length; i++) {
                    System.out.print(ah.getPalabra()[i]);
                }
                */
      
                fin=true;
            }
        } while (!fin);
        
        
        
    }
    
    
}

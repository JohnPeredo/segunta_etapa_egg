/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 *
 * @author John
 */
public class ArregloService {

    Random aleatorio = new Random();

    /*
    Método inicializarA recibe un arreglo por parámetro 
    y lo inicializa con números aleatorios.
     */
    public void inicializarA(double[] vector) {
        for (int i = 0; i < vector.length; i++) {
            vector[i] = aleatorio.nextInt(100);
        }

    }

    /*
    Método mostrar recibe un arreglo por 
    parámetro y lo muestra por pantalla.
     */
    public void mostrar(double[] vector) {
        System.out.println("entro");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
        System.out.println("");

    }

    /*
    Método ordenar recibe un arreglo por
    parámetro y lo ordena de mayor a menor.
     */
    public void ordenar(double[] vector) {
        Arrays.sort(vector);
        int izquierda = 0;
        int derecha = vector.length - 1;
        while (izquierda < derecha) {
            double temp = vector[izquierda];
            vector[izquierda] = vector[derecha];
            vector[derecha] = temp;
            izquierda++;
            derecha--;
        }
    }

    /*
    Método inicializarB copia los primeros 
    10 números del arreglo A en el arreglo B. 
    Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
     */
    public void inicializarB(double[] vectorGrande, double[] vector) {
        for (int i = 0; i < 10; i++) {
            vector[i] = vectorGrande[i];
        }
        for (int i = 10; i < vector.length; i++) {
            vector[i] = 0.5;
        }
        /*
        System.out.println("normal");
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i]+" ");
        }
        System.out.println("grandeeeeeee");
        for (int i = 0; i < vectorGrande.length; i++) {
            System.out.print(vectorGrande[i]+" ");
        }
         */

    }

}

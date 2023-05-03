/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class CadenaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n"); //abajo de class

    int a, e, iaux, o, u, vocales = 0;
    Cadena cadena = new Cadena();

    public void rellenar() {
        System.out.println("Ingrese una frase");
        cadena.setFrase(leer.nextLine());
        cadena.setLongitud(cadena.getFrase().length());

    }

    public void mostrarVocales() {

        for (int i = 0; i < cadena.getLongitud(); i++) {
            switch ((cadena.getFrase().toUpperCase()).substring(i, i + 1)) {
                case "A":
                    a++;
                    vocales++;
                    break;
                case "E":
                    e++;
                    vocales++;
                    break;
                case "I":
                    iaux++;
                    vocales++;
                    break;
                case "O":
                    o++;
                    vocales++;
                    break;
                case "U":
                    u++;
                    vocales++;
                    break;

            }
        }
        System.out.println("La cantidad de vocales es: " + vocales);

    }
    public void invertirFrase(){
        for (int i = cadena.getLongitud(); i>0; i--) {
            System.out.print(cadena.getFrase().substring(i-1,i ));
        }
        System.out.println("");
    }
    /*
    Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario 
    y contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
    Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.

    */
    public void vecesRepetido(String letra){
        int repetidas=0;
        for (int i = 0; i < cadena.getLongitud(); i++) {
            if (cadena.getFrase().substring(i, i+1).equalsIgnoreCase(letra)) {
                repetidas++;
            }
        }
        
        System.out.println("La letra "+letra+" se repitio "+repetidas+" veces");
    }
    /*
    Método compararLongitud(String frase), deberá comparar la longitud de la 
    frase que compone la clase con otra nueva frase ingresada por el usuario.
    */
    public void compararLongitud(String frase) {
        int compara = Integer.compare(cadena.getLongitud(), frase.length()); //>0 objeto, 0< lo otro mayor,== son iguales
        if (compara==0) {
            System.out.println("Son igual iguales de largos");
        }else if(compara>0){
            System.out.println("La frase objeto es mayor");
        }else{
            System.out.println("Su frase tiene una longitud mayor");
        }
        
    }
    public void unirFrases(String unir){
        System.out.println(cadena.getFrase().concat(" " + unir));
        
    }
    public void reemplazar(String letra){
        System.out.println(cadena.getFrase().replaceAll("a", letra));
        
    }
    public boolean contiene(String letra){
        return  cadena.getFrase().contains(letra);
    }
    }

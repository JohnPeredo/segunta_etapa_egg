/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.guia7_ejer3_extra.newpackage;

import com.mycompany.guia7_ejer3_extra.newpackage.newpackage.Jugador;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class Juego {
    private int cantIntentos;
    private int numero;

    Jugador j1 = new Jugador();
    Jugador j2 = new Jugador();

    private int getCantIntentos() {
        return cantIntentos;
    }

    private void setCantIntentos(int cantIntentos) {
        this.cantIntentos = cantIntentos;
    }

    private int getNumero() {
        return numero;
    }

    private void setNumero(int numero) {
        this.numero = numero;
    }

    public void iniciarJuego() { //Inicio
        String finalJuego;
        Scanner leer;
        leer = new Scanner(System.in);
        j1.setNombre(ingresoJugador());
        System.out.println("Hola " + j1.getNombre() + ". Ingrese la cantidad de intentos deseada");
        cantIntentos = leer.nextInt();
        System.out.println("Ahora ingresa un número para adivinar");
        numero = leer.nextInt();
        System.out.println("Es el turno de tu competidor");
        j2.setNombre(ingresoJugador());
        do {
            adivinaNum(j2);
            adivinaNum(j1);
            System.out.println("Desean seguir jugando / S=Si");
            finalJuego = leer.next();
        } while (finalJuego.equalsIgnoreCase("S"));
        ganadorJuego();

    }

    private String ingresoJugador() {
        String nombreJugador;
        Scanner leer = new Scanner(System.in);
        System.out.println("Bienvenido!! Ingrese su nombre");
        nombreJugador = leer.next();
        return nombreJugador;

    }

    private void adivinaNum(Jugador player) {
        int miNum, intentos = 0;
        Scanner leer = new Scanner(System.in);
        boolean finalizado = false;

        do {
            do {
                System.out.println("Ingrese un número del 1 al 10");
                miNum = leer.nextInt();
            } while (miNum < 1 || miNum > 10);

            intentos++;

            if (miNum == numero) {
                player.setGanados(player.getGanados() + 1);
                System.out.println("Felicitaciones " + player.getNombre() + ". Adivinaste!!."
                        + "\n Lo hiciste en " + intentos + " intentos.");
                finalizado = true;
            } else {
                // intentos++;
                if (intentos == cantIntentos) {
                    System.out.println("Lo lamento, " + player.getNombre() + " no adivinaste");
                    finalizado = true;
                } else {
                    if (miNum < numero) {
                        System.out.println("Intenta nuevamente. El número buscado es mayor que el ingresado");
                    } else {
                        System.out.println("Intenta nuevamente. El número buscado es menor que el ingresado");
                    }
                }
            }
        } while (!finalizado);
        System.out.println("Es el turno de tu contrincante."
                + "\n Ahora ingresa un número para adivinar");
        numero = leer.nextInt();
    }

    public void ganadorJuego() {
        String ganador;
        if (j1.getGanados() == j2.getGanados()) {
            ganador = "Partida empatada";
        } else if (j1.getGanados() > j2.getGanados()) {
            ganador = j1.getNombre();
        } else {
            ganador = j2.getNombre();
        }
        System.out.println("El ganador es " + ganador);
        System.out.println(j1.getNombre() + " = " + j1.getGanados());
        System.out.println(j2.getNombre() + " = " + j2.getGanados());
    }

}

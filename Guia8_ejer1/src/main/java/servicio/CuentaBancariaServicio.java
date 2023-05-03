/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicio;

import entidad.CuentaBancaria;
import java.util.Scanner;

/**
 *
 * @author John
 */
public class CuentaBancariaServicio {

    private Scanner leer = new Scanner(System.in).useDelimiter("\n"); //abajo de class
    CuentaBancaria cb1 = new CuentaBancaria();

    public void crearCuenta() {
        cb1.setNumeroCuenta(Math.random() * 10);
        System.out.println("Su numero de cuenta es: " + cb1.getNumeroCuenta());
        System.out.println("Ingrese un numero de DNI");
        cb1.setDniCliente(leer.nextLong());
        System.out.println("Cuanto va a depositar");
        cb1.setSaldoActual(leer.nextDouble());

    }

    public void ingreso() {
        System.out.println("Cuanto va a depositar?");
        double ingreso = leer.nextDouble();

        cb1.setSaldoActual(cb1.getSaldoActual() + ingreso);

    }

    public void retirar() {
        System.out.println("Cuanto desea retirar?");
        double retiro = leer.nextDouble();
        if (retiro < cb1.getSaldoActual()) {
            cb1.setSaldoActual(cb1.getSaldoActual() - retiro);
            System.out.println("La extraccion se realizo con exito");
            System.out.println("Hizo una extraccion de: " + retiro);
            System.out.println("Su saldo actual es de: " + cb1.getSaldoActual());
        } else {
            System.out.println("La extraccion no se pudo realizar, el retiro supera su saldo");
            System.out.println("Desea retirar todo su saldo? (s/n)");
            String opcion = leer.next();
            if (opcion.equalsIgnoreCase("s")) {
                cb1.setSaldoActual(0);
                System.out.println("Hizo una extraccion de: " + retiro);
                System.out.println("Su saldo actual es de: " + cb1.getSaldoActual());
            }
        }
        System.out.println("Fin de la operacion");
    }

    public void extraccionRapida() {
        System.out.println("Cuanto desea retirar?");
        double retiroRapido = leer.nextDouble();
        if (retiroRapido <= cb1.getSaldoActual() * 0.2) {
            cb1.setSaldoActual(cb1.getSaldoActual() - retiroRapido);
            System.out.println("Retiro exitoso, su saldo actual es de: "+cb1.getSaldoActual());

        } else {
            System.out.println("No se puede retirar más del 20% del saldo.");
        }

    }
    public void  consultarSaldo(){
        System.out.println("Su saldo actual es de: "+cb1.getSaldoActual());
    }
    
    public void consultarDatos(){
        System.out.println("Su numero de cuenta es: "+ cb1.getNumeroCuenta());
        System.out.println("Su numero de DNI es: "+ cb1.getDniCliente());
        System.out.println("Su saldo actual es de: "+cb1.getSaldoActual());
        
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidad;

/**
 *
 * @author John
 */
public class CuentaBancaria {
    double numeroCuenta;
    long dniCliente;
    double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(double numeroCuenta, long dniCliente, double saldoActual) {
        this.numeroCuenta = numeroCuenta; 
        this.dniCliente = dniCliente;
        this.saldoActual = saldoActual;
    }

    
    
    
    public double getNumeroCuenta() {
        return numeroCuenta;
    }

    public long getDniCliente() {
        return dniCliente;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setNumeroCuenta(double numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDniCliente(long dniCliente) {
        this.dniCliente = dniCliente;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }
    
    
}


package ejercicio5;

import java.util.Scanner;

public class CuentaBancaria {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private int numeroCuenta;
    private String DNI;
    private double saldoActual;

    public CuentaBancaria() {
    }

    public CuentaBancaria(int numeroCuenta, String DNI, double saldoActual) {
        this.numeroCuenta = numeroCuenta;
        this.DNI = DNI;
        this.saldoActual = saldoActual;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public String getDNI() {
        return DNI;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

}

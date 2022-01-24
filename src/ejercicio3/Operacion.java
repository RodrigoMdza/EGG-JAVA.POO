package ejercicio3;

import java.util.Scanner;

public class Operacion {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public double numero1;
    public double numero2;

    public Operacion(double numero1, double numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public double Sumar() {
        double sumar;
        sumar = numero1 + numero2;
        return sumar;
    }

    public double Restar() {
        return numero1 - numero2;
    }

    public double Multiplicar() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("ERROR");
            return 0;
        } else {
            return numero1 * numero2;
        }
    }

    public double Dividir() {
        if (numero1 == 0 || numero2 == 0) {
            System.out.println("ERROR");
            return 0;
        } else {
            return numero1 / numero2;
        }
    }
}

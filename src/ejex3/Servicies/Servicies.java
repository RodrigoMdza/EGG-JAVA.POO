package ejex3.Servicies;

import ejex3.objeto.Raices;
import java.util.Scanner;

public class Servicies {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Raices op1 = new Raices();
    private double a;
    private double b;
    private double c;

    public void llenarObjeto() {
        System.out.println("Ingrese los valores");
        a = leer.nextDouble();
        b = leer.nextDouble();
        c = leer.nextDouble();
    }

    public double getDiscriminante() {
        double discriminante = (Math.pow(b, 2) - 4 * a * c);
        return discriminante;
    }

    public boolean tieneRaices() {
        if (getDiscriminante() > 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean tieneRaiz() {
        if (getDiscriminante() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public void obtenerRaices() {
        double raiz1;
        double raiz2;
        if (tieneRaices()) {
            raiz1 = (-b + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            raiz2 = (-b - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
            System.out.println(raiz1);
            System.out.println(raiz2);
        } else {
            System.out.println("No tiene dos raices");
        }
    }

    public void obtenerRaiz() {
        if (tieneRaiz()) {
            double raiz = (-b / (2 * a));
            System.out.println(raiz);
        } else {
            System.out.println("No tiene una sola raiz");
        }
    }

    public void calcular() {
        if (tieneRaices()) {
            obtenerRaices();
        } else if (tieneRaiz()) {
            obtenerRaiz();
        } else {
            System.out.println("No tiene ninguna raiz");
        }
    }
}

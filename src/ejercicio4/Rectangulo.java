package ejercicio4;

import java.util.Scanner;

public class Rectangulo {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double Superficie() {
        return base * altura;
    }

    public double Perimetro() {
        return (base + altura) * 2;
    }

    public void dibujar() {
        double n, m;
        m = this.base;
        n = this.altura;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}

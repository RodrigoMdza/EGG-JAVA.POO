package ejercicio6;

import java.util.Scanner;

public class CafeteraServicies {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    Cafetera cafetera1 = new Cafetera();
    private int CapacidadMaxima;
    private int CantidadActual;

    public void CrearCafetera() {
        cafetera1.setCapacidadMaxima(1000);
        cafetera1.setCantidadActual(0);
    }

    public void llenarCafetera() {
        CapacidadMaxima = cafetera1.getCapacidadMaxima();
        CantidadActual = cafetera1.getCantidadActual();
        cafetera1.setCantidadActual(CapacidadMaxima);
    }

    public void servirTaza(int servtaza) {
        CapacidadMaxima = cafetera1.getCapacidadMaxima();
        CantidadActual = cafetera1.getCantidadActual();
        if (CapacidadMaxima == 0) {
            System.out.println("No hay cafe");
        } else if (CapacidadMaxima < servtaza) {
            System.out.println("La taza no se lleno completamente");
            System.out.println("Solo se llenaron " + CapacidadMaxima + "ml");
            cafetera1.setCantidadActual(0);
        } else {
            System.out.println("la taza se lleno completamente");
            cafetera1.setCantidadActual(CapacidadMaxima - servtaza);
            System.out.println("La cantidad actual es " + CantidadActual);
        }
    }
}

package ejercicio6;

import java.util.Scanner;

public class Cafetera {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private int CapacidadMaxima;
    private int CantidadActual;

    public Cafetera() {

    }

    public Cafetera(int CapacidadMaxima, int CantidadActual) {
        this.CapacidadMaxima = CapacidadMaxima;
        this.CantidadActual = CantidadActual;
    }

    public void setCapacidadMaxima(int CapacidadMaxima) {
        this.CapacidadMaxima = CapacidadMaxima;
    }

    public void setCantidadActual(int CantidadActual) {
        this.CantidadActual = CantidadActual;
    }

    public int getCapacidadMaxima() {
        return CapacidadMaxima;
    }

    public int getCantidadActual() {
        return CantidadActual;
    }

}

package ejex4;

import java.util.Scanner;

public class NIF {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private int DNI;
    private String letra;

    public NIF() {
    }

    public NIF(int DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public String getLetra() {
        return letra;
    }

    public String crearNif() {
        System.out.println("Ingrese el DNI");
        DNI = leer.nextInt();
        int NIF = DNI % 23;
        String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V",
            "H", "L", "C", "K", "E"};
        letra = (letras[NIF]);
        return letra;
    }

    public void mostrar() {
        System.out.println(DNI + "-" + letra);
    }
}

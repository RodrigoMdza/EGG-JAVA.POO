
package ejex6;

import java.util.Scanner;

public class Ahorcado {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String[] palabra;
    private int letrasEncontradas;
    private int maxjugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, int letrasEncontradas, int maxjugadas) {
        this.palabra = palabra;
        this.letrasEncontradas = letrasEncontradas;
        this.maxjugadas = maxjugadas;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public void setLetrasEncontradas(int letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    public void setMaxjugadas(int maxjugadas) {
        this.maxjugadas = maxjugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public int getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public int getMaxjugadas() {
        return maxjugadas;
    }

    
}

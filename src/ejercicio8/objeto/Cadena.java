package ejercicio8.objeto;

import java.util.Scanner;

public class Cadena {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    private String frase;
    private int longitud;

    public Cadena() {
    }

    public Cadena(String frase, int longitud) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public int mostrarVocales() {
        String letra = "";
        int contadorvocales = 0;
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, i + 1).equals("a") || frase.substring(i, i + 1).equals("e") || frase.substring(i, i + 1).equals("i") || frase.substring(i, i + 1).equals("o") || frase.substring(i, i + 1).equals("u")) {
                contadorvocales += 1;
            }
        }
        return contadorvocales;
    }

    public String invertirFrase() {
        StringBuilder frase2 = new StringBuilder(frase);
        frase = frase2.reverse().toString();
        return frase;
    }

    public int vecesRepetido(String letra) {
        int contadorletra = 0;
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, i + 1).equals(letra)) {
                contadorletra += 1;
            }
        }
        return contadorletra;
    }

    public void compararLongitud(String frase2) {
        int longitud2 = frase2.length();
        if (longitud == longitud2) {
            System.out.println("Ambas tienen la misma longitud");
        } else {
            System.out.println("NO tienen la misma longitud");
        }
    }

    public void unirFrases(String frase2) {
        frase = frase + " " + frase2;
        System.out.println(frase);
    }

    public void remplazar(String letra) {
        String frase2 = "";
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, (i + 1)).equals("a")) {
                frase2 += letra;
            } else {
                frase2 += frase.substring(i, (i + 1));
            }
        }
        System.out.println(frase2);
    }

    public boolean contiene(String letra) {
        boolean contiene = false;
        for (int i = 0; i < longitud; i++) {
            if (frase.substring(i, (i + 1)).equals(letra)) {
                contiene = true;
            }
        }
        return contiene;
    }
}

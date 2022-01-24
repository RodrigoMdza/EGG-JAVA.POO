package ejex6;

import java.util.Scanner;

public class AhorcadoServicies {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Ahorcado ahorcado = new Ahorcado();
    static String respuesta;
    static int dim;

    public void crearJuego() {
        System.out.println("Ingrese la palabra a adivinar");
        respuesta = leer.nextLine().trim();
        dim = respuesta.length();
        String[] palabra = new String[dim];
        for (int i = 0; i < dim; i++) {
            palabra[i] = respuesta.substring(i, i + 1);
        }

        ahorcado.setLetrasEncontradas(0);
        System.out.println("Ingrese el maximo de jugadas permitidas");
        ahorcado.setMaxjugadas(leer.nextInt());
    }

    public void longitud() {
        System.out.println("Debe adivinarse una palabra de " + dim + "caracteres");
    }

    public void buscar() {
        System.out.println("Ingrese la letra a buscar");
        String letra1 = leer.next();
        boolean encontrado = false;
        for (int i = 0; i < dim; i++) {
            if (letra1.equals(respuesta.substring(i, i + 1))) {
                System.out.println("La letra se encuentra en la palabra en la posicion " + (i + 1));
                ahorcado.setLetrasEncontradas(ahorcado.getLetrasEncontradas() + 1);
                encontrado = true;
            }
        }
        if (encontrado == false) {
            System.out.println("LA LETRA NO SE ENCUENTRA EN LA PALABRA");
            ahorcado.setMaxjugadas(ahorcado.getMaxjugadas() - 1);
        }
    }

    public void encontradas() {
        System.out.println("Se han encontrado al momento " + ahorcado.getLetrasEncontradas());
        System.out.println("Faltan encontrar " + (dim - ahorcado.getLetrasEncontradas()));
        System.out.println("Intentos restantes " + ahorcado.getMaxjugadas());
    }

    public void juego() {
        System.out.println("");
        System.out.println("CREANDO EL JUEGO");
        System.out.println("");
        crearJuego();
        longitud();
        System.out.println("");
        System.out.println("COMIENZA LA DIVERSION");
        System.out.println("");
        while (ahorcado.getMaxjugadas() > 0) {
            buscar();
            encontradas();
            if (ahorcado.getLetrasEncontradas() == dim) {
                System.out.println("HA GANADO");
                break;
            }
            if (ahorcado.getMaxjugadas() < 1) {
                System.out.println("HA PERDIDO");
                break;
            }
        }
    }
}

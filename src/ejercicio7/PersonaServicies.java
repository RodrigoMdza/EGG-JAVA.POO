package ejercicio7;

import java.util.Scanner;

public class PersonaServicies {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Persona persona = new Persona();

    public void crearperson() {
        System.out.println("Ingrese el nombre");
        persona.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        persona.setEdad(leer.nextDouble());
        System.out.println("Ingrese el sexo");
        persona.setSexo(leer.next());
        System.out.println("Ingrese el peso");
        persona.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura");
        persona.setAltura(leer.nextDouble());
    }

    public int calcularIMC() {
        double IMC;
        IMC = persona.getPeso() / (persona.getAltura() * persona.getAltura());
        if (IMC < 20) {
            return -1;
        }
        if (IMC > 24) {
            return 1;
        }
        if (IMC >= 20 && IMC <= 25) {
            return 0;
        }
        return 2;
    }

    public boolean esMayor() {
        return persona.getEdad() >= 18;
    }
}

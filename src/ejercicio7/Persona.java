package ejercicio7;

import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String Nombre;
    private double edad;
    private String sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String Nombre, double edad, String sexo, double peso, double altura) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return Nombre;
    }

    public double getEdad() {
        return edad;
    }

    public String getSexo() {
        return sexo;
    }

    public double getPeso() {
        return peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
}

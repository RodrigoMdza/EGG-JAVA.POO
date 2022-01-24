package ejercicio12;

import java.time.LocalDate;

import java.time.Period;
import java.util.Date;
import java.util.Scanner;

public class Persona {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String nombre;
    private int dia;
    private int mes;
    private int anio;
    private Date fechaNacimiento;

    public Persona() {
        fechaNacimiento = new Date();
    }

    public Persona(String nombre, int dia, int mes, int anio, Date fechaNacimiento) {
        this.nombre = nombre;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void crearPersona() {
        System.out.println("Ingrese el nombre");
        nombre = leer.next();
        System.out.println("Ingrese el amop de nacimiento");
        anio = leer.nextInt();
        System.out.println("El mes");
        mes = leer.nextInt();
        System.out.println("El dia");
        dia = leer.nextInt();
        fechaNacimiento = new Date(anio, mes, dia);
    }

    public void mostrarPersona() {
        System.out.println("La persona creada es:");
        System.out.println(nombre);
        System.out.println(fechaNacimiento.toString());
    }

    public int calcularEdad() {
        LocalDate fechahoy = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(anio + 1900, mes, dia);
        Period periodo = Period.between(fechaNacimiento, LocalDate.now());
        int edad = periodo.getYears();
        return edad;
    }

    public boolean menorQue(int edad2) {
        boolean menorQue = false;
        if (edad2 < calcularEdad()) {
            menorQue = true;
        }
        return menorQue;
    }
}

/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con
la clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la
clase Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le
pedirán al usuario para poner el constructor del objeto Date. Una vez creada la fecha
de tipo Date, deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la
fecha actual, que se puede conseguir instanciando un objeto Date con constructor
vacío.
 */
package ejercicio11;

import java.util.Date;
import java.util.Scanner;

public class ejercicio11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int distancia;
        Date fecha = new Date(leer.nextInt(), leer.nextInt(), leer.nextInt());
        Date fechaActual = new Date();
        System.out.println(fecha.toString());
        distancia = fechaActual.getYear() - fecha.getYear();
        System.out.println("Hay " + distancia + " anios entre las fechas ");
    }

}

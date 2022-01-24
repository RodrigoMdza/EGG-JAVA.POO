/*
Crea una clase en Java donde declares una variable de tipo array de Strings que
contenga los doce meses del año, en minúsculas. A continuación declara una variable
mesSecreto de tipo String, y hazla igual a un elemento del array (por ejemplo
mesSecreto = mes[9]. El programa debe pedir al usuario que adivine el mes secreto.
Si el usuario acierta mostrar un mensaje, y si no lo hace, pedir que vuelva a intentar
adivinar el mes secreto. Un ejemplo de ejecución del programa podría ser este:
Adivine el mes secreto. Introduzca el nombre del mes en minúsculas: febrero
No ha acertado. Intente adivinarlo introduciendo otro mes: agosto
No ha acertado. Intente adivinarlo introduciendo otro mes: octubre
¡Ha acertado!
 */
package ejex5;

import java.util.Scanner;

public class ejex5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String[] array = {"enero", "febrero", "marzo", "abril", "mayo", "junio", "julio", "agosto",
            "septiembre", "octubre", "noviembre", "diciembre"};
        String messecreto = array[2];
        String intento;
        do {
            System.out.println("Intente adivinar el mes secreto");
            intento = leer.next();
            if (intento.equals(messecreto)) {

            } else {
                System.out.println("NO ha acertado, intente nuevamente");
                intento = leer.next();
            }
        } while (!intento.equals(messecreto));
        System.out.println("HA ACERTADO");
    }
}

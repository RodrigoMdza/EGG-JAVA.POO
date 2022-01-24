/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales
con los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener
un constructor vacío, parametrizado y get y set. En el main se creará el objeto y se
usará el Math.random para generar los dos números y se guardaran en el objeto con
su respectivos set. Deberá además implementar los siguientes métodos:
20
• Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor
valor
• Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
• Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
 */
package ejercicio9;

import ejercicio9.objeto.Matematica;
import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double num1;
        double num2;
        Matematica matematica = new Matematica();
        matematica.setNum1(num1 = Math.random() * 10);
        matematica.setNum2(num2 = Math.random() * 10);
        System.out.println("numero 1 " + num1 + " numero 2 " + num2);
        System.out.println(matematica.devolverMayor());
        System.out.println(matematica.calcularPotencia());
        System.out.println(matematica.calcularRaiz());
    }

}

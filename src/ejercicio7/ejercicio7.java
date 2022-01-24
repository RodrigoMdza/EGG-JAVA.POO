/*
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún
otro atributo, puede hacerlo. Los métodos que se implementarán son:
• Un constructor por defecto.
• Un constructor con todos los atributos como parámetro.
• Métodos getters y setters de cada atributo.
• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, la
función devuelve un -1. Si la fórmula da por resultado un número entre 20 y 25
(incluidos), significa que el peso está por debajo de su peso ideal y la función
devuelve un 0. Finalmente, si el resultado de la fórmula es un valor mayor que 25
significa que la persona tiene sobrepeso, y la función devuelve un 1. Se recomienda
hacer uso de constantes para devolver estos valores.
• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad
en distintas variables, para después en el main, calcular un porcentaje de esas 4
personas cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por
encima, y también calcularemos un porcentaje de cuantos son mayores de edad y
cuantos menores.
*/
package ejercicio7;

import java.util.Scanner;

public class ejercicio7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        PersonaServicies persona = new PersonaServicies();
        int contbajopeso, contnormopeso, contsobrepeso, contmayor, contmenor;
        contbajopeso = 0;
        contnormopeso = 0;
        contsobrepeso = 0;
        contmayor = 0;
        contmenor = 0;
        persona.crearperson();
        persona.calcularIMC();
        persona.esMayor();
        if (persona.esMayor()) {
            System.out.println("Es meyor de edad");
            contmayor += 1;
        } else {
            System.out.println("Es menor");
            contmenor += 1;
        }
        if (persona.calcularIMC() == 0) {
            System.out.println("Peso normal");
            contnormopeso += 1;
        }
        if (persona.calcularIMC() == -1) {
            System.out.println("Bajo peso");
            contbajopeso += 1;
        }
        if (persona.calcularIMC() == 1) {
            System.out.println("Sobrepeso");
            contsobrepeso += 1;
        }
        PersonaServicies persona2 = new PersonaServicies();
        persona2.crearperson();
        if (persona2.esMayor()) {
            System.out.println("Es meyor de edad");
            contmayor += 1;
        } else {
            System.out.println("Es menor");
            contmenor += 1;
        }
        if (persona2.calcularIMC() == 0) {
            System.out.println("Peso normal");
            contnormopeso += 1;
        }
        if (persona2.calcularIMC() == -1) {
            System.out.println("Bajo peso");
            contbajopeso += 1;
        }
        if (persona2.calcularIMC() == 1) {
            System.out.println("Sobrepeso");
            contsobrepeso += 1;
        }
        PersonaServicies persona3 = new PersonaServicies();
        persona3.crearperson();
        if (persona3.esMayor()) {
            System.out.println("Es meyor de edad");
            contmayor += 1;
        } else {
            System.out.println("Es menor");
            contmenor += 1;
        }
        if (persona3.calcularIMC() == 0) {
            System.out.println("Peso normal");
            contnormopeso += 1;
        }
        if (persona3.calcularIMC() == -1) {
            System.out.println("Bajo peso");
            contbajopeso += 1;
        }
        if (persona3.calcularIMC() == 1) {
            System.out.println("Sobrepeso");
            contsobrepeso += 1;
        }
        PersonaServicies persona4 = new PersonaServicies();
        persona4.crearperson();
        if (persona4.esMayor()) {
            System.out.println("Es meyor de edad");
            contmayor += 1;
        } else {
            System.out.println("Es menor");
            contmenor += 1;
        }
        if (persona4.calcularIMC() == 0) {
            System.out.println("Peso normal");
            contnormopeso += 1;
        }
        if (persona4.calcularIMC() == -1) {
            System.out.println("Bajo peso");
            contbajopeso += 1;
        }
        if (persona4.calcularIMC() == 1) {
            System.out.println("Sobrepeso");
            contsobrepeso += 1;
        }
        System.out.println("Hay con peso normal " + contnormopeso + " bajo peso " + contbajopeso + " sobre peso " + contsobrepeso);
        System.out.println("Con sobrepeso hay un " + (contsobrepeso * 100) / 4);
        System.out.println("Con normopeso hay un " + (contnormopeso * 100) / 4);
        System.out.println("Con bajopeso hay un " + (contbajopeso * 100) / 4);
        System.out.println("Mayores son el " + (contmayor * 100) / 4 + "%" );
        System.out.println("Menores son el " + (contmenor * 100) / 4 + "%" );
         

    }
}

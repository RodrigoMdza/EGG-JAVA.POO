/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio 
de tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo
del objeto.
d) Método area(): para calcular el área de la circunferencia.
e) Método perimetro(): para calcular el perímetro.
 */
package ejercicio2;

public class ejercicio2 {

    public static void main(String[] args) {
        Circunferencia circulo = new Circunferencia();
        circulo.setRadio(6);
        System.out.println(circulo.getRadio());
        System.out.println(circulo.getArea());
        System.out.println(circulo.getPerimetro());
    }

}

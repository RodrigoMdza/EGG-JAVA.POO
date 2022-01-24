/*
Realizar un programa en Java donde se creen dos arreglos: el primero será un arreglo
A de 50 números reales, y el segundo B, un arreglo de 20 números, también reales. El
programa deberá inicializar el arreglo A con números aleatorios y mostrarlo por
pantalla. Luego, el arreglo A se debe ordenar de menor a mayor y copiar los primeros
10 números ordenados al arreglo B de 20 elementos, y rellenar los 10 últimos
elementos con el valor 0.5. Mostrar los dos arreglos resultantes: el ordenado de 50
elementos y el combinado de 20.
 */
package ejercicio10;

import java.util.Arrays;
import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        double[] array1 = new double[50];
        double[] array2 = new double[20];
        llenado(array1);
        ordenar(array1);
        System.out.println(Arrays.toString(array1));
        for (int i = 0; i < 20; i++) {
            if (i < 10) {
                array2 [i] = array1 [i];
            } 
            if (i >=10 && i < 20) {
             array2[i]=0.5;
            }
        }
        System.out.println(Arrays.toString(array2));
    }

    public static double[] llenado(double[] array1) {
        for (int i = 0; i < 50; i++) {
            array1[i] = (double) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(array1));
        return array1;
    }

    public static double[] ordenar(double[] array1) {
        Arrays.sort(array1);
        return array1;
    }

}

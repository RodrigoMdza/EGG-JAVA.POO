package ejercicio1;

import java.util.Scanner;

public class LibroService {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Libro libro1 = new Libro();

    public void crearLibro() {
        System.out.println("INGRESE EL ISBN");
        libro1.setISBN(leer.next());
        System.out.println("INGRESE El TITULO");
        libro1.setTitulo(leer.next());
        System.out.println("INGRESE EL AUTOR");
        libro1.setAutor(leer.next());
        System.out.println("INGRESE LA CANTIDAD DE PAGINAS");
        libro1.setPaginas(leer.nextInt());
        System.out.println(libro1.toString());
    }
}

package ejercicio1;

import java.util.Scanner;

public class Libro {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    private String ISBN;
    private String Titulo;
    private String Autor;
    private int paginas;

//constructor vavio
    public Libro() {
    }
    //contructor para llenar los objetos   

    public Libro(String ISBN, String Titulo, String Autor, int paginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.paginas = paginas;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", paginas=" + paginas + '}';
    }

}

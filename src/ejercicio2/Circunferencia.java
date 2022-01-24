package ejercicio2;

public class Circunferencia {

    private double radio;

    public Circunferencia(double radio) {
        this.radio = radio;
    }

    public Circunferencia() {
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public double getArea() {
        double area;
        area = 3.14 * radio;
        return area;
    }

    public double getPerimetro() {
        double perimetro;
        perimetro = (2 * 3.14 * radio);
        return perimetro;
    }

}

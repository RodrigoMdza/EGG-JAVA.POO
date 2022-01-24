package ejercicio5;

import java.util.Scanner;

public class CuentaBancariaServicies {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    CuentaBancaria cuenta = new CuentaBancaria();

    public CuentaBancaria crearCuenta() {
        System.out.println("Ingrese el dni");
        cuenta.setDNI(leer.next());
        System.out.println("Ingrese el saldo");
        cuenta.setSaldoActual(leer.nextDouble());
        System.out.println("Ingrese el numero de cuenta");
        cuenta.setNumeroCuenta(leer.nextInt());
        return cuenta;
    }

    public void ingresar(double ingreso) {
        cuenta.setSaldoActual(cuenta.getSaldoActual() + ingreso);
    }

    public void retirar(double retiro) {
        if (cuenta.getSaldoActual() > retiro) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retiro);
        } else {
            System.out.println("No hay saldo disponible");
            cuenta.setSaldoActual(0);
        }
    }

    public void consultarSaldo() {
        System.out.println(cuenta.getSaldoActual());
    }

    public void consultarDatos() {
        System.out.println(cuenta.getNumeroCuenta());
        System.out.println(cuenta.getDNI());
        System.out.println(cuenta.getSaldoActual());
    }

    public void extraccionRapida(double retirorapido) {
        if (retirorapido < (cuenta.getSaldoActual() * 0.20)) {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retirorapido);
        } else {
            System.out.println("Solo puede retirar el 20%");
        }
    }
}

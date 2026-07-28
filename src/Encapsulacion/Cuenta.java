package Encapsulacion;

public class Cuenta {

    private String titular;
    private double saldo;

    public Cuenta(String titular, double saldo) {
        this.titular = titular;
        this.saldo = saldo;
    }

    public void depositar(double monto) {
        saldo += monto;
    }

    public void retirar(double monto) {
        if (monto <= saldo) {
            saldo -= monto;
        } else {
            System.out.println("No hay saldo suficiente.");
        }
    }

    public void mostrar() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: Q" + saldo);
    }

}
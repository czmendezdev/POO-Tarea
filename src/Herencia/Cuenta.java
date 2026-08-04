package Herencia;

public class Cuenta {

    private String numeroCuenta;
    private double saldo;

    public Cuenta(String numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }

    public Cuenta() {
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void retirar(double monto) {

        if (monto <= saldo) {
            saldo -= monto;
            System.out.println("Retiro realizado.");
        } else {
            System.out.println("Saldo insuficiente.");
        }

    }

    public void mostrar() {
        System.out.println("Cuenta: " + numeroCuenta);
        System.out.println("Saldo: Q" + saldo);
    }
}
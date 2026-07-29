package GettersAndSetters;

public class CuentaBancaria {

    private String titular;
    private double saldo;
    private int pin;

    public CuentaBancaria() {
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("El saldo no puede ser negativo.");
            this.saldo = 0;
        }
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public void retirar(double monto, int pinIngresado) {
        if (pinIngresado != pin) {
            System.out.println("PIN incorrecto. Retiro rechazado.");
        } else if (monto <= 0) {
            System.out.println("El monto debe ser mayor que 0.");
        } else if (monto > saldo) {
            System.out.println("Saldo insuficiente.");
        } else {
            saldo -= monto;
            System.out.println("Retiro realizado correctamente.");
        }
    }
}
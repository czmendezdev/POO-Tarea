package Herencia;

public class CuentaCorriente extends Cuenta {

    private double limiteSobregiro;

    public CuentaCorriente(String numeroCuenta,
                           double saldo,
                           double limiteSobregiro) {

        super(numeroCuenta, saldo);
        this.limiteSobregiro = limiteSobregiro;
    }

    public CuentaCorriente() {
    }

    public double getLimiteSobregiro() {
        return limiteSobregiro;
    }

    public void setLimiteSobregiro(double limiteSobregiro) {
        this.limiteSobregiro = limiteSobregiro;
    }

    @Override
    public void retirar(double monto) {

        if (monto <= getSaldo() + limiteSobregiro) {

            setSaldo(getSaldo() - monto);

            System.out.println("Retiro realizado usando sobregiro si fue necesario.");

        } else {

            System.out.println("Se excedio el limite de sobregiro.");

        }

    }

    @Override
    public void mostrar() {

        super.mostrar();

        System.out.println("Limite de sobregiro: Q" + limiteSobregiro);

    }

}
package Herencia;

public class Electrodomestico {

    protected String marca;
    protected int potencia;

    public Electrodomestico(String marca, int potencia) {
        this.marca = marca;
        this.potencia = potencia;
    }

    public void mostrar() {
        System.out.println("Marca: " + marca);
        System.out.println("Potencia: " + potencia + " W");
    }
}
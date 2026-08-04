package Herencia;

public class Carro extends Vehiculo {

    private int puertas;

    public Carro(String marca, String modelo, int anio, int puertas) {
        super(marca, modelo, anio);
        this.puertas = puertas;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Puertas: " + puertas);
    }
}
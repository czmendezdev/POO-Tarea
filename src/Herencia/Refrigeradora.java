package Herencia;

public class Refrigeradora extends Electrodomestico {

    private int capacidad;

    public Refrigeradora(String marca, int potencia, int capacidad) {
        super(marca, potencia);
        this.capacidad = capacidad;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Capacidad: " + capacidad + " litros");
    }
}
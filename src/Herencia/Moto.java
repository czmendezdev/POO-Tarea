package Herencia;

public class Moto extends Vehiculo {

    private int cilindraje;

    public Moto(String marca, String modelo, int anio, int cilindraje) {
        super(marca, modelo, anio);
        this.cilindraje = cilindraje;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Cilindraje: " + cilindraje + " cc");
    }
}
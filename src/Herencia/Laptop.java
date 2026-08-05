package Herencia;

public class Laptop extends Computadora {

    private double pulgadas;

    public Laptop(String marca, String procesador, int ram, double pulgadas) {
        super(marca, procesador, ram);
        this.pulgadas = pulgadas;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Pantalla: " + pulgadas + " pulgadas");
    }
}

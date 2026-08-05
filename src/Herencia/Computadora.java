package Herencia;

public class Computadora {

    protected String marca;
    protected String procesador;
    protected int ram;

    public Computadora(String marca, String procesador, int ram) {
        this.marca = marca;
        this.procesador = procesador;
        this.ram = ram;
    }

    public void mostrar() {
        System.out.println("Marca: " + marca);
        System.out.println("Procesador: " + procesador);
        System.out.println("RAM: " + ram + " GB");
    }
}
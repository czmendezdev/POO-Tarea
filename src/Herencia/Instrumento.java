package Herencia;

public class Instrumento {

    protected String nombre;
    protected String tipo;

    public Instrumento(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
    }
}
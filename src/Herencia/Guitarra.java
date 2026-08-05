package Herencia;

public class Guitarra extends Instrumento {

    private int cuerdas;

    public Guitarra(String nombre, String tipo, int cuerdas) {
        super(nombre, tipo);
        this.cuerdas = cuerdas;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Cuerdas: " + cuerdas);
    }
}
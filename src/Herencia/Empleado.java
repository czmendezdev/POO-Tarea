package Herencia;

public class Empleado {

    protected String nombre;
    protected double salario;

    public Empleado(String nombre, double salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    public void mostrar() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Salario: Q" + salario);
    }
}
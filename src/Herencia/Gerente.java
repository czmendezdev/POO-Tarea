package Herencia;

public class Gerente extends Empleado {

    private String departamento;

    public Gerente(String nombre, double salario, String departamento) {
        super(nombre, salario);
        this.departamento = departamento;
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Departamento: " + departamento);
    }
}
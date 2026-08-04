package Herencia;

import java.time.LocalDate;

public class ProductoPerecedero extends Producto {

    private LocalDate fechaVencimiento;

    public ProductoPerecedero(
            String codigo,
            String nombre,
            double precio,
            LocalDate fechaVencimiento
    ) {
        super(codigo, nombre, precio);
        this.fechaVencimiento = fechaVencimiento;
    }

    public ProductoPerecedero() {
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public boolean estaVencido() {
        return fechaVencimiento.isBefore(LocalDate.now());
    }

    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Fecha de vencimiento: " + fechaVencimiento);

        if (estaVencido()) {
            System.out.println("Estado: Producto vencido");
        } else {
            System.out.println("Estado: Producto vigente");
        }
    }
}
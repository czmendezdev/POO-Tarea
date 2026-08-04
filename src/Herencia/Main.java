package Herencia;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== EJERCICIO 1: HERENCIA =====");

        Persona persona = new Persona(
                "Carlos",
                "Lopez",
                35,
                true
        );

        Estudiante estudiante = new Estudiante(
                "Maria",
                "Perez",
                17,
                true,
                "2026-001"
        );

        Docente docente = new Docente(
                "Juan",
                "Garcia",
                40,
                true,
                "Programacion"
        );

        System.out.println("\n--- PERSONA ---");
        persona.mostrar();

        System.out.println("\n--- ESTUDIANTE ---");
        estudiante.mostrar();

        System.out.println("\n--- DOCENTE ---");
        docente.mostrar();

        System.out.println("\n===== EJERCICIO 2: CUENTAS =====");

        Cuenta cuenta = new Cuenta(
                "001",
                1000
        );

        CuentaCorriente corriente = new CuentaCorriente(
                "002",
                1000,
                500
        );

        System.out.println("\n--- CUENTA NORMAL ---");
        cuenta.mostrar();

        cuenta.retirar(300);
        cuenta.mostrar();

        System.out.println("\n--- CUENTA CORRIENTE ---");
        corriente.mostrar();

        corriente.retirar(1200);
        corriente.mostrar();

        corriente.retirar(500);
        corriente.mostrar();


        System.out.println("\n===== EJERCICIO 3: PRODUCTOS =====");

        Producto producto = new Producto(
                "P001",
                "Teclado",
                350
        );

        ProductoPerecedero productoPerecedero1 =
                new ProductoPerecedero(
                        "P002",
                        "Leche",
                        18,
                        LocalDate.now().plusDays(5)
                );

        ProductoPerecedero productoPerecedero2 =
                new ProductoPerecedero(
                        "P003",
                        "Yogur",
                        12,
                        LocalDate.now().minusDays(2)
                );

        System.out.println("\n--- PRODUCTO NORMAL ---");
        producto.mostrar();

        System.out.println("\n--- PRODUCTO PERECEDERO VIGENTE ---");
        productoPerecedero1.mostrar();

        System.out.println("\n--- PRODUCTO PERECEDERO VENCIDO ---");
        productoPerecedero2.mostrar();

    }
}
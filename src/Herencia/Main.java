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

        System.out.println("\n===== EJERCICIO 4: VEHICULO =====");

        Vehiculo vehiculo = new Vehiculo(
                "Toyota",
                "Corolla",
                2020
        );

        Carro carro = new Carro(
                "Honda",
                "Civic",
                2023,
                4
        );

        System.out.println("\n--- VEHICULO ---");
        vehiculo.mostrar();

        System.out.println("\n--- CARRO ---");
        carro.mostrar();

        System.out.println("\n===== EJERCICIO 5: EMPLEADOS =====");

        Empleado empleado = new Empleado(
                "Luis",
                3500
        );

        Gerente gerente = new Gerente(
                "Ana",
                6500,
                "Recursos Humanos"
        );

        System.out.println("\n--- EMPLEADO ---");
        empleado.mostrar();

        System.out.println("\n--- GERENTE ---");
        gerente.mostrar();


        System.out.println("\n===== EJERCICIO 6: ANIMALES =====");

        Animal animal = new Animal("Animal");

        Perro perro = new Perro(
                "Firulais",
                "Pastor Alemán"
        );

        System.out.println("\n--- ANIMAL ---");
        animal.hacerSonido();

        System.out.println("\n--- PERRO ---");
        perro.hacerSonido();



        System.out.println("\n===== EJERCICIO 7: MOTO =====");

        Moto moto = new Moto(
                "Yamaha",
                "FZ",
                2024,
                150
        );

        System.out.println("\n--- MOTO ---");
        moto.mostrar();



        System.out.println("\n===== EJERCICIO 8: COMPUTADORAS =====");

        Computadora computadora = new Computadora(
                "Dell",
                "Intel Core i5",
                8
        );

        Laptop laptop = new Laptop(
                "Lenovo",
                "Intel Core i7",
                16,
                15.6
        );

        System.out.println("\n--- COMPUTADORA ---");
        computadora.mostrar();

        System.out.println("\n--- LAPTOP ---");
        laptop.mostrar();



        System.out.println("\n===== EJERCICIO 9: ELECTRODOMESTICOS =====");

        Electrodomestico electrodomestico = new Electrodomestico(
                "LG",
                800
        );

        Refrigeradora refrigeradora = new Refrigeradora(
                "Samsung",
                1200,
                450
        );

        System.out.println("\n--- ELECTRODOMESTICO ---");
        electrodomestico.mostrar();

        System.out.println("\n--- REFRIGERADORA ---");
        refrigeradora.mostrar();


        System.out.println("\n===== EJERCICIO 10: INSTRUMENTOS =====");

        Instrumento instrumento = new Instrumento(
                "Piano",
                "Teclas"
        );

        Guitarra guitarra = new Guitarra(
                "Guitarra Yamaha",
                "Cuerda",
                6
        );

        System.out.println("\n--- INSTRUMENTO ---");
        instrumento.mostrar();

        System.out.println("\n--- GUITARRA ---");
        guitarra.mostrar();
    }
}
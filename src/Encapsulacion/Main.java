package Encapsulacion;

public class Main {

    public static void main(String[] args) {

        // =========================
        // EJERCICIO 1: PERSONA
        // =========================

        Persona persona1 = new Persona("Carlos", "Lopez", 25);
        Persona persona2 = new Persona("Maria", "Perez", 20);
        Persona persona3 = new Persona("Juan", "Garcia", 30);

        persona1.mostrar();
        System.out.println();

        persona2.mostrar();
        System.out.println();

        persona3.mostrar();

        // =========================
        // EJERCICIO 2: RECTANGULO
        // =========================

        System.out.println("\n===== EJERCICIO 2 =====");

        Rectangulo rectangulo1 = new Rectangulo(8, 5);
        Rectangulo rectangulo2 = new Rectangulo(6, 9);

        System.out.println("Area Rectangulo 1: " + rectangulo1.area());
        System.out.println("Perimetro Rectangulo 1: " + rectangulo1.perimetro());

        System.out.println();

        System.out.println("Area Rectangulo 2: " + rectangulo2.area());
        System.out.println("Perimetro Rectangulo 2: " + rectangulo2.perimetro());

        System.out.println();

        if (rectangulo1.area() > rectangulo2.area()) {
            System.out.println("El Rectangulo 1 tiene mayor area.");
        } else if (rectangulo2.area() > rectangulo1.area()) {
            System.out.println("El Rectangulo 2 tiene mayor area.");
        } else {
            System.out.println("Ambos rectangulos tienen la misma area.");
        }
        // =========================
        // EJERCICIO 3: PRODUCTO
        // =========================
        System.out.println("\n===== EJERCICIO 3 =====");

        Producto producto1 = new Producto("P001", "Laptop", 5500);
        Producto producto2 = new Producto("P002", "Mouse", 250);

        producto1.aplicarDescuento(10);
        producto2.aplicarDescuento(20);

        producto1.mostrar();
        System.out.println();

        producto2.mostrar();

        // =========================
        // EJERCICIO 4: CUENTA
        // =========================
        System.out.println("\n===== EJERCICIO 4 =====");

        Cuenta cuenta = new Cuenta("Carlos Lopez", 1000);

        cuenta.mostrar();
        System.out.println();

        cuenta.depositar(500);
        System.out.println("Deposito de Q500");
        cuenta.mostrar();
        System.out.println();

        cuenta.retirar(300);
        System.out.println("Retiro de Q300");
        cuenta.mostrar();
        System.out.println();

        cuenta.retirar(1500);
        cuenta.mostrar();


        // =========================
        // EJERCICIO 5: LIBRO
        // =========================
        System.out.println("\n===== EJERCICIO 5 =====");

        Libro libro1 = new Libro("Java Basico", "Luis Perez", 250);
        Libro libro2 = new Libro("Programacion Orientada a Objetos", "Ana Gomez", 420);
        Libro libro3 = new Libro("Base de Datos", "Carlos Ruiz", 315);

        libro1.mostrar();
        System.out.println();

        libro2.mostrar();
        System.out.println();

        libro3.mostrar();


        // =========================
        // EJERCICIO 6: CALCULADORA
        // =========================
        System.out.println("\n===== EJERCICIO 6 =====");

        Calculadora calculadora = new Calculadora();

        System.out.println("Suma: " + calculadora.sumar(15, 5));
        System.out.println("Resta: " + calculadora.restar(15, 5));
        System.out.println("Multiplicacion: " + calculadora.multiplicar(15, 5));
        System.out.println("Division: " + calculadora.dividir(15, 5));

        System.out.println();
        System.out.println("Prueba dividiendo entre cero:");
        calculadora.dividir(15, 0);


        // =========================
        // EJERCICIO 7: FECHA
        // =========================
        System.out.println("\n===== EJERCICIO 7 =====");

        Fecha fecha1 = new Fecha(15, 8, 2026);
        Fecha fecha2 = new Fecha(35, 10, 2026);
        Fecha fecha3 = new Fecha(10, 15, 2026);

        fecha1.mostrar();
        System.out.println();

        fecha2.mostrar();
        System.out.println();

        fecha3.mostrar();
    }
}
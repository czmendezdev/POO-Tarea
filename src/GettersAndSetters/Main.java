package GettersAndSetters;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== EJERCICIO 1: PERSONA =====");

        Persona persona = new Persona();

        persona.setNombre("Carlos");
        persona.setApellido("Lopez");
        persona.setEdad(25);

        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
        System.out.println("Edad: " + persona.getEdad());

        System.out.println();

        persona.setEdad(-10);

        System.out.println("Edad después de ingresar -10:");
        System.out.println(persona.getEdad());

        ////////////////////////////////////////////////////////
        ////////////EJERCICIO 2: PRODUCTO//////////////////////

        System.out.println("\n===== EJERCICIO 2: PRODUCTO =====");

        Producto producto = new Producto();

        producto.setCodigo("P001");
        producto.setNombre("Teclado");
        producto.setPrecio(350);
        producto.setStock(10);

        System.out.println("Codigo: " + producto.getCodigo());
        System.out.println("Nombre: " + producto.getNombre());
        System.out.println("Precio: Q" + producto.getPrecio());
        System.out.println("Stock inicial: " + producto.getStock());

        System.out.println("\nVenta de 3 unidades:");
        producto.vender(3);
        System.out.println("Stock actual: " + producto.getStock());

        System.out.println("\nIntento de venta de 10 unidades:");
        producto.vender(10);
        System.out.println("Stock final: " + producto.getStock());


        ////////////////////////////////////////////////////////
        ////////////EJERCICIO 3: CUENTA BANCARIA//////////////////////
        System.out.println("\n===== EJERCICIO 3: CUENTA BANCARIA =====");

        CuentaBancaria cuenta = new CuentaBancaria();

        cuenta.setTitular("Carlos Lopez");
        cuenta.setSaldo(2000);
        cuenta.setPin(1234);

        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Saldo inicial: Q" + cuenta.getSaldo());

        System.out.println("\nIntento con PIN incorrecto:");
        cuenta.retirar(500, 9999);
        System.out.println("Saldo actual: Q" + cuenta.getSaldo());

        System.out.println("\nIntento con PIN correcto:");
        cuenta.retirar(500, 1234);
        System.out.println("Saldo final: Q" + cuenta.getSaldo());
    }
}
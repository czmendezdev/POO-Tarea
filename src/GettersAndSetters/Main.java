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

        ////////////////////////////////////////////////////////
        ////////////EJERCICIO 4: CURSO//////////////////////
        System.out.println("\n===== EJERCICIO 4: CURSO =====");

        Curso curso = new Curso();

        curso.setNombreCurso("Programacion II");
        curso.setNota1(75);
        curso.setNota2(68);
        curso.setNota3(80);

        System.out.println("Curso: " + curso.getNombreCurso());
        System.out.println("Nota 1: " + curso.getNota1());
        System.out.println("Nota 2: " + curso.getNota2());
        System.out.println("Nota 3: " + curso.getNota3());
        System.out.println("Promedio: " + curso.promedio());
        System.out.println("Estado: " + curso.estado());


        ////////////////////////////////////////////////////////
        ////////////EJERCICIO 5: ESTUDIANTE//////////////////////
        System.out.println("\n===== EJERCICIO 5: ESTUDIANTE =====");

        Estudiante estudiante = new Estudiante();

        estudiante.setCarnet("1690-16-14293");
        estudiante.setNombre("Carlos Lopez");
        estudiante.setPromedio(88);

        System.out.println("Carnet: " + estudiante.getCarnet());
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Promedio: " + estudiante.getPromedio());

        if (estudiante.esBecado()) {
            System.out.println("El estudiante tiene beca.");
        } else {
            System.out.println("El estudiante no tiene beca.");
        }

        ////////////////////////////////////////////////////////
        ////////////EJERCICIO 6: TERMOMETRO//////////////////////
        System.out.println("\n===== EJERCICIO 6: TERMOMETRO =====");

        Termometro termometro = new Termometro();

        termometro.setCelsius(25);

        System.out.println("Temperatura Celsius: " + termometro.getCelsius());
        System.out.println("Temperatura Fahrenheit: " + termometro.getFahrenheit());

        System.out.println("\nPrueba con temperatura menor al cero absoluto:");
        termometro.setCelsius(-300);

        System.out.println("Temperatura almacenada: " + termometro.getCelsius());
        System.out.println("Temperatura Fahrenheit: " + termometro.getFahrenheit());



        //////////////////////////////////////////////////////
        // EJERCICIO 7: RELOJ
        //////////////////////////////////////////////////////

        System.out.println("\n===== EJERCICIO 7: RELOJ =====");

        Reloj reloj = new Reloj();

        reloj.setHora(14);
        reloj.setMinuto(35);
        reloj.setSegundo(20);

        System.out.println("Hora: " + reloj.mostrarHora());

        System.out.println("\nProbando valores incorrectos:");

        reloj.setHora(30);
        reloj.setMinuto(70);
        reloj.setSegundo(80);

        System.out.println("Hora: " + reloj.mostrarHora());



        //////////////////////////////////////////////////////
        // EJERCICIO 8: CONTACTO
        //////////////////////////////////////////////////////

        System.out.println("\n===== EJERCICIO 8: CONTACTO =====");

        Contacto contacto = new Contacto();

        contacto.setNombre("Carlos Lopez");
        contacto.setTelefono("55123456");
        contacto.setEmail("carlos@gmail.com");

        contacto.mostrarContacto();

        System.out.println();

        Contacto contacto2 = new Contacto();

        contacto2.setNombre("Maria Perez");
        contacto2.setTelefono("12345");
        contacto2.setEmail("mariagmail.com");

        contacto2.mostrarContacto();


        //////////////////////////////////////////////////////
        // EJERCICIO 9: JUGADOR
        //////////////////////////////////////////////////////

        System.out.println("\n===== EJERCICIO 9: JUGADOR =====");

        Jugador jugador = new Jugador();

        jugador.setNombre("Carlos");
        jugador.setPuntajeMaximo(100);

        jugador.actualizarPuntaje(80);

        System.out.println("Jugador: " + jugador.getNombre());
        System.out.println("Puntaje actual: " + jugador.getPuntajeActual());
        System.out.println("Puntaje maximo: " + jugador.getPuntajeMaximo());

        System.out.println("\nNuevo puntaje de 150:");
        jugador.actualizarPuntaje(150);

        System.out.println("Puntaje actual: " + jugador.getPuntajeActual());
        System.out.println("Puntaje maximo: " + jugador.getPuntajeMaximo());

        System.out.println("\nPrueba con puntaje negativo:");
        jugador.actualizarPuntaje(-20);

        System.out.println("Puntaje actual: " + jugador.getPuntajeActual());
        System.out.println("Puntaje maximo: " + jugador.getPuntajeMaximo());


        //////////////////////////////////////////////////////
        // EJERCICIO 10: FACTURA
        //////////////////////////////////////////////////////

        System.out.println("\n===== EJERCICIO 10: FACTURA =====");

        Factura factura = new Factura();

        factura.setCodigoFactura("F001");
        factura.setDescripcion("Monitor LED");
        factura.setCantidad(2);
        factura.setPrecioUnitario(1250);

        factura.mostrarFactura();

        System.out.println();

        Factura factura2 = new Factura();

        factura2.setCodigoFactura("F002");
        factura2.setDescripcion("Teclado Gamer");
        factura2.setCantidad(-5);
        factura2.setPrecioUnitario(-300);

        factura2.mostrarFactura();
    }
}
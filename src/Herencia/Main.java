package Herencia;

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

    }
}
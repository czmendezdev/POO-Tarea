package Herencia;

public class Docente extends Persona {

    private String especialidad;

    public Docente(String nombre, String apellido, int edad,
                   boolean activo, String especialidad) {

        super(nombre, apellido, edad, activo);
        this.especialidad = especialidad;
    }

    public Docente() {
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    // Sobrescritura del método heredado de Persona.
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Especialidad: " + especialidad);
    }

    @Override
    public String toString() {
        return "Docente{" +
                "especialidad='" + especialidad + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", edad=" + getEdad() +
                ", activo=" + isActivo() +
                '}';
    }
}
package Herencia;

public class Estudiante extends Persona {

    private String carnet;

    public Estudiante(String nombre, String apellido, int edad, boolean activo, String carnet) {
        super(nombre, apellido, edad, activo);
        this.carnet = carnet;
    }

    public Estudiante() {
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    @Override
    public void validarEdad() throws Exception {
        super.validarEdad();

        if (this.getEdad() > 18) {
            throw new Exception("Es mayor de edad!");
        }
    }

    public void validarEdad(int nuevaEdad) throws Exception {
        this.setEdad(nuevaEdad);
        super.validarEdad();
    }

    // Sobrescritura del método heredado de Persona.
    @Override
    public void mostrar() {
        super.mostrar();
        System.out.println("Carnet: " + carnet);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "carnet='" + carnet + '\'' +
                ", nombre='" + getNombre() + '\'' +
                ", apellido='" + getApellido() + '\'' +
                ", edad=" + getEdad() +
                ", activo=" + isActivo() +
                '}';
    }
}
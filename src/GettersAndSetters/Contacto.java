package GettersAndSetters;

public class Contacto {

    private String nombre;
    private String telefono;
    private String email;

    public Contacto() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        if (telefono.length() == 8) {
            this.telefono = telefono;
        } else {
            System.out.println("El telefono debe tener exactamente 8 digitos.");
            this.telefono = "00000000";
        }
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        if (email.contains("@")) {
            this.email = email;
        } else {
            System.out.println("Correo electronico invalido.");
            this.email = "correo@ejemplo.com";
        }
    }

    public void mostrarContacto() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Telefono: " + telefono);
        System.out.println("Email: " + email);
    }
}
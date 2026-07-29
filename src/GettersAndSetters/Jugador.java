package GettersAndSetters;

public class Jugador {

    private String nombre;
    private int puntajeActual;
    private int puntajeMaximo;

    public Jugador() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntajeActual() {
        return puntajeActual;
    }

    public void setPuntajeActual(int puntajeActual) {
        if (puntajeActual >= 0) {
            this.puntajeActual = puntajeActual;
        } else {
            System.out.println("El puntaje actual no puede ser negativo.");
            this.puntajeActual = 0;
        }
    }

    public int getPuntajeMaximo() {
        return puntajeMaximo;
    }

    public void setPuntajeMaximo(int puntajeMaximo) {
        if (puntajeMaximo >= 0) {
            this.puntajeMaximo = puntajeMaximo;
        } else {
            System.out.println("El puntaje maximo no puede ser negativo.");
            this.puntajeMaximo = 0;
        }
    }

    public void actualizarPuntaje(int nuevoPuntaje) {
        if (nuevoPuntaje < 0) {
            System.out.println("El nuevo puntaje no puede ser negativo.");
            puntajeActual = 0;
        } else {
            puntajeActual = nuevoPuntaje;

            if (nuevoPuntaje > puntajeMaximo) {
                puntajeMaximo = nuevoPuntaje;
            }
        }
    }
}
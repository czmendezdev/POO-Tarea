package GettersAndSetters;

public class Producto {

    private String codigo;
    private String nombre;
    private double precio;
    private int stock;

    public Producto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("El precio debe ser mayor que 0.");
            this.precio = 0;
        }
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock >= 0) {
            this.stock = stock;
        } else {
            System.out.println("El stock no puede ser negativo.");
            this.stock = 0;
        }
    }

    public void vender(int cantidad) {
        if (cantidad <= 0) {
            System.out.println("La cantidad debe ser mayor que 0.");
        } else if (cantidad <= stock) {
            stock -= cantidad;
            System.out.println("Venta realizada correctamente.");
        } else {
            System.out.println("No hay suficientes unidades disponibles.");
        }
    }
}
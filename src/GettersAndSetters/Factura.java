package GettersAndSetters;

public class Factura {

    private String codigoFactura;
    private String descripcion;
    private int cantidad;
    private double precioUnitario;

    public Factura() {
    }

    public String getCodigoFactura() {
        return codigoFactura;
    }

    public void setCodigoFactura(String codigoFactura) {
        this.codigoFactura = codigoFactura;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        if (cantidad > 0) {
            this.cantidad = cantidad;
        } else {
            System.out.println("La cantidad debe ser mayor que cero.");
            this.cantidad = 1;
        }
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public void setPrecioUnitario(double precioUnitario) {
        if (precioUnitario > 0) {
            this.precioUnitario = precioUnitario;
        } else {
            System.out.println("El precio debe ser mayor que cero.");
            this.precioUnitario = 1;
        }
    }

    public double calcularTotal() {
        return cantidad * precioUnitario;
    }

    public void mostrarFactura() {
        System.out.println("Codigo: " + codigoFactura);
        System.out.println("Descripcion: " + descripcion);
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Precio Unitario: Q" + precioUnitario);
        System.out.println("Total: Q" + calcularTotal());
    }
}
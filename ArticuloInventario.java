public class ArticuloInventario {

    private String nombre;
    private double precioUnitario;
    private double cantidadStock;

    public ArticuloInventario(String nombre, double precioUnitario, double cantidadStock) {
        this.nombre = nombre;
        this.precioUnitario = precioUnitario;
        this.cantidadStock = cantidadStock;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioUnitario() {
        return precioUnitario;
    }

    public double getCantidadStock() {
        return cantidadStock;
    }

    public void ActualizarDatos(String nuevoNombre, double nuevoPrecio, double nuevaCantidad) {
        nombre = nuevoNombre;
        precioUnitario = nuevoPrecio;
        cantidadStock = nuevaCantidad;
    }
}

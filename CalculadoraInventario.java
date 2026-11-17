public class CalculadoraInventario {

    public double calcularSubtotal(ArticuloInventario articulo) {
        return articulo.getCantidadStock() * articulo.getPrecioUnitario();
    }

    public double calcularTotalConDescuento(double subtotal, double porcentajeDescuento) {
        double montoDescuento = subtotal * (porcentajeDescuento / 100.0);
        return subtotal - montoDescuento;
    }
}

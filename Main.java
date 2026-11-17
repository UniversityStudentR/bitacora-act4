public class Main {

    public static void main(String[] args) {

        ArticuloInventario lenovo = new ArticuloInventario("Lenovo", 32_500.0, 8);
        CalculadoraInventario calculadora = new CalculadoraInventario();
        ReporteInventario reporte = new ReporteInventario();

        double subtotal = calculadora.calcularSubtotal(lenovo);
        double totalFinal = calculadora.calcularTotalConDescuento(subtotal, 10.0);

        reporte.desplegarInformacion(lenovo, totalFinal);
    }
}

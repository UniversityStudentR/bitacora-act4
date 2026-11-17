public class ReporteInventario {

    public void desplegarInformacion(ArticuloInventario articulo, double totalValorizado) {
        System.out.println("Articulo: " + articulo.getNombre() + " | Stock: " + articulo.getCantidadStock());
        System.out.println("Total inventario valorizado: $" + totalValorizado);
    }
}

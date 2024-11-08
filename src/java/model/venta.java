package model;

public class venta {
    // Método para calcular el total de la venta
    public static double calcularTotal(producto producto) {
        return producto.getPrecio() * producto.getCantidad();
    }
}

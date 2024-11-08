package controller;

import model.producto;

public class ProductoController {
    // Método para crear un producto a partir de los datos de entrada
    public producto crearProducto(String nombre, double precio, int cantidad) {
        return new producto(nombre, precio, cantidad);
    }
}

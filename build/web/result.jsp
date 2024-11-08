<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.producto, model.venta, controller.ProductoController" %>
<!DOCTYPE html>
<html>
<head>
    <title>Resultado de la Venta</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
</head>
<body class="container">
    <h1 class="mt-5">Resultado de la Venta</h1>

    <%
        String nombre = request.getParameter("nombre");
        double precio = Double.parseDouble(request.getParameter("precio"));
        int cantidad = Integer.parseInt(request.getParameter("cantidad"));

        ProductoController controller = new ProductoController();
        producto producto = controller.crearProducto(nombre, precio, cantidad);
        double totalVenta = venta.calcularTotal(producto);
    %>

    <p><strong>Producto:</strong> <%= producto.getNombre() %></p>
    <p><strong>Precio unitario:</strong> $<%= producto.getPrecio() %></p>
    <p><strong>Cantidad:</strong> <%= producto.getCantidad() %></p>
    <p><strong>Total de la Venta:</strong> $<%= totalVenta %></p>

    <a href="index.jsp" class="btn btn-secondary mt-3">Nueva Venta</a>
</body>
</html>

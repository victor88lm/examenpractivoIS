<%-- 
    Document   : indexFM
    Created on : 8/11/2024, 10:34:41 AM
    Author     : victo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Flores SA de CV</title>
            <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
    </head>
<body class="container">
    <h1 class="mt-5">Registro de Venta</h1>
    <form action="result.jsp" method="post" class="form-group">
        <!-- Campo para el nombre del producto -->
        <label for="nombre">Nombre del Producto:</label>
        <input type="text" class="form-control" id="nombre" name="nombre" required>
        
        <!-- Campo para el precio del producto -->
        <label for="precio">Precio:</label>
        <input type="number" step="0.01" class="form-control" id="precio" name="precio" required>
        
        <!-- Campo para la cantidad -->
        <label for="cantidad">Cantidad:</label>
        <input type="number" class="form-control" id="cantidad" name="cantidad" required>
        
        <!-- Botón para enviar el formulario -->
        <button type="submit" class="btn btn-primary mt-3">Calcular Venta</button>
    </form>
</body>
</html>

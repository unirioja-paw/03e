<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Producto</title>
    </head>
    <body>
        <h1>Producto</h1>

        <img src="../../assets/images/electrosa/aspirador/aspirador00.jpg" alt=""/>
        
        <form action="./producto" method="post">
            <input type="hidden" name="productId" value="1028">
            <button type="submit">Añadir a la cesta</button>
        </form>

        <div style="margin: 40px;">
            <a href="./carrito">Cesta</a>
        </div>
    </body>
</html>

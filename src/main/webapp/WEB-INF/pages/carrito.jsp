<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cesta</title>
    </head>
    <body>
        <h1>Cesta de la compra</h1>
        <h2>${fn:length(sessionScope['compras_carro'].productos)} productos</h2>

        <c:forEach var="p" items="${sessionScope['compras_carro'].productos}">
            <div style="margin: 4px 0;">${p}</div>
        </c:forEach>

        <c:if test="${fn:length(sessionScope['compras_carro'].productos) eq 0}">
            No hay productos en la cesta
        </c:if>
        <c:if test="${fn:length(sessionScope['compras_carro'].productos) gt 0}">
            <div style="margin: 40px;">
                <a href="./pagar-y-salir">Pagar y salir</a>
            </div>
        </c:if>
    </body>
</html>

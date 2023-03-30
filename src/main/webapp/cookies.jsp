<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@page contentType="text/html" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cookies</title>
    </head>
    <body>
        <h1>Lista de todas las cookies recibidas (Scriptlet)</h1>
        <%
            Cookie[] cookies = request.getCookies();
            for (Cookie ck : cookies) {
        %>
        <dl>
            <dt>Cookie <%= ck.getName()%></dt> <dd><%= ck.getValue()%></dd>
        </dl>
        <%
            }
        %>
        
        <h1>Lista de todas las cookies recibidas (EL y JSTL)</h1>
        <dl>
            <c:forEach var="c" items="${cookie}">
                <dt>Cookie ${c.key}</dt> <dd>${c.value.value}</dd>
            </c:forEach>
        </dl>



    </body>
</html>

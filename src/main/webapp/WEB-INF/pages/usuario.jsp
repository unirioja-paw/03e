<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Zona de usuarios</title>
        <%@ include file='/WEB-INF/pages/include/_head-style.jsp'%>

    </head>
    <body>
        <div style="padding: 4px; background-color: #279B48; color: white; text-align: right;">
            <b>${sessionScope.usuario.login}</b>
            /
            <a href="#">Salir</a>
        </div>
            
            
        <h1>Zona de usuarios</h1>
        <div>
            <h2>Hola ${sessionScope.usuario.displayName}</h2>

        </div>

    </body>
</html>

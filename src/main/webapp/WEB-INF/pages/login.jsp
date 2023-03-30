<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
        <%@ include file='/WEB-INF/pages/include/_head-style.jsp'%>

    </head>
    <body>
        <h1>Paso 2</h1>
        <div>
            <h1>Login de usuario</h1>
            <form method="post" action="login">
                <div>
                    <label>Usuario:</label>
                    <input type="text" name="username">
                </div>
                <div>
                    <label>Contraseña:</label>
                    <input type="text" name="password">
                </div>
                <div>
                    <button type="submit">Aceptar</button>
                </div>
            </form>
        </div>

    </body>
</html>

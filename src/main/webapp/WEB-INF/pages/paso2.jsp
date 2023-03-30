<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Paso 2</title>
        <%@ include file='/WEB-INF/pages/include/_head-style.jsp'%>

    </head>
    <body>
        <h1>Paso 2</h1>
        <div>
            Hobby: ${hobby}
            <br>
            (is null? ${empty hobby})
        </div>

    </body>
</html>

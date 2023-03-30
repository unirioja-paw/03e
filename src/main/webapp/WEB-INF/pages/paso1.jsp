<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Paso 1</title>
        <%@ include file='/WEB-INF/pages/include/_head-style.jsp'%>

    </head>
    <body>
        <h1>Paso 1</h1>
        <div>
            Hobby: ${hobby}
        </div>
        <div>
            <a href="./paso2">Siguiente paso</a>
        </div>
    </body>
</html>

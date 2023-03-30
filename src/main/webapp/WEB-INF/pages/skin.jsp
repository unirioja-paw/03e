<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Skin</title>
        <%@ include file='/WEB-INF/pages/include/_head-style.jsp'%>

    </head>
    <body>
        <h1>Ejemplo skin en cookie</h1>
        <div class="box">
            Hola mundo
        </div>
        <div class="box">
            SKin: ${cookie['skin'].value}
        </div>
    </body>
</html>

<%-- 
   Alternativa a las cookies: reescribir las URL
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Reescritura URL</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <a href='<%= response.encodeURL("hola.jsp")%>' >Un enlace</a>
        <br>

        <a href='<%= response.encodeURL(request.getContextPath() + "/pub/adios.jsp")%>' >Otro enlace</a>

    </body>
</html>

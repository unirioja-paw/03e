package es.unirioja.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "PruebaCookie", urlPatterns = {"/pruebaCookie"})
public class PruebaCookie extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");

//        Cookie ck = new Cookie("miCookie", "una prueba");
        Cookie ck = new Cookie("miCookie", URLEncoder.encode("una prueba", Charset.forName("UTF-8")));
        // Será devuelta a cualquier página del contexto
        ck.setPath(req.getContextPath());
        // Durante 1 hora
        ck.setMaxAge(60 * 60);
        resp.addCookie(ck);

        PrintWriter out = resp.getWriter();
        out.println("<html><head><title>PruebaCookie</title></head>");
        out.println("<body><h1>Prueba " + req.getContextPath() + "</h1></body>");
        out.println("</html>");
    }

}

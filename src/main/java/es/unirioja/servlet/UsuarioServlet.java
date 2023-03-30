package es.unirioja.servlet;

import es.unirioja.session.Usuario;
import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "UsuarioServlet", urlPatterns = {"/usuario"})
public class UsuarioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // Si no se ha creado la sesión, no debo crearla (create = false)
        HttpSession sesion = request.getSession(false);
        if (sesion == null) {
            response.sendRedirect("login");
            return;
        }
        Usuario usr = (Usuario) sesion.getAttribute("usuario");
        if (usr == null) {
            response.sendRedirect("login");
            return;
        }
        // alguna accion con el usuario

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/usuario.jsp");
        rd.forward(request, response);
    }

}

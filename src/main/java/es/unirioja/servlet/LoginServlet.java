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

@WebServlet(name = "LoginServlet", urlPatterns = {"/login"})
public class LoginServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/login.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        Usuario usuario = new Usuario();
        usuario.setLogin("alove");
        usuario.setDisplayName("Ada Lovelace");
        session.setAttribute("usuario", usuario);
        System.out.println("Usuario en sesion:"
                + ((Usuario) session.getAttribute("usuario")).getLogin()
        );

        response.sendRedirect("usuario");
    }

}

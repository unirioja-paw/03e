package es.unirioja.servlet;

import es.unirioja.session.CarroCompra;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "PagarSalirServlet", urlPatterns = {"/pagar-y-salir"})
public class PagarSalirServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("GET " + request.getRequestURI());
        HttpSession session = request.getSession();
        CarroCompra carro = (CarroCompra) session.getAttribute("compras_carro");
        if (carro == null) {
            System.out.println("No hay nada que pagar ... ");
        } else {
            System.out.println("Pagar e invalidar sesion");
//            Logica.pagar(carro);
            session.invalidate();
        }
    }

}

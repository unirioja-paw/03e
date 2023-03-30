package es.unirioja.servlet;

import es.unirioja.session.CarroCompra;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "ComprarServlet", urlPatterns = {"/comprar"})
public class ComprarServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession sesion = req.getSession(); // o getSession(true);
        CarroCompra carro = (CarroCompra) sesion.getAttribute("compras_carro");
        if (carro == null) {// aún no se ha creado el carro
            carro = new CarroCompra();
            sesion.setAttribute("compras_carro", carro);
        }
        String idArt = req.getParameter("idA");
        carro.addArticulo(idArt);

    }

}

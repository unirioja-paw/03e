package es.unirioja.servlet;

import com.github.javafaker.Faker;
import es.unirioja.session.CarroCompra;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet(name = "FichaProductoServlet", urlPatterns = {"/producto"})
public class FichaProductoServlet extends HttpServlet {

    private Faker faker = new Faker(new Locale("es"));

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/fichaProducto.jsp");
        rd.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();

        CarroCompra carro = (CarroCompra) session.getAttribute("compras_carro");
        if (carro == null) {
            System.out.println("CarroCompra todavia era null");
            carro = new CarroCompra();
        }
        carro.addArticulo(
                faker.commerce().productName()
        );

        session.setAttribute("compras_carro", carro);
        RequestDispatcher rd = request.getRequestDispatcher("/WEB-INF/pages/fichaProducto.jsp");
        rd.forward(request, response);
    }

}

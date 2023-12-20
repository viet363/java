package Servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.Product;
import Model.ProductDao;

@WebServlet("/GarenaServlet")
public class GarenaServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductDao productDao = new ProductDao();
        List<Product> productList1 = null;
        try {
            productList1 = productDao.getGarenaProducts();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        request.setAttribute("GarenaServlet", productList1);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Garena.jsp");
        dispatcher.forward(request, response);
    }

}

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

@WebServlet("/GateServlet")
public class GateServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductDao productDao = new ProductDao();
        List<Product> productList1 = null;
        try {
            productList1 = productDao.getGateProducts();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        request.setAttribute("GateServlet", productList1);
        RequestDispatcher dispatcher = request.getRequestDispatcher("Gate.jsp");
        dispatcher.forward(request, response);
    }

}

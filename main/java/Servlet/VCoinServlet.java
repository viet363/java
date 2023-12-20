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

@WebServlet("/VCoinServlet")
public class VCoinServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductDao productDao = new ProductDao();
        List<Product> productList1 = null;
        try {
            productList1 = productDao.getVCoinProducts();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        request.setAttribute("VCoinServlet", productList1);
        RequestDispatcher dispatcher = request.getRequestDispatcher("VCoin.jsp");
        dispatcher.forward(request, response);
    }

}

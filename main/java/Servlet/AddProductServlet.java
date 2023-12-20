package Servlet;

import Model.Product;
import Model.ProductDao;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddProductServlet")
public class AddProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String productId = request.getParameter("productId");
        String productName = request.getParameter("productName");
        String productType = request.getParameter("productType");
        int productPrice = 0;  

        String priceParam = request.getParameter("productPrice");
        if (priceParam != null && !priceParam.isEmpty()) {
            try {
                productPrice = Integer.parseInt(priceParam);
            } catch (NumberFormatException e) {
                e.printStackTrace();  
            }
        }

        Product product = new Product();
        product.setId(productId);
        product.setName(productName);
        product.setType(productType);
        product.setPrice(productPrice);

        ProductDao productDao = new ProductDao();

        try {
            productDao.addProduct(product);
            response.sendRedirect("add-product.jsp");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect("login.jsp"); 
        }
    }
}

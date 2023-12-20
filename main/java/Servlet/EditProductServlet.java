package Servlet;
import Model.Product;
import Model.ProductDao;
import Model.User;
import Model.UserDao;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/EditProductServlet")
public class EditProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	ProductDao list= new ProductDao();
        List<Product> productList = null;
		try {
			productList = ProductDao.getAllProducts();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
        request.setAttribute("productList", productList);
        RequestDispatcher dispatcher = request.getRequestDispatcher("product-list.jsp");
        dispatcher.forward(request, response);
    }
    private List<Product> getList() {
        try {
            return ProductDao.getAllProducts();
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");
        String idParameter = request.getParameter("id");

        if (idParameter != null && !idParameter.isEmpty()) {
            int productId = Integer.parseInt(idParameter);

            ProductDao productDao = new ProductDao();

            if ("edit".equals(action)) {
                Product product = null;
                try {
                    product = productDao.getProductById(productId);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                request.setAttribute("product", product);
                request.getRequestDispatcher("edit-product.jsp").forward(request, response);
            } else if ("delete".equals(action)) {
                try {
                    productDao.deleteProduct(productId);
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                response.sendRedirect("EditProductServlet?action=list");
            } else if ("list".equals(action)) {
                List<Product> productList = null;
                try {
                    productList = productDao.getAllProducts();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                request.setAttribute("productList", productList);
                request.getRequestDispatcher("product-list.jsp").forward(request, response);
            }
        } else {
            // Xử lý trường hợp idParameter là null hoặc chuỗi trống
            response.getWriter().println("Invalid or missing product ID");
        }
    }
}

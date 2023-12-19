package Servlet;

import Model.Product;
import Model.ProductDAO;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ProductServlet")
public class ProductServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doGet(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String action = request.getParameter("action");

        if (action == null) {
            action = "list"; // Default action
        }

        switch (action) {
            case "add":
                addProduct(request, response);
                break;
            case "delete":
                deleteProduct(request, response);
                break;
            case "edit":
                editProduct(request, response);
                break;
            case "search":
                searchProducts(request, response);
                break;
            default:
                listProducts(request, response);
                break;
        }
    }

    private void listProducts(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ProductDAO productDAO = new ProductDAO();
        List<Product> productList = productDAO.getAllProducts();
        request.setAttribute("productList", productList);

        // Forward to product list JSP page
        request.getRequestDispatcher("/product-list.jsp").forward(request, response);
    }

    private void addProduct(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve data from the form
        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String type = request.getParameter("type");
        int price = Integer.parseInt(request.getParameter("price"));

        // Create a new Product object
        Product product = new Product(id,name, type, price);

        // Add the product to the database
        ProductDAO productDAO = new ProductDAO();
        productDAO.addProduct(product);

        // Redirect to the product list page
        response.sendRedirect("ProductServlet");
    }

    private void deleteProduct(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve product Type from the request
        int productType = Integer.parseInt(request.getParameter("type"));

        // Delete the product from the database
        ProductDAO productDAO = new ProductDAO();
        productDAO.deleteProduct(productType);

        // Redirect to the product list page
        response.sendRedirect("ProductServlet");
    }

    private void editProduct(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve product Type from the request
        int productId = Integer.parseInt(request.getParameter("id"));

        // Get the product from the database
        ProductDAO productDAO = new ProductDAO();
        Product product = productDAO.getProductById(productId);

        // Set the product in the request attributes
        request.setAttribute("product", product);

        // Forward to the product edit JSP page
        request.getRequestDispatcher("/edit.jsp").forward(request, response);
    }

    private void searchProducts(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Retrieve search keyword from the request
        String searchKeyword = request.getParameter("searchKeyword");

        // Search for products in the database
        ProductDAO productDAO = new ProductDAO();
        List<Product> searchResults = productDAO.searchProducts(searchKeyword);

        // Set the search results in the request attributes
        request.setAttribute("searchResults", searchResults);

        // Forward to the search results JSP page
        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }
}

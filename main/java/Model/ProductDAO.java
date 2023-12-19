package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {
    private String jdbcUrl = "jdbc:mysql://localhost:3306/web";
    private String username = "root";
    private String password = " "; 

    private Connection connect() throws SQLException {
        return DriverManager.getConnection(jdbcUrl, username, password);
    }

    public void addProduct(Product product) {
        String sql = "INSERT INTO products (name, type, price) VALUES (?, ?, ?)";

        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, product.getName());
            statement.setString(2, product.getType());
            statement.setInt(3, product.getPrice());

            statement.executeUpdate();
        } catch (SQLException e) {
            handleSQLException(e);
        }
    }

    public void deleteProduct(int productType) {
        String sql = "DELETE FROM products WHERE type = ?";

        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, productType);

            statement.executeUpdate();
        } catch (SQLException e) {
            handleSQLException(e);
        }
    }

    public void updateProduct(Product product) {
        String sql = "UPDATE products SET name = ?, type = ?, price = ? WHERE id = ?";

        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, product.getName());
            statement.setString(2, product.getType());
            statement.setInt(3, product.getPrice());
            statement.setInt(4, product.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            handleSQLException(e);
        }
    }

    public List<Product> getProductsByType(int productType) {
        String sql = "SELECT * FROM products WHERE type = ?";
        List<Product> products = new ArrayList<>();

        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, productType);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    products.add(new Product(
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getString("type"),
                            resultSet.getInt("price")
                    ));
                }
            }
        } catch (SQLException e) {
            handleSQLException(e);
        }

        return products;
    }

    public Product getProductByName(String productName) {
        String sql = "SELECT * FROM products WHERE name = ?";
        Product product = null;

        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, productName);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    product = new Product(
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getString("type"),
                            resultSet.getInt("price")
                    );
                }
            }
        } catch (SQLException e) {
            handleSQLException(e);
        }

        return product;
    }

    public Product getProductById(int productID) {
        String sql = "SELECT * FROM products WHERE id = ?";
        Product product = null;

        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, productID);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    product = new Product(
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getString("type"),
                            resultSet.getInt("price")
                    );
                }
            }
        } catch (SQLException e) {
            handleSQLException(e);
        }

        return product;
    } 
    
    public List<Product> getAllProducts() {
        String sql = "SELECT * FROM products";
        List<Product> products = new ArrayList<>();

        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                products.add(new Product(
                        resultSet.getInt("id"),
                        resultSet.getString("name"),
                        resultSet.getString("type"),
                        resultSet.getInt("price")
                ));
            }
        } catch (SQLException e) {
            handleSQLException(e);
        }

        return products;
    }

    public List<Product> searchProducts(String searchKeyword) {
        String sql = "SELECT * FROM products WHERE name LIKE ? OR type LIKE ?";
        List<Product> searchResults = new ArrayList<>();

        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(sql)) {

            // Set parameters for the prepared statement
            statement.setString(1, "%" + searchKeyword + "%"); // Search by name
            statement.setString(2, "%" + searchKeyword + "%"); // Search by type

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    searchResults.add(new Product(
                            resultSet.getInt("id"),
                            resultSet.getString("name"),
                            resultSet.getString("type"),
                            resultSet.getInt("price")
                    ));
                }
            }
        } catch (SQLException e) {
            handleSQLException(e);
        }

        return searchResults;
    }


    private void handleSQLException(SQLException e) {
        // Handle or log the exception appropriately
        e.printStackTrace();
    }
}

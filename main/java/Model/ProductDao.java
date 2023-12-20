package Model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class ProductDao{
	 private static final String URL = "jdbc:mysql://localhost:3306/web";
	    private static final String USERNAME = "root";
	    private static final String PASSWORD = " "; 

	    private static final String ADMIN_TYPE = "Admin";

	    public static Connection connect() throws SQLException, ClassNotFoundException {
	        try {
	        	Class.forName("com.mysql.cj.jdbc.Driver");

	            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
	        } catch (SQLException e) {
	            handleSQLException(e);
	            throw e;
	        }
	    }

	    public void addProduct(Product product) throws ClassNotFoundException {
	        String sql = "INSERT INTO products (id, name, type, price) VALUES (?, ?, ?, ?)";

	        try (Connection connection = connect();
	             PreparedStatement statement = connection.prepareStatement(sql)) {
	            if (product.getId() != null) {
	                statement.setString(1, product.getId());
	            } else {
	                statement.setString(1, UUID.randomUUID().toString());
	            }

	            statement.setString(2, product.getName());
	            statement.setString(3, product.getType());
	            statement.setInt(4, product.getPrice());

	            statement.executeUpdate();
	        } catch (SQLException e) {
	            handleSQLException(e);
	        }
	    }


    public void deleteProduct(int productType) throws ClassNotFoundException {
        String sql = "DELETE FROM products WHERE type = ?";

        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, productType);

            statement.executeUpdate();
        } catch (SQLException e) {
            handleSQLException(e);
        }
    }

    public void updateProduct(Product product) throws ClassNotFoundException {
        String sql = "UPDATE products SET name = ?, type = ?, price = ? WHERE id = ?";

        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, product.getName());
            statement.setString(2, product.getType());
            statement.setInt(3, product.getPrice());
            statement.setString(4, product.getId());

            statement.executeUpdate();
        } catch (SQLException e) {
            handleSQLException(e);
        }
    }

    public List<Product> getProductsByType(int productType) throws ClassNotFoundException {
        String sql = "SELECT * FROM products WHERE type = ?";
        List<Product> products = new ArrayList<>();

        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setInt(1, productType);

            try (ResultSet resultSet = statement.executeQuery()) {
                while (resultSet.next()) {
                    products.add(new Product(
                            resultSet.getString("id"),
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

    public Product getProductByName(String productName) throws ClassNotFoundException {
        String sql = "SELECT * FROM products WHERE name = ?";
        Product product = null;

        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setString(1, productName);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    product = new Product(
                            resultSet.getString("id"),
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

    public Product getProductById(int productID) throws ClassNotFoundException {
        String sql = "SELECT * FROM products WHERE id = ?";
        Product product = null;

        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(sql)) {
            statement.setLong(1, productID);

            try (ResultSet resultSet = statement.executeQuery()) {
                if (resultSet.next()) {
                    product = new Product(
                            resultSet.getString("id"),
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
    
    public static List<Product> getAllProducts() throws ClassNotFoundException {
        String sql = "SELECT * FROM products";
        List<Product> products = new ArrayList<>();

        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                products.add(new Product(
                        resultSet.getString("id"),
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

    public static List<Product> getZingProducts() throws ClassNotFoundException {
        String sql = "SELECT * FROM products where type = 'Zing' ";
        List<Product> products = new ArrayList<>();

        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                products.add(new Product(
                        resultSet.getString("id"),
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
    
    public static List<Product> getGarenaProducts() throws ClassNotFoundException {
        String sql = "SELECT * FROM products where type = 'Garena' ";
        List<Product> products = new ArrayList<>();

        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                products.add(new Product(
                        resultSet.getString("id"),
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
    
    public static List<Product> getVCoinProducts() throws ClassNotFoundException {
        String sql = "SELECT * FROM products where type = 'VCoin' ";
        List<Product> products = new ArrayList<>();

        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                products.add(new Product(
                        resultSet.getString("id"),
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
    
    public static List<Product> getGateProducts() throws ClassNotFoundException {
        String sql = "SELECT * FROM products where type = 'Gate' ";
        List<Product> products = new ArrayList<>();

        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                products.add(new Product(
                        resultSet.getString("id"),
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
    
    public static List<Product> getVGPlayProducts() throws ClassNotFoundException {
        String sql = "SELECT * FROM products where type = 'VGPlay' ";
        List<Product> products = new ArrayList<>();

        try (Connection connection = connect();
             PreparedStatement statement = connection.prepareStatement(sql);
             ResultSet resultSet = statement.executeQuery()) {

            while (resultSet.next()) {
                products.add(new Product(
                        resultSet.getString("id"),
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
    
    public List<Product> searchProducts(String searchKeyword) throws ClassNotFoundException {
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
                            resultSet.getString("id"),
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


    private static void handleSQLException(SQLException e) {
        e.printStackTrace();
    }
}
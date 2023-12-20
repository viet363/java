package Model;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    private static final String URL = "jdbc:mysql://localhost:3306/web";
    private static final String USERNAME = "root";
    private static final String PASSWORD = " "; 

    private static final String ADMIN_TYPE = "Admin";

    public static Connection connect() throws SQLException, ClassNotFoundException {
        try {
        	Class.forName("com.mysql.cj.jdbc.Driver");

            return DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            handleSQLException("Không thể kết nối đến cơ sở dữ liệu.", e);
            throw e;
        }
    }

    public static void addUser(User user) throws ClassNotFoundException {
        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "INSERT INTO user (username, password, email, type, SDT) VALUES (?, ?, ?, ?, ?)")) {

            preparedStatement.setString(1, user.getUsername());
            preparedStatement.setString(2, user.getPassword());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setString(4, user.getType());
            preparedStatement.setInt(5, user.getsdt());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Người dùng đã được thêm thành công!");
            } else {
                System.out.println("Không thành công khi thêm người dùng.");
            }

        } catch (SQLException e) {
            handleSQLException("Lỗi khi thêm người dùng.", e);
        }
    }

    public static void updateUser(User user) throws ClassNotFoundException {
        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "UPDATE user SET password=?, email=?, type=?, SDT=? WHERE username=?")) {

            preparedStatement.setString(1, user.getPassword());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getType());
            preparedStatement.setInt(4, user.getsdt());
            preparedStatement.setString(5, user.getUsername());

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Người dùng đã được cập nhật thành công!");
            } else {
                System.out.println("Không thành công khi cập nhật người dùng.");
            }

        } catch (SQLException e) {
            handleSQLException("Lỗi khi cập nhật người dùng.", e);
        }
    }

    public static void deleteUser(String username) throws ClassNotFoundException {
        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM user WHERE username=?")) {

            preparedStatement.setString(1, username);

            int rowsAffected = preparedStatement.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Người dùng đã được xóa thành công!");
            } else {
                System.out.println("Không thành công khi xóa người dùng. Người dùng có thể không tồn tại.");
            }

        } catch (SQLException e) {
            handleSQLException("Lỗi khi xóa người dùng.", e);
        }
    }

    public static boolean authenticateUser(String username, String password) throws ClassNotFoundException {
        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT * FROM user WHERE username=? AND password=?")) {

            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next();
            }

        } catch (SQLException e) {
            handleSQLException("Lỗi khi thực hiện xác thực người dùng.", e);
            return false;
        }
    }

    public static String getUserType(String username) throws ClassNotFoundException {
        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT type FROM user WHERE username=?")) {

            preparedStatement.setString(1, username);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                if (resultSet.next()) {
                    return resultSet.getString("type");
                }
            }

        } catch (SQLException e) {
            handleSQLException("Lỗi khi lấy loại người dùng.", e);
        }

        return null;
    }

    public static boolean isEmailRegistered(String email) throws ClassNotFoundException {
        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT * FROM user WHERE email=?")) {

            preparedStatement.setString(1, email);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next();
            }

        } catch (SQLException e) {
            handleSQLException("Lỗi khi kiểm tra email đã đăng ký.", e);
            return false;
        }
    }

    public static boolean isUsernameTaken(String username) throws ClassNotFoundException {
        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement(
                     "SELECT * FROM user WHERE username=?")) {

            preparedStatement.setString(1, username);

            try (ResultSet resultSet = preparedStatement.executeQuery()) {
                return resultSet.next();
            }

        } catch (SQLException e) {
            handleSQLException("Lỗi khi kiểm tra username đã được sử dụng.", e);
            return false;
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        String usernameToAuthenticate = "adminUser";
        String passwordToAuthenticate = "adminPassword";

        User user1 = new User("a", "1", "lequocviet362003@gmail.com", "admin", 123456789);
        addUser(user1);

        if (authenticateUser(usernameToAuthenticate, passwordToAuthenticate)) {
            String userType = getUserType(usernameToAuthenticate);

            if (ADMIN_TYPE.equalsIgnoreCase(userType)) {
                System.out.println("Chuyển hướng đến trang quản trị...");
            } else {
                System.out.println("Bạn không đủ quyền truy cập!");
            }
        } else {
            System.out.println("Đăng nhập không thành công.");
        }
    }

    public static List<User> getAllUsers() throws ClassNotFoundException {
        List<User> userList = new ArrayList<>();

        try (Connection connection = connect();
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM user");
             ResultSet resultSet = preparedStatement.executeQuery()) {

            while (resultSet.next()) {
                String username = resultSet.getString("username");
                String password = resultSet.getString("password");
                String email = resultSet.getString("email");
                String type = resultSet.getString("type");
                int sdt = resultSet.getInt("sdt");

                User user = new User(username, password, email, type, sdt);
                userList.add(user);
            }

        } catch (SQLException e) {
            handleSQLException("Lỗi khi lấy danh sách người dùng.", e);
        }

        return userList;
    }

    private static void handleSQLException(String message, SQLException e) {
        System.err.println(message);
        e.printStackTrace();
    }
}
package Servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.User;
import Model.UserDao;

@WebServlet("/RegistServlet")
public class RegistServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        try {
        	
            Class.forName("com.mysql.cj.jdbc.Driver");
            String username = request.getParameter("username");
            String phoneNumber = request.getParameter("phoneNumber");
            String email = request.getParameter("email");
            String password = request.getParameter("password");
            String confirmPassword = request.getParameter("confirmPassword");

            if (UserDao.isUsernameTaken(username)) {
                out.println("Tên người dùng đã tồn tại. Vui lòng chọn tên người dùng khác.");
                return;
            }

            if (UserDao.isEmailRegistered(email)) {
                out.println("Email đã được đăng ký. Vui lòng sử dụng một email khác.");
                return;
            }

            User newUser = new User(username, password, email, "user", Integer.parseInt(phoneNumber));

            UserDao.addUser(newUser);

            response.sendRedirect("login.jsp");
        } catch (Exception e) {
            out.println("Đã xảy ra lỗi: " + e.getMessage());
        } finally {
            out.close();
        }
    }
}
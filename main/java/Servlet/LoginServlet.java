package Servlet;

import Model.UserDao;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        boolean isAuthenticated = false;
		try {
			isAuthenticated = UserDao.authenticateUser(username, password);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		if (isAuthenticated) {
		    String userType = null;
			try {
				userType = UserDao.getUserType(username);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		    if ("admin".equals(userType)) {
		        response.sendRedirect("indexAdmin.jsp");
		    } else {
		        response.sendRedirect("indexUser.jsp");
		    }
		} else {
		    request.setAttribute("error", "Đăng nhập thất bại. Username hoặc Password của bạn có thể bị sai. Vui lòng kiểm tra lại.");
		    request.getRequestDispatcher("login.jsp").forward(request, response);
		}
    }
}

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="utf-8">
    <title>Danh sách User</title>
    <link href="img/favicon.ico" rel="icon">
    <link href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css" rel="stylesheet">
    <link href="css/style.css" rel="stylesheet">
</head>

<body>
    <!-- Phần Header của trang -->
    <div class="container-fluid">
        <div class="row bg-secondary py-2 px-xl-5">
            <div class="col-lg-6 d-none d-lg-block">
                <div class="d-inline-flex align-items-center">
                    <a class="text-dark" href="">FAQs</a> <span class="text-muted px-2">|</span>
                    <a class="text-dark" href="">Help</a> <span class="text-muted px-2">|</span>
                    <a class="text-dark" href="">Support</a>
                </div>
            </div>
            <div class="col-lg-6 text-center text-lg-right">
                <div class="d-inline-flex align-items-center">
                    <a class="text-dark px-2" href="https://www.facebook.com/viet.lequoc.7543/">
                        <i class="fab fa-facebook-f"></i>
                    </a> <a class="text-dark px-2" href="https://twitter.com/T1LoL"> <i class="fab fa-twitter"></i>
                    </a> <a class="text-dark px-2" href="https://www.facebook.com/viet.lequoc.7543/"> <i
                            class="fab fa-linkedin-in"></i>
                    </a> <a class="text-dark px-2" href="https://www.instagram.com/cristiano/"> <i
                            class="fab fa-instagram"></i>
                    </a> <a class="text-dark pl-2" href="https://www.youtube.com/@MixiGaming89"> <i
                            class="fab fa-youtube"></i>
                    </a>
                </div>
            </div>
        </div>
        <div class="row align-items-center py-3 px-xl-5">
            <div class="col-lg-3 d-none d-lg-block">
                <a href="" class="text-decoration-none">
                    <h1 class="m-0 display-5 font-weight-semi-bold">
                        <span class="text-primary font-weight-bold border px-3 mr-1">V</span>NapNgay
                    </h1>
                </a>
            </div>
            <div class="col-lg-6 col-6 text-left">
                <form action="ProductServlet" method="get">
                    <div class="input-group">
                        <input type="text" class="form-control" name="searchKeyword"
                            placeholder="Tìm kiếm sản phẩm ở đây">
                        <div class="input-group-append">
                            <button class="btn btn-primary" type="submit">
                                <i class="fa fa-search"></i>
                            </button>
                        </div>
                    </div>
                    <input type="hidden" name="action" value="search">
                </form>
            </div>
            <div class="col-lg-3 col-6 text-right">
                <a href="" class="btn border"> <i class="fas fa-heart text-primary"></i> <span class="badge">0</span>
                </a> <a href="" class="btn border"> <i class="fas fa-shopping-cart text-primary"></i> <span
                        class="badge">0</span>
                </a>
            </div>
        </div>
    </div>

    <!-- Phần chính của trang -->
    <div class="container-fluid mb-5">
        <div class="row border-top px-xl-5">
            <div class="col-lg-9">
                <!-- Navbar -->
                <nav class="navbar navbar-expand-lg bg-light navbar-light py-3 py-lg-0 px-0">
                    <a href="indexAdmin.jsp" class="text-decoration-none d-block d-lg-none">
                        <h1 class="m-0 display-5 font-weight-semi-bold">
                            <span class="text-primary font-weight-bold border px-3 mr-1">V</span>Napngay
                        </h1>
                    </a>
                    <button type="button" class="navbar-toggler" data-toggle="collapse" data-target="#navbarCollapse">
                        <span class="navbar-toggler-icon"></span>
                    </button>
                    <div class="collapse navbar-collapse justify-content-between" id="navbarCollapse">
                        <div class="navbar-nav mr-auto py-0">
                            <a href="indexAdmin.jsp" class="nav-item nav-link active">Trang chủ</a>
                            <a href="product-list.jsp" class="nav-item nav-link">Quản lý sản phẩm</a>
                            <a href="user-list.jsp" class="nav-item nav-link">Quản lý user </a>
                        </div>
                        <div class="navbar-nav ml-auto py-0">
                            <a href="login.jsp" class="nav-item nav-link">Đăng xuất</a>
                        </div>
                    </div>
                </nav>
                <div class="mt-4">
                    <h2>Danh sách người dùng</h2>
                    <table class="table">
                        <thead>
                            <tr>
                                <th scope="col">UserName</th>
                                <th scope="col">Password</th>
                                <th scope="col">Email</th>
                                <th scope="col">Type</th>
                                <th scope="col">Số điện thoại</th>
                            </tr>
                        </thead>
                        <tbody>
                            <!-- Iterate through the list of users -->
                            <c:forEach var="user" items="${userList}">
                                <tr>
                                    <td>${user.username}</td>
                                    <td>${user.password}</td>
                                    <td>${user.email}</td>
                                    <td>${user.type}</td>
                                    <td>${user.sdt}</td>
                                    <td>
                                        <form action="user-list" method="post">
                                            <input type="hidden" name="action" value="delete">
                                            <input type="hidden" name="username" value="${user.username}">
                                            <button type="submit" class="btn btn-danger btn-sm">Xóa</button>
                                        </form>
                                        <button type="button" class="btn btn-primary btn-sm" data-toggle="modal"
                                            data-target="#updateModal${user.username}">
                                            Cập nhật
                                        </button>
                                    </td>
                                </tr>
                                <!-- Update user modal -->
                                <div class="modal fade" id="updateModal${user.username}" tabindex="-1" role="dialog"
                                    aria-labelledby="updateModalLabel${user.username}" aria-hidden="true">
                                    <div class="modal-dialog" role="document">
                                        <div class="modal-content">
                                            <div class="modal-header">
                                                <h5 class="modal-title" id="updateModalLabel${user.username}">Cập nhật thông tin người dùng</h5>
                                                <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                                                    <span aria-hidden="true">&times;</span>
                                                </button>
                                            </div>
                                            <div class="modal-body">
                                                <!-- Update user form -->
                                                <form action="user-list" method="post">
                                                    <input type="hidden" name="action" value="update">
                                                    <input type="hidden" name="username" value="${user.username}">
                                                    <!-- Add input fields for updating user information -->
                                                    <div class="form-group">
                                                        <label for="newPassword">Mật khẩu mới:</label>
                                                        <input type="password" class="form-control" id="newPassword" name="newPassword" required>
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="newEmail">Email mới:</label>
                                                        <input type="email" class="form-control" id="newEmail" name="newEmail" required>
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="newType">Loại người dùng mới:</label>
                                                        <input type="text" class="form-control" id="newType" name="newType" required>
                                                    </div>
                                                    <div class="form-group">
                                                        <label for="newSDT">Số điện thoại mới:</label>
                                                        <input type="text" class="form-control" id="newSDT" name="newSDT" required>
                                                    </div>
                                                    <button type="submit" class="btn btn-primary">Cập nhật</button>
                                                </form>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                        </tbody>
                    </table>
                </div>
            </div>
        </div>
    </div>
</body>
</html>


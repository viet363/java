<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="utf-8">
<title>Mua thẻ game online</title>
<link href="img/favicon.ico" rel="icon">
<link
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.10.0/css/all.min.css"
	rel="stylesheet">
<link href="css/style.css" rel="stylesheet">
</head>

<body>
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
					<a class="text-dark px-2"
						href="https://www.facebook.com/viet.lequoc.7543/"> <i
						class="fab fa-facebook-f"></i>
					</a> <a class="text-dark px-2" href="https://twitter.com/T1LoL"> <i
						class="fab fa-twitter"></i>
					</a> <a class="text-dark px-2"
						href="https://www.facebook.com/viet.lequoc.7543/"> <i
						class="fab fa-linkedin-in"></i>
					</a> <a class="text-dark px-2"
						href="https://www.instagram.com/cristiano/"> <i
						class="fab fa-instagram"></i>
					</a> <a class="text-dark pl-2"
						href="https://www.youtube.com/@MixiGaming89"> <i
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
				<a href="" class="btn border"> <i
					class="fas fa-heart text-primary"></i> <span class="badge">0</span>
				</a> <a href="" class="btn border"> <i
					class="fas fa-shopping-cart text-primary"></i> <span class="badge">0</span>
				</a>
			</div>
		</div>
	</div>
	<div class="container-fluid mb-5">
		<div class="row border-top px-xl-5">	
			<div class="col-lg-9">
				<nav
					class="navbar navbar-expand-lg bg-light navbar-light py-3 py-lg-0 px-0">
					<a href="" class="text-decoration-none d-block d-lg-none">
						<h1 class="m-0 display-5 font-weight-semi-bold">
							<span class="text-primary font-weight-bold border px-3 mr-1">V</span>Napngay
						</h1>
					</a>
					<button type="button" class="navbar-toggler" data-toggle="collapse"
						data-target="#navbarCollapse">
						<span class="navbar-toggler-icon"></span>
					</button>
					<div class="collapse navbar-collapse justify-content-between"
						id="navbarCollapse">
						<div class="navbar-nav mr-auto py-0">
							<a href="indexAdmin.jsp" class="nav-item nav-link active">Trang chủ</a> 
							<a href="product-list" class="nav-item nav-link">Quản lý sản phẩm</a>
							<a href="user-list" class="nav-item nav-link">Quản lý user </a>
						</div>
						<div class="navbar-nav ml-auto py-0">
							<a href="login.jsp" class="nav-item nav-link">Đăng xuất</a>
						</div>
					</div>
				</nav>
            
            <div class="col-lg-9 col-12">
                <!-- Product List Section -->
                <h2 class="mb-4">Product List</h2>
                <table class="table table-striped">
                    <thead>
                        <tr>
                            <th>ID</th>
                            <th>Name</th>
                            <th>Type</th>
                            <th>Price</th>
                            <th>Action</th>
                        </tr>
                    </thead>
                    <tbody>
                        <c:forEach var="product" items="${products}">
                            <tr>
                                <td>${product.id}</td>
                                <td>${product.name}</td>
                                <td>${product.type}</td>
                                <td>${product.price}</td>
                                <td>
                                    <a href="edit-product.jsp" class="btn btn-primary btn-sm">Sửa</a>
                                    <a href="ProductServlet?action=delete&id=${product.id}" class="btn btn-danger btn-sm">Xóa</a>
                                </td>
                            </tr>
                        </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</body>

</html>

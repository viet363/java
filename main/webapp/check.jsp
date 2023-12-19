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
	<!-- Topbar Start -->
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
					<a class="text-dark px-2" href=""> <i class="fab fa-facebook-f"></i>
					</a> <a class="text-dark px-2" href=""> <i class="fab fa-twitter"></i>
					</a> <a class="text-dark px-2" href=""> <i
						class="fab fa-linkedin-in"></i>
					</a> <a class="text-dark px-2" href=""> <i class="fab fa-instagram"></i>
					</a> <a class="text-dark pl-2" href=""> <i class="fab fa-youtube"></i>
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
	<!-- Topbar End -->


	<!-- Navbar Start -->
	<div class="container-fluid">
		<div class="row border-top px-xl-5">
			<div class="col-lg-3 d-none d-lg-block">
				<a
					class="btn shadow-none d-flex align-items-center justify-content-between bg-primary text-white w-100"
					data-toggle="collapse" href="#navbar-vertical"
					style="height: 65px; margin-top: -1px; padding: 0 30px;">
					<h6 class="m-0">Danh sách</h6> <i
					class="fa fa-angle-down text-dark"></i>
				</a>
				<nav
					class="collapse position-absolute navbar navbar-vertical navbar-light align-items-start p-0 border border-top-0 border-bottom-0 bg-light"
					id="navbar-vertical" style="width: calc(100% - 30px); z-index: 1;">
					<div class="navbar-nav w-100 overflow-hidden" style="height: 410px">
						<div class="nav-item dropdown">
							<a href="#" class="nav-item nav-link">ZING</a> <a href="#"
								class="nav-item nav-link">VCOIN</a> <a href="#"
								class="nav-item nav-link">GARENA</a> <a href="#"
								class="nav-item nav-link">GATE</a> <a href="#"
								class="nav-item nav-link">VGPLAY</a>
						</div>
					</div>
				</nav>
			</div>
			<div class="col-lg-9">
				<nav
					class="navbar navbar-expand-lg bg-light navbar-light py-3 py-lg-0 px-0">
					<a href="#" class="text-decoration-none d-block d-lg-none">
						<h1 class="m-0 display-5 font-weight-semi-bold">
							<span class="text-primary font-weight-bold border px-3 mr-1">V</span>NapNgay
						</h1>
					</a>
					<button type="button" class="navbar-toggler" data-toggle="collapse"
						data-target="#navbarCollapse">
						<span class="navbar-toggler-icon"></span>
					</button>
					<div class="collapse navbar-collapse justify-content-between"
						id="navbarCollapse">
						<div class="navbar-nav mr-auto py-0">
							<a href="indexUser.jsp" class="nav-item nav-link active">Trang
								chủ</a> <a href="check.jsp" class="nav-item nav-link">Giỏ hàng</a> <a
								href="contact.jsp" class="nav-item nav-link">Liên hệ</a>
						</div>
						<div class="navbar-nav ml-auto py-0">
							<a href="login.jsp" class="nav-item nav-link">Đăng xuất</a>
						</div>
					</div>
				</nav>
			</div>
		</div>
	</div>
	<!-- Navbar End -->


	<!-- Page Header Start -->
	<div class="container-fluid bg-secondary mb-5">
		<div
			class="d-flex flex-column align-items-center justify-content-center"
			style="min-height: 300px">
			<h1 class="font-weight-semi-bold text-uppercase mb-3">Giỏ hàng</h1>
			<div class="d-inline-flex">
				<p class="m-0">
					<a href="">Trang chủ</a>
				</p>
				<p class="m-0 px-2">-</p>
				<p class="m-0">Giỏ hàng</p>
			</div>
		</div>
	</div>
	<!-- Page Header End -->


	<!-- Cart Start -->
	<div class="container-fluid pt-5">
		<div class="row px-xl-5">
			<div class="col-lg-8 table-responsive mb-5">
				<table class="table table-bordered text-center mb-0">
					<thead class="bg-secondary text-dark">
						<tr>
							<th>Sản phẩm</th>
							<th>Giá</th>
							<th>Số lượng</th>
							<th>Tổng giá</th>
							<th>Xóa</th>
						</tr>
					</thead>
					<tbody class="align-middle">
						<tr>
							<td class="align-middle"><img src="img/product-1.jpg" alt=""
								style="width: 50px;">Card Zing</td>
							<td class="align-middle">100</td>
							<td class="align-middle">
								<div class="input-group quantity mx-auto" style="width: 100px;">
									<div class="input-group-btn">
										<button class="btn btn-sm btn-primary btn-minus">
											<i class="fa fa-minus"></i>
										</button>
									</div>
									<input type="text"
										class="form-control form-control-sm bg-secondary text-center"
										value="1">
									<div class="input-group-btn">
										<button class="btn btn-sm btn-primary btn-plus">
											<i class="fa fa-plus"></i>
										</button>
									</div>
								</div>
							</td>
							<td class="align-middle">100</td>
							<td class="align-middle"><button
									class="btn btn-sm btn-primary">
									<i class="fa fa-times"></i>
								</button></td>
						</tr>
						<tr>
							<td class="align-middle"><img src="img/product-3.jpg" alt=""
								style="width: 50px;"> Garena</td>
							<td class="align-middle">500</td>
							<td class="align-middle">
								<div class="input-group quantity mx-auto" style="width: 100px;">
									<div class="input-group-btn">
										<button class="btn btn-sm btn-primary btn-minus">
											<i class="fa fa-minus"></i>
										</button>
									</div>
									<input type="text"
										class="form-control form-control-sm bg-secondary text-center"
										value="1">
									<div class="input-group-btn">
										<button class="btn btn-sm btn-primary btn-plus">
											<i class="fa fa-plus"></i>
										</button>
									</div>
								</div>
							</td>
							<td class="align-middle">500</td>
							<td class="align-middle"><button
									class="btn btn-sm btn-primary">
									<i class="fa fa-times"></i>
								</button></td>
						</tr>
					</tbody>
				</table>
			</div>
			<div class="col-lg-4">
				<form class="mb-5" action="">
					<div class="input-group">
						<input type="text" class="form-control p-4"
							placeholder="Mã giảm giá">
						<div class="input-group-append">
							<button class="btn btn-primary">Sử dụng</button>
						</div>
					</div>
				</form>
				<div class="card border-secondary mb-5">
					<div class="card-header bg-secondary border-0">
						<h4 class="font-weight-semi-bold m-0">Hóa đơn</h4>
					</div>
					<div class="card-body">
						<div class="d-flex justify-content-between mb-3 pt-1">
							<h6 class="font-weight-medium">Zing</h6>
							<h6 class="font-weight-medium">100</h6>
						</div>
						<div class="d-flex justify-content-between">
							<h6 class="font-weight-medium">Garena</h6>
							<h6 class="font-weight-medium">500</h6>
						</div>
					</div>
					<div class="card-footer border-secondary bg-transparent">
						<div class="d-flex justify-content-between mt-2">
							<h5 class="font-weight-bold">Tổng giá</h5>
							<h5 class="font-weight-bold">600</h5>
						</div>
						<button class="btn btn-block btn-primary my-3 py-3">Xác
							Nhận</button>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Cart End -->


	<div class="container-fluid bg-secondary text-dark mt-5 pt-5">
		<div class="row px-xl-5 pt-5">
			<div class="col-lg-4 col-md-12 mb-5 pr-3 pr-xl-5">
				<a href="" class="text-decoration-none">
					<h1 class="mb-4 display-5 font-weight-semi-bold">
						<span
							class="text-primary font-weight-bold border border-white px-3 mr-1">V</span>NapNgay
					</h1>
				</a>
				<p>Giúp bạn nạp nhanh hơn thuận tiện hơn.Chúng tôi luôn muốn mang trải
					nghiệm tốt nhất cho người dùng</p>
				<p class="mb-2">
					<i class="fa fa-map-marker-alt text-primary mr-3"></i>123 Phạm Ngũ
					Lão, Đà Lạt, Lâm Đồng
				</p>
				<p class="mb-2">
					<i class="fa fa-envelope text-primary mr-3"></i>lequocviet362003@gmail.com
				</p>
				<p class="mb-0">
					<i class="fa fa-phone-alt text-primary mr-3"></i>0385522339
				</p>
			</div>
			<div class="col-lg-8 col-md-12">
				<div class="row">
					<div class="col-md-4 mb-5">
						<h5 class="font-weight-bold text-dark mb-4">Quick Links</h5>
						<div class="d-flex flex-column justify-content-start">
							<a class="text-dark mb-2" href="indexUser.jsp"
								<i class="fa fa-angle-right mr-2"></i>>Trang chủ</a> <a
								class="text-dark mb-2" href="check.jsp"
								class="nav-item nav-link" <i class="fa fa-angle-right mr-2"></i>>Giỏ hàng</a> 
								<a class="text-dark mb-2" href="contact.jsp"class="nav-item nav-link" <i class="fa fa-angle-right mr-2"></i>>
								Liên hệ</a>
						</div>
					</div>
					<div class="col-md-4 mb-5">
						<h5 class="font-weight-bold text-dark mb-4">Newsletter</h5>
						<form action="">
							<div class="form-group">
								<input type="text" class="form-control border-0 py-4"
									placeholder="Your Name" required="required" />
							</div>
							<div class="form-group">
								<input type="email" class="form-control border-0 py-4"
									placeholder="Your Email" required="required" />
							</div>
							<div>
								<button class="btn btn-primary btn-block border-0 py-3"
									type="submit">Subscribe Now</button>
							</div>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
</html>
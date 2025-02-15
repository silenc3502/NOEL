<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>엄세연</title>
<link rel="stylesheet" href="/resources/css/index/owl.theme.default.min.css">
<link rel="stylesheet" href="/resources/css/index/owl.carousel.min.css">

</head>
<body data-bs-spy="scroll" data-bs-target=".navbar" data-bs-offset="70">
	<jsp:include page="/WEB-INF/views/layouts/header.jsp" />
	<!-- SLIDER -->
	<div class="owl-carousel owl-theme hero-slider">
		<div class="slide slide1">
			<div class="container">
				<div class="row">
					<div class="col-12 text-center text-white">
						<h1 class="display-3 my-4">bonjour noël<br />For Sweet & Healthy Life
						</h1> <a href="/marketListFrm?reqPage=1" id="home" class="btn btn-brand" id="font">Market</a>
					</div>
				</div>
			</div>
		</div>
		<div class="slide slide2">
			<div class="container">
				<div class="row">
					<div class="col-12 text-center text-white">
						<h1 class="display-3 my-4"><br />Cooking & Bakery
						</h1> <a href="#" class="btn btn-brand" id="font">Class</a>
					</div>
				
					<!-- <div class="col-12 col-lg-10 offset-lg-1 text-white">
						<h6 class="text-white text-uppercase" id="font">천연 식재료로 만들어 보는 건강</h6>
						<h1 class="display-3 my-4">Cooking & Class <br />
						</h1> <a href="#" class="btn btn-brand" id="font">Class</a>
					</div> -->
				</div>
			</div>
		</div>
	</div>

	<jsp:include page="/WEB-INF/views/layouts/footer.jsp" />

	<script src="/resources/js/index/jquery.min.js"></script>
	<script src="/resources/js/index/owl.carousel.min.js"></script>
	<script src="/resources/js/index/app.js"></script>
</body>
</html>
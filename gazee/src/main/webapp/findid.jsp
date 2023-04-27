<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script
	src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
<style>
<!--
body {
	text-align: center;
}

/* div {
	padding : 30px;
	background-color: #6f42c1;
	border-radius: 30px;
	width: 18px;
	text-align: center;
	padding: 30px;
} */

div {
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
	padding: 30px;
	background-color: #6f42c1;
	border-radius: 30px;
	text-align: center;
}

.form-control {
	margin: 10px;
}
-->
</style>
</head>
<body>

	<h3 class="container" style="color: #6f42c1">아이디 찾기 페이지입니다.</h3>
	<hr color="#6f42c1">
	<img src="resources/img/gazegaze.png" style="width: 300px" height="100">
	<form action="one2" method="get">

		<div class="container">
			<label for="usr" style="color: #ffc107" style="width:18px;text-align:right;">이름 입력</label> 
			    <input type="text" class="form-control" name="name" style="width: 350px"style="text-align:center;"> 
				 <label> </label>

			<!-- <button type="submit" class="container" style="width:-50px">서버로 전송</button>-->
			<label></label><br>
			<button type="submit" class="btn btn-primary btn-lg"
				style="background: #ffc107">서버로 전송</button>
			<br>

		</div>
		<label></label><br>

		<button type="button" class="btn btn-primary btn-sm"
			style="background: #6f42c1" onClick="location.href='member.jsp'">로그인 화면</button>
	
	</form>
</html>
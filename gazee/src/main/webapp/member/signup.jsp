<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- 05-16 10:09 추가 -->
<link rel="short icon" href="#">

<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script type="text/javascript" src="../resources/js/jquery-3.6.4.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
<script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>



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
	
	<h3 class="container" style="color: #6f42c1">회원가입 화면입니다.</h3>
	<hr color="#6f42c1">
	<img src="../resources/img/gazegaze.png" style="width: 300px" height="100">
	<div class="container">
		<form action="insert" method="post">
			<label for="usr" style="color: #ffc107" style="width:18px;text-align:right;">아이디</label> 
			<input type="text" name="id" class="form-control"><br> 
			
			<label for="usr"style="color: #ffc107" style="width:18px;text-align:right;">비밀번호</label>
			<input name="pw" class="form-control" value="1234"><br>

			<label for="usr" style="color: #ffc107" style="width:18px;text-align:right;">이름</label> 
			<input name="name" class="form-control" value="park"><br> 
			<label for="usr"	style="color: #ffc107" style="width:18px;text-align:right;">전화번호</label>
			<input name="tel" class="form-control" value="011"><br>
				
			<label for="usr" style="color: #ffc107"style="width:18px;text-align:right;">닉네임</label> 
			<input name="nickname" class="form-control" value="hodu"><br>

			<label for="usr" style="color: #ffc107" style="width:18px;text-align:right;">주소</label> 
			<input name="address" class="form-control" value="011"><br> 

			<label for="usr" style="color: #ffc107" style="width:18px;text-align:right;">이메일</label> 
			<input name="email" class="form-control" value="011"><br>

			<label for="usr" style="color: #ffc107" style="width:18px;text-align:right;">나이</label> 
			<input name="age" class="form-control" value="0"><br> 
				
			<label for="usr" style="color: #ffc107" style="width:18px;text-align:right;">성별</label> 
			<input name="gender" class="form-control" value="남성"><br>

			<button type="submit" class="btn btn-primary btn-lg"
				style="background: #ffc107">회원가입</button>
		</form>
	</div>
</html>
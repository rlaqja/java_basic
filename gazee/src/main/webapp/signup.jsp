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
<script type="text/javascript" src="js/jquery-3.6.4.js"></script>
<script type="text/javascript">
	$(function() {
		$('#b1').click(function() {
			$.ajax({
				url : "data/rank.xml",
				success : function(doc) {
					alert("요청성공!" + doc)
					list = $(doc).find('rank')
					alert(list.length)
					for (var i = 0; i < list.length; i++) {
						//console.log($(list[i]).find('name').text())
						//console.log($(list[i]).find('tel').text())
						name = $(list[i]).find('name').text()
						tel = $(list[i]).find('tel').text()
						$('#result').append(name + "," + tel + "<br>")
					}
				}
			})
		})
	})
		</script>

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

	<h3 class="container" style="color: #6f42c1">회원가입 화면입니다.</h3>
	<hr color="#6f42c1">
	<img src="resources/img/gazegaze.png" style="width: 300px" height="100">
	<div class="container">
		<form action="insert" method="get">
		<label for="usr" style="color: #ffc107" style="width:18px;text-align:right;">아이디</label> 
		<input  name="id" class="form-control" value="kakao"><br>
		<label for="usr" style="color: #ffc107" style="width:18px;text-align:right;">비밀번호</label> 
	     <input name="pw" class="form-control" value="1234"><br> 
		<label for="usr" style="color: #ffc107" style="width:18px;text-align:right;">이름</label> 
	     <input  name="name" class="form-control" value="park"><br> 
		<label for="usr" style="color: #ffc107" style="width:18px;text-align:right;">전화번호</label> 
	     <input  name="tel" class="form-control" value="011"><br>
		<label for="usr" style="color: #ffc107" style="width:18px;text-align:right;">금액</label> 
	     <input  name="seed" class="form-control" value="1000"><br>
		<label for="usr" style="color: #ffc107" style="width:18px;text-align:right;">닉네임</label> 
	     <input  name="nickname" class="form-control" value="hodu"><br>
		<label for="usr" style="color: #ffc107" style="width:18px;text-align:right;">주소</label> 
	     <input  name="address" class="form-control" value="011"><br>
		<label for="usr" style="color: #ffc107" style="width:18px;text-align:right;">이메일</label> 
	         <input  name="email" class="form-control" value="011"><br>
			<button type="submit" class="btn btn-primary btn-lg"
				style="background: #ffc107">서버로 전송</button>
		</form>
	</div>
</html>
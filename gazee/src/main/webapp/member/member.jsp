<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
<script type="text/javascript" src="../resources/js/jquery-3.6.4.js"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script
	src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
	<link href="../resources/css/style.css?after" rel="stylesheet" type="text/css"/>
	<script type="text/javascript" src="../resources/js/jquery-3.6.4.js"></script>
	<!-- <script type="text/javascript">
	 $(function() {
		$('#b1').click(function() {
			var id2 = $('#id').val();
			var pw2 = $('#pw').val();
			
			if(id2 != '') {
				if(pw2 != ''){
					$.ajax({
						url:"login",
						type:'post',
						data:{
							id2: id2,
							pw2: pw2
						},
						success: function(result) {
							console.log(result)
						},//success
					})//ajax
				}else {
					alert("비밀번호를 입력해주세요");
				}
			}else{
				alert("아이디를 입력해주세요");
			}
		})
	})
	</script> -->
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

 #loginbox {
 	width: 1000px;
 	margin: 0 auto;
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
	padding: 30px;
	background-color: #6f42c1;
	border-radius: 30px;
	text-align: center;
}

.container  {
	display: flex;
	flex-flow: column;
	align-items: center;
}

.form-control {
	margin: 10px;
}
-->
</style>
</head>
<body>
<!-- <div id ="content">
 --><!-- <div id = "header"> -->
	<div class = "headerContent">
		<a href="gazeeMain.jsp">
			<img src="../resources/img/gazegaze.png" id = "logo">
		</a>
		<div id="search">
			<input type="text" id="searchBar" placeholder="검색어를 입력하세요.">
			<input type="submit" id="searchButton" value="검색">
		</div>
		<ul class = "menu">
			<li id="login" >로그인</li>
			<li class= "line">|</li>
			<li>회원가입</li>
			<li class= "line">|</li>
			<li>고객센터</li>
			<li class= "line">|</li>
			<li>
				<div class="mobile_btn">
					<input type="checkbox" id="hamburger" />
					<label for="hamburger">
					  	<span></span>
					  	<span></span>
					  	<span></span>
					</label>
					<div class="sidebar">
					    <h2 style="text-align: center; position: relative; top: 60px; color: #693FAA;">카테고리</h2>
					    <hr style="position: relative; top:60px; border: solid 1px black;">
					    <ul class="nav_mobile">
					      <li><a href="#">의류</a><a href="#">잡화</a><a href="#">도서</a></li>
					      <li><a href="#">디지털기기</a><a href="#">생활가전</a><a href="#">가구/인테리어</a></li>
					      <li><a href="#">뷰티/미용</a><a href="#">스포츠/레저</a><a href="#">생활/주방</a></li>
					      <li><a href="#">취미/게임/음반</a><a href="#">반려동물용품</a><a href="#">기타</a></li>
					    </ul>
					</div>
				</div>
			</li>
		</ul>
	</div>
<!-- </div>  -->
<div id="loginbox">
		<!-- <div class="container"> -->
			<form action="login" method="post">
			    <label for="usr" style="color: #ffc107" style="width:18px;text-align:right;">아이디:</label> 
			    <input name="id" type="text" value="김" class="form-control" style="width: 350px"style="text-align:center;"> 
				
				<label for="pw" style="color: #ffc107">비밀번호:</label> 
				<input name="pw" type="password" value="1234" class="form-control" style="width: 350px"style="width:-600px">
				 <label></label>
			
			<!-- <button type="submit" class="container" style="width:-50px">서버로 전송</button>-->
			<label></label><br>
			<button type="submit"  class="btn btn-primary btn-lg"
				style="background: #ffc107">서버로 전송</button>
			<br>
			</form>
		<!-- </div> -->
</div>
	
		<label></label><br>
		<button type="button" class="btn btn-primary btn-sm"
			style="background: #6f42c1" onClick="location.href='findpw.jsp'">비밀번호 찾기</button>
		<button type="button" class="btn btn-primary btn-sm"
			style="background: #6f42c1" onClick="location.href='findid.jsp'">아이디 찾기</button>
		<button type="button" class="btn btn-primary btn-sm"
			style="background: #6f42c1" onClick="location.href='signup.jsp'">회원가입</button>
</body>
</html>
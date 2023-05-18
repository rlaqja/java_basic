<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script type="text/javascript" src="../resources/js/jquery-3.6.4.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
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
<!--  표현식(expression) --> 
<h3 class="container" style="color: #6f42c1">택배 운송번호 입력 화면입니다.</h3>
	<hr color="#6f42c1">
<!-- bag.getId()  -->
<%--model의 속성으로 전달받은 bag은 EL로 출력한다. --%>
<!-- EL: 속성으로 지정한 값 꺼내서 출력해주세요.!라는 의미! -->


		테스트<%= session.getAttribute("nickname") %>
<form action="update" method="get">
	
	운송장 번호 등록하기 : <input name="tracknumber" value="65249452"><br>
	
	<button type="submit">운송번호 등록하기</button>
</form>
	

</body>
<label></label><br>
	<button type="button" class="btn btn-primary btn-sm"
			style="background: #ffc107" onClick="location.href='mypage.jsp'">돌아가기</button>
</html>





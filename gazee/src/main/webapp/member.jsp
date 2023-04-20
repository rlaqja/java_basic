<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script src="https://cdn.jsdelivr.net/npm/jquery@3.6.4/dist/jquery.slim.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
  
</head>
<body>

<h3>로그인 화면입니다. </h3>
<hr color="red">
<form action="login" method="get">
	<div class="form-group">
  <label for="usr">Name:</label>
  <input type="text" class="form-control" id="usr" style=“width:50px”">
</div>
<div class="form-group">
  <label for="pwd">Password:</label>
  <input type="password" class="form-control" id="pwd">
</div>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">

<h3>회원가입 화면입니다. </h3>
<hr color="red">
<form action="insert" method="get">
	id : <input name="id" value="kakao"><br>
	pw : <input name="pw" value="1234"><br>
	name : <input name="name" value="park"><br>
	tel : <input name="tel" value="011"><br>
	<button type="submit">서버로 전송</button>
</form>
<hr color="red">
</body>
</html>
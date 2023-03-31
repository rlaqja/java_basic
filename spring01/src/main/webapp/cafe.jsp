<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<from action="bbb">
	댓글 달아버리기:<input name="buy"><br>
	<img src="resources/img/멍멍이.jpg" width="150" height="200"><br>
	<hr color="blue">

	<%
	if(session.getAttribute("id") != null) { //로그인이 성공 
%>
	<button type="button" class="btn btn-secondary" class="btn btn-primary">공동구매 참여하기</button><br>
<%}else{ %> <!-- 로그인 안함.  -->
	<a href="login.jsp">로그인페이지로</a>
<%}%>
</from>
</body>

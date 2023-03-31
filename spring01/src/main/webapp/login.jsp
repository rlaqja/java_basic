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
<% if(session.getAttribute("id") == null){ %>
<h3>로그인 화면입니다. </h3>
<hr color="red">
<form action="login" method="get">
	id : <input name="id" value="apple1"><br>
	pw : <input name="pw" value="1234"><br>
	<button type="submit">서버로 전송</button>
</form>
<%} else {%>
<hr color="red">
${id}님이 로그인 중입니다.~!<br>
<a href="bbs.jsp">
	<button type="button" class="btn btn-secondary" class="btn btn-primary">게시판 화면으로 go</button>
</a>
<a href="news.jsp">
	<button type="button" class="btn btn-info" class="btn btn-primary">뉴스 사이트로 go</button>
</a>
<a href="cafe.jsp">
	<button type="button" class="btn btn-primary" class="btn btn-primary">카페 사이트로 go</button>
</a>
<%} %>
</body>
</html>





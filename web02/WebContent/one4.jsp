<%@page import="multi.MovieDAO"%>
<%@page import="multi.MovieVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	int	 id =	Integer.parseInt(request.getParameter("id"));
	//int price = Integer.parseInt(request.getParameter("price"));
	MovieDAO dao = new MovieDAO();
	MovieVo bag2 = dao.one(Integer.parseInt(request.getParameter("id")));
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body {
	background: gray;
}
</style>
<meta name="viewport" content="width=device-width, initial-scale=1">
  <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
당신이 검색을 원하는 영화는 <%= id %>
	<h4 style="background: yellow;">영화상세 내용</h4>
	<table class="table table-dark table-striped">
		<tr>
			<td>영화 id</td>
			<td><%=bag2.getId()%></td>
		</tr>
		<tr>
			<td>영화명</td>
			<td><%=bag2.getTitle()%></td>
		</tr>
		<tr>
			<td>영화 내용</td>
			<td><%=bag2.getContent()%></td>
		</tr>
		<tr>
			<td>영화관 위치</td>
			<td><%=bag2.getLocation()%></td>
		</tr>
		<tr>
			<td>감독</td>
			<td><%=bag2.getDirector()%></td>
		</tr>
	</table>
</body>
</html>
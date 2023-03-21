<%@page import="multi.BbsVo"%>
<%@page import="multi.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String no = request.getParameter("no");

BbsDAO dao = new BbsDAO();
BbsVo bag2 = dao.one(Integer.parseInt(no));
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
	<h4 style="background: yellow;">찾은 게시판 내용</h4>
	<table class="table table-dark table-striped">
		<tr>
			<td>검색한 제목</td>
			<td><%=bag2.getTitle()%></td>
		</tr>
		<tr>
			<td>검색한 제목</td>
			<td><%=bag2.getContent()%></td>
		</tr>
		<tr>
			<td>검색한 제목</td>
			<td><%=bag2.getWriter()%></td>
		</tr>
	</table>
</body>
</html>
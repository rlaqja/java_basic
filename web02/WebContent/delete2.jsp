<%@page import="multi.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String no = request.getParameter("no");

	BbsDAO dao = new BbsDAO();
	dao.delete(Integer.parseInt(no));

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
</head>
<body>
	게시판 삭제 남바는:<%=no%>
	
</body>
</html>
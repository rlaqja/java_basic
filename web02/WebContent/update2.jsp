<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVo"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String no = request.getParameter("no");
	String content = request.getParameter("content");
	
	BbsVo bag =new BbsVo();
	bag.setNo(Integer.parseInt(no));
	bag.setContent(content);
	
	BbsDAO dao = new BbsDAO();
	
	dao.update(bag);
	
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
	당신이 원하는 수정 남바는:<%=no%>
	<br>당신이 수정하고싶은 댓글 :<%=content%>
</body>
</html>
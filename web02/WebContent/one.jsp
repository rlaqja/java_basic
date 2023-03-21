<%@page import="multi.MemberVO"%>
<%@page import="multi.MemberDAO33"%>
<%@page import="multi.BbsVo"%>
<%@page import="multi.BbsDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
	String id = request.getParameter("id");

	MemberDAO33 dao = new MemberDAO33();
	MemberVO bag2 = dao.one(id);
	
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
<h4 style="background:yellow">찾은 게시판 내용</h4> 

	검색할 아이디:<%=bag2.getId() %><br>
	검색할 이름:<%=bag2.getName()%><br>
	검색한 전화번호:<%=bag2.getTel() %>
	
</body>
</html>
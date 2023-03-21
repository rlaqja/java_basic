<%@page import="multi.MemberDAO33"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    //HttpServletRequest request = new HttpServletRequest();
    String id = request.getParameter("id");	
	
	MemberDAO33 dao = new MemberDAO33();
	dao.delete(id);
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
<body>아이디 삭제 요청되었음.
<hr color="blue">
삭제요청한 ID : <%= id %>

</body>
</html>
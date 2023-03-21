<%@page import="multi.MemberDAO33"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    //HttpServletRequest request = new HttpServletRequest();
    String id = request.getParameter("id");	
    String pw = request.getParameter("pw");	
    String name = request.getParameter("name");	
    String tel = request.getParameter("tel");	
    
	MemberVO bag = new MemberVO();
	bag.setId(id);
	bag.setPw(pw);
	bag.setName(name);
	bag.setTel(tel);
	
	MemberDAO33 dao = new MemberDAO33();
	dao.insert(bag);
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
<body>회원가입 요청되었음.
<hr color="blue">
가입한 ID : <%= id %>
<br>가입한 PW : <%= pw %>
<br>가입한 NAME : <%= name %>
<br>가입한 TEL : <%= tel %>
</body>
</html>
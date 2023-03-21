<%@page import="multi.MemberDAO33"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%
    //HttpServletRequest request = new HttpServletRequest();
    String id = request.getParameter("id");	
    String tel = request.getParameter("tel");	
    
    MemberVO bag = new MemberVO();
	bag.setId(id);
	bag.setTel(tel);
	
	MemberDAO33 dao = new MemberDAO33();
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
<body>수정 요청되었음.
<hr color="blue">
수정하는 ID : <%= id %>
<br>수정한 전화번호 : <%= tel %>
</body>
</html>
<%@page import="multi.MovieDAO"%>
<%@page import="multi.ProductDAO"%>
<%@page import="multi.ProductVO"%>
<%@page import="multi.BbsDAO"%>
<%@page import="multi.BbsVo"%>
<%@page import="multi.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<jsp:useBean id="bag" class="multi.MovieVo"></jsp:useBean>
	<jsp:setProperty property="*" name="bag"/>
<%
	
	/* String id = request.getParameter("id");
	String name = request.getParameter("name");
	String content = request.getParameter("content");
	int price = Integer.parseInt(request.getParameter("price"));
	String company = request.getParameter("company");
	String img = request.getParameter("img"); */
	
/* 	ProductVO bag = new ProductVO();
	bag.setId(id);
	bag.setName(name);
	bag.setContent(content);
	bag.setPrice(price);
	bag.setCompany(company);
	bag.setImg(img); */

	MovieDAO dao = new MovieDAO();
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
<body>
<h4 style="background:red;">CGV</h4>
<%-- 무비 이름 <%= bag.getId() %> --%>
<br>영화 제목 <%= bag.getTitle() %>
<br>영화 내용 <%= bag.getContent() %>
<br>영화관 위치 <%= bag.getLocation() %>
<br>감독  <%= bag.getDirector() %>

</body>
</html>
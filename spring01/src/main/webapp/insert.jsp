<%@page import="com.multi.mvc01.MemberDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
    //1.브라우저에서 넘어오는 값 서버에서 받기
    String id = request.getParameter("id");
    String pw = request.getParameter("pw");
    String name = request.getParameter("name");
    String tel = request.getParameter("tel");
    //2.dao에 데이터 값 주면서 Insert요청하기..
    //MemberDAO33 dao = new MemberDAO33();
    //3.결과를 html에 담아서 클라이언트로 전송해주기...
    //dao.insert(bag);
    
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
가입 id: <%= id %><br>
가입 pw: <%= pw %><br>
가입 name: <%= name %><br>
가입 tel: <%= tel %><br>
</body>
</html>
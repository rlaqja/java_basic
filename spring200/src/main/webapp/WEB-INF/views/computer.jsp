<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<table border=1>
<tr>
	<td>항목명</td>
	<td>가격</td>
</tr>
<tr>
	<td>${vo.com}</td>
	<td>${vo.price}</td>
</tr>
<tr>
	<td>${vo.mouse}</td>
	<td>${vo.price2}</td>
</tr>
<tr>
	<td>총 합계</td>
	<td>${vo.sum}</td>
</tr>
</table>
</body>
</html>
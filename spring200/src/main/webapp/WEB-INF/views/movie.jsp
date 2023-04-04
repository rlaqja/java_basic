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
	<td style="background: yellow">영화제목</td>
	<td style="background: yellow">영화가격</td>
</tr>
<tr>
	<td style="background: pink">${vo.title}</td>
	<td style="background: pink">${vo.price}</td>
</tr>

</table>
</body>
</html>
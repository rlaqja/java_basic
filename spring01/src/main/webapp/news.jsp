<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
 <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
  <link rel="preconnect" href="https://fonts.googleapis.com">
<link rel="preconnect" href="https://fonts.gstatic.com" crossorigin>
<link href="https://fonts.googleapis.com/css2?family=Noto+Sans+KR&display=swap" rel="stylesheet">
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
font-family: 'Noto Sans KR', sans-serif;
}


</style>
</head>
<body>
	<img src="resources/img/조현천.jpg" width="300" height="300"><br>

<h4>뉴스 속보 </h4><br>

	박근혜 전 대통령 탄핵 국면 당시 계엄령 검토 문건 의혹의 핵심인물인 조현천 전 국군기무사령관이 미국 생활 5년여 만에 귀국해 결국 구속수감됐습니다.<br>

	서울서부지검은 지난 2016년 보수 성향 민간단체인 자유총연맹 회장 선거에 개입한 혐의로 조현천 전 사령관을 구속했습니다.<br>

	조 전 사령관은 또, 기무사 요원들을 동원해 박근혜 전 대통령을 지지하는 집회를 여는 등 여론을 조작한 혐의도 받고 있습니다.<br>

	조 전 사령관에 대한 구속영장을 심사한 서울서부지법은 "증거 인멸과 도망 우려가 있다"며 심사 5시간 만에 영장을 발부했습니다.<br>

	조 전 사령관의 신병을 확보한 검찰은, 본격적으로 박 전 대통령 탄핵 국면에서 윗선 지시로 계엄 문건을 작성해 내란을 계획한 의혹에 대해 수사를 벌일 계획입니다.<br>
<%
	if(session.getAttribute("id") != null) { //로그인이 성공해서 ram에 id를 저장해놓은 것.
%>
<from action="aaa">
	댓글 달아버리기:<input name="reply"><br>
	<button>댓글달기</button>
	<%} %>
</from>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="resources/js/jquery-3.6.4.js"></script>
<script type="text/javascript">

	$(function() {
		//alert("월요일입니당")
		$('#b1').click(function() {
			$.ajax({
				url : "movie",
				data : {
					title : $('#title').val(),
					price : $('#price').val()
				},
				success : function(x) {
					alert("영화 예매 성공!!")
					//alert(x)
					$('#result').append(x+"<br>")
				},
				error : function() {
					alert("영화 예매 실패!!")
				}//error
			})//ajax
		})//b2
		$('#b2').click(function() {
			$.ajax({
				url : "fruit",
				success : function(x) {
					alert("과일 불러오기 성공!!")
					//alert(x)
					$('#result').append(x+"<br>")
				},
				error : function() {
					alert("과일 불러오기 실패!!")
				}//error
			})//ajax
		})//b2
		$('#b3').click(function() {
			$.ajax({
				url : "tour",
				success : function(x) {
					alert("투어목록 불러오기 성공!!")
					//alert(x)
					$('#result').append(x+"<br>")
				},
				error : function() {
					alert("투어목록 불러오기 실패!!")
				}//error
			})//ajax
		})//b2
	})//$
</script>
</head>
<body>
영화제목 : <input id="title"><br>
영화관람료 : <input id="price"><br>
<input id="b1" type="button" value="영화 관람 확인"><br>
<input id="b2" type="button" value="과일목록 가지고 오기"><br>
<input id="b3" type="button" value="여행목록 가지고 오기"><br>
<hr color="blue">
<div id="result"></div>

</body>
</html>
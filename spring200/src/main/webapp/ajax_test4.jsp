<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.6.3/jquery.min.js"></script>
<script type="text/javascript">
$(function() {
	  $('#b1').click(function() { 
		  $('#result').empty()
		$.ajax({
			url:"list5",
			dataType: "json",
			success: function(json) {
				id = json[0].id
				pw = json[0].pw
				name = json[0].name
				tel = json[0].tel
				table=
				"<tr><td>아이디</td><td>"+id+"</td></tr>"+
				"<tr><td>비밀번호</td><td>"+pw+"</td></tr>"+
				"<tr><td>이름</td><td>"+name+"</td></tr>"+
				"<tr><td>전화번호</td><td>"+tel+"</td></tr>"
				$('#result').append(table)
			}//success
		})//ajax
		
	 })
	$('#b2').click(function() { 
		$('#result').empty()
		$.ajax({
			url:"list9",
			dataType: "json",
			success: function(json) {
				id = json[0].id
				pw = json[0].pw
				name = json[0].name
				tel = json[0].tel
				table=
				"<tr><td>아이디</td><td>"+id+"</td></tr>"+
				"<tr><td>비밀번호</td><td>"+pw+"</td></tr>"+
				"<tr><td>이름</td><td>"+name+"</td></tr>"+
				"<tr><td>전화번호</td><td>"+tel+"</td></tr>"
				$('#result').append(table)
			}//success
		})//ajax
		
	 })
	$('#b2').click(function() { 
		$('#result').empty()
		$.ajax({
			url:"list9",
			dataType: "json",
			success: function(json) {
				id = json[0].id
				pw = json[0].pw
				name = json[0].name
				tel = json[0].tel
				table=
				"<ul><li>아이디</li><li>"+id+"</li></ul>"+
				"<ul><li>비밀번호</li><li>"+pw+"</li></ul>"+
				"<ul><li>이름</li><li>"+name+"</li></ul>"+
				"<ul><li>전화번호</li><li>"+tel+"</li></ul>"
				$('#result').append(table)
			}//success
		})//ajax
		
	 })
	$('#b3').click(function() {
		$('#result').empty()
		$.ajax({
			url:"list6",
			data:{
				bbsno: 3
			},
			success: function(x) {
				$('#result').append(x)
				
			}//success
		})//ajax
	})//b3
	
	$('#b4').click(function() {
		$('#result').empty()
		$.ajax({
			url:"one5",
			data:{
				id:"apple"
				
			},
			success: function(x){
				//alert("성공!!!")
				$('#result').append(x)
				//$('#reply').val('') 
			}//success
		})//ajax
	})//b4
	$('#b5').click(function() {
		$('#result').empty()
		$.ajax({
			url:"one6",
			data:{
				no: 1
				
			},
			success: function(x){
				//alert("성공!!!")
				$('#result').append(x)
				//$('#reply').val('') 
			}//success
		})//ajax
	})//b5
	$('#b6').click(function() {
		$('#result').empty()
		$.ajax({
			url:"list7",
			success: function(x) {
				$('#result').append(x)
				
			}//success
		})//ajax
	})//b6
	$('#b7').click(function() {
		$.ajax({
			url:"update7",
			data:{
			   no: $('#no').val(),
			   content: $('#content').val()
			},
			success: function(x) {
				alert("수정완료!")
				window.location.href = "ajax_test.jsp" 
			}//success
		})//ajax
	})//b7
	$('#b8').click(function() {
		$('#result').empty()
		$.ajax({
			url:"delete8",
			data:{
				 no: $('#no2').val()
			},
			success: function(x) {
				window.location.href = "ajax_test.jsp" 
			}//success
		})//ajax
	})//b8
/* 	$.ajax({
		crossOrigin: true,
		url:'http://api.openweathermap.org/data/2.5/weather?q=seoul&units=metirc&lang=kr&appid=43238037f8f84c1b9d70369513a425e6',
		dataType : 'json',
		success: function(x){
			console.log(x);
			$('#result').html("위치"+x.name+"<br>"+
					"날씨"+x.weather[0].description+"<br>"+
					"풍속"+x.wind.speed+"<br>"+
					"최고 기온"+x.main.temp_max+"<br>"+
					"최저 기온"+x.main.temp_min+"<br>"+
					"체감 온도"+x.main.feels_like+"<br>"+
					"구름"+x.clouds.all+"<br>")
		}
		
	}) */
	$('#b8').click(function() {
		$('#result').empty()
		$.ajax({
			url:"delete8",
			data:{
				 no: $('#no2').val()
			},
			success: function(x) {
				window.location.href = "ajax_test.jsp" 
			}//success
		})//ajax
	})//b8
})//$

</script>
</head>
<body>
<button id="b1">member 테이블로 가지고 오기</button> 
<button id="b2">member 리스트로 가지고 오기</button>
<button id="b3">bbs번호 3번 reply리스트 가지고 오기</button>
<button id="b4">member id가 apple인 사람 정보 가지고 오기</button>
<button id="b5">bbs no가 1인 게시물의 상세 정보 가지고 오기</button>
<button id="b6">member의 모든 정보 가지고 오기</button>
<button id="b7">member의 모든 정보 가지고 오기</button>
<hr color="blue">
	no : <input id="no" value="1"><br>
	content : <input id="content" value="오늘은~"><br>
	<button id="b7">수정요청 전송</button>
<hr color="blue">
	no : <input id="no2" value="1"><br>
	<button id="b8">삭제요청 전송</button>
	<button id="b1">날씨 알아오기!</button>
<div id="result"></div>
</body>
</html>
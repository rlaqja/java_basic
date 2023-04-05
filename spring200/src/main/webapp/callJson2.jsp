<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
		$('#b1').click(
				function() {
					$('#result').empty()
					$.ajax({
						url : "json1",
						dataType : "json",
						success : function(json) {
							id = json.id
							pw = json.pw
							name = json.name
							tel = json.tel
							$('#result').append(id + " " + pw + " " + name +" "+ tel+"<br>")
						}//success
					})//ajax
				})//b1
		$('#b11').click(
				function() {
					$('#result').empty()
					$.ajax({
						url : "json1",
						dataType : "json",
						success : function(json) {
							id = json.id
							pw = json.pw
							name = json.name
							tel = json.tel
							table="<table><tr><td>항목명</td><td>값</td></tr>"+
							"<tr><td>아이디</td><td>"+id+"</td></tr>"+
							"<tr><td>비밀번호</td><td>"+pw+"</td></tr>"+
							"<tr><td>이름</td><td>"+name+"</td></tr>"+
							"<tr><td>전화번호</td><td>"+tel+"</td></tr><table>"
							$('#result').append(table)
						}//success
					})//ajax
				})//b11
		$('#b111').click(
				function() {
					$('#result').empty()
					$.ajax({
						url : "json1",
						dataType : "json",
						success : function(json) {
							id = json.id
							pw = json.pw
							name = json.name
							tel = json.tel
							table="<ul><li>항목명</li><li>값</li></ul>"+
							"<ul><li>아이디</li><li>"+id+"</li></ul>"+
							"<ul><li>비밀번호</li><li>"+pw+"</li></ul>"+
							"<ul><li>이름</li><li>"+name+"</li></ul>"+
							"<ul><li>전화번호</li><li>"+tel+"</li></ul>"
							$('#result').append(table)
						}//success
					})//ajax
				})//b11
		$('#b2').click(
				function() {
					$('#result').empty()
					$.ajax({
						url : "json2",
						dataType : "json",
						success : function(json) {
							id1 = json[1].id
							name1 = json[1].name
							
							$('#result').append("json배열 중 2번째 것>>" +name1 + " " + id1 + "<br>")
						}
					})
				})
		$('#b3').click(function() {
			$('#result').empty()
			$.ajax({
				url: "json3",
				dataType : "json",
				success : function(json) {
					no = json.no
					title = json.title
					content = json.content
					writer = json.writer
					//$('#result').append(today + " " + temp + " " + hu + "<br>")
					$('#result').append(no + " " + title + " " + content +" "+writer +"<br>")
				}
			})
		})
		$('#b4').click(function() {
			$('#result').empty()
			$.ajax({
				url : "json4",
				dataType : "json",
				success : function(json) {
					no1 = json[0].no
					title1 = json[0].title
					content1 = json[0].content
					writer1 = json[0].writer
					//$('#result').append(today + " " + temp + " " + hu + "<br>")
					$('#result').append(no1 + " " + title1 + " " + content1 +" "+writer1 +"<br>")
				}
			})
		})
	})

</script>

</head>
<body>
<button id="b1">컨트롤러에서 JSON(텍스트)받아오기</button>
<button id="b11">컨트롤러에서 JSON(다른 모양,table,li)받아오기</button>
<button id="b111">컨트롤러에서 JSON(다른 모양,table,li)2받아오기</button>
<button id="b2">컨트롤러에서 JSONArray받아오기</button>
<hr color="blue">
<button id="b3">컨트롤러에서 JSON3받아오기</button>

<button id="b4">컨트롤러에서 JSONArray4받아오기</button>
<hr color="blue">
<div id="result"></div>
</body>
</html>
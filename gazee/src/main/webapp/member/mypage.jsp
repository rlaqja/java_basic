<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="UTF-8">
<head>
<!--05-15 23:26분에 추가 했음.  -->
<link rel="short icon" href="#">
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
 <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script type="text/javascript" src="../resources/js/jquery-3.6.4.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
   <link href="../resources/css/style.css?after" rel="stylesheet" type="text/css"/>
  <style>
body {
	text-align: center;
}

.fakeimg {
	height: 200px;
	background: #aaa;
}

  table, td, th {
	border: 0px solid black;
	border-collapse: collapse;
} 

 table {
	width: 200px;
	height: 100px;
} 

th, td {
	text-align: center;
} 
#seedcheck {
 	width: 210px;
 	height: 100px;
 	margin: 0 auto;
	display: flex;
	justify-content: center;
	align-items: center;
	flex-direction: column;
	padding: 30px;
	background-color: #6f42c1;
	border-radius: 30px;
	text-align: center;
}
.btn{
	color: #fff;
}
</style>
<script type="text/javascript">
	  $(function() { 
		
		 var session = '<%= session.getAttribute("id")%>'
		 console.log(session) 
		
		$('document').ready(function() {
			$.ajax({
				url: 'seed',
				data: {
					id : session
				},
				success: function(result) {	
					$('.container').append(result)
				}
			})
		}) 
		
		//작성
		// 05-15 23:40 추가
		   $('#purchslist').click(function() {
			   $('.container').empty();
			$.ajax({
				url : 'purchslist',
				data : {
					id : session
				},
				success : function(result) {
					console.log(result)
					$('.container').append(result)
				}
			})
		})   
		   $('#selllist').click(function() {
			   $('.container').empty();
			$.ajax({
				url : 'selllist',
				data : {
					id : session
				},
				success : function(result) {
					console.log(result)
					$('.container').append(result)
				}
			})
		})   
		   $('#b3').click(function() {  
			$.ajax({
				url : '',
				data : {
					id : session
				},
				success : function(result) {
					console.log(result)
					location.href = "tracknumber"
				}
			})
		})   
		   $('#basket').click(function() {
			   $('.container').empty();
			$.ajax({
				url : 'basket',
				data : {
					id : session
				},
				success : function(result) {
					console.log(result)
					$('.container').append(result)
				}
			})
		})   
						
	}) 
	
		
		

</script> 
</head>
<body>
 <!-- <div id = "header"> -->
	<div class = "headerContent">
		<a href="gazeeMain.jsp">
			<img src="../resources/img/gazegaze.png" id = "logo">
		</a>
		<div id="search">
			<input type="text" id="searchBar" placeholder="검색어를 입력하세요.">
			<input type="submit" id="searchButton" value="검색">
		</div>
		<ul class = "menu">
			<li id="login">로그인</li>
			<li class= "line">|</li>
			<li>회원가입</li>
			<li class= "line">|</li>
			<li>고객센터</li>
			<li class= "line">|</li>
			<li>
				<div class="mobile_btn">
					<input type="checkbox" id="hamburger" />
					<label for="hamburger">
					  	<span></span>
					  	<span></span>
					  	<span></span>
					</label>
					<div class="sidebar">
					    <h2 style="text-align: center; position: relative; top: 60px; color: #693FAA;">카테고리</h2>
					    <hr style="position: relative; top:60px; border: solid 1px black;">
					    <ul class="nav_mobile">
					      <li><a href="#">의류</a><a href="#">잡화</a><a href="#">도서</a></li>
					      <li><a href="#">디지털기기</a><a href="#">생활가전</a><a href="#">가구/인테리어</a></li>
					      <li><a href="#">뷰티/미용</a><a href="#">스포츠/레저</a><a href="#">생활/주방</a></li>
					      <li><a href="#">취미/게임/음반</a><a href="#">반려동물용품</a><a href="#">기타</a></li>
					    </ul>
					</div>
				</div>
			</li>
		</ul>
	</div>
<!-- </div>  -->



 <div class="jumbotron text-center" style="margin-bottom:0">
  <img src="../resources/img/gazegaze.png" style="width: 300px" height="100">
  <p>여기는 가지마이페이지입니다!! <%= session.getAttribute("nickname") %>님 환영합니다.</p> 
   
</div>  
 	  

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <button class="btn" onclick="mypage.jsp"><h4>LOGO</h4></button>	 
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse justify-content-center" id="collapsibleNavbar">
    	<ul class="navbar-nav">
     	 <li class="nav-item">
    
        <button class="btn"  id="purchslist" >구매내역</button>
    
      </li>
      <li class="nav-item">
      
        <button class="btn" id="selllist" >판매내역</button>
      
      </li>
      <li class="nav-item">
    
        <button class="btn" onClick="location.href='tracknumber.jsp'">운송장</button>
    														
      </li>
      <li class="nav-item">
   
       <button class="btn" id="basket">찜 목록</button>
  
      </li>    
      <li class="nav-item">
  
        <button class="btn" id="updateuser">회원수정/탈퇴</button>
      
      </li>
    </ul>
  </div>  
</nav>

<div class="container" style="margin-top:30px">
</div>
<label></label><br>
<label></label>
<div id = "footer">
	<div>
		<p style = "margin: 0; font-size: 12px;">Copyrightⓒ 2023. gazee. All rights reserved.</p>
	</div>
</div>

</body>
</html>

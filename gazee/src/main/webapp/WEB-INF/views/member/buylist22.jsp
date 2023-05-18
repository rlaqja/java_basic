<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
  <script type="text/javascript" src="../resources/js/jquery-3.6.4.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
  <style>
  body{
  	text-align: center;
  }
  .fakeimg {
    height: 200px;
    background: #aaa;
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

  </style>
</head>
<body>

<div class="jumbotron text-center" style="margin-bottom:0">
  <img src="../resources/img/gazegaze.png" style="width: 300px" height="100">
  <p>여기는 가지구매내역페이지입니다!! ${id}님 환영합니다.</p> 
</div>
 	  

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <a class="navbar-brand" href="../member/mypage">LOGO</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse justify-content-center" id="collapsibleNavbar">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="buylist.jsp">구매내역</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="selllist.jsp" >판매내역</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="basket.jsp">찜 목록</a>
      </li>    
      <li class="nav-item">
        <a class="nav-link" href="updateuser.jsp">회원수정/탈퇴</a>
      </li>    
    </ul>
  </div>  
</nav>

<div class="container" style="margin-top:30px">
  <div class="row">
    <div class="col-sm-4">
      <h5>가지잔액</h5>
      <div id="seedcheck">     		
        	<a href="#" style="color: #fff">가지 잔액 : ${seed}원}</a>
        </div>  
      <hr class="d-sm-none">
    </div>
    <div class="col-sm-8">
      <h5>구매 목록(내역)</h5>
      <div class="fakeimg">Fake Image</div>
      <br>
      
	<h5>판매 목록(내역)</h5>
      <div class="fakeimg">Fake Image</div>
      <p>Some text..</p>
      <p>ㅁㄴㅇㄴㅁㅇ</p>
    </div>
  </div>
</div>

<div class="jumbotron text-center" style="margin-bottom:0">
  <p>(주)가지가지 중고거래 플랫폼</p>
</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="UTF-8">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/css/bootstrap.min.css">
 <script type="text/javascript" src="../resources/js/jquery-3.6.4.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.2/dist/js/bootstrap.bundle.min.js"></script>
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
	// 05-17 00:25 추가
	  $('#b1').click(function() {
			var id2 = $('#id').val();
			var pw2 = $('#pw').val();
			var email2 = $('#email').val();
			var address2 = $('#address').val();
			
			if (id2 != '') {
				if (pw2 != '') {
					if (email2 != '') {
						if (address2 != '') {
							$.ajax({
								url:"update",
								type:'post',
								data:{
									id : id2,
									pw : pw2 ,
									email : email2,
									address : address2
								},
								success : function(data) {
									if (data.id == '없음') {
										alert("회원수정 오류");
									} else {
										alert("회원수정 성공");
										location.href="mypage"
									}
								},//success
								error: function() {
									alert("서버연결 실패")
								}
							})//ajax
														
						}else{
							alert("주소를 입력해주세요");
						}
						
					}else{
						alert("이메일을 입력해주세요");
					}
					
				}else{
					alert("비밀번호를 입력해주세요");
				}
			}else{
				alert("아이디를 입력해주세요");
			}
		})
		$('#b2').click(function() {
			var id2 = $('#id').val();
			
			if (id2 != '') {
				$.ajax({
					url:"delete",
					data:{
						id : id2
					},
					success: function(data) {
						if (data.id == 'no') {
							alert("가지탈퇴 오류");
						} else {
							alert('ㅠㅠ가지를 이용해주셔서 감사합니다ㅠㅠ');
							location.href="mypage"
							
						}
					},//success
				})//ajax
			}else{
				alert("회원탈퇴 할 아이디를 입력해주세요")
			}
			
		})
			
}) 
</script>	
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
.btn{
	color: #fff;
}
  </style>
</head>
<body>

<div class="jumbotron text-center" style="margin-bottom:0">
  <img src="../resources/img/gazegaze.png" style="width: 300px" height="100">
  <p>여기는 가지 운송장입력페이지입니다!! ${nickname}님 환영합니다.</p> 
</div>
 	  

<nav class="navbar navbar-expand-sm bg-dark navbar-dark">
  <a class="navbar-brand" href="../member/mypage">LOGO</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse justify-content-center" id="collapsibleNavbar">
    <ul class="navbar-nav">
    <li class="nav-item">
      <form action="purchslist" method="post">
        <button class="btn"  name="purchslist" >구매내역</button>
    </form>
      </li>
      <li class="nav-item">
      <form action="selllist" method="post">
        <button class="btn" name="selllist" >판매내역</button>
        </form>
      </li>
      <li class="nav-item">
      <form action="trackNumber" method="post">
        <button class="btn" name="trackNumber" >운송장</button>
        </form>
      </li>
      <li class="nav-item">
      <form action="basket" method="post">
       <button class="btn" name="basket">찜 목록</button>
        </form>
      </li>    
      <li class="nav-item">
      <form action="updateuser" method="post">
        <button class="btn" name="updateuser">회원수정/탈퇴</button>
        </form>   
        </li> 
    </ul>
  </div>  
</nav>

  <div class="container" style="margin-top:30px">
<%-- <div class="row">
    <div class="col-sm-4">
      <h5>가지잔액</h5>
      <div id="seedcheck">
        	<a href="#" style="color: #fff">가지 잔액 : ${seed}원</a>
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
  </div>--%>
</div> 

<div class="jumbotron text-center" style="margin-bottom:0">
  <p>(주)가지가지 중고거래 플랫폼</p>
</div>

</body>
</html>
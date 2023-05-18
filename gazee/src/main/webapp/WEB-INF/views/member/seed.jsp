<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <div class="container" style="margin-top:30px">
  <div class="row">
    <div class="col-sm-4">
      <h5>가지잔액</h5>
      <div id="seedcheck">     		
        	<a href="#" style="color: #fff">가지 잔액 : ${seed}원</a>
        </div>  
      <hr class="d-sm-none">
    </div>
    <div class="col-sm-8">
      <h5>구매 목록(내역)</h5>
      <div class="fakeimg">
      <table class="table table-striped">
       <thead>
      <tr>
        <th>상품이름</th>
        <th>구매자</th>
        <th>판매자</th>
        <th>금액</th>
      </tr>
      	<c:forEach var="list" items="${purchslist}">
		<tr>
			<td>${list.productId}</td>
			<td>${list.buyerId}</td>
			<td>${list.sellerId}</td>
			<td>${list.paid}</td>
		</tr>
		</c:forEach>
		 </thead>
	</table>
      </div>
      <br>
      
	<h5>판매 목록(내역)</h5>
      <div class="fakeimg">
     <table class="table">
       <thead>
      <tr>
        <th>판매자</th>
        <th>구매자</th>
        <th>금액</th>
      </tr>
   
      	<c:forEach var="list2" items="${selllist}">
      	<tbody>
		<tr>
			<td>${list2.sellerId}</td>
			<td>${list2.buyerId}</td>
			<%-- <td>${list2.piad}</td> --%>
		</tr>
		</tbody>
		</c:forEach>
		 </thead>
	</table>
      </div>
    </div>
  </div>
</div>
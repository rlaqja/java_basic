<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="purchslist">
      <h5>구매 목록(내역)</h5>
      <table class="table table-striped" style="border: 0px !important" >
       <thead>
        <tr>
	        <th>상품이름</th>
	        <th>구매자</th>
	        <th>판매자</th>
	        <th>금액</th>
	        <th>셀러컨필름</th>
	        <th>바이어컨필름</th>
	     </tr>
        </thead>
        <tbody>
      	<c:forEach var="list" items="${purchslist}">
		<tr>
			<td>${list.productId}</td>
			<td>${list.buyerId}</td>
			<td>${list.sellerId}</td>
			<td>${list.paid}</td>
			<td>${list.sellerConfirm}</td>
			<td>${list.buyerConfirm}</td>
		</tr>
		</c:forEach>
		</tbody>
	</table>   
      <br>
</div>
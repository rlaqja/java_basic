<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<div id="selllist">
	<h5>판매 목록(내역)</h5>
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
			<%--  <td>${list2.piad}</td>  --%>
		</tr>
		</tbody>
		</c:forEach>
		 </thead>
	</table>
      </div>


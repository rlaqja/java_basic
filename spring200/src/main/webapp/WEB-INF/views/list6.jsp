<%@page import="com.spring.multi.BbsVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet">
  <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>

<table class="table table-bordered">
	<tr>
		<td class="top">no</td>
		<td class="top">bbsno</td>
		<td class="top">content</td>
		<td class="top">writer</td>
	</tr>

	<c:forEach items="${list}" var="bag">

		<tr>
			<td class="down">${bag.no}</td>
			<td class="down">${bag.bbsno}</td>
			<td class="down">${bag.content}</td>
			<td class="down">${bag.writer}</td>
		</tr>

	</c:forEach>
</table>
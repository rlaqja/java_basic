<%@page import="com.spring.multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script>
<table class="table table-bordered">
	<tr>
		<td class="top">넘버</td>
		<td class="top">제목</td>
		<td class="top">내용</td>
		<td class="top">작성자</td>
	</tr>
	<tr>
		<td class="down">${bag.no}</td>
		<td class="down">${bag.title}</td>
		<td class="down">${bag.content}</td>
		<td class="down">${bag.writer}</td>
	</tr>
</table>

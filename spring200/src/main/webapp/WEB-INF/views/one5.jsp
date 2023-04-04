<%@page import="com.spring.multi.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<link
	href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css"
	rel="stylesheet">
<script
	src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"></script><table class="table table-bordered">
	<tr>
		<td class="top">아이디</td>
		<td class="top">비밀번호</td>
		<td class="top">이름</td>
		<td class="top">전화번호</td>
	</tr>
	<tr>
		<td class="down">${bag.id}</td>
		<td class="down">${bag.pw}</td>
		<td class="down">${bag.name}</td>
		<td class="down">${bag.tel}</td>
	</tr>
</table>

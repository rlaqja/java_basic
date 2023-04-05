<%@page import="org.json.simple.JSONArray"%>
<%@page import="org.json.simple.JSONObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	JSONObject json = new JSONObject();
	
	json.put("yesterday", "LG");
	json.put("high", 20000);
	json.put("low", 10000);
	json.put("end", 14280);
	
	JSONObject json2 = new JSONObject();
	json2.put("today", "LG");
	json2.put("high", 35000);
	json2.put("low", 25000);
	json2.put("end", 28500);
	
	
	JSONArray array = new JSONArray();
	array.add(json);
	array.add(json2);
	
	
%><%= array.toJSONString() %>

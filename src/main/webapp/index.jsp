<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="co" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
	<head>
		<meta charset="utf-8">
		<title>.....[Evaluacion Spring 5].....</title>
	</head> 
	<body>
		<co:url value="/showMessage.ea" var="messageUrl" />
		<a href="${messageUrl}">Click to enter</a>
	</body>
</html>

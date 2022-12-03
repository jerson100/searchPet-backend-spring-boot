<!DOCTYPE html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="co"%>

<html>
	<head>
		<meta charset="utf-8">
		<title>.....[Evaluacion Spring 5].....</title>
	</head> 
	<body>
		<h1>Módulo de Evaluation Spring - Base de Datos</h1>
		<hr>
		Fecha del Sistema :<co:out value="${vModel.vFechaSistema}"></co:out>
		<br>	
		<h3>${vModel.message}</h3>
	</body>
</html>

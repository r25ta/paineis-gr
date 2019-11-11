<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"  
	session="false"  %>
	
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<!DOCTYPE html>
<html lang="pt">
<head>
<!-- 
		<meta http-equiv="content-type" content="text/html; charset=UTF-8">
		<meta charset="utf-8">
-->

<meta http-equiv="X-UA-Compatible" content="IE=Edge" />
<title>Painel Acidentes</title>
<meta name="generator" content="Bootply" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1"/>
 
<!--[if IE]>
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
<![endif]-->

<!--[if lt IE 9]>
			<script src=<c:url value="/resources/bootstrap/html5shiv.js"/></script>		
			
<![endif]-->

<link href="<c:url value="/styles/painel_gr_style.css"/>" rel="stylesheet">


</head>
<body id="painel-acidentes">
    <div id="painel-titulo">Acidentes</div>
    <div id="painel-indicador">${indicador}</div>
</body>

</html>
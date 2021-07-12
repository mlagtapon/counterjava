<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
	<script type="text/javascript" src="js/app.js"></script>
	<link rel="stylesheet" type="text/css" href="css/date.css">

<title>Counter</title>
</head>


<body>
	<h1>You have visited <c:out value="${count}"/> times.</h1>
	<br><h1><a href="/one">Test another visit?</a></h1>
	<br><h1><a href="/two">Add two counts.</a></h1>
	
</body>
</html>
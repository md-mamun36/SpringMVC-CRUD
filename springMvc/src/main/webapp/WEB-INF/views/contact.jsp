<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %> 
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Contact_ pages</title>
</head>
<body>
<h2>my name is ${name }</h2>
<c:forEach var="all" items="${ids }">
<h3>${all }</h3>
</c:forEach>

<h2>Address: Dhaka</h2>
<h2>mobile_No.:01626609636</h2>
</body>
</html>
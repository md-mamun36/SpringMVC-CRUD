<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page isELIgnored="false" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>home Page</title>
</head>
<body>
<h2>all Students Are = </h2>
<c:forEach var ="names" items="${emp }">
<h3>${names}</h3>
</c:forEach>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page isELIgnored="false"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Top Movies</title>
</head>
<body>
	<h1>Top Movies</h1>
	<ol>
		<c:forEach items="${mov}" var="m">
			<li>${m}</li>
		</c:forEach>
	</ol>
</body>
</html>
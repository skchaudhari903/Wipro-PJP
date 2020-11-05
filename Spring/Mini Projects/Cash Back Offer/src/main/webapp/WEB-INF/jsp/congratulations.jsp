<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Congratulations</title>
</head>
<body bgcolor="orange">
	
	<h1>Congratulations</h1>
	<br>
	<c:forEach var="coupon" items="${list}">
	<h3>You received a ${ coupon.offerpercentage } cash back offer</h3>
	<br><br><br><br>
	<h3>Your updated new balance is: ${ coupon.balance + ((coupon.offerpercentage/100)*coupon.balance) }</h3>
	</c:forEach>
</body>
</html>
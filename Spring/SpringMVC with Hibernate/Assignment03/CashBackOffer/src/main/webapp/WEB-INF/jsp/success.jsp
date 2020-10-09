<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Success</title>
</head>
<body bgcolor="orange">
	<h2>Login Successfull</h2>
	<br><br>
	<c:forEach var="customer" items="${list}">
	<h3>Your Current Balance is : ${ customer.balance }</h3>
	</c:forEach>
	<br><br>
	<h3>Claim your Cash Back here</h3>
	<form:form method="post" action="save">
		<table>
			<tr>
				<td> Enter Coupon Code : </td>
				<td> <form:input path="couponcode" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr>    
	          <td> </td>    
	          <td><input type="submit" value="Claim" /></td>    
	         </tr>
		</table>
	</form:form>
</body>
</html>
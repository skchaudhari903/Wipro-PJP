<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body bgcolor="orange">
	<h2>Enter your Login Details</h2>
	<br>
	<form:form method="post" action="save">
		<table>
			<tr>
				<td> Customer ID : </td>
				<td> <form:input path="customerid" /></td>
			</tr>
			<tr>
				<td> Password : </td>
				<td> <form:input path="password" /></td>
			</tr>
			<tr></tr>
			<tr></tr>
			<tr>    
	          <td> </td>    
	          <td><input type="submit" value="Login" /></td>    
	         </tr>
		</table>
	</form:form>
</body>
</html>
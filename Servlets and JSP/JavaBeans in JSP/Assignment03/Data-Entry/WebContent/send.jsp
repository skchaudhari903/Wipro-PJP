<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<%@ page import="javax.servlet.RequestDispatcher"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="US-ASCII">
<title>Send</title>
</head>
<body>
	<%
		RequestDispatcher rd = request.getRequestDispatcher("/DataEntry");
		rd.forward(request, response);
	%>
</body>
</html>
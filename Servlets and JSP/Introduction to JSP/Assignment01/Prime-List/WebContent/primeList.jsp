<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="US-ASCII">
<title>Prime List</title>
<style type="text/css">
body {
	text-align: center;
}
</style>
</head>
<body>
	<h1>Primes List</h1>
	<%
		ArrayList<Integer> primeList = (ArrayList<Integer>) request.getAttribute("primeList");
	for (int num : primeList) {
		out.print(num + ", ");
	}
	%>
</body>
</html>
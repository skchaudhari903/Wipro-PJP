<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%!long fact(int num) {
		if (num == 1)
			return 1;
		return num * fact(num - 1);
	}%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Factorial Table</title>
</head>
<body>
	<h2>Factorial Table</h2>
	<table border="1" style="text-align: center;">
		<tr>
			<th>Number</th>
			<th>Factorial</th>
		</tr>
		<%
			for (int i = 1; i < 15; i++) {
		%>
		<tr>
			<td><%=i%></td>
			<td><%=fact(i)%></td>
		</tr>
		<%
			}
		%>
	</table>
</body>
</html>
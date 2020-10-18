<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Insert</title>
</head>
<body>
	<div align="center">
		<sp:form action="InsertStudent" method="post" modelAttribute="student">
			<pre> Enter Student ID : <sp:input path="studentid" />
			</pre>
			<pre> Enter Student Name : <sp:input path="studentname" />
			</pre>
			<pre> Enter Student Department : <sp:input path="studentdept" />
			</pre>
			<br>
			<input type="submit" />
		</sp:form>
	</div>
</body>
</html>
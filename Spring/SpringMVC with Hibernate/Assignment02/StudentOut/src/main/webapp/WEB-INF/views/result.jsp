<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ page isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Result</title>
</head>
<body>
	<pre>
		${msg}
		Student [ ${student.studentid}, ${student.studentname}, ${student.studentdept} ]
	</pre>
</body>
</html>
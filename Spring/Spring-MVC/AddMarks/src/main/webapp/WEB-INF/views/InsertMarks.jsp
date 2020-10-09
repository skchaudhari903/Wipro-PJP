<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert Marks</title>
</head>
<body>
	<pre>
<sp:form action="InsertMarks" method="post" modelAttribute="marks">
Enter Science Marks : <sp:input path="sci" />
Enter Math Marks : <sp:input path="math" />
Enter English Marks : <sp:input path="eng" />
<input type="submit" />
</sp:form>
</pre>
</html>
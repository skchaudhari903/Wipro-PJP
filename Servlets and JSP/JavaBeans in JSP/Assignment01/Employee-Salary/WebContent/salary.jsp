<%@ page language="java" contentType="text/html; charset=US-ASCII"
	pageEncoding="US-ASCII"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="US-ASCII">
<title>Employee Salary</title>
</head>
<body style="text-align: center;">
	<jsp:useBean id="emp" class="bean.Employee" />
	<jsp:setProperty property="id" name="emp"
		value="<%=Integer.parseInt(request.getParameter(\"id\"))%>" />
	<jsp:setProperty property="empName" name="emp"
		value="<%=request.getParameter(\"empName\")%>" />
	<jsp:setProperty property="base" name="emp"
		value="<%=Integer.parseInt(request.getParameter(\"base\"))%>" />
	<jsp:setProperty property="bonus" name="emp"
		value="<%=Integer.parseInt(request.getParameter(\"bonus\"))%>" />
	<h2>Employee Details</h2>
	ID = <jsp:getProperty property="id" name="emp" /><br>
	Name = <jsp:getProperty property="empName" name="emp" /><br>
	Salary = <%=emp.getBase() + emp.getBonus()%>
</body>
</html>
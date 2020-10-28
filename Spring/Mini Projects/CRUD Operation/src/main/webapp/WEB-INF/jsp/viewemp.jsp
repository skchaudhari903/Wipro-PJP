<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employees List</title>
</head>
<body>
	<h1>Employees List</h1>  
<table border="2" width="70%" cellpadding="2">  
<tr><th>Id</th><th>Name</th><th>Designation</th><th>Salary</th><th>Edit</th><th>Delete</th></tr>  
   <c:forEach var="employee" items="${list}">   
   <tr>  
   <td>${employee.id}</td>  
   <td>${employee.name}</td>  
   <td>${employee.designation}</td> 
   <td>${employee.salary}</td>   
   <td><a href="editemp/${employee.id}">Edit</a></td>  
   <td><a href="deleteemp/${employee.id}">Delete</a></td>  
   </tr>  
   </c:forEach>  
   </table>  
   <br/>  
   <a href="empform">Add New Employee</a>  
</body>
</html>
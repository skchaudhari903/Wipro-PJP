<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    <%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@page import="java.util.Iterator"%>
<!DOCTYPE html>
<html>
<head>
<style>
a:link, a:visited {
  background-color: #696969;
  color: white;
  padding: 14px 25px;
  text-align: center;
  text-decoration: none;
  display: inline-block;
}
table, th, td {
  border: 1px solid black;
  border-collapse: collapse;
}
</style>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
<tr>
                <th>ID</th>
                <th>Name</th>
                <th>Gender</th>
                <th>Designation</th>
                <th>Salary</th>
                <th>City</th>
                <th>Email Id</th>
                <th>Mobile number</th>
            </tr>
            <c:forEach var="l" items="${list}">
            <tr>
            <td><c:out value="${l.id}" /></td>
           <td><c:out value="${l.name}" /></td>
                    <td><c:out value="${l.gender}" /></td>
                    <td><c:out value="${l.designation}" /></td>
                    <td><c:out value="${l.salary}" /></td>
                    <td><c:out value="${l.city}" /></td>
                    <td><c:out value="${l.email}" /></td>
                    <td><c:out value="${l.mobile}" /></td>
                    
            </c:forEach>
    
</table>
<p>
<a href="DeleteEmp2?id=${id}">Delete</a>
</p>
</body>
</html>
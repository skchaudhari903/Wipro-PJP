<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.c1{
    visibility:hidden;
}
</style>
</head>
<body>
<form action="Update" method="post">
<p>
<input type="hidden" id="id" name="id" value='<c:out value="${id}"></c:out>'>
</p>
<p>Name:
<input type="text" name="name" value='<c:out value="${name}"></c:out>'>
</p>
<p>Gender:
<label class="c1">
<input type="radio" id="male" name="gender" value="${gender}" checked>
</label>
<input type="radio" id="male" name="gender" value="male">
<label for="male">Male</label>
<input type="radio" id="female" name="gender" value="female">
<label for="female">Female</label>
<input type="radio" id="other" name="gender" value="other">
<label for="other">Other</label>
</p>
<p>Designation:
<input type="text" name="designation" id="designation" value='<c:out value="${designation}"></c:out>'>
</p>
<p>Salary:
<input type="number" name="salary" id="salary" value='<c:out value="${salary}"></c:out>'>
</p>
<p>City:
<input type="text" name="city" id="city" value='<c:out value="${city}"></c:out>'>
</p>
<p>Email Id:
<input type="email" name="email" id="email" value='<c:out value="${email}"></c:out>'>
</p>
<p>Mobile number:
<input type="number" name="mobile" id="mobile" value='<c:out value="${mobile}"></c:out>'>
</p>
<p>
<input type="submit" value="Update">
</form>
</body>
</html>
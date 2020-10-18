<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ page import="bean.AucBean"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
div{
background-color: yellow;
text-align:center;

}
table{
 margin-left:auto; 
    margin-right:auto;
}
tr,td{
 border: 2px solid white;
}
</style>
</head>
<body>
<div>
<h1>Bid Submitted</h1>
<br>
Your bid id now active.If your bid is successful,you will be notified within 24 hours close of bidding.
<br>
<br>
<table>
<%AucBean c=(AucBean)(request.getAttribute("b"));%>
<tr style="background-color:black;color:white;">
<th>CAR</th>
</tr>
<tr>
<td>Item ID:<%=c.getItemId()%></td>
</tr>
<tr>
<td>Name: <%=c.getName()%></td>
</tr>
<tr>
<td>Email Address:<%=c.getEmail() %></td>
</tr>
<tr>
<td>Bid price:Rs<%=c.getBid() %></td>
</tr>
<tr>
<td>Auto-increment price: <%=c.getStatus() %></td>
</tr>

</table>

<br>




</div>
</body>
</html>
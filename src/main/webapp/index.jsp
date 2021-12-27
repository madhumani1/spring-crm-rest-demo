<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Hello Spring REST world</title>
</head>
<body>
	<h3>Spring REST Demo</h3>
	<hr>
	<a href="${pageContext.request.contextPath}/api/customers">Get All Customers</a>
</body>
</html>
<%-- <% response.sendRedirect("test/hello"); %> --%>
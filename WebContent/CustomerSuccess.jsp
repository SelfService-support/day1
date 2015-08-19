<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<%@ taglib  uri="http://java.sun.com/jsp/jstl/core" prefix="sd" %>
</head>
<body>
	<!-- welcome ${key.empName} your ${key.empCode} and salary ${key.salary} successfully updated to bean<br> -->
	<table border="2">

<tr>
<th>customer id</th><th>customer first name</th><th>customer last name</th>
<sd:forEach var="cust" items="${ListKey}">
<tr><td>${cust.customerID}</td><td>${cust.customerFirstName}</td><td>${cust.customerLastName}</td></tr>

</sd:forEach>
</table>
</body>
</html>
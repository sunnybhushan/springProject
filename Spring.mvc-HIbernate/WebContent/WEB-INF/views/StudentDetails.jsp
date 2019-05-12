<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Student</h2>
<table>
<tr>
	<th>user Name</th>
	<td>${student.fname}</td>
</tr>

<tr>
	<th>last Name</th>
	<td>${student.lname}</td>
</tr>

<tr>
	<th>roll no</th>
	<td>${student.rollNO}</td>
</tr>

<tr>
	<th>mobile no</th>
	<td>${student.mobileNo}</td>
</tr>


</table>

</body>
</html>
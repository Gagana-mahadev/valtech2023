<%@page import="departmentWithEmployee.DepartmentD"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Department and Employee Details</title>
<link
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css"
	rel="stylesheet">
<style>
body {
	background-color: #f7f7f7; /* Set your desired background color */
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
}

.container {
	max-width: 600px;
	margin: 0 auto;
	padding: 20px;
	background-color: #ffffff;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

table {
	width: 100%;
	border-collapse: collapse;
	margin-top: 20px;
}

table, th, td {
	border: 1px solid #ccc;
}

th, td {
	padding: 10px;
	text-align: center;
}

thead {
	background-color: #357abf;
	/* Set your desired table header background color */
	color: #fff;
}

form {
	display: flex;
	justify-content: space-between;
}

input[type="submit"] {
	padding: 10px;
	background-color: #357abf; /* Set your desired button color */
	color: #fff;
	border: none;
	border-radius: 3px;
	cursor: pointer;
	transition: background-color 0.3s;
}

input[type="submit"]:hover {
	background-color: #246598; /* Button color on hover */
}
/* styles.css */
body {background-co ... by Gagana CM 10:52GaganaCM /* styles.css */ 
 
body {
    background-color : #f7f7f7; /* Set your desired background color */
	font-family: Arial, sans-serif;
	margin: 0;
	padding: 0;
}

.container {
	max-width: 600px;
	margin: 0 auto;
	padding: 20px;
	background-color: #ffffff;
	border-radius: 5px;
	box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
}

table {
	width: 100%;
	border-collapse: collapse;
	margin-top: 20px;
}

table, th, td {
	border: 1px solid #ccc;
}

th, td {
	padding: 10px;
	text-align: center;
}

thead {
	background-color: #357abf;
	/* Set your desired table header background color */
	color: #fff;
}

form {
	display: flex;
	justify-content: space-between;
}

input[type="submit"] {
	padding: 10px;
	background-color: #357abf; /* Set your desired button color */
	color: #fff;
	border: none;
	border-radius: 3px;
	cursor: pointer;
	transition: background-color 0.3s;
}

input[type="submit"]:hover {
	background-color: #246598; /* Button color on hover */
}
has
 
context
 
menu


Compose
</style>
</head>
<body>
	<%
	DepartmentD dept = (DepartmentD) session.getAttribute("dept");
	%>
	<table class="table table-bordered">
		<tr>
			<td>Department Id:</td>
			<td><%=dept.getDeptId()%></td>
		</tr>
		<tr>
			<td>Department Name:</td>
			<td><%=dept.getDeptName()%></td>
		</tr>
		<tr>
			<td>Department Location:</td>
			<td><%=dept.getDeptLoc()%></td>
		</tr>
		<tr>
			<td colspan="2">
				<form action="dispEmpbyDept" method="post">
					<input type="submit" name="submit" value="First" /> <input
						type="submit" name="submit" value="Previous" /> <input
						type="submit" name="submit" value="Next" /> <input type="submit"
						name="submit" value="Last" />
				</form>
			</td>
		</tr>
	</table>
	<table class="table table-bordered">
		<thead>
			<tr>
				<th>ID</th>
				<th>NAME</th>
				<th>AGE</th>
				<th>EXPERIENCE</th>
				<th>SENIORITY</th>
				<th>SALARY</th>
				<th>DID</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="employee" items="${emps}">
				<tr>
					<td><c:out value="${employee.id}" /></td>
					<td><c:out value="${employee.name}" /></td>
					<td><c:out value="${employee.age}" /></td>
					<td><c:out value="${employee.experience}" /></td>
					<td><c:out value="${employee.seniority}" /></td>
					<td><c:out value="${employee.salary}" /></td>
					<td><c:out value="${employee.deptId}" /></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


</body>
</html>

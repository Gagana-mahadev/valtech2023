<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h5 style=color:"red">${message }</h5>
<form action="register" method="post">
<table>
	<tr>
		<td>UserName:</td>
		<td><input type="text" name="username"/></tr>
	</tr>
	<tr>
		<td>Password:</td>
		<td><input type="password" name="password"/></tr>
	</tr>
	<tr>
		<td>Confirm Password:</td>
		<td><input type="password" name="confirmPassword"/></tr>
	</tr>
	<tr>
		<td colspan="2">
		<<input type="submit" name="submit" value="Register"/>
		</td>
	</tr>
		 

</table>
</form>
</body>
</html>
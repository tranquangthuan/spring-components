<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product page</title>
</head>
<body>
	<h1>Add new</h1>
	<form:form action="doLogin" modelAttribute="user" method="post">
		<table>
			<tr>
				<td>username</td>
				<td><form:input path="username" /></td>
			</tr>
			<tr>
				<td>password</td>
				<td><form:password path="password" /></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Login" /></td>
			</tr>
		</table>

	</form:form>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product page</title>
</head>
<body>
	<h1>Home jsp page</h1>
	${message} <br/>
	${product}
	<table>
		<tr>
			<th>Id</th>
			<th>Name</th>
			<th>Quantity</th>
			<th>Edit/Update</th>
		</tr>
		<c:forEach items="${products}" var="product">
			<tr>
				<td>${product.id}</td>
				<td>${product.name}</td>
				<td>${product.quantity}</td>
				<td><a href="edit?id=${product.id}">Edit</a> <a
					href="delete/${product.id}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>
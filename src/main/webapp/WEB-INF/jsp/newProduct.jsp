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
	<form:form action="addNew" modelAttribute="product" method="post">
		<table>
			<tr>
				<td>Name</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Quantity</td>
				<td><form:input path="quantity" /></td>
			</tr>
			<tr>
				<td>Colors</td>
				<td><form:checkboxes items="${colorMasterList}" path="colors" />
				</td>
			</tr>
			<tr>
				<td>Country</td>
				<td><form:select path="country">
						<form:option value="NONE" label="Select" />
						<form:options items="${countryMasterList}" />
					</form:select></td>
			</tr>
			<tr>
				<td></td>
				<td><input type="submit" value="Add Product" /></td>
			</tr>
		</table>

	</form:form>

</body>
</html>
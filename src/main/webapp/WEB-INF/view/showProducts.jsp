<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Display Products</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container" align="center">
		<h2>List of Products</h2>
		<table class="table table-striped">
		<tbody>
			<tr>
				<th>Category</th>
				<th>Product Name</th>
				<th>Price</th>
				
			</tr>
			<c:forEach items="${products}" var="product">
				<tr>
					<td>${product.category.name}</td>
					<td>${product.name}</td>
					<td>${product.price}</td>
				</tr>
			</c:forEach>	
		</tbody>		
		</table>
		<br>
		<a href="logout_admin">[Logout]</a>
	</div>
</body>
</html>
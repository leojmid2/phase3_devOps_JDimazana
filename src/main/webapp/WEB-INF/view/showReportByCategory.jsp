<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Show Purchase Product by Category</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container" align="center">
		<h2>Show Purchase Products by Category: ${category}</h2>
		<br>
		<table class="table table-striped">
		<tbody>
			<tr>
				<th>Purchase Number</th>
				<th>Purchase Date</th>
				<th>Product Name</th>
				<th>Product Price</th>
				
			</tr>
			<c:forEach items="${products}" var="p">
				<tr>
					<td>${p.purchaseId}</td>
					<td>${p.purchaseDate}</td>
					<td>${p.name}</td>
					<td>${p.price}</td>
				</tr>
			</c:forEach>	
		</tbody>		
		</table>
		<br>
		<a href="viewReport">[Back to Search]</a>
		<a href="logout_admin">[Logout]</a>
	</div>
</body>
</html>
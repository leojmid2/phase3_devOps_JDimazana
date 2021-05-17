<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Show Purchase by Date</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container" align="center">
		<h2>Purchase by Date: ${dop}</h2>
		<br>
		<c:forEach items="${purchases}" var="p">
		 <div class="form-group col-sm-12">
  			<label class="control-label">Purchase Number: </label> ${p.purchaseId}
  		 </div>
  		 <div class="form-group col-sm-12">	
  		 	<table class="table table-striped">
				<tbody>
					<tr>
						<th>Product Name</th>
						<th>Product Price</th>
					</tr>
					<c:forEach items="${p.lineItems}" var="pr">
					<tr>
						<td>${pr.product.name}</td>
						<td>${pr.product.price}</td>
					</tr>
						
				</c:forEach>
				</tbody>
			</table>
  		 </div>
		</c:forEach>
		<br>
		<a href="viewReport">[Back to Search]</a>
		<a href="logout_admin">[Logout]</a>
	</div>
</body>
</html>
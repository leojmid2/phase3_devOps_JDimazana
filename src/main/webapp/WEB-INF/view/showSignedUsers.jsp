<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Show Signed User</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>

</head>
<body>
	<div class="container" align="center">
		<h2>Signed Up User</h2>
		<table class="table table-striped">
		<tbody>
			<tr>
				<th>First Name</th>
				<th>Last Name</th>
				<th>Email</th>
			</tr>
			<c:forEach items="${signedUsers}" var="user">
				<tr>
					<td>${user.firstname}</td> 
					<td>${user.lastname}</td>
					<td>${user.email}</td>
				</tr>
			</c:forEach>	
		</tbody>		
		</table>
		<br>
		<a href="logout_admin">[Logout]</a>
	</div>
</body>
</html>
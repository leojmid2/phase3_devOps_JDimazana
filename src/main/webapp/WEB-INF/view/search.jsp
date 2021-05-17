<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Reports</title>
	<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/css/bootstrap.min.css">
	<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.4/js/bootstrap.min.js"></script>
</head>
<body onload="initFunction()">
	<div class="container">
		<h2>Search</h2>
	    <p class="text-danger">${message}</p>
 		<form class="form-horizontal" method="get" action="search">
 		
 		<div class="form-group col-sm-8">
    		<label class="control-label col-sm-3">Type of Search:</label>
    		<div class="col-sm-9">
      			<select class="form-control" id="type" name="type" onchange="myFunction()">
	 			    <option value="1">By Date</option>
	 			    <option value="2">By Category</option>
    			</select>
    		</div>
  		</div>
 		 <div id="date_div" class="form-group col-sm-8">
    		<label class="control-label col-sm-3">Date of Purchase</label>
    		<div class="col-sm-9">
      			<input type="date" class="form-control" id="dop" name="dop">
    		</div>
  		</div>
 		 <div id="cat_div" class="form-group col-sm-8">
    		<label class="control-label col-sm-3">Choose Category</label>
    		<div class="col-sm-9">
      			<select class="form-control" id="category" name="category">
      			<c:forEach items="${categories}" var="category">
			    <option value="${category.catId}">${category.name}</option>
			</c:forEach>	
      			</select>
    		</div>
  		</div>
 		 <div class="form-group col-sm-8" align="center">
			<input type="submit" value="View Report" class="btn btn-primary"/>
			<input type="reset" value="Clear" class="btn btn-primary"/>
			
		</div>	
		</form>
	</div>	
<script>
function myFunction() {
  	var x = document.getElementById("date_div");
  	var y = document.getElementById("cat_div");
    if (x.style.display === "none") {
      x.style.display = "block"
      y.style.display="none";
    } 
    else {
      x.style.display = "none";
      y.style.display="block";
    }
}

function initFunction(){
	var x = document.getElementById("cat_div");
    if (x.style.display === "none") {
      x.style.display = "block"
    } 
    else {
      x.style.display = "none";
    }
}


</script>
</body>
</html>
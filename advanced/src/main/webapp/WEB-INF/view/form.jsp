<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Register Page</title>
</head>
<body>
	<h1 align="center">Second Page</h1>

	<div align="center">
		<br> The data is added successfully!
	</div>

	<h2 align="center">Find Customer by ID</h2>
	<div align="center">
		<form action="findCustomerbyId" method="POST">

			Customer ID : <input type="number" name="cid"><br>
			<br> <input type="submit" value="Search"><br>

		</form>
	</div>



</body>
</html>
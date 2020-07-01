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
	<h1 align="center">First Page</h1>
	<div align="center">
	<form action="form" method="POST" modelAttribute="customer">

		Customer ID : <input type="text" name="cid"><br><br>
		Customer Name : <input type="text" name="cname"><br><br>
		Customer Email : <input type="text" name="cemail"><br><br>
				<input type="submit" value="Submit"><br>

	</form>
	</div>

</body>
</html>
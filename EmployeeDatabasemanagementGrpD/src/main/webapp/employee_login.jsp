<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Employee Login</title>
<link rel="stylesheet" type="text/css" href="resources/css/Style1.css">
</head>
<body>
	<div class="center">
		<h1>Login as Employee</h1>
		<form method="post" Action="EmployeeLoginServlet">
			<div class="txt_field">
				<input type="text" name="Username" required> <span></span> <label>Username</label>
			</div>
			<div class="txt_field">
				<input type="password" name="Password" required> <span></span>
				<label>Password</label>
			</div>
			<div class="checkbox">
				<input type="checkbox" id="remember-me"> <label
					for="remember-me">Remember me.</label>
			</div>
			<br/>
			<br/> <input type="submit" value="Login"><br/>
			<br/>


		</form>
	</div>
</body>
</html>
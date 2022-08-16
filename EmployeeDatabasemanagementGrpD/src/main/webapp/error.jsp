<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginFailed</title>
<style>
.wrapper .title {
	width: 50%;
	margin-left: 450px;
	font-size: 30px;
	font-weight: 700;
	margin-bottom: 25px;
	line-height: 100px;
	color: #ffffff;
	text-transform: uppercase;
	text-align: center;
	border-radius: 10px;
	background: linear-gradient(-135deg, #c850c0, #4158d0);
}

</style>
</head>
<body>

 <form method="post" Action ="EmployeeLoginServlet">
	<div class="wrapper">
<a href="employee_login.jsp"></a>
<a href="admin_login.jsp"></a>
		<div class="title">
			<h4>..... Sorry .....</h4>
		</div>
	</div>

	<h2>Error occured...</h2>
	</form>
	<button class="button"><a href="employee_login.jsp" style="text-decoration:none">Employee Login</a></button>
	<button class="button"><a href="admin_login.jsp" style="text-decoration:none">Admin Login</a></button>
	<button class="button"><a href="landing_page.jsp" style="text-decoration:none">HomePage</a></button>
	
</body>
</html>
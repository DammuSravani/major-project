<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<style>
.wrapper .title
{
  width: 100%;
  font-size: 30px;
  font-weight: 700;
  margin-bottom: 25px;
  line-height: 100px;
  color: #ffffff;  
  text-align: center;
  border-radius: 10px;
  background: linear-gradient(-135deg, #c850c0, #4158d0);
}
.button
{
  height:50px;
  width:160px;
  border:2px solid;
  font-size:20px;
  text-decoration:none;
  color:white;
}
</style>
<title>EmployeeDatabaseManagementGrpD</title>
</head>
<body>
	   <div class="wrapper">
       <div class="title">
       <h2 align="center">Employee Database Management</h2>
       </div>
       </div>
	<div align="center">
		<button class="button"><a href="admin_login.jsp" style="text-decoration:none">Admin Login</a></button><br></br>
		<button class="button"><a href="employee_login.jsp" style="text-decoration:none">Employee Login</a></button>
	</div>
</body>
</html>
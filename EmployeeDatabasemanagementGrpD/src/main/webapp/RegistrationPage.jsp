<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
<link rel="stylesheet" type="text/css" href="resources/css/Style3.css">

</head>
<body>
	<div class="wrapper">
	<form method="post" action ="RegistrationLoginServlet">
		<div class="title">Registration Form</div>
	
	<div class="form">
		<div class="inputfield">
			<label>EmpId</label> <input type="text" class="EmpId">
		</div>
		<br></br>
		<div class="inputfield">
			<label>EmpName</label> <input type="text" class="EmpName">
		</div><br></br>
		<div class="inputfield">
			<label>EmailId</label> <input type="email" class="EmailId">
		</div><br></br>
		<div class="inputfield">
			<label>PhoneNO</label> <input type="text" class="PhoneNO">
		</div><br></br>

		<div class="inputfield">
			<label>Department</label>
			<div class="custom_select">
				<select>

					<option value="developer">Devops</option>
					<option value="developer">Developers</option>
					<option value="hr">HRTeam</option>
					<option value="manager">Manager Team</option>
					<option value="developer">Support</option>
					<option value="support">IT</option>
					<option value="support">Consultant</option>
					<option value="manager">Administration</option>
					<option value="developer">R&D</option>
				</select>
			</div>
		</div><br></br>
		<div class="inputfield">
			<label>DateOfJoining</label> <input type="date" class="DateOfJoining">
		</div><br></br>
		<div class="inputfield">
			<label>DateOfJoining</label> <input type="date" class="DateOfResignation">
		</div><br></br>

		<div class="inputfield">
			<label>Location</label>
			<div class="custom_select">
				<select>
					
					<option value="Select">Hyderabad</option>
					<option value="Select">Banglore</option>
					<option value="Select">Mumbai</option>
					<option value="Select">Chennai</option>
				</select>
			</div>
		</div><br></br>

		<div class="inputfield">
			<label>Address</label>
			<textarea class="textarea"></textarea>
		</div>
		<div class="inputfield">
			<div class="signupBtn">
				<button type="submit" class="btn" style="font-size: 25px;">Register</button>
			</div>
		</div>
		</form>
		</div>
</body>
</html>
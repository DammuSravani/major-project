<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="resources/css/Style2.css">
<jsp:include page="header.jsp"/>
<jsp:include page="nav.jsp"/>
</head>
<body>

	<div align="center">
		
	
		<table>
			<tr>
				<td>
					<form action="FetchEmployeeServlet" method="post">
						<label style="font-size:20px;">Enter Employee ID :</label>
						<input type="text" name="EmpId" style="width:58%; height:30px; border: 1px solid;"><br></br> 
						<input type="submit" value="View" name="button1" style="height:30px; width:100px; font-size:20px;"/>
					</form> <br/> OR <br/>
					<form action="FetchEmployeeServlet" method="post">
						
						<label style="font-size:20px;">Enter Email ID :</label>
						<input type="text" name="EmailId" style="width:65%; height:30px; border: 1px solid;"><br></br> 
						<input type="submit" value="View" name="button2" style="height:30px; width:100px; font-size:20px;">
						
					</form> <br/> OR <br/>
					<form action="FetchEmployeeServlet" method="post">
						<label style="font-size:20px;">Enter Employee Name :</label>
						<input type="text" name="EmpName" style="width:50%; height:30px; border: 1px solid;"><br></br> 
						<input type="submit" value="View" name="button3" style="height:30px; width:100px; font-size:20px;">
					</form><br/> OR <br/>
					
					<form action="FetchAllEmployeesServlet" method="post">
						
						<input type="submit" value="View All Employees" name="button3" style="height:30px; width:200px; font-size:20px;">
					</form>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>
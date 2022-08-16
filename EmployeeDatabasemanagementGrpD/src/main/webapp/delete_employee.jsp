<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="resources/css/Style2.css">
<title>DeleteTable</title>
<jsp:include page="header.jsp"/>
<jsp:include page="nav.jsp"/>
</head>
<body>

	<div align="center">
		<table>
			<tr id="header">
		</table>
		<table>

			<tr>
				<td>
					<form action="DeleteEmployeeServlet" method="post">
						<label style="font-size:25px;">Enter Employee ID :</label>
						<input type="text" name="EmpId" style="width:50%; height:30px; border: 1px solid;"><br></br> 
						<input type="submit" value="Delete Employee" style="height:30px; width:200px; font-size:20px;">
					</form>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>
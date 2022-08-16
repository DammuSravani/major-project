<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import = "empdbmgmt.dal.DemographicDao,java.util.List,empdbmgmt.model.*"
    %>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="ISO-8859-1">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" type="text/css" href="resources/css/Style2.css">
<title>EditTable</title>
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
				<form method="post" action="EditEmployeeServlet">
					
					<label style="font-size:20px;">Employee Id : </label>
					<input type="text" name="EmpId" style="width:50%; border: 1px solid;"><br></br>
					 
					<label style="font-size:20px;">Employee Name:</label>
					<input type="text" name="EmpName" style="width:45%; border: 1px solid;"><br></br>
					
					<label style="font-size:20px;">EmailId: </label>
					<input type="text" name="EmailId" style="width:60%; border: 1px solid;"><br></br>
					
					<label style="font-size:20px;">Address : </label>
					<input type="text" name="Address" style="width:59%; border: 1px solid;"><br></br> 
					
					<label style="font-size:20px;">Phone NO. :</label> 
					<input type="text" name="PhoneNO" style="width:54%; border: 1px solid;"><br></br>
					
					<label for="datepicker" style="font-size:20px;">Date Of Joining:</label>
					<input type="date" name="DateOfJoining" id="datepicker" style="width:45%; border: 1px solid;"><br></br> 
					
					<label for="datepicker" style="font-size:20px;">Date Of Resignation:</label>
					<input type="date"name="DateOfResignation" id="datepicker" style="width:38%; border: 1px solid;"><br></br>
					 
					<label  style="font-size:20px;">Department:</label>
					 <select name="department" id="department">
                     <option value="DE1001"> DE1001</option>
                     <option value="DE1002"> DE1002</option>
                     <option value="DE1003"> DE1003</option>
                     <option value="DE1004"> DE1004</option>
                     <option value="DE1005"> DE1005</option>
                     <option value="DE1006"> DE1006</option>
                     <option value="DE1007"> DE1007</option>
                     <option value="DE1008"> DE1008</option>
                     <option value="DE1009"> DE1009</option>
                     </select><br/><br/>
                     
					 <label  style="font-size:20px;">Location:</label>
					 <select name="location" id="location">
	                     <option value="L101"> L101</option>
	                     <option value="L102"> L102</option>
	                     <option value="L103"> L103</option>
	                     <option value="L104"> L104</option>
                     </select><br/><br/>
                      
					<input type="submit" value="Edit Employee" style="height:30px; width:150px; font-size:20px;">
			</form>
			</td>
		</tr>
	</table>
	</div>
</body>
</html>

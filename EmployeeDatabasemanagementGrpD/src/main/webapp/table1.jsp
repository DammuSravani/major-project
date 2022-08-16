<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="empdbmgmt.service.Helper" %>
<!DOCTYPE html>

<html>

<head>
    <meta charset="ISO-8859-1">
	<link rel="stylesheet" type="text/css" href="resources/css/Table.css">
	<title>Table</title>
</head>

<body>
	<table>
		<tr>
			<th>Employee Id</th>
			<th>Employee Name</th>
			<th>EmailId</th>
			<th>Address</th>
			<th>Phone No.</th>
			<th>Department Id</th>
			<th>Date Of Joining</th>
			<th>Date Of Resignation</th>
			<th>Location Id</th>
		</tr>
		
	<%Helper h = new Helper();
	ResultSet result = h.fetchTable4();
	while(result.next()){
	%>
		
		<tr>
			<td><% out.println(result.getString("EmpId")); %></td>
			<td><% out.println(result.getString("EmpName"));%></td>
			<td><% out.println(result.getString("EmailId"));%></td>
			<td><% out.println(result.getString("Address"));%></td>
			<td><% out.println(result.getString("PhoneNO"));%></td>
			<td><% out.println(result.getString("DepId"));%></td>
			<td><% out.println (result.getString("DateOfJoining"));%></td>
			<td><% out.println(result.getString("DateOfResignation"));%></td>
			<td><% out.println(result.getString("LocationId"));%></td>
			
		</tr>
		<%} %>
	</table>
	
	 <h2><button class="button"><a href="landing_page.jsp" style="text-decoration:none">LogOut</a></button></h2>
</body>
</html>
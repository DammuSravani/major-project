<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
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
		
		<c:forEach var="employee" items="${emp}">
		<tr>
			<td><label><c:out value="${employee.empId}"/></label></td>
			<td><c:out value="${employee.empName}"/></td>
			<td><c:out value="${employee.emailId}"/></td>
			<td><c:out value="${employee.address}"/></td>
			<td><c:out value="${employee.phoneNO}"/></td>
			<td><c:out value="${employee.depId}"/></td>
			<td><c:out value="${employee.dateOfJoining}"/></td>
			<td><c:out value="${employee.dateOfResignation}"/></td>
			<td><c:out value="${employee.locationId}"/></td>
		</tr>
		</c:forEach>
		</table>
	<h2><button class="button"><a href="landing_page.jsp" style="text-decoration:none">LogOut</a></button></h2>
</body>
</html>
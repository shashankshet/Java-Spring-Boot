<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
  <%@page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>View Locations</title>
</head>
<body>
	<div class="container">
		<h1>Locations</h1>
		<div class="card">
			<div class="card-body">

<table class="table">
<tr>
<th  scope="col">id</th>
<th  scope="col">code</th>
<th  scope="col">name</th>
<th  scope="col">type</th>
</tr>

<c:forEach items="${locations}" var="location">
<tr>
<td>${location.id}</td>
<td>${location.code}</td>
<td>${location.name}</td>
<td>${location.type}</td>
<td><a href="deleteLocation?id=${location.id}" class="btn btn-danger">Delete</a></td>
<td><a href="showUpdate?id=${location.id}" class="btn btn-info">Edit</a></td>
</tr>
</c:forEach>

</table>
<a href="showCreate" class="btn btn-dark">Add Location</a>
</body>
</html>
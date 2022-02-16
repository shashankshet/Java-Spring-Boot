<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<title>Create Location</title>
</head>
<body>
	<div class="container">
		<h1>Location Form</h1>
		<div class="card">
			<div class="card-body">
				<form action="savLoc" method="post" />
				<div class="form-group row">
					<div class="col-sm-7"></div>
				</div>
				<div class="form-group">
				Id: <input type="text" class="form-control" name="id" /> 
				</div>
				Code: <input type="text"  class="form-control" name="code" /> 
				Name: <input type="text"  class="form-control" name="name" />
		
				 Type: Urban <input type="radio"  name="type" value="URBAN" /> 
				 Rural <input type="radio" name="type" value="RURAL" />
				 <br><br>
				<input type="submit" class="btn btn-primary" value="save" />   <a href="displayLocations" class="btn btn-dark">View all</a>

				</form>
				${msg}
				<br>
				
</body>
</html>
 !-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
 <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-// W3C// DTD HTML 4.01  
 Transitional// EN" "http:// www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Person</title>
</head>
<body>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	<div class='container' class='form-group'>
	<h1>Add Person</h1>
	<div class="form-group">
	
		<form:form method="post" action ="save">
			<table class='table-striped' class='table'>
				<tr>
					<td>First name:</td>
					<td> 
						<form:input path="fname" class='form-control'/>
					</td>
				</tr>
				<tr>
					<td>Last name:</td>
					<td><form:input path='lname' class='form-control'/></td>
				</tr>
				<tr>
					<td>Age:</td>
					<td><form:input path='age' class='form-control'/></td>
				</tr>
				<tr>
					<td>height:</td>
					<td><form:input path='height' class='form-control'/></td>
				</tr>
				<tr>
					<td>weight:</td>
					<td><form:input path='weight' class='form-control'/></td>
				</tr>
				<tr>
					<td>gender:</td>
					<td><form:input path='gender' class='form-control'/></td>
				</tr>
				<tr>
					<td>phone:</td>
					<td><form:input path='phone' class='form-control'/></td>
				</tr>
				<tr>
					<td>email::</td>
					<td><form:input path='email' class='form-control'/></td>
				</tr>
				<tr>
					<td>city:</td>
					<td><form:input path='city' class='form-control'/></td>
				</tr>
				<tr>
					<td>country:</td>
					<td><form:input path='country' class='form-control'/></td>
				</tr>
				<tr>
					<td></td>
					<td><input type='submit' value='Save'
						class='btn btn-primary btn-lg' /></td>
				</tr>
			</table>
		</form:form>
	</div><!-- fin form-group -->
	
	
	
	
		<nav class='navbar navbar-inverse'>
		<div class='container-fluid'>
			<!--Barand and toggle get grouped for better mobile display  -->
			<div class="navbar-header">
				<button type='button' class='navbar-toggle collapsed'
					data-toggle='collapse' data>
					<span class='sr-only'>Toggle navigation</span> <span
						class='icon-bar'></span> <span class='icon-bar'></span> <span
						class='icon-bar'></span> <span class='icon-bar'></span>
				</button>
				<a class='navbar-brand' href='/crud'>Person information</a>
			</div>
			<!--  fin navbar-header-->

			<!-- Collect the nav links, forms, and other content for toggling -->
			<div class='collapse navbar-collapse'
				id='bs-example-navbar-collapse-1'>
				<ul class='nav navbar-nav'>
					<li class="active"><a href='/crud/addperson'>Add Person</a></li>
					<li><a href='/crud/viewperson'>View Person</a></li>
					<li class='dropdown'><a href='#' class='dropdown-toggle'
						data-toggle='dropdown' role='button' aria></a>

						<ul class='dropdown-menu'>
							<li><a href='#'>Action</a></li>
							<li><a href='#'>Another action</a></li>
							<li><a href='#'>Something else here</a></li>
							<li role='separator' class='divider'></li>
							<li><a href='#'>Separated link</a></li>
							<li role='separator' class='divider'></li>
							<li><a href='#'>One more separated link</a></li>
						</ul></li>
				</ul>
			</div>
			<!-- fin collapse-->
		</div>
		<!-- fin container --> </nav>

	
		
	</div><!-- fin container -->
</body>
</html>

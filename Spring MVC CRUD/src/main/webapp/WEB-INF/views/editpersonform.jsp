 !-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
	integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
	crossorigin="anonymous">
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
	integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
	crossorigin="anonymous"></script>
<script
	src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
	integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
	integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
	crossorigin="anonymous"></script>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-// W3C// DTD HTML 4.01  
 Transitional// EN" "http:// www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Viewperson</title>
</head>
<body>

	<nav class='navbar navbar-inverse'>
	<div class='container-fluid'>
		<!--Barand and toggle get grouped for better mobile display  -->
		<div class="navbar-header">
			<button type='button' class='navbar-toggle collapsed' data-toggle='collapse' data>
				<span class='sr-only'>Toggle navigation</span>
				<span class='icon-bar'></span> 
				<span class='icon-bar'></span> 
				<span class='icon-bar'></span> 
			</button>
			<a class='navbar-brand' href='/crud'>Person information</a>
		</div>

		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class='collapse navbar-collapse'
			id='bs-example-navbar-collapse-1'>
			<ul class='nav navbar-nav'>
				<li><a href='/crud/addperson'>Add Person </a></li>
				<li><a href='/crud/viewperson'>View Person </a></li>
				<li class='dropdown'><a href='#' class='dropdown-toggle'
					data-toggle='dropdown' role='button' aria></a>
					<ul class='dropdown-menu'>
						<li><a href='#'>Action</a></li>
						<li><a href='#'>Another action</a></li>
						<li><a href='#'>Something else here</a></li>
						<li role='separator' class='divider'></li>
						<li><a href='#'>Separated link</a></li>
					</ul></li>
			</ul>
		</div><!--  fin navbar-collapse-->
	</div><!-- fin container-fluid -->
	</nav>








<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<h1>Update Person info</h1>
<form:form method="POST" action="/crud/udperson">
	<table class"table-striped">
		<tr>
			<td></td>
			<td><form:hidden path="id"/></td>
		</tr>
		<tr>
			<td>First name</td>
			<td><form:hidden path="fname"/></td>
		</tr>
		<tr>
			<td>Last name</td>
			<td><form:hidden path="lname"/></td>
		</tr>
		<tr>
			<td>age</td>
			<td><form:hidden path="age"/></td>
		</tr>
		<tr>
			<td>height</td>
			<td><form:hidden path="height"/></td>
		</tr>
		<tr>
			<td>weight</td>
			<td><form:hidden path="weight"/></td>
		</tr>
		<tr>
			<td>gender</td>
			<td><form:hidden path="gender"/></td>
		</tr>
		<tr>
			<td>phone</td>
			<td><form:hidden path="phone"/></td>
		</tr>
		<tr>
			<td>email</td>
			<td><form:hidden path="email"/></td>
		</tr>
		<tr>
			<td>city</td>
			<td><form:hidden path="city"/></td>
		</tr>
		<tr>
			<td>country</td>
			<td><form:hidden path="country"/></td>
		</tr>
		<tr>
		<td>	<input type="submit" value="submit" class="btn btn-success"></input> </td>
		</tr>
	</table>
</form:form>
</body>
</html>

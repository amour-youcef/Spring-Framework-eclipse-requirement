<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page session="false"%>
<html>
<head>
<title>Home</title>
</head>
<body>

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
		<!-- fin container -->
	</nav>

	<form:form>
		<table>
			<tr>
				<td>First name:</td>
				<td><form:input path='fname' class='form-control'>
						</form></td>
			</tr>
			<tr>
				<td>Last name:</td>
				<td><form:input path='lname' class='form-control'>
						</form></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><form:input path='age' class='form-control'>
						</form></td>
			</tr>
			<tr>
				<td>height:</td>
				<td><form:input path='height' class='form-control'>
						</form></td>
			</tr>
			
			<tr>
				<td></td>
				<td> <input type='submit' value='Save' class='btn btn-primary btn-lg'/></td>
			</tr>
		</table>
		</form>
</body>
</html>

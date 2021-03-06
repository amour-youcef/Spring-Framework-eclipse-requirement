<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
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
				<span class='icon-bar'></span>
			</button>
			<a class='navbar-brand' href='/crud'>Person information</a>
		</div>
		
		<!-- Collect the nav links, forms, and other content for toggling -->
		<div class ='collapse navbar-collapse' id='bs-example-navbar-collapse-1' >
		<ul class='nav navbar-nav'>
			<li> <a href='/crud/addperson'>Add Person </a></li>
			<li> <a href='/crud/viewperson'>View Person </a></li>
			<li class='dropdown'>
				<a href='#' class='dropdown-toggle' data-toggle='dropdown' role='button' aria></a>
				<ul class ='dropdown-menu'>
					<li><a href='#'>Action</a></li>
					<li><a href='#'>Another action</a></li>
					<li><a href='#'>Something else here</a></li>
					<li role='separator' class='divider'></li>
					<li><a href='#'>Separated link</a></li>
					<li role='separator' class='divider'></li>
					<li><a href='#'>One more separated link</a></li>
				</ul>
			 </li>
		</ul>
		</div>
	</div>
</nav>

<div class='container theme-showcase' role='main'>
	<!-- Main jumbotron for a primary marketing message or call to action -->
	<div class='jumbotron'>
		<div class='row'>
			<div class='col-sm-12'>
				<h1>Person information</h1>
				
			</div><!-- fin col-sm-12 -->
		</div><!-- fin row -->
	</div><!-- fin jumbotron -->
	<div class='page-header'>
		<div class="row">
			<div class='col-sm-12'>
				<a href='/crud/addperson' class='btn btn-success btn-lg'><i class='fa fa-user fa-1x'> Add Person</a>
				<a href='/crud/views' class='btn btn-success btn-lg'><i class='fa fa-user fa-1x'> View Person</a>
			</div><!-- fin col-sm-12 -->
		</div>
	</div><!--Fin page heaser  -->
</div><!--fin container  -->
</body>
</html>

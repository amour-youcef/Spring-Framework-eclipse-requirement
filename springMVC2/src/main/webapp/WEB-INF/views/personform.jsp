<!-- Latest compiled and minified CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css"
	integrity="sha384-HSMxcRTRxnN+Bdg0JdbxYKrThecOKuH5zCYotlSAcp1+c8xmyTe9GYg1l9a69psu"
	crossorigin="anonymous">

<!-- Optional theme -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap-theme.min.css"
	integrity="sha384-6pzBo3FDv/PJ8r2KRkGHifhEocL+1X2rVCTTkUfGk7/0pbek5mMa1upzvWbrUbOZ"
	crossorigin="anonymous">

<!-- Latest compiled and minified JavaScript -->
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"
	integrity="sha384-aJ21OjlMXNL5UyIl/XNwTMqvzeRMZH2w8c5cRVpzpU8Y5bApTppSuUkhZXN0VxHd"
	crossorigin="anonymous"></script>


<%@ taglib uri='http://www.springframework.org/tags/form' prefix='form'%>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c'%>

<div class='container'>
	<div class='jumbotron'>
		<form:form method='post' action='addperson' class='form-group'>
			<table class=table-bordered width='100%'>
				<tr>
					<td>id :</td>
					<td><form:input path='id' class='form-control' /></td>
				</tr>
				<tr>
					<td>Name :</td>
					<td><form:input path='name' class='form-control' /></td>
				</tr>
				</tr>
				<tr>
					<td>Age :</td>
					<td><form:input path='age' class='form-control' /></td>
				</tr>
				<tr>
					<td>Address :</td>
					<td><form:input path='address' class='form-control' /></td>
				</tr>
				<tr>
					<td colspan='2'><input type='submit' value='submit' class='form-control' /></td>
				</tr>
			</table>
		</form:form>
	</div>
</div>

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
		<table border='1' width='100%' cellpadding='1' class=table-bordered>
			<tr>
				<th>Id</th>	<th>Name</th> 	<th>Age</th> 	<th>Address</th>
			</tr>
			
			<c:forEach var='p' items='${list }'>
				<tr>
					<td>${p.id}</td>
					<td>${p.name}</td>
					<td>${p.age}</td>
					<td>${p.address}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</div>




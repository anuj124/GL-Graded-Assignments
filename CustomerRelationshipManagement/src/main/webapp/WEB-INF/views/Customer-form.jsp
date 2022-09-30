<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<!-- Required meta tags -->
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1, shrink-to-fit=no">

<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css"
	integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS"
	crossorigin="anonymous">

<meta charset="UTF-8">
<title>Register Customer</title>
</head>
<body>

	<div class="container">
		<h3>Customer Directory</h3>
		<hr>
		<p class="h4 mb-4">Customer</p>

		<form action="/CustomerRelationshipManagement/customer/save" method="post">
			<input type="hidden" name="customerId" value="${Customer.customerId}">

			<div class="form-inline">
				<input type="text" name="firstName" value="${Customer.firstName}"
					class="form-control mb-4 col-4" placeholder="First Name">
			</div>
			<div class="form-inline">
				<input type="text" name="lastName" value="${Customer.lastName}"
					class="form-control mb-4 col-4" placeholder="Last Name">
			</div>
			<div class="form-inline">
				<input type="text" name="email" value="${Customer.email}"
					class="form-control mb-4 col-4" placeholder="Email">
			</div>
			
			<button type="submit" class="btn btn-info col-2">Save</button>
		</form>
		<a href="CustomerRelationshipManagement/customer/list">Back to Customer list</a>
	</div>
</body>
</html>
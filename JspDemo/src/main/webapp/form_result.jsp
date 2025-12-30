<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Form</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<section class="container">
		<div class="card mt-5 p-5 mb-2">
			<h1 class="alert alert-secondary">Displaying data from form request!!</h1>
			<a href="Contact" class="btn btn-info btn-sm">Submit Again</a>
		</div>
		<div class="card p-5">
			<div class="card-header">
				<h4 class="card-title">Full Name: <%= request.getAttribute("full_name") %></h4>
			</div>
			<div class="card-body">
				<h3>Contact: <%= request.getAttribute("contact") %></h3>
				<h3>Email: <%= request.getAttribute("email") %></h3>
				<h3>Remarks: <%= request.getAttribute("remarks") %></h3>
			</div>
		</div>
	</section>
</body>
</html>
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
			<h1>Please feel free to contact us!!</h1>
			<hr>
			<h3>We are always available to serve you!!</h3>
		</div>
		<div class="card p-5">
			<form action="Contact" method="post">
				<div class="form-group mb-3 mt-3">
					<label for="full_name">Full Name:</label>
					<input type="text" class="form-control" name="full_name">
				</div>
				<div class="form-group mb-3">
					<label for="email">Email:</label>
					<input type="email" class="form-control" name="email">
				</div>
				<div class="form-group mb-3">
					<label for="contact">Contact:</label>
					<input type="number" class="form-control" name="contact">
				</div>
				<div class="form-group mb-3">
					<label for="remarks">Remarks:</label>
					<input type="text" class="form-control" name="remarks">
				</div>
				<input type="submit" class="btn btn-primary btn-sm" value="Submit" />
			</form>
		</div>
	</section>
</body>
</html>
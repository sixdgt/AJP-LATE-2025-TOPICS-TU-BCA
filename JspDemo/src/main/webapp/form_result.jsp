<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Contact Form Result</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
</head>
<body>
	<header>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
		  <div class="container-fluid">
		    <a class="navbar-brand" href="#">Jsp Demo</a>
		    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		      <span class="navbar-toggler-icon"></span>
		    </button>
		    <div class="collapse navbar-collapse" id="navbarSupportedContent">
		      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
		        <li class="nav-item">
		          <a class="nav-link" aria-current="page" href="<%= request.getContextPath() %>/">Home</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link" aria-current="page" href="<%= request.getContextPath() %>/Contact">Contact</a>
		        </li>
		        <li class="nav-item">
		          <a class="nav-link active" aria-current="page" href="#">Result</a>
		        </li>
		       </ul>
		    </div>
		  </div>
		</nav>
	</header>
	
	<section class="container mt-3">
		<nav aria-label="breadcrumb">
		  <ol class="breadcrumb">
		    <li class="breadcrumb-item"><a href="<%= request.getContextPath() %>/">Home</a></li>
		    <li class="breadcrumb-item" aria-current="page"><a href="<%= request.getContextPath() %>/Contact">Contact</a></li>
		    <li class="breadcrumb-item active" aria-current="page">Result</li>
		  </ol>
		</nav>
	</section>
	<section class="container">
		<div class="card mt-5 p-5 mb-2">
			<h1 class="alert alert-secondary">Displaying data from form request!!</h1>
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
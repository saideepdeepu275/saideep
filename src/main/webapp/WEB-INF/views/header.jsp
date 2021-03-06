<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
   <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>cars </title>
</head>
<body><body   background="${pageContext.request.contextPath}/resources/game.jpg"   style="width:100%" "height="20%">

<nav id="navbar-blue" class="navbar navbar-static-top" role="navigation">
<div class="container">
		<ul class="nav navbar-nav">
			<button type="button"class="nabar-toggle collapse" data-toggle="collapse" data-target="#bs-example-nav">
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			<span class="icon-bar"></span>
			</button>
		</ul>
</div>
<div class="collapse navbar-collapse" id="bs-example-nav">
    <ul class="nav navbar-nav">
		<li><a href="http://localhost:8080/carsfrontend"><i class="fa fa-home" aria-hidden="true"></i>Home</a></li>
		<li><a href="registration">Register</a></li>
		<li><a href="login"><i class="fa fa-sign-in" aria-hidden="true"></i>Login</a></li>
		
			<li><a href="category">Category</a></li>
				<li><a href="product">Product</a></li>
					<li><a href="Cart">Cart</a></li>
	
				<li><a href="supplier">Supplier</a></li>
				  <sec:authorize access="isAuthenticated()">
                 <li><a href="<c:url value="j_spring_security_logout"/>">Logout</a></li>
              
                  </sec:authorize>
	</ul>
</div>
</nav>
</body>
</html>
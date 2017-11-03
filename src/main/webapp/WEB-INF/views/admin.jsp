	 <%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<style type="text/css">

.bs-example{
    	margin: 40px;
    }
.img-rounded
{
background-color:RED;
}
</style>
<title>CarsHub</title>
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta charset="utf-8">
<link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css" rel="stylesheet" integrity="sha384-wvfXpqpZZVQGK6TAh5PVlGOfQNHSoD2xbE+QkPxCAFlNEevoEH3Sl0sibVcOQVnN" crossorigin="anonymous">
<link href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>CARS NEW DESIGN</title>
</head>

<jsp:include page="footer.jsp"></jsp:include>

<body><body   background="${pageContext.request.contextPath}/resources/REDIAMGE.JPG"   style="width:100%" "height="20%">

<div class="bs-example">
    <nav id="myNavbar" class="navbar navbar-inverse" role="navigation">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="#">CARSFRONTEND</a>
            </div>
            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                <ul class="nav navbar-nav">
                    <li><a href="http://localhost:8080/carsfrontend">Home</a></li>
                    
                   
                   
                </ul>
                
                <ul class="nav navbar-nav navbar-right">
                    <li class="dropdown">
                        <a href="#" data-toggle="dropdown" class="dropdown-toggle">admin <b class="caret"></b></a>
                        <ul class="dropdown-menu">
                            <li><a href="category">CATEGORY MODULE</a></li>
                            <li><a href="supplier">SUPPLIER MODULE</a></li>
                            <li><a href="product">PRODUCT MODULE</a></li>
                             <li><a href="Cart">Cart</a></li>
                            <li class="divider"></li>
                         
                         
                              <li> <a href="<c:url value="j_spring_security_logout" />">Logout</a></li>
                            
                           
                            
                        </ul>
                    </li>
                </ul>6
                
                 <ul class="nav navbar-nav">
                    
                    <li><a href="viewcart">CARTPAGE</a></li>
               </ul> 
            </div>
        </div>
    </nav>
</div>



<body>
<div class="Container">.
<h2><Strong>Mostly Viewed</Strong></h2>

<div id="mycarousel" class="carousel slide" data-ride="carousel">
<!-- indicators -->
<ol class="carousel-indicators">
<li data-target="#mycarousel" data-slide-to="0" class="active"></li>
<li data-target="#mycarousel" data-slide-to="1"></li>
<li data-target="#mycarousel" data-slide-to="2"></li>
<li data-target="#mycarousel" data-slide-to="3"></li>
</ol>

<!-- wrapper for slides -->
<div class="carousel-inner">
  <div class="item active ">
      <img class="img-rounded" class="img-responsive center-block" src="resources/acura-nsx-concept-at-beijing-motor-show01.jpg"style=" width="100%" height="30%"">
  </div>
   <div class="item">
   <img class="img-rounded" class="img-responsive center-block" src="resources/awesome-red-car-2.jpg" style="width="100%" height="30%"">
   </div>
   <div class="item">
   <img class="img-rounded" class="img-responsive center-block"src="resources/car1.jpg" style="width="100%" height="30%"" >
   </div>
  
  </div>
</div>
<!-- Left and Right controls-->
<a class="left carousel-control" href="#mycarousel"data-slide="prev">
 <span class="glyphicon glyphicon-chervon-left"></span>
 <span class="sr-only">Previous</span>
</a>
<a  class="right carousel-control" href="#mycarousel"data-slide="next">
  <span class="glyphicon glyphicon-chervon-right"></span>
  <span class="sr-only">Next</span>
</a>

</div>
</body>
</html>
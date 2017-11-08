<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
  <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>   
  <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
 <%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="resources/css/Pretty-Footer.css">
 <link rel="stylesheet" href="resources/css/PageDisplay.css">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
  <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<title>Order Summary</title>
</head>
<body><body   background="${pageContext.request.contextPath}/resources/gaming.jpg"   style="width:100%" "height="20%">

<div id="wrap">
<div id="main" class="container clear-top">
<div class = "row">
      <div class = "col-xs-8 jumbotron">
      	<div class = "col-xs-5">
      		<p>Shipping Address:</p><br>
      		 ${address.name}<br/>
      		${address.address1}
      		<br/>${address.address2}
      		<br/>${address.landmark}
      		 <br>${address.city} &nbsp; ${address.state}
      		 <br/> Pincode : ${address.pincode}
      		<br/> Mobile: <c:choose>
      		<c:when test="${address.phone eq 0}">${sessionScope.user.phone}</c:when>
      		<c:when test="${not empty address.phone}">${address.phone}</c:when>
      		</c:choose>
      	</div>
      	<div class = "col-xs-4">
      	 <p>Payment Method</p>
      	 <br>${paymentChoice}
      	</div>
      </div>
      
      <div class= "col-xs-4">
      
      	 <div class ="jumbotron">
      	 <a class="btn btn-warning btn-block" href="${pageContext.request.contextPath}/processOrder">Place Order</a><br><br/>
      	 <p>Order Summary</p>
      	 <h5> Items Subtotal :<span class="fa fa-inr"></span> ${cartTotalAmount}</h5>
      	 <h5> Delivery Charges:<span class="fa fa-inr"></span>   50.0 </h5>
      	 <hr/>
      	 <c:set var="ordertot" value="${cartTotalAmount + 50.0}"></c:set>
      	 <p>OrderTotal: <span class="fa fa-inr"></span> ${ordertot}</p>
      
      	 </div>
      </div>
  </div>
  
  <div class="row">
	 <div class="col-sm-12 col-md-10 col-md-offset-1">
	 <table class="table table-hover table-condensed">
	 <thead>
			<tr>
			<th>Product</th>
			<th></th>
			<th></th>
			<th class="text-center">Expected Delivery</th>
			<th class="text-center">Quantity</th>
			
			</tr>	
		</thead>
		<tbody>
			<c:forEach items="${cartList}" var ="cart">
			<tr>
			 <td class="col-sm-8 col-md-6">
			<div class="media">
			 <a class="thumbnail pull-left" href=""><img class="media-object" src="/carsfrontend/myImage/imageDisplay?id=${cart.productId}" class="img-thumbnail" width="72px" height="72px"/></a>
					
			<div class="media-body">
			<c:forEach items="${productList}" var="product">	
				<c:if test="${product.productId == cart.productId}">
			<h4 class="media-heading"><a href="">${product.productName}</a></h4>
                                <h5 class="media-heading"></h5>
                                <span>Status: </span><span class="text-success"><strong>In Stock</strong></span>
                            </div>
                        </div></td>
                 </c:if>
              </c:forEach>
               <td class="col-sm-1 col-md-1 text-center"></td>
			 <td class="col-sm-1 col-md-1 text-center"></td>
             <td class="col-sm-1 col-md-1">
             With in 6 working days
 			 </td>
			 <td class="col-sm-1 col-md-1" style="text-align: center">
			
			${cart.productQuantity}
			
			</td>
			
			
				
		</tr>
		
		</c:forEach>
		<tr>
			<td>  </td>
			<td>  </td>
			<td>  </td>
			<td></td>
			<td class="text-right"><h5><a class="btn btn-sm btn-warning"  href="${pageContext.request.contextPath}/cart">Edit Order</a></h5></td>
		</tr>
		
		
		</tbody>
		
	</table>
	
		</div>
	</div>
  </div>
  </div>
</body>
<jsp:include page="footer.jsp" /> 
</html>
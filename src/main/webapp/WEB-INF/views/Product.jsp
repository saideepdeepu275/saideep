<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The Product Details</h3>
        <form:form method="POST" action="InsertProduct" modelAttribute="product" enctype="multipart/form-data" >
             <table>
                <tr>
                    <td><form:label path="productName">Product Name</form:label></td>
                    <td><form:input path="productName"/></td>
                </tr>
		<tr>
                    <td><form:label path="productDesc">Product Description</form:label></td>
                    <td><form:input path="productDesc"/></td>
                </tr>
		<tr>
                    <td><form:label path="price">Product Price</form:label></td>
                    <td><form:input path="price"/></td>
                </tr>

                <tr>
                    <td><form:label path="stock">Stock</form:label></td>
                    <td><form:input path="stock"/></td>
                </tr> 
          <tr>
						<td><form:label class="btn btn-default btn-block" path="supId">Supplier</form:label></td>
								
							
						<td><form:select path="supId" class="form-control"
								required="true">
								<form:option value="0">--------Select--------</form:option>
							<form:options  items="${supplierList}"></form:options>
							</form:select></td>
					</tr>
					<tr>
						<td><form:label class="btn btn-default btn-block" path="catId">Category</form:label></td>
						<td><form:select class="form-control" path="catId"
								required="true">
								<form:option value="0">--------Select--------</form:option>
							<form:options  items="${categoryList}"></form:options>
						</form:select></td>
					</tr>
					<tr>
					<td>Image:</td>
					<td><input type="file"
							class=" btn btn-default btn-block form-control" name="file"/></td>
				</tr>
    <tr>
				<td colspan="2">
						<c:if test="${product.productId==0}">
		<input type="submit" value="Add Product" id="btn-add" class="btn btn-primary" >
		
		</c:if> <c:if test="${product.productId!=0}">
		
	   <input type="submit" value="updateProduct" id="btn-update" class="btn btn-primary" >
	  </c:if>
				</td>
			</tr>
            </table>
        </form:form>
        
        
        <div align="center">
		<table class="table" style="width: 80%" border="1px">
			<caption>Products</caption>
			<thead>
				<tr >
					<th>Product Id</th>
					<th>Product Name</th>
					<th>Product Description</th>
					<th>Product Price</th>
					<th>Category ID</th>
					<th>Supplier ID</th>
					<th>Image</th>
					<th>Edit</th>
					<th>Delete</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${productList}" var="product"	>
					<tr >
					<tr bgcolor="cyan">
				<td>${product.productId}</td>
				<td>${product.productName}</td>
				<td>${product.productDesc}</td>
				<td>${product.stock}</td>
				<td>${product.price}</td>
				<td>${product.catId}</td>
				<td>${product.supId}</td>
				<td>${product.image}</td>
								</div>
					<td>
								<a href="<c:url value="deleteProduct/${product.productId}"/>">DELELTE</a>
								<a href="<c:url value="updateProduct/${product.productId}"/>">UPDATE</a>  
								</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>

	</div>
        
     
    </body>
</html>
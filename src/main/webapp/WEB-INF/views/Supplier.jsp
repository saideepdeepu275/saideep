<%@ page language="java" contentType="text/html" import="com.model.Category"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>supplier</title>
</head>
	<body>
			<!-- <form action="AddSupplier" method="post">-->

			<form:form action="AddSupplier" modelAttribute="supplier">
			<table align="center" cellspacing="2">
			<tr>
				<td colspan="2">Supplier Module</td>
			</tr>
			
			<tr>
					<td>Supplier ID</td>
					<!--<td><input type="text" name="suppId"/></td>-->
					<td><form:input path="suppId"/></td>
			</tr>
	
			<tr>
				<td>Supplier Name</td>
				<!-- <td><input type="text" name="supprName"/></td> -->
				<td><form:input path="suppName"/></td>
			</tr>
		
			<tr>
				<td>Supplier Address</td>
				<!-- <td><input type="text" name="suppAddress"/></td> -->
				<td><form:input path="suppAddress"/></td>
			</tr>
	
		<tr>
			<td colspan="2">
				<center><input type="submit" value="Insert"/></center>
			</td>
		</tr>
	</table>
	</form:form>


			

<form:form action="${pageContext.request.contextPath}/editSupplier" modelAttribute="Supplier" method="post">
			
			<table align="center" cellspacing="2">
			<tr>
				<td colspan="2">Supplier Module</td>
			</tr>
			
			<tr>
					<td>Supplier ID</td>
					<!--<td><input type="text" name="suppId"/></td>-->
					<td><form:input path="suppId"/></td>
			</tr>
	
			<tr>
				<td>Supplier Name</td>
				<!-- <td><input type="text" name="supprName"/></td> -->
				<td><form:input path="suppName"/></td>
			</tr>
		
			<tr>
				<td>Supplier Address</td>
				<!-- <td><input type="text" name="suppAddress"/></td> -->
				<td><form:input path="suppAddress"/></td>
			</tr>
	
		<tr>
			<td colspan="2">
				<center><input type="submit" value="Update"/></center>
			</td>
		</tr>
	</table>
	</form:form>

<table cellspacing="2" align="center">
	<tr bgcolor="gray">
		<td>Supplier ID</td>
		<td>Supplier Name</td>
		<td>Supplier Address</td>
		<td>Operation</td>
	</tr>
	
	<c:forEach items="${supplierList}" var="supplier">
		<tr bgcolor="cyan">
			<td>${supplier.suppId}</td>
			<td>${supplier.suppName}</td>
			<td>${supplier.suppAddress}</td>
			<td>
			
				<a href="<c:url value="deleteSupplier/${supplier.suppId}"/>">DELETE</a>/
				<a href="<c:url value="updateSupplier/${supplier.suppId}"/>">UPDATE</a>
			</td>
		</tr>
	</c:forEach>

</table>
		

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
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


</body>
</html>
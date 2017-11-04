<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body><body   background="${pageContext.request.contextPath}/resources/REDIAMGE.JPG"   style="width:100%" "height="20%">


<form:form action="${pageContext.request.contextPath}/editCategory" modelAttribute="category" method="post">
		<table align="center" cellspacing="2">
		<tr>
			<td colspan="2">Category Module</td>
		</tr>
		
		<tr>
				<td>Category ID</td>
				<!--<td><input type="text" name="catId"/></td>-->
				<td><form:input path="catId"/></td>
		</tr>
	
		<tr>
			<td>Category Name</td>
			<!-- <td><input type="text" name="catName"/></td> -->
			<td><form:input path="catName"/></td>
		</tr>
	
		<tr>
			<td>Category Desc</td>
			<!-- <td><input type="text" name="catDesc"/></td> -->
			<td><form:input path="catDesc"/></td>
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
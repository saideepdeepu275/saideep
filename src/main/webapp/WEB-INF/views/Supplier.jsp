<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
    </head>
    <body>
        <h3>Welcome, Enter The Supplier Details</h3>
        <h2>${message}</h2>
        <form:form method="POST" action="saveSupplier" modelAttribute="supplier">
             <table>
                <tr>
                    <td><form:label path="supplierName">supplierName</form:label></td>
                    <td><form:input path="supplierName"/></td>
                </tr>
             
                <tr>
                    <td><form:label path="supplierAddress">supplierAddress</form:label></td>
                    <td><form:input path="supplierAddress"/></td>
                </tr>
                <tr>
                    <td><input type="submit" value="Submit"/></td>
                </tr>
            </table>
        </form:form>
         <c:if test="${!empty supplierList}"> 
 <table align="center" border="1">
  <tr>
   <th>ID</th>
   <th>Name</th>
   <th>Address</th>
  </tr>

  <c:forEach items="${supplierList}" var="supplier">
   <tr>
    <td><c:out value="${supplier.id}"/></td>
  
    <td><c:out value="${supplier.supplierName}"/></td>
    <td><c:out value="${supplier.supplierAddress}"/></td>
     <td align="center"><a href="editSupplier.html?pubId=${supplier.id}">Edit</a> | <a href="deletePublication.html?pubId=${supplier.id}">Delete</a></td> 
   </tr>
  </c:forEach>
 </table>
 </c:if>
        
    </body>
</html>
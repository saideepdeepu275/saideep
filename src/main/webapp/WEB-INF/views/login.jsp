<%@ page language="java" contentType="text/html"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>

<title>Login Page - CARS</title>
</head>
<body>

<form action="perform_login" method="post">
<table align="center">
	
		<tr><td colspan="2"><center>Login Page</center></td></tr>
		<tr>
			<td> Login ID</td>
			<td> <input type="text" name="username" required/></td>
		</tr>
		<tr>
			<td> Password</td>
			<td> <input type="password" name="password" required/></td>
		</tr>
		<tr>
			<td colspan="2"><center><input type="submit" value="LOGIN"/></center>
		</tr>
</table>
</form>

</body>
</html>
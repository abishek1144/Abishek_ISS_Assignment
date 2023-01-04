<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Login Form </title>
</head>
<body>
<h1>Login Page</h1>
<form action="login_action" method="post">
		<table style="with: 50%">
			<tr>
				<td>UserName</td>
				<td><input type="text" id="username" name="username" /></td>
			</tr>
				<tr>
				<td>Password</td>
				<td><input type="password" id="password" name="password" /></td>
			</tr>
		</table>
		<input type="submit" value="Login" /></form><button onclick="location.href = 'registration.jsp';">Register</button>
</body>
</html>
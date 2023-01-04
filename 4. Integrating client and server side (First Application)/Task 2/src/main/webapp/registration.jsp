<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<title>Registration Form </title>
<script src="javascript/verification.js"> </script>
</head>
<body>
<h1>Registration Form</h1>
<form name="registration" onsubmit="return verification()" action="registration_action" method="post">
		<table style="width: 50%">
		<tr>
				<td>FirstName</td>
				<td><input type="text" id="firstname" name="firstname" /></td>
			</tr>
			<tr>
				<td>LastName</td>
				<td><input type="text" id="lastname" name="lastname" /></td>
			</tr>
			<tr>
				<td>Age</td>
				<td><input type="text" id="age" name="age" /></td>
			</tr>
			<tr>
				<td>Address</td>
				<td><input type="text" id="address" name="address" /></td>
			</tr>
			<tr>
				<td>UserName</td>
				<td><input type="text" id="username" name="username" /></td>
			</tr>
				<tr>
				<td>Password</td>
				<td><input type="password" id="password" name="password" /></td>
			</tr>
			<tr>
				<td>Confirm Password</td>
				<td><input type="password" id="cpassword" name="cpassword" /></td>
			</tr>
		</table>
		<input type="submit" value="Register" /></form><button onclick="location.href = 'login_page.jsp';">Login</button>
</body>
</html>
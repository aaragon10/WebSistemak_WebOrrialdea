<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="/fvp/css/styleSheet.css" rel="stylesheet" />
<title>Log In</title>
</head>
<body>
	<header>
	<h1>Federación Vasca de Patinaje / Euskal Herriko Irristaketa Federazioa</h1>
	<h3>Login orrialdea</h3>
	</header>
	<section>
	<form method="POST" action="/fvp/servlet/LoginServlet">
		<table>
			<tr>
				<td>User:</td>
				<td><input name="user" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="password" /></td>
			</tr>
		</table>
		<button>Bidali</button>
	</form>
	</section>
	<footer>Aitor Aragón</footer>
</body>
</html>
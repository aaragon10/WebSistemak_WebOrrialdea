<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>LogUp Form</title>
</head>
<body>
	<header>
		<h1>Federación Vasca de Patinaje / Euskal Herriko Irristaketa Federazioa</h1>
		<h3>Logup orrialdea</h3>
	</header>
		<section>
	<form method="POST" action="/fvp/servlet/SignupServlet">
		<table>
			<tr>
				<td>User:</td>
				<td><input name="user" /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="pass" /></td>
			</tr>
			<tr>
				<td>Izena:</td>
				<td><input name="izena" /></td>
			</tr>
			<tr>
				<td>Kalea:</td>
				<td><input name="kalea" /></td>
			</tr>
			<tr>
				<td>Zenbakia:</td>
				<td><input name="zenbakia" /></td>
			</tr>
			<tr>
				<td>Solairua:</td>
				<td><input name="solairua" /></td>
			</tr>
			<tr>
				<td>Letra:</td>
				<td><input name="letra" /></td>
			</tr>
			<tr>
				<td>Posta kodea:</td>
				<td><input name="postaKode" /></td>
			</tr>
			<tr>
				<td>Hiria:</td>
				<td><input name="hiria" /></td>
			</tr>
			<tr>
				<td>Email:</td>
				<td><input name="email" /></td>
			</tr>
			<tr>
				<td>Telefonoa:</td>
				<td><input name="telefonoa" /></td>
			</tr>
		</table>
		<button>Bidali</button>
	</form>
	</section>
	<section> <a href="/fvp/html/logupForm.html"
		style="text-decoration: none"> <font color="white">Sign Up</font>
	</a> </section>
	<footer>Aitor Aragón</footer>
</body>
</html>
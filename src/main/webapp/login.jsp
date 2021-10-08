<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="ISO-8859-1">
<link href="css/styles.css" type="text/css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Bienvenido</title>
<style>
body {
  background-image: url('img/bg_06.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: 100% 100%;
}
</style>

</head>
<body>

	<header id="Encabezado" class="Encabezado">
		<div class="cont_titulologo">
			<h1 style="color: #9297a0">
				Bienvenidos a la <b style="color: #13aaaa; font-weight:bold;">Tienda
					Gen&eacute;rica</b>
			</h1>
			<div class="logo"></div>
		</div>
	</header>
    <main>
	<div class="card">
		<!--<section class="barraGris" style="width: 40%"></section>-->
		<form action="Servletinicio" id="Ingreso" class="Ingreso"
			method="post">
			<table>
				<tr>
					<td>Usuario:</td>
					<td><input type="text" name="usuario" id="usuario"
						class="txtField_01"></td>
				</tr>
				<tr>
					<td>Contrase&ntilde;a:</td>
					<td><input type="password" name="password" id="password"
						class="txtField_01"></td>
				</tr>
				<tr>
					<td><input type="submit" value="Enviar" class="btns"></td>
					<td><input type="submit" value="Cancelar" class="btns"></td>
				</tr>
			</table>
		</form>
	</div>
    </main>
</body>
</html>
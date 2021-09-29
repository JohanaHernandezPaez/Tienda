<%@page import="controlador.conexion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="ISO-8859-1">
<link href="css/styles.css" type="text/css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Insert title here</title>
</head>
<body>
	<%
	String ced = "", nombre = "", email = "", pass = "", usu = "";
	if (request.getParameter("co") != null) {
		ced = request.getParameter("co");
		nombre = request.getParameter("no");
		email = request.getParameter("em");
		pass = request.getParameter("pa");
		usu = request.getParameter("us");
	}
	%>

	<header id="Encabezado" class="Encabezado">
		<div class="cont_titulologo">
			<h1 style="color: #9297a0">
				Panel de <b style="color: #13aaaa; font-weight: bold;">Usuarios.</b>
			</h1>
			<div class="logo"></div>
		</div>
	</header>
	<main>
		<div class="card">
			<!--<section class="barraGris" style="width: 40%"></section>-->
			<form action="ServletUsuarios" id="Ingreso" class="Ingreso"
				method="post">

				<table>
					<tr>
						<form action="ServletUsuarios" method="POST">
							<tr>
								<td>Documento:</td>
								<td><input type="text" name="cedula_usuario"
									value="<%=ced%>" placeholder="Documento" class="txtField_01"></td>
							</tr>
							<tr>
								<td>Email:</td>
								<td><input type="text" name="email_usuario"
									value="<%=email%>" placeholder="Email" class="txtField_01"></td>
							</tr>
							<tr>
								<td>Nombre:</td>
								<td><input type="text" name="nombre_usuario"
									value="<%=nombre%>" placeholder="Nombre" class="txtField_01"></td>
							</tr>
							<tr>
								<td>Usuario:</td>
								<td><input type="text" name="usuario" value="<%=usu%>"
									placeholder="Usuario" class="txtField_01"></td>
							</tr>
							<tr>
								<td>Contraseña:</td>
								<td><input type="password" name="password"
									value="<%=pass%>" placeholder="Contraseña" class="txtField_01"></td>
							</tr>
					</tr>

					<tr>
						<td><input type="submit" name="btninsUsu" value="Registrar"
							class="btns"></td>
						<td><input type="submit" name="btnconUsu" value="Consultar"
							class="btns"></td>
						<td><input type="submit" name="btnactUsu" value="Actualizar"
							class="btns"></td>
						<td><input type="submit" name="btneliUsu" value="Eliminar"
							class="btns"></td>
						
						</form>
					</tr>
				
				</table>
			</form>
			<a href="vistados.jsp"><img src="atras1.png"  ></a>
		</div>
	</main>




</body>
</html>
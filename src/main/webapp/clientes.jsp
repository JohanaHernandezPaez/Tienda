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
<title>Gestión de clientes</title>
</head>
<body>
	<%
	String ced = "", direccion = "", email = "", nombre = "", telefono = "";
	if (request.getParameter("co") != null) {
		ced = request.getParameter("co");
		direccion = request.getParameter("di");
		email = request.getParameter("em");
		nombre = request.getParameter("no");
		telefono = request.getParameter("te");
	}
	%>

	<header id="Encabezado" class="Encabezado">
		<div class="cont_titulologo">
			<h1 style="color: #9297a0">
				Panel de <b style="color: #13aaaa; font-weight: bold;">Clientes.</b>
			</h1>
			<div class="logo"></div>
		</div>
	</header>
	<main>
		<div class="card">
			<!--<section class="barraGris" style="width: 40%"></section>-->
			<form action="ServletCliente" id="Ingreso" class="Ingreso"
				method="post">

				<table>

					<form action="ServletCliente" method="POST">
						<tr>
							<td>Documento:</td>
							<td><input type="text" name="cedula_cliente"
								value="<%=ced%>" placeholder="Documento" class="txtField_01"></td>
						</tr>
						<tr>
							<td>Dirección:</td>
							<td><input type="text" name="direccion_cliente"
								value="<%=direccion%>" placeholder="Direccion cliente"
								class="txtField_01"></td>
						</tr>
						<tr>
							<td>Email:</td>
							<td><input type="text" name="email_cliente"
								value="<%=email%>" placeholder="Email cliente"
								class="txtField_01"></td>
						</tr>
						<tr>
							<td>Nombre:</td>
							<td><input type="text" name="nombre_cliente"
								value="<%=nombre%>" placeholder="Nombre cliente"
								class="txtField_01"></td>
						</tr>
						<tr>
							<td>Telefono:</td>
							<td><input type="text" name="telefono_cliente"
								value="<%=telefono%>" placeholder="telefono cliente"
								class="txtField_01"></td>
						</tr>
					</form>


					<tr>
						<td><input type="submit" name="btninsCli" value="Registrar"
							class="btns"></td>
						<td><input type="submit" name="btnconCli" value="Consultar"
							class="btns"></td>
						<td><input type="submit" name="btnactCli" value="Actualizar"
							class="btns"></td>
						<td><input type="submit" name="btneliCli" value="Eliminar"
							class="btns"></td>
					</tr>


				</table>
			</form>
			<a href="vistados.jsp"><img src="atras1.png"  ></a>
		</div>
	</main>




</body>
</html>
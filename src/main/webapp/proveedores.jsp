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
<title>Gestión Proveedores</title>
</head>
<body>
	<%
	String nit = "", nombre_proveedor = "", direccion_proveedor = "", telefono_proveedor = "", ciudad_proveedor = "";
	if (request.getParameter("nt") != null) {
		nit = request.getParameter("nt");
		nombre_proveedor = request.getParameter("np");
		direccion_proveedor = request.getParameter("dp");
		telefono_proveedor = request.getParameter("tp");
		ciudad_proveedor = request.getParameter("cp");
	}
	%>

	<header id="Encabezado" class="Encabezado">
		<div class="cont_titulologo">
			<h1 style="color: #9297a0">
				Panel de <b style="color: #13aaaa; font-weight: bold;">Proveedores.</b>
			</h1>
			<div class="logo"></div>
		</div>
	</header>
	<main>
		<div class="card">
			<!--<section class="barraGris" style="width: 40%"></section>-->
			<form action="ServletProveedores" id="Ingreso" class="Ingreso"
				method="post">

				<table>

					<form action="ServletProveedores" method="POST">
						<tr>
							<td>Nit:</td>
							<td><input type="text" name="nitproveedor"
								value="<%=nit%>" placeholder="Nit" class="txtField_01"></td>
						</tr>
						<tr>
							<td>Proveedor:</td>
							<td><input type="text" name="nombre_proveedor"
								value="<%=nombre_proveedor%>" placeholder="Nombre Proveedor"
								class="txtField_01"></td>
						</tr>
						<tr>
							<td>Dirección:</td>
							<td><input type="text" name="direccion_proveedor"
								value="<%=direccion_proveedor%>" placeholder="direccion_proveedor"
								class="txtField_01"></td>
						</tr>
						<tr>
							<td>Teléfono:</td>
							<td><input type="text" name="telefono_proveedor"
								value="<%=telefono_proveedor%>" placeholder="Teléfono Proveedor"
								class="txtField_01"></td>
						</tr>
						<tr>
							<td>Ciudad:</td>
							<td><input type="text" name="ciudad_proveedor"
								value="<%=ciudad_proveedor%>" placeholder="Ciudad Proveedor"
								class="txtField_01"></td>
						</tr>
					</form>


					<tr>
						<td><input type="submit" name="btninsPro" value="Registrar"
							class="btns"></td>
						<td><input type="submit" name="btnconPro" value="Consultar"
							class="btns"></td>
						<td><input type="submit" name="btnactPro" value="Actualizar"
							class="btns"></td>
						<td><input type="submit" name="btneliPro" value="Eliminar"
							class="btns"></td>
					</tr>


				</table>
			</form>
			<a href="vistados.jsp"><img src="img/atras1.png"  ></a>
		</div>
	</main>




</body>
</html>
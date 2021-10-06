<%@page import="javax.swing.JOptionPane"%>
<%@page import="modelo.ClientesDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="ISO-8859-1">
<link href="css/styles.css" type="text/css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Gestión de ventas</title>
</head>
<header id="Encabezado" class="Encabezado">
		<div class="cont_titulologo">
			<h1 style="color: #9297a0">
				Panel de <b style="color: #13aaaa; font-weight: bold;">Ventas.</b>
			</h1>
			<div class="logo"></div>
		</div>
	</header>
<body>
	<section>
		<fieldset>
			<legend>Gestión Ventas</legend>
			<form action="ServletVentas" method="post" align="center">
				<input type="text" name="cedula" value="${cliente.getCedula_cliente()}"
					placeholder="cedula"> <input type="text" name="nombre"
					value="${cliente.getNombre_cliente()}" placeholder="nombre"> <input
					type="submit" name="confirmar">
				<table>
					<tbody>
						<tr>
							<th>Codigo del producto</th>
							<th>Consultar producto</th>
							<th>Nombre del producto</th>
							<th>Cantidad de producto</th>
							<th>Precio del producto</th>
						</tr>


						<tr>
							<td><input type="text" name="codigo"
								value="${producto.getCodigoproducto()}"></td>
							<td><input type="submit" name="conpro"
								value="Buscar producto"></td>
							<td><input type="text" class="nombre" name="n2"
								value="${producto.getNombreproducto()}"></td>
							<td><input type="text" class="cantidad" id="cantidad"
								name="can"></td>
							<td><input type="text" class="pre" id="pre" name="precio"
								value="${producto.getPrecioventa()}"></td>

						</tr>
						<tr>
							<td><input type="text" name="codigo1"
								value="${producto1.getCodigoproducto()}"></td>
							<td><input type="submit" name="conpro1"
								value="Buscar producto"></td>
							<td><input type="text" class="nombre" name="n2"
								value="${producto1.getNombreproducto()}"></td>
							<td><input type="text" class="cantidad1" id="cantidad1"
								name="can1"></td>
							<td><input type="text" class="pre" id="pre1" name="precio1"
								value="${producto1.getPrecioventa()}"></td>

						</tr>
						<tr>
							<td><input type="text" name="codigo2"
								value="${producto2.getCodigoproducto()}"></td>
							<td><input type="submit" name="conpro2"
								value="Buscar producto"></td>
							<td><input type="text" class="nombre" name="n2"
								value="${producto2.getNombreproducto()}"></td>
							<td><input type="text" class="cantidad2" id="cantidad2"
								name="can2"></td>
							<td><input type="text" class="pre" id="pre2" name="precio2"
								value="${producto2.getPrecioventa()}"></td>

						</tr>

						<tr>
							<td class="ult" colspan="5"><input type="submit"
								name="total" value="Enviar venta"></td>
						</tr>

					</tbody>

				</table>

				<input type="text" name="cu" value="${vs.getCedula_Usuario()}">



			</form>


		</fieldset>

	</section>

</body>
</html>
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
	<main>
		<fieldset>
			<legend>Gestión Ventas</legend>
			<div class="card">
			<form action="ServletVentas" method="post" align="center" style="margin-top:0.5em">
				<input type="text" name="cedula" value="${cliente.getCedula_cliente()}"
					placeholder="cedula" class="txtField_01"> <input type="text" name="nombre"
					value="${cliente.getNombre_cliente()}" placeholder="nombre" class="txtField_01"> <input
					type="submit" name="confirmar" class="btns">
				<table>
					<tbody>
						<tr>
							<th>C&oacute;digo del producto</th>
							<th>Consultar producto</th>
							<th>Nombre del producto</th>
							<th>Cantidad de producto</th>
							<th>Precio del producto</th>
						</tr>


						<tr>
							<td><input type="text" name="codigo"
								value="${producto.getCodigoproducto()}" class="txtField_01"></td>
							<td><input type="submit" name="conpro"
								value="Buscar producto" class="btns"></td>
							<td><input type="text" name="n2"
								value="${producto.getNombreproducto()}" class="txtField_01"></td>
							<td><input type="text" id="cantidad"
								name="can" class="txtField_01"></td>
							<td><input type="text" id="pre" name="precio"
								value="${producto.getPrecioventa()}" class="txtField_01"></td>

						</tr>
						<tr>
							<td><input type="text" name="codigo1"
								value="${producto1.getCodigoproducto()}" class="txtField_01"></td>
							<td><input type="submit" name="conpro1"
								value="Buscar producto" class="btns"></td>
							<td><input type="text" name="n2"
								value="${producto1.getNombreproducto()}" class="txtField_01"></td>
							<td><input type="text"  id="cantidad1"
								name="can1" class="txtField_01"></td>
							<td><input type="text" id="pre1" name="precio1"
								value="${producto1.getPrecioventa()}" class="txtField_01"></td>

						</tr>
						<tr>
							<td><input type="text" name="codigo2"
								value="${producto2.getCodigoproducto()}" class="txtField_01"></td>
							<td><input type="submit" name="conpro2"
								value="Buscar producto" class="btns"></td>
							<td><input type="text"  name="n2"
								value="${producto2.getNombreproducto()}"class="txtField_01"></td>
							<td><input type="text"  id="cantidad2"
								name="can2" class="txtField_01"></td>
							<td><input type="text"  id="pre2" name="precio2"
								value="${producto2.getPrecioventa()}" class="txtField_01"></td>

						</tr>

						<tr>
							<td  colspan="5"><input type="submit"
								name="total" value="Enviar venta" class="btns"></td>
						</tr>
						<tr>
						<td colspan="5"><input type="text" name="cu" value="${vs.getCedula_Usuario()}" class="txtField_01" ></td>
						</tr>
						
					</tbody>

				</table>

				



			</form>
			</div>

		</fieldset>
	</main>
	</section>

</body>
</html>
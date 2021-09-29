<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/styles.css" type="text/css" rel="stylesheet" />
<title>Segunda Vista</title>
</head>
<body>


	<header id="SegundaVista" class="SegundaVista">
		<section>
			<h1 style="color: #9297a0">
				Bienvenidos a la <b style="color: #13aaaa; font-weight:bold;">Tienda
					Gen&eacute;rica</b>
			</h1>
			<main>
			<div >
			<nav id="nav">
				<ul>
					
					<li><form action ="usuarios.jsp"><input type="submit" value="Usuarios" name="btn_usu" class="btn_menuPrincipal"></form></li>
					<li><form action ="clientes.jsp"><input type="submit" value="Clientes" name="btncli" class="btn_menuPrincipal"></form></li>
					<li><form action="proveedores.jsp"><input type="submit" value="Proveedores" name="btn_Proveedores" class="btn_menuPrincipal"></form></li>
					<li><input type="submit" value="Productos" name="btn_Productos" class="btn_menuPrincipal"></li>
					<li><input type="submit" value="Ventas" name="btn_Ventas" class="btn_menuPrincipal"></li>
					<li><input type="submit" value="Reportes" name="btn_Reportes" class="btn_menuPrincipal"></li>
					
				</ul>
				<div class="barraGris" style="width: 100%"></div>
			</nav>
			<a href="vistados.jsp"><img src="usuarios.png"  ></a>
			<a href="vistados.jsp"><img src="clientes.png"  ></a>
			<a href="vistados.jsp"><img src="proveedores.png"  ></a>
			<a href="vistados.jsp"><img src="productos.png"  ></a>
			<a href="vistados.jsp"><img src="ventas.png"  ></a>
			<a href="vistados.jsp"><img src="informes.png"  ></a>
			</div>
			
			</main>
			
		</section>


	</header>

</body>
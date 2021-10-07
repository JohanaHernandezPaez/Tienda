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
			<div class="card">
			<nav id="nav">
				<ul>
					<table>
					<tr><td><li><form action ="usuarios.jsp"><input type="submit" value="Usuarios" name="btn_usu" class="btn_menuPrincipal"><a href="usuarios.jsp"><img src="img/usuarios.png" class="img_menu" ></a></form></li>
					<li><form action ="clientes.jsp"><input type="submit" value="Clientes" name="btncli" class="btn_menuPrincipal"><a href="clientes.jsp"><img src="img/clientes.png"  class="img_menu"></a></form></li>
					</td><td>
					<li><form action="proveedores.jsp"><input type="submit" value="Proveedores" name="btn_Proveedores" class="btn_menuPrincipal"><a href="proveedores.jsp"><img src="img/proveedores.png" class="img_menu" ></a></form></li>
					
					<li><form action="productos.jsp"><input type="submit" value="Productos" name="btn_Productos" class="btn_menuPrincipal"><a href="productos.jsp"><img src="img/productos.png" class="img_menu" ></a></form></li>
					</td><td>
					<li><form action="ventas.jsp"><input type="submit" value="Ventas" name="btn_Ventas" class="btn_menuPrincipal"><a href="ventas.jsp"><img src="img/ventas.png" class="img_menu" ></a></form></li>
					<li><input type="submit" value="Reportes" name="btn_Reportes" class="btn_menuPrincipal"><a href="vistados.jsp"><img src="img/informes.png"  class="img_menu"></a></li>
					</td></tr></table>
					
				</ul>
				
			</nav>
		
			</div>
			
			</main>
			
		</section>


	</header>

</body>

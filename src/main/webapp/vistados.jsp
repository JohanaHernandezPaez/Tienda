<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="jakarta.servlet.http.HttpSession" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/styles.css" type="text/css" rel="stylesheet" />
<title>Menú Principal</title>
<style>
body {
  background-image: url('img/bg_01.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: 100% 100%;
}
</style>
</head>
<body>
<%
HttpSession objsesion=request.getSession();
String nombre=(String)objsesion.getAttribute("vs");
%>
<header id="SegundaVista" class="SegundaVista">
		<section>
			<h1 style="color: #9297a0">
				Bienvenidos a la <b style="color: #13aaaa; font-weight:bold;">Tienda
					Toretto</b>
			</h1>
			<main>
			<div class="card">
			<nav id="nav">
				<ul>
					<table>
					<label><strong>Bienvenido <%=nombre%></strong></label>
					<tr><td><li><form action ="usuarios.jsp"><input type="submit" value="Usuarios" name="btn_usu" class="btn_menuPrincipal"><a href="usuarios.jsp"><img src="img/usuarios.png" class="img_menu" ></a></form></li>
					<li><form action ="clientes.jsp"><input type="submit" value="Clientes" name="btncli" class="btn_menuPrincipal"><a href="clientes.jsp"><img src="img/clientes.png"  class="img_menu"></a></form></li>
					</td><td>
					<li><form action="proveedores.jsp"><input type="submit" value="Proveedores" name="btn_Proveedores" class="btn_menuPrincipal"><a href="proveedores.jsp"><img src="img/proveedores.png" class="img_menu" ></a></form></li>
					
					<li><form action="productos.jsp"><input type="submit" value="Productos" name="btn_Productos" class="btn_menuPrincipal"><a href="productos.jsp"><img src="img/productos.png" class="img_menu" ></a></form></li>
					</td><td>
					<li><form action="ventas.jsp"><input type="submit" value="Ventas" name="btn_Ventas" class="btn_menuPrincipal"><a href="ventas.jsp"><img src="img/ventas.png" class="img_menu" ></a></form></li>
					<li><form action="consultasyreportes.jsp"><input type="submit" value="Reportes" name="btn_Reportes" class="btn_menuPrincipal"><a href="consultasyreportes.jsp"><img src="img/informes.png"  class="img_menu"></a></form></li>
					</td></tr></table>
					
				</ul>
				
			</nav>
			<a href="index.jsp"><img src="img/atras1.png"  ></a>
			</div>
			
			</main>
			
		</section>


	</header>

</body>

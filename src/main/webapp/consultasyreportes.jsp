<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script type="text/javascript" src="js/jquery-3.6.0.min.js"></script>
<script type="text/javascript" src="js/consultar.js"></script>
<script type="text/javascript" src="js/consultarcli.js"></script>
<script type="text/javascript" src="js/consultar3.js"></script>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="ISO-8859-1">
<link href="css/styles.css" type="text/css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
</head>

<title>Reportes y consultas</title>
<style>
body {
  background-image: url('img/bg_02.jpg');
  background-repeat: no-repeat;
  background-attachment: fixed;
  background-size: 100% 100%;
}
</style>
<header id="Encabezado" class="Encabezado">

		<div class="cont_titulologo">
			<h1 style="color: #9297a0">
				Panel de <b style="color: #13aaaa; font-weight: bold;">Consultas y Reportes.</b>
			</h1>
			<div class="logo"></div>
		</div>
	</header>
<body>

<form>
<!-- button no recarga la página por eso se pone button -->
<input type="button" name="cargausuarios" value="Listado de Usuarios" class="btnscarga" >
<input type="button" name="cargaclientes" value="Listado de Clientes" class="btnscargacli" >
<input type="button" name="cargarventas" value="Ventas por Cliente" class="btnscargaventa" >
</form>
<table id="tab"></table>

<a href="vistados.jsp"><img src="img/atras1.png"  ></a>

</body>
</html>
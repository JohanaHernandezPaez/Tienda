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
input[type=button]{
text-decoration: none;
	margin-left: 1em;
    padding: 6px;
	padding-left: 12px;
	padding-right: 12px;
    font-weight: 600;
    font-size: 12px;
	border-bottom-right-radius: 8px;
	border-top-left-radius: 8px;
	background-color: #13aaaa;
    color: #000000;
	border-style:none;
    box-shadow: rgba(12, 12, 12, 0.75) 0px 2px 6px -5px;
}
input[type=button]:hover{
background-color: #007a7b;
    color: #000000;
}
table{
	margin:auto;
	padding: 20px;
    font-family: sans-serif, 'Lucida Sans', 'Lucida Sans Regular', 'Lucida Grande', 'Lucida Sans Unicode', Geneva, Verdana, sans-serif;
    font-size: 14px;
	/*background-color: #c2c8d1;*/
	border-bottom-left-radius: 6px;
	border-bottom-right-radius: 6px;
	border-right: darkgray;
	width: 40%;
}
#tab th{
	padding: 0.5em;
	background-color: #007a7b;
}
td{
	padding: 0.5em;
	background-color: #c2c8d1;

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

<main>

<div class="card">
<div style="margin:4em;">
<form action="ServletProductos" method="post" enctype="multipart/form-data"><h1>Consulte por lista general:</h1>
<nav>
<ul>
<!-- button no recarga la página por eso se pone button -->
<li><input type="button" name="cargausuarios" value="Listado de Usuarios" class="btnscarga" style="margin-top:1em; margin-bottom:1em;"></li>
<li><input type="button" name="cargaclientes" value="Listado de Clientes" class="btnscargacli" style="margin-top:1em; margin-bottom:1em;"></li>
<li><input type="button" name="cargarventas" value="Ventas por Cliente" class="btnscargaventa" style="margin-top:1em; margin-bottom:1em;"></li></ul>
</nav>
</form>

<table id="tab">
</table>

<a href="vistados.jsp"><img src="img/atras1.png"  ></a>
</div>
</div>

</main>




</body>
</html>
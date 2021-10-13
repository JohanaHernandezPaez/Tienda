<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="ISO-8859-1">
<link href="css/styles.css" type="text/css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Reportes y consultas</title>
<style>
body {
  background-image: url('img/bg_02.jpg');
}
</style>
</head>

<body>
<header id="Encabezado" class="Encabezado">
		<div class="cont_titulologo">
			<h1 style="color: #9297a0">
				Panel de <b style="color: #13aaaa; font-weight: bold;">Consultas y Reportes.</b>
			</h1>
			<div class="logo"></div>
		</div>
	</header>


<main>

<div class="card">
<div style="margin:4em;">
<form action="ServletProductos" method="post" enctype="multipart/form-data"><h1>Consulte por lista general:</h1>
<nav>
<ul></ul>
<li><input type="submit" name="cargar" value="Listado de Usuarios" class="btns" style="margin-top:1em; margin-bottom:1em;"></li>
<li><input type="submit" name="cargar" value="Listado de Clientes" class="btns" style="margin-top:1em; margin-bottom:1em;"></li>
<li><input type="submit" name="cargar" value="Ventas por Cliente" class="btns" style="margin-top:1em; margin-bottom:1em;"></li>
</nav>
</form>
<a href="vistados.jsp"><img src="img/atras1.png"  ></a>
</div>
</div>

</main>
</body>
</html>
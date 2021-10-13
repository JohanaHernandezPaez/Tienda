<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<meta charset="ISO-8859-1">
<link href="css/styles.css" type="text/css" rel="stylesheet" />
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<title>Agregar productos</title>
<style>
body {
  background-image: url('img/bg_05.jpg');
}
</style>
</head>
<body>
<%
HttpSession objsesion=request.getSession();
String uss=(String)objsesion.getAttribute("llevausuario");
%>
<!-- <div><%=uss%></div> --> 
<header id="Encabezado" class="Encabezado">
		<div class="cont_titulologo">
			<h1 style="color: #9297a0">
				Panel de <b style="color: #13aaaa; font-weight: bold;">Productos.</b>
			</h1>
			<div class="logo"></div>
		</div>
	</header>

<main>

<div class="card">
<div style="margin:4em;">
<form action="ServletProductos" method="post" enctype="multipart/form-data"><h1>Cargue el archivo de los productos:</h1>
<input type="file" name="archivo" value="" class="txtfile"style="margin-top:1em; margin-bottom:1em;">
<input type="submit" name="cargar" value="Cargar Archivo" class="btns" style="margin-top:1em; margin-bottom:1em;">
</form>
<a href="vistados.jsp"><img src="img/atras1.png"  ></a>
</div>
</div>

</main>
</body>
</html>
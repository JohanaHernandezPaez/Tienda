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





<form action="ServletProductos" method="post" enctype="multipart/form-data">
<input type="file" name="archivo" value="" class="txtfile">
<input type="submit" name="cargar" value="add Archivo" class="btns" >
</form>
<a href="vistados.jsp"><img src="img/atras1.png"  ></a>
</body>
</html>
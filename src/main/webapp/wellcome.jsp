<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<link href="css/styles.css" type="text/css" rel="stylesheet"/>
<title>Segunda Vista</title>
</head>
<body>
<header id="SegundaVista" class="SegundaVista">
    <section>
        <h1 style="color: #9297a0">Bienvenidos a la <b style="color: #13aaaa;">Tienda Gen&eacute;rica</b></h1>
        <nav id="nav">
            <ul>
                <li><input type="submit" value="Usuario" class="btn_menuPrincipal"></li>
                <li><input type="submit" value="Clientes" class="btn_menuPrincipal"></li>
                <li><input type="submit" value="Proveedores" class="btn_menuPrincipal"></li>
                <li><input type="submit" value="Productos" class="btn_menuPrincipal"></li>
                <li><input type="submit" value="Ventas" class="btn_menuPrincipal"></li>
                <li><input type="submit" value="Reportes" class="btn_menuPrincipal"></li>
            </ul>
            <div class="barraGris" style="width:100%"></div>
        </nav>
    </section>
    
    
</header>
<%

String dato=request.getParameter("dato");



%>
<div>
<h3>Usted esta logueado con el usuario :  <%=dato%>  </h3>

 
</div>
</body>
</html>
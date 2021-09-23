<!--Código GitHub: https://github.com/JohanaHernandezPaez/Tienda.git -->

<%@page import="javax.swing.JOptionPane"%>
<%@page import="controlador.conexion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Hola Johana esta es una modificación</title>
</head>
<body>
<h2>prueba</h2>
<%
/*conexion con=new conexion();
con.conexionbd();*/

String cod="" , nombre="";
if(request.getParameter("co")!=null){
	cod=request.getParameter("co");
	nombre=request.getParameter("no");
}
%>
<form action="Servletgestionlineas" method="post">
<input type="text" name="codlin" value="<%=cod %>" placeholder="codigo de la linea">
<input type="text" name="nomlin" value="<%=nombre %>" placeholder="Nombre de la linea">

<input type="submit" name="btnins" value="Registrar">
<input type="submit" name="btncon" value="Consultar">
<input type="submit" name="btnins" value="Actualizar">
<input type="submit" name="btnins" value="Eliminar">
</form>
<form action="Servletgestionlineas" method="POST">
<table>
<tr><th>Código</th>
<th>Nombre</th>
</tr>
<tr>
<td><input type="text" name="codlin" value="<%=cod %>"></td>
<td><input type="text" name="nomlin" value="<%=nombre %>"></td>
<td><input type="submit" name="btnact" value="Actualizar"></td>
</tr>

</table>



</form>
</body>
</html>
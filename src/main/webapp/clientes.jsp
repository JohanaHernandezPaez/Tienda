<%@page import="controlador.conexion"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%conexion con=new conexion();
con.conexionbd();
%>
<form action="ServletCliente" method="POST">
<input type="text" name="cedula_cliente" placeholder="cedula_cliente">
<input type="text" name="direccion_cliente" placeholder="direccion cliente">
<input type="text" name="email_cliente" placeholder="email Cliente">
<input type="text" name="nombre_cliente" placeholder="nombre cliente">
<input type="text" name="telefono_cliente" placeholder="telefono cliente">
<input type="submit" name="btncli">
</form>


</body>
</html>
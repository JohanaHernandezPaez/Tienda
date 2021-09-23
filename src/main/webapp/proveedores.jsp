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
<form action="ServletProveedores" method="POST">
<input type="text" name="nitproveedor" placeholder="nit proveedor">
<input type="text" name="nombre_proveedor" placeholder="nombre proveedor">
<input type="text" name="direccion_proveedor" placeholder="direccion proveedorio">
<input type="text" name="telefono_proveedor" placeholder="telefono proveedor">
<input type="text" name="ciudad_proveedor" placeholder="ciudad proveedor">
<input type="submit" name="btn_Proveedores">
</form>

</body>
</html>
package modelo;

public class ReportesDTO {
private Long cedula_cliente;
private String nombre_cliente;
private double total_venta;
public ReportesDTO(Long cedula_cliente, String nombre_cliente, double total_venta) {
	super();
	this.cedula_cliente = cedula_cliente;
	this.nombre_cliente = nombre_cliente;
	this.total_venta = total_venta;
}
public Long getCedula_cliente() {
	return cedula_cliente;
}
public void setCedula_cliente(Long cedula_cliente) {
	this.cedula_cliente = cedula_cliente;
}
public String getNombre_cliente() {
	return nombre_cliente;
}
public void setNombre_cliente(String nombre_cliente) {
	this.nombre_cliente = nombre_cliente;
}
public double getTotal_venta() {
	return total_venta;
}
public void setTotal_venta(double total_venta) {
	this.total_venta = total_venta;
}


}
